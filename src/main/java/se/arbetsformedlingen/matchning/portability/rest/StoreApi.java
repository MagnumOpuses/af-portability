package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.arbetsformedlingen.matchning.portability.model.storeapi.StoreRequestBody;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;

@RestController
public class StoreApi {

    private static String storeDataUrl;
    StoreApi(
            @Value("${spring.outbox.host}") String host,
            @Value("${spring.outbox.port}") String port) {
        StoreApi.storeDataUrl = "http://" + host + ":" + port;
    }

    ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin
    @PostMapping("/store")
    private JsonNode StoreValue(@RequestBody StoreRequestBody body) throws IOException {
        String results;
        try {
            results = this.storeValueToRedis(body);
        } catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
            throw new HttpNotFoundException("Token not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JsonNode jsonNode = mapper.readTree(results);
        ObjectNode o = (ObjectNode) jsonNode;
        return o;

    }

    private String storeValueToRedis(StoreRequestBody body) throws IOException {

        HttpClient client = HttpClients.createDefault();

        HttpPost postRequest = new HttpPost(StoreApi.storeDataUrl + "/store");

        String json = "";
        try {
            json = mapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        StringEntity entity = new StringEntity(json, "UTF-8");
        postRequest.setEntity(entity);
        postRequest.setHeader("Content-type", "application/json");
        HttpResponse response = client.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), StoreApi.storeDataUrl + "/store");
        }
        HttpEntity responseEntity = response.getEntity();
        String results = EntityUtils.toString(responseEntity);
        return results;

    }
}
