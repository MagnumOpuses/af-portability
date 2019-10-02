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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.util.UUID;

import static com.google.common.base.Predicates.equalTo;

@RestController
public class SessionTokenApi {

    @Value("${spring.outbox.url:localhost}")
    private static String registerTokenUrl;

    ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin
    @GetMapping(value = "/token")
    public Token generateSessionToken() {
        UUID uuid = UUID.randomUUID();
        Token t = new Token(uuid.toString());

        try {
            String result = this.registerTokenToRedis(t);
        } catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            return t;
        }
    }

    public String registerTokenToRedis(Token t) throws IOException {

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
        return results;

    }

}
