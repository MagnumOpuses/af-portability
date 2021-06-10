package se.arbetsformedlingen.matchning.portability;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SanitizeTest {

    @Test
    public void test() throws JsonParseException, IOException {
        final String original = "{\"hello\":true,\"foo\":{\"bar\":\"Hello<script>baz</script>\"},\"lorem\":[\"ipsum\",\"dolor\",\"sit\",\"amet\"]}";
        final String expected = "{\"hello\":true,\"foo\":{\"bar\":\"Hello\"},\"lorem\":[\"ipsum\",\"dolor\",\"sit\",\"amet\"]}";

        final PolicyFactory policy = new HtmlPolicyBuilder()
                .allowElements("a")
                .allowUrlProtocols("https")
                .allowAttributes("href").onElements("a")
                .requireRelNofollowOnLinks()
                .requireRelNofollowOnLinks()
                .toFactory();

        final ObjectMapper om = new ObjectMapper();

        final JsonNode inputNode = om.readTree(original); // Load data to work on
        final JsonNode outputNode = om.createObjectNode();


        JsonSanitizer.processObject(policy, inputNode, outputNode);
        final String actual = om.writeValueAsString(outputNode);

        assertEquals(expected, actual); // Output stream expected to match expected
    }
}