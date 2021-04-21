package se.arbetsformedlingen.matchning.portability.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import se.arbetsformedlingen.matchning.portability.JsonSanitizer;
import se.arbetsformedlingen.matchning.portability.builder.CandidateTypeBuilder;
import se.arbetsformedlingen.matchning.portability.dto.CandidateType;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.taxonomy.repository.Taxonomies;

import java.io.IOException;
import java.util.List;

@Repository
public class AspRespository {

    //@Value("${spring.profile.url}")
    private static String PROFIL_URL; //= "http://arbetssokandeprofil.arbetsformedlingen.se:80/arbetssokandeprofil/rest/af/v1/arbetssokandeprofil/arbetssokandeprofiler";

    //@Value("${spring.kundgift.url}")
    private static String KUNDUPPGIFT_URL; //= "http://arbetssokande.arbetsformedlingen.se:80/arbetssokande/rest/af/v1/arbetssokande/externa-personuppgifter";
    @Autowired
    ObjectMapper mapper;
    @Autowired
    Taxonomies taxonomyRepository;
    private final Logger LOG = LoggerFactory.getLogger(AspRespository.class);

    AspRespository(
            @Value("${spring.profile.url}") final String profilUrl,
            @Value("${spring.kundgift.url}") final String kundgiftUrl
    ) {
        PROFIL_URL = profilUrl;
        KUNDUPPGIFT_URL = kundgiftUrl;
    }

    public CandidateType getCandidateForToken(final String token) {
        CandidateType candidate = null;
        try {
            String results = readFromAPI(PROFIL_URL, token);

            final PolicyFactory policy = new HtmlPolicyBuilder()
                    .allowElements("a")
                    .allowUrlProtocols("https")
                    .allowAttributes("href").onElements("a")
                    .requireRelNofollowOnLinks()
                    .toFactory();

            final ObjectMapper om = new ObjectMapper();

            final JsonNode inputNode = om.readTree(results);
            final JsonNode outputNode = om.createArrayNode();

            JsonSanitizer.processArray(policy, inputNode, outputNode);
            final String actual = om.writeValueAsString(outputNode);

            final List<ArbetsSokandeProfil> profiler = mapper.readValue(actual, new TypeReference<List<ArbetsSokandeProfil>>() {
            });
            results = readFromAPI(KUNDUPPGIFT_URL, token);

            final PersonUppgifter personUppgifter = mapper.readValue(results, PersonUppgifter.class);

            candidate = new CandidateTypeBuilder()
                    .withPersonUppgifter(personUppgifter)
                    .withProfiles(profiler)
                    .build();

        } catch (final HttpException he) {
            LOG.error("Request to " + he.getURL() + " failed (" + he.getStatusCode() + ")");

        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
        return candidate;
    }


    private String readFromAPI(final String apiUrl, final String token) throws IOException {
        final HttpGet httpGet = new HttpGet(apiUrl);
        httpGet.setHeader("X-JWT-Assertion", token);
        final HttpClient client = HttpClients.createDefault();
        final HttpResponse response = client.execute(httpGet);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), apiUrl);
        }
        final HttpEntity entity = response.getEntity();
        final String results = EntityUtils.toString(entity);
        return results;
    }
}
