package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.util.Strings;
import org.json.JSONArray;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import se.arbetsformedlingen.matchning.portability.builder.EnvelopeTypeBuilder;
import se.arbetsformedlingen.matchning.portability.dto.CandidateType;
import se.arbetsformedlingen.matchning.portability.dto.EnvelopeType;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.AspRespository;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class ProfileApi {

    private static String idpUrl;
    private static String outboxUrl;
    ProfileApi(
        @Value("${spring.idp.url}") String idpUrl,
        @Value("${spring.outbox.host}") String host,
        @Value("${spring.outbox.port}") String port) {
        ProfileApi.idpUrl = idpUrl;
        ProfileApi.outboxUrl = "http://" + host + ":" + port;
    }

    @Autowired
    AspRespository aspRespository;

    private Logger LOG = LogManager.getLogger(ProfileApi.class);
    private ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin
    @RequestMapping(value="/profile", method = RequestMethod.GET, produces = "application/json")
    public EnvelopeType fetchCandidate(
            @RequestHeader("AMV_SSO_COOKIE") String ssoCookie,
            @RequestParam("sessionToken") String sessionToken
    ) {
        if (Strings.isEmpty(ssoCookie)) {
            throw new UnauthorizedException("Cookie is missing or invalid");
        }

        Token jwtToken = null;
        try {
            jwtToken = this.requestJWTToken("AMV_SSO_COOKIE", ssoCookie);
        } catch (URISyntaxException ue) {
            ue.printStackTrace();
        }catch (HttpException he) {
            throw new HttpNotFoundException("Invalid token");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        CandidateType candidate = aspRespository.getCandidateForToken(jwtToken.getToken());
        if (candidate == null) {
            throw new UnauthorizedException(Strings.isEmpty(jwtToken.getToken()) ? "Missing JWT token" : "JWT token is invalid");
        }

        String encodedPurpose = "";
        try {
            encodedPurpose = this.requestValueWithSessionToken(sessionToken);
        } catch (URISyntaxException ue) {
            ue.printStackTrace();
        }catch (HttpException he) {
            throw new HttpNotFoundException("Invalid or missing purpose");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<CandidateType> candidates = new ArrayList<CandidateType>();
        candidates.add(candidate);

        EnvelopeType envelop = new EnvelopeTypeBuilder()
                                .setSessionToken(sessionToken)
                                .setData(candidates)
                                .build();
        envelop.getSink().setPurposeOfUse(this.decodeStringToList(encodedPurpose));

        return envelop;
    }

    private Token requestJWTToken(String cookieName, String cookieValue) throws IOException, URISyntaxException {
        HttpClient instance = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(idpUrl);
        request.setHeader("cookie", cookieName + "=" + cookieValue);

        HttpResponse response = instance.execute(request);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), idpUrl);
        }

        Token token = this.mapper.readValue(response.getEntity().getContent(), Token.class);

        return token;
    }

    private String requestValueWithSessionToken(String token) throws IOException, URISyntaxException {
        URIBuilder builder = new URIBuilder(ProfileApi.outboxUrl + "/envelop");
        builder.setParameter("sessionToken", token);
        HttpGet httpGet = new HttpGet(builder.build());
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(httpGet);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), ProfileApi.outboxUrl + "/envelop");
        }
        HttpEntity entity = response.getEntity();
        String results = EntityUtils.toString(entity);
        return results;
    }

    private List<String> decodeStringToList(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        final JSONArray parsed = new JSONArray(decodedString);
        final List<String> purposeList = IntStream.range(0, parsed.length())
            .mapToObj(parsed::get)
            .map(Object::toString)
            .collect(Collectors.toList());
        return purposeList;
    }
}
