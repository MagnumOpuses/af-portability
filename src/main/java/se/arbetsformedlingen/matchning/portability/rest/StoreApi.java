package se.arbetsformedlingen.matchning.portability.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
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

    final ObjectMapper mapper = new ObjectMapper();

    @CrossOrigin
    @PostMapping("/store")
    private JsonNode StoreValue(@RequestBody StoreRequestBody body) throws IOException {

        // Remove personal number from CV data to be shared
        JSONObject jo=new JSONObject(body.value);
        JSONObject person=jo
            .getJSONObject("transferObject")
            .getJSONArray("data").getJSONObject(0)
            .getJSONObject("person");
        JSONObject id = person.getJSONObject("legalId");  // Save id for later use
        person.remove("legalId");                    // Remove from shared CV data

        body.value=jo.toString();

        // Store to Redis
        String results;
        try {
            results = this.storeValueToRedis(body);
        } catch (HttpException he) {
            System.out.println("Error Request to " + he.getURL() + " failed ("+ he.getStatusCode() + ")");
            throw new HttpNotFoundException("Token not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Construct JSON format log object:
        JSONObject data = new JSONObject(body.value);
        String sessionId=data.getString("sessionToken");
        String timestamp=data.getJSONObject("consent").getString("consentTimestamp");
        String purpose=data.getJSONObject("sink").getJSONArray("purposeOfUse").getString(0);
        String employer=data.getJSONObject("sink").getString("sinkName");
        String agency=  data.getJSONObject("sink").getString("companyName");
        String jobTitle=data.getJSONObject("sink").getString("jobTitle");

        String profileId=data.getJSONObject("transferObject")
                .getJSONArray("data").getJSONObject(0)
                .getJSONArray("profiles")
                .getJSONObject(0)
                .getJSONObject("profileId")
                .getString("value");

        // Get the personal number "YYYY-MM-DD-NNNN"
        String legalId = id.getString("value");

        JSONObject nameObj = data.getJSONObject("transferObject")
                .getJSONArray("data")
                .getJSONObject(0)
                .getJSONObject("person")
                .getJSONObject("name");
        String name=nameObj.getString("given")+" "+nameObj.getString("family");

        // Cleartext consent declaration
        String logItem=createConsentLogItem(
                name,
                legalId,
                employer,
                agency,
                jobTitle,
                profileId,
                timestamp);

        // Create JSON log structure
        JSONObject  application = new JSONObject();
        application.put("name", "af-portability");
        application.put("class", "se.arbetsformedlingen.matchning.portability.rest.StoreApi");
        JSONObject event = new JSONObject();
        event.put("action", "grant");
        JSONObject consent = new JSONObject();
        consent.put("personalNumber",legalId);
        consent.put("profileId",profileId);
        consent.put("purpose",purpose);
        consent.put("consent", logItem);
        JSONObject log = new JSONObject();
        log.put("level","INFO");
        JSONObject session = new JSONObject();
        session.put("id",sessionId);
        JSONObject logEntry =new JSONObject();
        logEntry.put("application",application);
        logEntry.put("event",event);
        logEntry.put("consent",consent);
        logEntry.put("@timestamp",timestamp);
        logEntry.put("session",session);

        System.out.println(logEntry); // Logging occurs here !

        return mapper.readTree(results);
    }

    /** Create AF Connect consent log item */
    private String createConsentLogItem(
            String name,
            String personalNumber,
            String companyName,
            String employer,
            String jobTitle,
            String profileId,
            String timestamp) {

        // Produce text based log entry and write to STDOUT
        return  "Jag, "+name+" ("+personalNumber+") har vid tidpunkten "+timestamp+" givit följande medgivande\n" +
                "till "+companyName+" att ta emot arbets-profil-data (CV) med profil-id "+profileId+" från Arbetsförmedlingen,\n" +
                "för användning som del av arbets-ansökan.\n" +
                "             MEDGIVANDE\n" +
                companyName+" får endast använda uppgifterna i följande syfte:\n" +
                "   • Ansökan till roll '"+jobTitle+"' på "+employer+"\n\n" +
                "   • Jag ger mitt medgivande till att Arbetsförmedlingen under ett tillfälle får hantera och överföra dessa\n" +
                "     uppgifter till "+companyName+".\n" +
                "   • Jag samtycker till att denna process häver sekretessen för de uppgifter jag väljer att dela\n" +
                "     med "+companyName+".\n" +
                "   • Jag har granskat uppgifterna och bekräftar att inga oönskade uppgifter ingår\n" +
                "     i överföringen till "+companyName+".\n" +
                "   • Jag har läst och förstår följande bilaga: \"Behandling av dina personuppgifter\":\n\n" +
                "   Behandling av dina personuppgifter\n\n" +
                "   • Den här tjänsten gör det möjligt att skicka ditt valda CV till "+companyName+".\n" +
                "     Arbetsförmedlingen ansvarar inte för uppgifterna när de har levererats.\n" +
                "   • Arbetsförmedlingen kommer att lagra all samtyckeinformation som en del av deras\n" +
                "     processer, inklusive vilket jobb du har ansökt om och när. Den loggade informationen\n" +
                "     betraktas som av allmänt intresse och kan begäras ut till allmänheten på begäran.\n" +
                "   • Klicka HÄR för att lära dig mer om hur Arbetsförmedlingen behandlar dina uppgifter.\n" +
                "   • "+companyName+" är skyldigt att använda dina uppgifter enligt EU:s allmänna dataskyddsförordning.\n" +
                "   • Efter att uppgifterna har levererats till "+companyName+" kan Arbetsförmedlingen inte verifiera\n" +
                "         ◦ hur eller var informationen kommer att lagras;\n" +
                "         ◦ om dina uppgifter kommer att skickas till andra parter;\n" +
                "         ◦ om uppgifterna kommer att användas för ett annat syfte än en som anges ovan; eller\n" +
                "         ◦ som kommer att kunna komma åt uppgifterna.\n" +
                "   • Om du känner att dina uppgifter missbrukas på något sätt, vänligen kontakta\n" +
                "    \"Datainspektionen\" => (https://www.datainspektionen.se)\n";
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
        return EntityUtils.toString(responseEntity);
    }
}
