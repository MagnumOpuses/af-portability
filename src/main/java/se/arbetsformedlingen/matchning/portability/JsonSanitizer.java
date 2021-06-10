package se.arbetsformedlingen.matchning.portability;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.owasp.html.PolicyFactory;

import java.util.Iterator;

public class JsonSanitizer {
    public static String sanitize(final PolicyFactory policy, final String input) {
        return policy.sanitize(input);
    }

    public static void processObject(final PolicyFactory policy, final JsonNode inputNode, final JsonNode outputNode) {
        inputNode.fields().forEachRemaining(entry -> {
            final String entryKey = entry.getKey();
            final JsonNode entryNode = entry.getValue();

            if (entryNode.isObject()) {
                final JsonNode element = ((ObjectNode) outputNode).putObject(entryKey);
                processObject(policy, entryNode, element);
            } else if (entryNode.isArray()) {
                final JsonNode array = ((ObjectNode) outputNode).putArray(entryKey);
                processArray(policy, entryNode, array);
            } else if (entryNode.isTextual()) {
                processTextual(policy, inputNode, outputNode, entryKey);
            } else {
                processOther(policy, inputNode, outputNode, entryKey);
            }
        });
    }

    public static void processArray(final PolicyFactory policy, final JsonNode inputNode, final JsonNode outputNode) {

        final ArrayNode arrayNode = (ArrayNode) inputNode;

        final Iterator<JsonNode> node = arrayNode.elements();
        while (node.hasNext()) {
            final JsonNode entryNode = node.next();

            if (entryNode.isObject()) {
                final JsonNode element = ((ArrayNode) outputNode).addObject();
                processObject(policy, entryNode, element);
            } else if (entryNode.isArray()) {
                final JsonNode array = ((ArrayNode) outputNode).addArray();
                processArray(policy, entryNode, array);
            } else if (entryNode.isTextual()) {
                ((ArrayNode) outputNode).add(sanitize(policy, entryNode.asText()));
            } else {
                ((ArrayNode) outputNode).add(entryNode);
            }
        }
    }

    public static void processTextual(final PolicyFactory policy, final JsonNode inputNode, final JsonNode outputNode, final String key) {
        ((ObjectNode) outputNode).put(key, sanitize(policy, inputNode.get(key).asText()));
    }

    public static void processOther(final PolicyFactory policy, final JsonNode inputNode, final JsonNode outputNode, final String key) {
        ((ObjectNode) outputNode).set(key, inputNode.get(key));
    }
}
