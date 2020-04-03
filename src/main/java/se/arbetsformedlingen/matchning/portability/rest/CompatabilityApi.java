package se.arbetsformedlingen.matchning.portability.rest;

import com.github.zafarkhaja.semver.UnexpectedCharacterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import com.github.zafarkhaja.semver.Version;

@RestController
public class CompatabilityApi {

    private final Properties properties = new Properties();

    CompatabilityApi() {
        final String PROPERTIES_FILE = "compatability.properties";

        try (InputStream inputStream = CompatabilityApi.class.getClassLoader()
                .getResourceAsStream(PROPERTIES_FILE)) {
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @CrossOrigin
    @GetMapping(value = "/checkCompatability")
    public HashMap<String, Object> checkCompatability(@RequestParam("name") String name,
                                                      @RequestParam("version") String version) {
        final HashMap<String, Object> response = new HashMap<>();

        response.put("result", false);

        try {
            if (properties.containsKey(name)) {
                response.put("result", Version.valueOf(version)
                        .satisfies(properties.getProperty(name)));
            }
        } catch (UnexpectedCharacterException ex) {
            // NOP
        }

        return response;
    }
}
