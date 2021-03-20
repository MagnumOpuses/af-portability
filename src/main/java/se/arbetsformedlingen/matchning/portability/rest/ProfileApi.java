package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.builder.*;
import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.model.storeapi.StoreResponse;
import se.arbetsformedlingen.matchning.portability.repository.AspRespository;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class ProfileApi {

    private static String idpUrl;
    private static String outboxUrl;
    private final Logger LOG = LogManager.getLogger(ProfileApi.class);
    private final ObjectMapper mapper = new ObjectMapper();
    @Autowired
    AspRespository aspRespository;

    ProfileApi(@Value("${spring.idp.url}") final String idpUrl, @Value("${spring.outbox.host}") final String host,
               @Value("${spring.outbox.port}") final String port) {
        ProfileApi.idpUrl = idpUrl;
        ProfileApi.outboxUrl = "http://" + host + ":" + port;
    }

    @CrossOrigin
    @RequestMapping(value = "/profile", method = RequestMethod.GET, produces = "application/json")
    public EnvelopeType fetchCandidate(@RequestHeader("AMV_SSO_COOKIE") final String ssoCookie,
                                       @RequestParam("sessionToken") final String sessionToken) {
        if (Strings.isEmpty(ssoCookie)) {
            throw new UnauthorizedException("Cookie is missing or invalid");
        }

        Token jwtToken = null;
        try {
            jwtToken = this.requestJWTToken("AMV_SSO_COOKIE", ssoCookie);
        } catch (final URISyntaxException ue) {
            ue.printStackTrace();
        } catch (final HttpException he) {
            throw new HttpNotFoundException("Invalid token");
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        final CandidateType candidate = aspRespository.getCandidateForToken(jwtToken.getToken());
        if (candidate == null) {
            throw new UnauthorizedException(
                    Strings.isEmpty(jwtToken.getToken()) ? "Missing JWT token" : "JWT token is invalid");
        }

        StoreResponse encodedPurpose = new StoreResponse();
        final String purposeToken = sessionToken + "-purpose";
        try {
            encodedPurpose = this.requestValueWithSessionToken(purposeToken);
        } catch (final URISyntaxException ue) {
            ue.printStackTrace();
        } catch (final HttpException he) {
            throw new HttpNotFoundException("Invalid or missing purpose");
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        StoreResponse dataSinkName = new StoreResponse();
        final String dataSinkNameToken = sessionToken + "-dataSinkName";
        try {
            dataSinkName = this.requestValueWithSessionToken(dataSinkNameToken);
        } catch (final URISyntaxException ue) {
            ue.printStackTrace();
        } catch (final HttpException he) {
            throw new HttpNotFoundException("Invalid or missing dataSinkName");
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        StoreResponse companyName = new StoreResponse();
        final String companyNameToken = sessionToken + "-companyName";
        try {
            companyName = this.requestValueWithSessionToken(companyNameToken);
        } catch (final URISyntaxException ue) {
            ue.printStackTrace();
        } catch (final HttpException he) {
            throw new HttpNotFoundException("Invalid or missing Company Name");
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        StoreResponse jobTitle = new StoreResponse();
        final String jobTitleToken = sessionToken + "-jobTitle";
        try {
            jobTitle = this.requestValueWithSessionToken(jobTitleToken);
        } catch (final URISyntaxException ue) {
            ue.printStackTrace();
        } catch (final HttpException he) {
            throw new HttpNotFoundException("Invalid or missing Job Title");
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        final List<CandidateType> candidates = new ArrayList<CandidateType>();
        candidates.add(candidate);

        final Source source = new SourceBuilder().setSourceName("Arbetsformedlingen").build();
        final Sink sink = new SinkBuilder()
                .setSinkName(dataSinkName.value)
                .setCompanyName(companyName.value)
                .setJobTitle(jobTitle.value)
                .setPurposeOfUse(this.decodeStringToList(encodedPurpose.value))
                .build();

        final Consent consent = new ConsentBuilder().build();

        final TransferObject transferObject = new TransferObjectBuilder()
                .setDataStructureLink("https://github.com/MagnumOpuses/common-cv-model").setDocumentType("CV")
                .setData(candidates).build();

        final EnvelopeType envelop = new EnvelopeTypeBuilder().setSessionToken(sessionToken).setSource(source).setSink(sink)
                .setConsent(consent).setTransferObject(transferObject).build();

        return envelop;
    }

    private Token requestJWTToken(final String cookieName, final String cookieValue) throws IOException, URISyntaxException {
        final HttpClient instance = HttpClientBuilder.create().build();
        final HttpGet request = new HttpGet(idpUrl);
        request.setHeader("cookie", cookieName + "=" + cookieValue);

        final HttpResponse response = instance.execute(request);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), idpUrl);
        }

        final Token token = this.mapper.readValue(response.getEntity().getContent(), Token.class);

        return token;
    }

    private StoreResponse requestValueWithSessionToken(final String token) throws IOException, URISyntaxException {
        final URIBuilder builder = new URIBuilder(ProfileApi.outboxUrl + "/envelop");
        builder.setParameter("sessionToken", token);
        final HttpGet httpGet = new HttpGet(builder.build());
        final HttpClient client = HttpClients.createDefault();
        final HttpResponse response = client.execute(httpGet);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), ProfileApi.outboxUrl + "/envelop");
        }

        return this.mapper.readValue(response.getEntity().getContent(), StoreResponse.class);
    }

    private List<String> decodeStringToList(final String encodedString) {
        final byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        final String decodedString = new String(decodedBytes);
        if (decodedString.isEmpty()) {
            return Collections.emptyList();
        }
        final JSONArray parsed = new JSONArray(decodedString);
        final List<String> purposeList = IntStream.range(0, parsed.length()).mapToObj(parsed::get).map(Object::toString)
                .collect(Collectors.toList());
        return purposeList;
    }
}
