package se.arbetsformedlingen.matchning.portability.rest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.util.UUID;

import static com.google.common.base.Predicates.equalTo;

@RestController
public class SessionTokenApi {

    private static final String registerTokenUrl = "http://127.0.0.1:8100/registerToken";

    @GetMapping(value = "/token")
    public Token generateSessionToken() {
        UUID uuid = UUID.randomUUID();

        try {
            String result = this.registerTokenToRedis(uuid.toString(), this.registerTokenUrl);
        } catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            return new Token(uuid.toString());
        }
    }

    public String registerTokenToRedis(String t, String apiUrl) throws IOException {

        HttpClient client = HttpClients.createDefault();

        HttpPost postRequest = new HttpPost(apiUrl);

        String json = "{\"token\":\"" + t + "\"}";
        StringEntity entity = new StringEntity(json);
        postRequest.setEntity(entity);
        postRequest.setHeader("Content-type", "application/json");
        HttpResponse response = client.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), apiUrl);
        }
        HttpEntity responseEntity = response.getEntity();
        String results = EntityUtils.toString(responseEntity);
        System.out.println("RESULTS: " + results);
        return results;

    }

}
