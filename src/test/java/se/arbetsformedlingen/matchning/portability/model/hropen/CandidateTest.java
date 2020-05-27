package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import org.junit.Before;
import org.junit.Test;
import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.builder.*;
import se.arbetsformedlingen.matchning.portability.model.asp.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CandidateTest {

    ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
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

        final CommunicationType communication = candidateType.getPerson().getCommunication();
        assertEquals(personUppgifter.getEpostadress(), communication.getEmail().get(0).getAddress());
        assertEquals(personUppgifter.getHemsida(), communication.getWeb().get(0).getUrl());
        assertEquals(personUppgifter.getTelefonnummerHem(), communication.getPhone().get(0).getFormattedNumber());
        assertEquals(personUppgifter.getTelefonnummerMobil(), communication.getPhone().get(1).getFormattedNumber());
        assertEquals(personUppgifter.getTelefonnummerOvrig(), communication.getPhone().get(2).getFormattedNumber());

        for(AddressType item : communication.getAddress()) {
            assertEquals(personUppgifter.getAdress(), item.getLine());
            assertEquals(personUppgifter.getCo(), item.getExtendedLines());
            assertEquals(personUppgifter.getPostort(), item.getCity());
            assertEquals(personUppgifter.getPostnummer(), item.getPostalCode());
            assertEquals(personUppgifter.getLand(), item.getCountryCode().value());
        }

        // Test profiles
        final ArbetsSokandeProfil arbetsSokandeProfil = arbetsSokandeProfiler.get(0);
        final CandidateProfileType profileType = candidateType.getProfiles().get(0);
        assertEquals(arbetsSokandeProfil.getNamn(), profileType.getProfileName());
        assertEquals(arbetsSokandeProfil.getBeskrivning(), profileType.getObjective());
        assertEquals(arbetsSokandeProfil.getPresentation(), profileType.getExecutiveSummary());

        final Utbildning utbildning = arbetsSokandeProfil.getUtbildningar().get(0);
        final EducationAttendanceType educationAttendanceType = candidateType.getProfiles().get(0).education.get(0);
        assertEquals(utbildning.getSkola(), educationAttendanceType.getInstitution().getLegalId().getValue());
        assertEquals("2000-05", educationAttendanceType.getStart());
        assertEquals("2001-06", educationAttendanceType.getEnd());
        assertEquals(utbildning.isPagaende(), educationAttendanceType.current);
        assertEquals(utbildning.getInriktning(), educationAttendanceType.getDescriptions().get(0));

        final Anstallning anstallning = arbetsSokandeProfil.getAnstallningar().get(0);
        final EmployerHistoryType employerHistoryType = candidateType.getProfiles().get(0).getEmployment().get(0);
        assertEquals(anstallning.getArbetsgivare(), employerHistoryType.getOrganization().getLegalId().getValue());
        assertEquals(anstallning.getRubrik(), employerHistoryType.getPositionHistories().get(0).getTitle());

        assertEquals("2018-07", employerHistoryType.getStart());
        assertEquals("2019-05", employerHistoryType.getEnd());
        assertEquals(anstallning.isPagaende(), employerHistoryType.current);
        assertEquals(anstallning.getBeskrivning(), employerHistoryType.getDescriptions().get(0));

        final Merit merit = arbetsSokandeProfil.getOvrigaMeriter().get(0);
        final CertificationType certificationType = candidateType.getProfiles().get(0).getCertifications().get(0);
        assertEquals(merit.getRubrik(), certificationType.getName());
        assertEquals(merit.getBeskrivning(), certificationType.getDescriptions().get(0));

        final Arbetsort ort = arbetsSokandeProfil.getArbetsorter().get(0);
        final PositionPreferenceType city = candidateType.getProfiles().get(0).getPositionPreferences().get(0);
        assertEquals(ort.getVarde1(), city.getLocations().get(0).getReferenceLocation().getCity());
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

