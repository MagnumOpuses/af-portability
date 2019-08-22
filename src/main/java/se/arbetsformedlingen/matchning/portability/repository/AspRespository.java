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
import org.springframework.stereotype.Repository;
import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.portability.model.asp.common.ArManad;
import se.arbetsformedlingen.matchning.portability.model.hropen.Candidate;
import se.arbetsformedlingen.matchning.portability.model.hropen.Profile;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Education;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Employment;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Qualification;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;
import se.arbetsformedlingen.matchning.taxonomy.repository.Taxonomies;

import java.io.IOException;
import java.util.List;

@Repository
public class AspRespository {

    private static final String PROFIL_URL = "http://arbetssokandeprofil.arbetsformedlingen.se:80/arbetssokandeprofil/rest/af/v1/arbetssokandeprofil/arbetssokandeprofiler";
    private static final String KUNDUPPGIFT_URL = "http://arbetssokande.arbetsformedlingen.se:80/arbetssokande/rest/af/v1/arbetssokande/externa-personuppgifter";

    private Logger LOG = LoggerFactory.getLogger(AspRespository.class);

    @Autowired
    ObjectMapper mapper;

    @Autowired
    Taxonomies taxonomyRepository;

    public Candidate getCandidateForToken(String token) {
        Candidate candidate = null;
        try {
            String results = readFromAPI(PROFIL_URL, token);
            List<ArbetsSokandeProfil> profiler = mapper.readValue(results, new TypeReference<List<ArbetsSokandeProfil>>() {
            });
            LOG.info("> Got " + profiler.size() + " number of profiles");
            results = readFromAPI(KUNDUPPGIFT_URL, token);
            PersonUppgifter personUppgifter = mapper.readValue(results, PersonUppgifter.class);
            LOG.info("Got " + personUppgifter.getFornamn() + " " + personUppgifter.getEfternamn());
            candidate = createCandidate(personUppgifter, profiler);
        } catch (HttpException he) {
            LOG.error("Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return candidate;
    }

    private Candidate createCandidate(PersonUppgifter personUppgifter, List<ArbetsSokandeProfil> profiler) {
        Candidate candidate = new Candidate()
                .withDocumentId(personUppgifter.getKundnummer(), "AF Kundnummer")
                .withPersonnummer(personUppgifter.getPersonnummer())
                .withName(personUppgifter.getFornamn() + " " + personUppgifter.getEfternamn())
                .withEmail(personUppgifter.getEpostadress())
                .withPhone(personUppgifter.getTelefonnummerHem(), "hem")
                .withPhone(personUppgifter.getTelefonnummerMobil(), "mobil")
                .withPhone(personUppgifter.getTelefonnummerOvrig(), "övrigt")
                .withWebpage(personUppgifter.getHemsida())
                .withAddress("hemadress", personUppgifter.getAdress(), personUppgifter.getCo(), personUppgifter.getPostnummer(), personUppgifter.getPostort(), personUppgifter.getLand());

        for (ArbetsSokandeProfil profil : profiler) {
            Profile profile = new Profile();
            profile.setProfileName(profil.getNamn());
            profile.setDescription(profil.getBeskrivning());
            profile.setExecutiveSummary(profil.getPresentation());

            if (profil.getKortkort() != null) {
                for (String kkklass : profil.getKortkort().getKorkortsklasser()) {
                    profile.withDriversLicence(kkklass, "Körkort klass " + kkklass);
                }
            }
            if (profil.getKompetenser() != null) {
                for (Kompetens kompetens : profil.getKompetenser()) {
                    profile.withConcept(taxonomyRepository.getConcept(""+kompetens.getTaxonomiId(), Concept.EntityType.skill));
                }
            }
            if (profil.getYrkeserfarenheter() != null) {
                for (Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                    profile.withConcept(taxonomyRepository.getConcept("" + yrkeserfarenhet.getYrkesbenamning(), Concept.EntityType.jobterm));
                }
            }
            if (profil.getAnstallningar() != null) {
                for (Anstallning anstallning : profil.getAnstallningar()) {
                    Employment employment = new Employment().withTitle(anstallning.getRubrik()).withOrganization(anstallning.getArbetsgivare());
                    ArManad startdatum = anstallning.getStartdatum();
                    ArManad slutdatum = anstallning.getSlutdatum();
                    if (startdatum != null) {
                        employment.withEmploymentFrom("" + startdatum.getArtal(), "" + startdatum.getManad());
                    }
                    if (slutdatum != null) {
                        employment.withEmploymentTo("" + slutdatum.getArtal(), "" + slutdatum.getManad());
                    }

                    employment.setDescription(anstallning.getBeskrivning());
                    profile.withEmployment(employment);
                }
            }
            if (profil.getUtbildningar() != null) {
                for (Utbildning utbildning : profil.getUtbildningar()) {
                    Education education = new Education().withSchool(utbildning.getSkola()).withProgram(utbildning.getInriktning());
                    ArManad startdatum = utbildning.getStartdatum();
                    ArManad slutdatum = utbildning.getSlutdatum();
                    String fromYear = null;
                    String fromMonth = null;
                    String toYear = null;
                    String toMonth = null;
                    if (startdatum != null) {
                        fromYear  = "" + startdatum.getArtal();
                        fromMonth = "" + startdatum.getManad();
                    }
                    if (slutdatum != null) {
                        toYear = "" + slutdatum.getArtal();
                        toMonth = "" + slutdatum.getManad();
                    }
                    education.setDescription(utbildning.getBeskrivning());
                    profile.withEducation(education.withAttendancePeriod(fromYear, fromMonth, toYear, toMonth));
                }

            }
            if (profil.getOvrigaMeriter() != null) {
                for (Merit merit : profil.getOvrigaMeriter()) {
                    profile.withQualification(new Qualification().withCompetencyName(merit.getRubrik()).withDescription(merit.getBeskrivning()));
                }
            }
            if (profil.getYrkesroller() != null) {
                for (Yrkesroll yrkesroll : profil.getYrkesroller()) {
                    profile.withWantedConcept(taxonomyRepository.getConcept("" + yrkesroll.getKod(), Concept.EntityType.jobterm));
                }
            }
            if (profil.getArbetsorter() != null) {
                for (Arbetsort arbetsort : profil.getArbetsorter()) {
                    profile.withWantedLocation(arbetsort.getVarde1());
                }
            }
            candidate.withProfile(profile);
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
