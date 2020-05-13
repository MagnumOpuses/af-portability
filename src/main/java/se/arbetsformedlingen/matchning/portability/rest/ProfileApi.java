package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.util.Strings;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateType;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.AspRespository;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class ProfileApi {

    private static String idpUrl;
    ProfileApi(@Value("${spring.idp.url}") String idpUrl) {
        ProfileApi.idpUrl = idpUrl;
    }

    @Autowired
    AspRespository aspRespository;

    private Logger LOG = LogManager.getLogger(ProfileApi.class);
    private ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin
    @RequestMapping(value="/profile", method = RequestMethod.GET, produces = "application/json")
    public CandidateType fetchCandidate(
            @RequestHeader("AMV_SSO_COOKIE") String ssoCookie
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

        return candidate;
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
}
