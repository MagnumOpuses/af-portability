package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import se.arbetsformedlingen.matchning.portability.builder.hropen.CandidateTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.CandidateType;

import java.util.Date;

public class CandidateTest {

    ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreatingCandidateWithWithMethods() throws JsonProcessingException {
        CandidateType candidate = new CandidateTypeBuilder().createCandidateType()
                .withName("Lastname, Firstname")
                .withBirthDate(new Date())
                .withEmail("firstname.lastname@workplace.se")
                .withEmail("private_email@gmail.com")
                .withPhone("0123-1234567")
                .withProfile(new Profile().withDriversLicence("B", "Personbil"));



        String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(candidate);
        System.out.println(jsonData);
        assert(!jsonData.contains("null"));
        assert(candidate.getPerson().getName().getFamily().equals("Lastname"));
        assert(candidate.getPerson().getName().getGiven().equals("Firstname"));
        assert(candidate.getPerson().getName().getPreferredSalutationCode() == null);
        assert(candidate.getPerson().getCommunication().getEmail() != null);
        assert(candidate.getPerson().getCommunication().getEmail().size() > 0);
        assert(candidate.getPerson().getCommunication().getEmail().get(0).getAddress().equals("firstname.lastname@workplace.se"));
        assert(candidate.getPerson().getCommunication().getEmail().get(1).getAddress().equals("private_email@gmail.com"));
        assert(candidate.getPerson().getCommunication().getPhone() != null);
        assert(candidate.getPerson().getCommunication().getPhone().size() == 1);
        assert(candidate.getPerson().getCommunication().getPhone().get(0).getFormattedNumber().equals("0123-1234567"));
    }

}

