package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;
import se.arbetsformedlingen.matchning.portability.model.hropen.Candidate;
import se.arbetsformedlingen.matchning.portability.model.hropen.Profile;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.AspRespository;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
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

    private Logger LOG = LoggerFactory.getLogger(ProfileApi.class);
    private ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin
    @RequestMapping(value="/profile", method = RequestMethod.GET, produces = "application/json")
    public Candidate fetchCandidate(
            @RequestHeader("AMV_SSO_COOKIE") String ssoCookie
    ) {

        LOG.info("IDP url: " + idpUrl);
        Token jwtToken = null;
        try {
            jwtToken = this.requestJWTToken("AMV_SSO_COOKIE", ssoCookie);
        } catch (URISyntaxException ue) {
            ue.printStackTrace();
        }catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
            throw new HttpNotFoundException("Invalid token");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Candidate candidate = aspRespository.getCandidateForToken(jwtToken.getToken());
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
