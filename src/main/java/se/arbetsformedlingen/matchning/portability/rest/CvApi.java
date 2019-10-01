package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Response;
import se.arbetsformedlingen.matchning.portability.model.sessionToken.Token;
import se.arbetsformedlingen.matchning.portability.repository.HttpException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
public class CvApi {

    private static final String getCvUrl = "http://127.0.0.1:8100/envelop";

    @GetMapping(value = "/cv")
    public JsonNode getCv(@RequestParam("sessionToken") String token) throws IOException {
        System.out.println(token);
        String results = null;
        try {
            results = this.requestCvWithSessionToken(token, this.getCvUrl);

        } catch (URISyntaxException ue) {
            ue.printStackTrace();
        }catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(results);
        ObjectMapper mapper = new ObjectMapper();
        Response res = mapper.readValue(results, Response.class);

        if (res.value == "") {
            System.out.println("value not found");
            ObjectNode emptyNode = mapper.createObjectNode();
            emptyNode.put("status", 204);
            emptyNode.put("message", "Content Not found");
            return emptyNode;
        }

        JsonNode jsonNode = mapper.readTree(results);
        JsonNode valueNode = mapper.readTree(jsonNode.get("value").asText());
        System.out.println("JSON: " + valueNode);
        ObjectNode o = (ObjectNode) valueNode;
        o.put("status", 200);
        return o;
    }

    private String requestCvWithSessionToken(String token, String apiUrl) throws IOException, URISyntaxException {
        URIBuilder builder = new URIBuilder(apiUrl);
        builder.setParameter("sessionToken", token);
        HttpGet httpGet = new HttpGet(builder.build());
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(httpGet);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new HttpException(response.getStatusLine().getStatusCode(), apiUrl);
        }
        HttpEntity entity = response.getEntity();
        String results = EntityUtils.toString(entity);
        System.out.println("RESULTS: " + results);
        return results;
    }

}
