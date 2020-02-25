package se.arbetsformedlingen.matchning.portability.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.base.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;
import se.arbetsformedlingen.matchning.taxonomy.repository.Taxonomies;

import java.io.IOException;
import java.util.List;

@Repository
public class AspRespository {

    //@Value("${spring.profile.url}")
    private static String PROFIL_URL; //= "http://arbetssokandeprofil.arbetsformedlingen.se:80/arbetssokandeprofil/rest/af/v1/arbetssokandeprofil/arbetssokandeprofiler";

    //@Value("${spring.kundgift.url}")
    private static String KUNDUPPGIFT_URL; //= "http://arbetssokande.arbetsformedlingen.se:80/arbetssokande/rest/af/v1/arbetssokande/externa-personuppgifter";

    private Logger LOG = LoggerFactory.getLogger(AspRespository.class);

    @Autowired
    ObjectMapper mapper;

    @Autowired
    Taxonomies taxonomyRepository;

    AspRespository(
            @Value("${spring.profile.url}") String profilUrl,
            @Value("${spring.kundgift.url}") String kundgiftUrl
    ) {
        PROFIL_URL = profilUrl;
        KUNDUPPGIFT_URL = kundgiftUrl;
    }

    public CandidateType getCandidateForToken(String token) {
        CandidateType candidate = null;

        LOG.info("Profile url: " + PROFIL_URL);
        LOG.info("Kundgift url: " + KUNDUPPGIFT_URL);

        try {
            String results = readFromAPI(PROFIL_URL, token);
            List<ArbetsSokandeProfil> profiler = mapper.readValue(results, new TypeReference<List<ArbetsSokandeProfil>>() {
            });
            LOG.info("> Got " + profiler.size() + " number of profiles");
            results = readFromAPI(KUNDUPPGIFT_URL, token);
            PersonUppgifter personUppgifter = mapper.readValue(results, PersonUppgifter.class);
            LOG.info("Got " + personUppgifter.getFornamn() + " " + personUppgifter.getEfternamn());

            candidate = candidateMapper(personUppgifter, profiler);

        } catch (HttpException he) {
            LOG.error("Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return candidate;
    }


    private CandidateType candidateMapper(PersonUppgifter personUppgifter, List<ArbetsSokandeProfil> profiler) {
        CandidateType candidate = null;


        candidate.setDocumentId(new IdentifierType().withValue(personUppgifter.getKundnummer())); //Mapping the account number of the incoming document.
        candidate.withPersonBaseInfo(personUppgifter.getFornamn(),
                personUppgifter.getEfternamn(),
                personUppgifter.getAdress(),
                personUppgifter.getCo(),
                personUppgifter.getLand(), //TODO fix mapping to the codelist.
                personUppgifter.getPostort(),
                personUppgifter.getPostnummer(),
                personUppgifter.getEpostadress(),
                personUppgifter.getHemsida());
        candidate.withPersonPhone(personUppgifter.getTelefonnummerHem(), "Home");
        candidate.withPersonPhone(personUppgifter.getTelefonnummerMobil(), "Mobile");
        candidate.withPersonPhone(personUppgifter.getTelefonnummerOvrig(), "Other");

        for (ArbetsSokandeProfil profil : profiler){
            candidate.withProfiles(profil.getNamn(), (profil.getBeskrivning()), profil.getPresentation());

            if (profil.getKortkort() != null){
                for (String korkortklas : profil.getKortkort().getKorkortsklasser()){
                    candidate.withProfilesLicense(korkortklas, new String(String.valueOf(profil.getKortkort().getSenastUppdaterad())));
                }
            }

            if (profil.getKompetenser() != null){
                for (Kompetens kompetens : profil.getKompetenser()){
                    candidate.withProfilesCompetence(new String(String.valueOf(kompetens.getTaxonomiId())), new String(String.valueOf(Concept.EntityType.skill)));
                }
            }

            if (profil.getYrkeserfarenheter() != null) {
                for (Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                    //TODO Adjust this to use the new taxonomy.
                    candidate.withProfilesWorkExperienceLevels(new String(String.valueOf(yrkeserfarenhet.getYrkesbenamning())), new String(String.valueOf(Concept.EntityType.jobterm)));
                }
            }

            if (profil.getYrkesroller() != null) {
                for (Yrkesroll yrkesroll : profil.getYrkesroller()) {
                    candidate.withProfilesWorkExperienceLevels(yrkesroll.getKod(), new String(String.valueOf(Concept.EntityType.jobterm)));
                }
            }

            if (profil.getAnstallningar() != null) {
                for (Anstallning anstallning : profil.getAnstallningar()) {
                    if (anstallning.getSlutdatum() != null){
                        candidate.withProfilesWorkExperience(anstallning.getRubrik(),
                                anstallning.getArbetsgivare(),
                                new String(String.valueOf(anstallning.getStartdatum())),
                                new String(String.valueOf(anstallning.getSlutdatum())),
                                Boolean.FALSE,
                                anstallning.getBeskrivning());
                    }
                    else if (anstallning.getSlutdatum() == null) {
                        candidate.withProfilesWorkExperience(anstallning.getRubrik(),
                                anstallning.getArbetsgivare(),
                                new String(String.valueOf(anstallning.getStartdatum())),
                                new String(String.valueOf(anstallning.getSlutdatum())),
                                Boolean.TRUE,
                                anstallning.getBeskrivning());
                    }
                }
            }

            if (profil.getUtbildningar() != null) {
                for (Utbildning utbildning : profil.getUtbildningar()) {
                    if (utbildning.getSlutdatum() != null){
                        candidate.withProfilesEducation(utbildning.getSkola(),
                                utbildning.getInriktning(),
                                new String(String.valueOf(utbildning.getStartdatum())),
                                new String(String.valueOf(utbildning.getSlutdatum())),
                                Boolean.FALSE,
                                utbildning.getBeskrivning());
                    }
                    else if (utbildning.getSlutdatum() == null) {
                        candidate.withProfilesEducation(utbildning.getSkola(),
                                utbildning.getInriktning(),
                                new String(String.valueOf(utbildning.getStartdatum())),
                                new String(String.valueOf(utbildning.getSlutdatum())),
                                Boolean.TRUE,
                                utbildning.getBeskrivning());
                    }
                }
            }

            if (profil.getOvrigaMeriter() != null) {
                for (Merit merit : profil.getOvrigaMeriter()) {
                    candidate.withProfilesMerit(merit.getRubrik(), merit.getBeskrivning());
                }
            }

            if (profil.getArbetsorter() != null) {
                for (Arbetsort arbetsort : profil.getArbetsorter()) {
                    candidate.withProfilesPositionPreference(arbetsort.getVarde1()); //TODO make sure this is the correct mapping
                }
            }




        }
        return candidate;
    }



    private String readFromAPI(String apiUrl, String token) throws IOException {
        HttpGet httpGet = new HttpGet(apiUrl);
        httpGet.setHeader("X-JWT-Assertion", token);
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(httpGet);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), apiUrl);
        }
        HttpEntity entity = response.getEntity();
        String results = EntityUtils.toString(entity);
        LOG.info("RESULTS: " + results);
        return results;
    }
}
