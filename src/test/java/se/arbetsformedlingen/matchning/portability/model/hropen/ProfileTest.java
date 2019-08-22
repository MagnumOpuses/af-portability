package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class ProfileTest {
    ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreatingProfileWithWithMethods() throws JsonProcessingException {
        Profile profile = new Profile().withDriversLicence("B", "Personbil");

        String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(profile);
        System.out.println(jsonData);
        assert(!jsonData.contains("null"));
    }

}
