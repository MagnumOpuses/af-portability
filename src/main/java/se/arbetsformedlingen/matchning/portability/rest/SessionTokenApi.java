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
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.model.ApiKeys;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.ApiGatewayRepository;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.util.UUID;

@RestController
@PropertySource("classpath:application.properties")
public class SessionTokenApi {

    private static String registerTokenUrl;

    private static String envMessage;

    @Autowired
    private ApiGatewayRepository apiGatewayRepository;

    SessionTokenApi(
            @Value("${spring.outbox.host}") String host,
            @Value("${spring.outbox.port}") String port,
            @Value("${spring.env.message}") String message) {
        SessionTokenApi.registerTokenUrl = "http://" + host + ":" + port;
        SessionTokenApi.envMessage = message;
    }

    ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin(allowedHeaders = "*")
    @GetMapping(value = "/token")
    public Token generateSessionToken(@RequestParam("api-key") String apikey) {
        ApiKeys info = apiGatewayRepository.getAllApiKeys(apikey);
        if (info == null) {
            throw new UnauthorizedException("Api Key missing or invalid");
        }
        System.out.println(info.toString());

        UUID uuid = UUID.randomUUID();
        Token t = new Token(uuid.toString());

        try {
            this.registerTokenToRedis(t);
        } catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
            throw he;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return t;
    }

    public void registerTokenToRedis(Token t) throws IOException {

        HttpClient client = HttpClients.createDefault();

        HttpPost postRequest = new HttpPost(SessionTokenApi.registerTokenUrl + "/store");

        String json = "";
        try {
            json = mapper.writeValueAsString(t);
            System.out.println("ResultingJSONstring = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        StringEntity entity = new StringEntity(json);
        postRequest.setEntity(entity);
        postRequest.setHeader("Content-type", "application/json");
        HttpResponse response = client.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), SessionTokenApi.registerTokenUrl + "/store");
        }
        HttpEntity responseEntity = response.getEntity();
        String results = EntityUtils.toString(responseEntity);
        System.out.println("RESULTS: " + results);
    }

}
