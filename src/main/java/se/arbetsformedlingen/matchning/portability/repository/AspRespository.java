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
import se.arbetsformedlingen.matchning.portability.builder.hropen.CandidateTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;
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
        try {
            String results = readFromAPI(PROFIL_URL, token);
            List<ArbetsSokandeProfil> profiler = mapper.readValue(results, new TypeReference<List<ArbetsSokandeProfil>>() {
            });
            results = readFromAPI(KUNDUPPGIFT_URL, token);
            PersonUppgifter personUppgifter = mapper.readValue(results, PersonUppgifter.class);

            candidate = new CandidateTypeBuilder()
                    .withPersonUppgifter(personUppgifter)
                    .withProfiles(profiler)
                    .build();

        } catch (HttpException he) {
            LOG.error("Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");

        } catch (IOException e) {
            throw new RuntimeException(e);
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
        return results;
    }
}
