package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import org.junit.Test;
import se.arbetsformedlingen.matchning.portability.dto.DateTimeType;
import se.arbetsformedlingen.matchning.portability.dto.DateType;
import se.arbetsformedlingen.matchning.portability.dto.EnvelopeType;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EnvelopeTest {

    private static final String ENVELOPE_SCHEMA_FILEPATH = "schemas/envelope/DataEnvelope.json";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final JsonValidator validator;

    public EnvelopeTest() {
        final ValidationConfiguration cfg = ValidationConfiguration.newBuilder()
                .setDefaultVersion(SchemaVersion.DRAFTV4).freeze();
        validator = JsonSchemaFactory.newBuilder().setValidationConfiguration(cfg).freeze().getValidator();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); // <-- TODO: still not global, it's only in the unit test.
        final SimpleModule module = new SimpleModule();
        module.addSerializer(DateType.class, new DateType.DateTypeSerializer());
        module.addDeserializer(DateType.class, new DateType.DateTypeDeserializer());
        module.addSerializer(DateTimeType.class, new DateTimeType.DateTypeSerializer());
        module.addDeserializer(DateTimeType.class, new DateTimeType.DateTypeDeserializer());
        objectMapper.registerModule(module);
    }

    @Test
    public void envelopeValidation() throws IOException, ProcessingException {
        final URL exampleEnvelopeURL = getClass().getClassLoader().getResource("schemas/envelope/example_WithHROpen421JSON.json");
        final EnvelopeType envelope = objectMapper.readValue(exampleEnvelopeURL, EnvelopeType.class);
        final JsonNode instance = objectMapper.valueToTree(envelope);

        final URL schemaURL = getClass().getClassLoader().getResource(ENVELOPE_SCHEMA_FILEPATH);
        final JsonNode schema = JsonLoader.fromURL(schemaURL);

        final ProcessingReport report = validator.validate(schema, instance);
        assertTrue(report.toString(), report.isSuccess());
    }

    @Test
    public void dateFormatTest() {
        final LocalDate date = LocalDate.of(2020, 6, 3);

        final DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
        final String text = date.format(formatter);

        assertEquals("2020-W23-3", text);

        final LocalDate parsedDate = LocalDate.parse(text, formatter);
    }
}
