package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import se.arbetsformedlingen.matchning.portability.builder.hropen.CandidateTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

public class CandidateTest {

    ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        //mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void readASPPersonUppgifter() throws IOException {
        loadPersonUppgifter("personUppgifter.json");
    }

    @Test
    public void readASPProfile() throws IOException {
        loadArbetsSokandeProfil("arbetsSokandeProfil.json");
    }

    @Test
    public void asp2HROpenMappingCheck() throws IOException {
        final PersonUppgifter personUppgifter = loadPersonUppgifter("personUppgifter.json");
        final List<ArbetsSokandeProfil> arbetsSokandeProfiler = loadArbetsSokandeProfil("arbetsSokandeProfil.json");
        final CandidateType candidateType = new CandidateTypeBuilder().withPersonUppgifter(personUppgifter).withProfiles(arbetsSokandeProfiler).build();

        // Test person uppgifter
        assertEquals(personUppgifter.getKundnummer(), candidateType.getDocumentId().getValue());
        assertEquals(personUppgifter.getFornamn(), candidateType.getPerson().getName().getGiven());
        assertEquals(personUppgifter.getEfternamn(), candidateType.getPerson().getName().getFamily());

        for(AddressTypeArray.Item item :  candidateType.getPerson().getCommunication().getAddress().getItem()) {
            assertEquals(personUppgifter.getAdress(), item.getLine());
            assertEquals(personUppgifter.getCo(), item.getExtendedLines().getItem().get(0).getValue());
            assertEquals(personUppgifter.getPostort(), item.getCity());
            assertEquals(personUppgifter.getPostnummer(), item.getPostalCode());
            assertEquals(personUppgifter.getLand(), item.getCountryCode().value());
        }
        assertEquals(personUppgifter.getEpostadress(), candidateType.getPerson().getCommunication().getEmail().getItem().get(0).getAddress());
        assertEquals(personUppgifter.getHemsida(), candidateType.getPerson().getCommunication().getWeb().getItem().get(0).getUrl());

        assertEquals(personUppgifter.getTelefonnummerHem(), candidateType.getPerson().getCommunication().getPhone().getItem().get(0).getFormattedNumber());
        assertEquals(personUppgifter.getTelefonnummerMobil(), candidateType.getPerson().getCommunication().getPhone().getItem().get(1).getFormattedNumber());
        assertEquals(personUppgifter.getTelefonnummerOvrig(), candidateType.getPerson().getCommunication().getPhone().getItem().get(2).getFormattedNumber());


        // Test profiles
        ArbetsSokandeProfil arbetsSokandeProfil = arbetsSokandeProfiler.get(0);
        CandidateProfileType profileType = candidateType.getProfiles().getItem().get(0);
        assertEquals(arbetsSokandeProfil.getNamn(), profileType.getProfileName());
        assertEquals(arbetsSokandeProfil.getBeskrivning(), profileType.getObjective());
        assertEquals(arbetsSokandeProfil.getPresentation(), profileType.getExecutiveSummary());
 //       Utbildning utbildning = arbetsSokandeProfil.getUtbildningar().get(0);
   //     assertEquals(utbildning.getSkola(), candidateType.getProfiles().getItem());

        Anstallning anstallning = arbetsSokandeProfil.getAnstallningar().get(0);
        EmployerHistoryType employerHistoryType = candidateType.getProfiles().getItem().get(0).getEmployment().getItem().get(0);
        assertEquals(anstallning.getArbetsgivare(), employerHistoryType.getOrganization().getLegalId());
        assertEquals(anstallning.getRubrik(), employerHistoryType.getPositionHistories().getItem().get(0).getTitle());
        assertEquals(anstallning.getStartdatum(), employerHistoryType.getStart());
        assertEquals(anstallning.getSlutdatum(), employerHistoryType.getEnd());
        assertEquals(anstallning.isPagaende(), employerHistoryType.isCurrent());
        assertEquals(anstallning.getBeskrivning(), employerHistoryType.getDescriptions().getItem().get(0));

        Merit merit = arbetsSokandeProfil.getOvrigaMeriter().get(0);
        CertificationType certificationType = candidateType.getProfiles().getItem().get(0).getCertifications().getItem().get(0);
        assertEquals(merit.getBeskrivning(), certificationType.getName());

    }

    @Test
    public void testCreatingCandidateWithWithMethods() throws JsonProcessingException {
        /*CandidateType candidate = new CandidateTypeBuilder().build()
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
        assert(candidate.getPerson().getCommunication().getPhone().get(0).getFormattedNumber().equals("0123-1234567"));*/
    }

    private PersonUppgifter loadPersonUppgifter(String resourceName) throws IOException {
        String json = Resources.toString(Resources.getResource(resourceName), Charset.forName("UTF-8"));
        return mapper.readValue(json, PersonUppgifter.class);
    }

    private List<ArbetsSokandeProfil> loadArbetsSokandeProfil(String resourceName) throws IOException {
        String json = Resources.toString(Resources.getResource(resourceName), Charset.forName("UTF-8"));
        return mapper.readValue(json, new TypeReference<List<ArbetsSokandeProfil>>() {});
    }
}

