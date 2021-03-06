package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.arbetsformedlingen.matchning.portability.model.ApiKeys;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.model.storeapi.StoreRequestBody;
import se.arbetsformedlingen.matchning.portability.repository.ApiGatewayRepository;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.util.UUID;

@RestController
@PropertySource("classpath:application.properties")
public class SessionTokenApi {

    private static String registerTokenUrl;

    private static String envMessage;
    ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private ApiGatewayRepository apiGatewayRepository;

    SessionTokenApi(
            @Value("${spring.outbox.host}") final String host,
            @Value("${spring.outbox.port}") final String port,
            @Value("${spring.env.message}") final String message) {
        SessionTokenApi.registerTokenUrl = "http://" + host + ":" + port;
        SessionTokenApi.envMessage = message;
    }

    @CrossOrigin(allowedHeaders = "*")
    @GetMapping(value = "/token")
    public Token generateSessionToken(
        @RequestParam("api-key") String apikey,
        @RequestParam("purpose") String purpose,
        @RequestParam("job_title") String jobTitle,
        @RequestParam("company_name") String companyName
        ) {
        final ApiKeys info = apiGatewayRepository.getAllApiKeys(apikey);
        if (info == null) {
            throw new UnauthorizedException("Api Key missing or invalid");
        }

        final UUID uuid = UUID.randomUUID();
        final Token sessionToken = new Token(uuid.toString());
        final Token dataSinkNameToken = new Token(sessionToken.getToken() + "-dataSinkName");
        final Token purposeToken = new Token(sessionToken.getToken() + "-purpose");
        final Token jobTitleToken = new Token(sessionToken.getToken() + "-jobTitle");
        final Token companyNameToken = new Token(sessionToken.getToken() + "-companyName");

        try {
            this.registerTokenToRedis(new StoreRequestBody(sessionToken.getToken(), ""));
            this.registerTokenToRedis(new StoreRequestBody(purposeToken.getToken(), purpose));
            this.registerTokenToRedis(new StoreRequestBody(dataSinkNameToken.getToken(), info.getCompanyName()));
            this.registerTokenToRedis(new StoreRequestBody(jobTitleToken.getToken(), jobTitle));
            this.registerTokenToRedis(new StoreRequestBody(companyNameToken.getToken(), companyName));
        } catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed (" + he.getStatusCode() + ")");

            throw he;
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        return sessionToken;
    }

    public void registerTokenToRedis(final StoreRequestBody body) throws IOException {

        final HttpClient client = HttpClients.createDefault();

        final HttpPost postRequest = new HttpPost(SessionTokenApi.registerTokenUrl + "/store");

        String json = "";
        try {
            json = mapper.writeValueAsString(body);
        } catch (final JsonProcessingException e) {
            e.printStackTrace();
        }

        final StringEntity entity = new StringEntity(json);
        postRequest.setEntity(entity);
        postRequest.setHeader("Content-type", "application/json");
        final HttpResponse response = client.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), SessionTokenApi.registerTokenUrl + "/store");
        }
        final HttpEntity responseEntity = response.getEntity();
        final String results = EntityUtils.toString(responseEntity);
    }

}
