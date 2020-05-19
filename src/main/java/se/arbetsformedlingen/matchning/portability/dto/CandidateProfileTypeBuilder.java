package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.builder.*;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.asp.Kompetens;
import se.arbetsformedlingen.matchning.portability.model.asp.Yrkeserfarenhet;
import se.arbetsformedlingen.matchning.portability.model.asp.Yrkesroll;

import java.util.List;

public class CandidateProfileTypeBuilder {
    private CandidateProfileType candidateProfileType = new CandidateProfileTypeBuilder().createCandidateProfileType();

    public CandidateProfileTypeBuilder setProfileName(String profileName) {
        candidateProfileType.profileName = profileName;
        return this;
    }

    public CandidateProfileTypeBuilder setLanguageCode(LanguageCodeList languageCode) {
        candidateProfileType.languageCode = languageCode;
        return this;
    }

    public CandidateProfileTypeBuilder setEducation(List<EducationAttendanceType> education) {
        candidateProfileType.education = education;
        return this;
    }

    public CandidateProfileTypeBuilder setEmployment(List<EmployerHistoryType> employment) {
        candidateProfileType.employment = employment;
        return this;
    }

    public CandidateProfileTypeBuilder setMilitaryService(List<MilitaryServiceType> militaryService) {
        candidateProfileType.militaryService = militaryService;
        return this;
    }

    public CandidateProfileTypeBuilder setLicenses(List<LicenseType> licenses) {
        candidateProfileType.licenses = licenses;
        return this;
    }

    public CandidateProfileTypeBuilder setCertifications(List<CertificationType> certifications) {
        candidateProfileType.certifications = certifications;
        return this;
    }

    public CandidateProfileTypeBuilder setPatents(List<PatentType> patents) {
        candidateProfileType.patents = patents;
        return this;
    }

    public CandidateProfileTypeBuilder setPublications(List<PublicationType> publications) {
        candidateProfileType.publications = publications;
        return this;
    }

    public CandidateProfileTypeBuilder setQualifications(List<PersonCompetencyType> qualifications) {
        candidateProfileType.qualifications = qualifications;
        return this;
    }

    public CandidateProfileTypeBuilder setAffiliations(List<OrganizationAffiliationType> affiliations) {
        candidateProfileType.affiliations = affiliations;
        return this;
    }

    public CandidateProfileTypeBuilder setSecurityCredentials(List<CertificationType> securityCredentials) {
        candidateProfileType.securityCredentials = securityCredentials;
        return this;
    }

    public CandidateProfileTypeBuilder setReferences(List<RefereeType> references) {
        candidateProfileType.references = references;
        return this;
    }

    public CandidateProfileTypeBuilder setAttachments(List<AttachmentType> attachments) {
        candidateProfileType.attachments = attachments;
        return this;
    }

    public CandidateProfileTypeBuilder setProfileId(IdentifierType profileId) {
        candidateProfileType.profileId = profileId;
        return this;
    }

    public CandidateProfileTypeBuilder setAlternateIds(List<IdentifierType> alternateIds) {
        candidateProfileType.alternateIds = alternateIds;
        return this;
    }

    public CandidateProfileTypeBuilder setPersonAvailability(PersonAvailabilityType personAvailability) {
        candidateProfileType.personAvailability = personAvailability;
        return this;
    }

    public CandidateProfileTypeBuilder setProcessingInformation(String processingInformation) {
        candidateProfileType.processingInformation = processingInformation;
        return this;
    }

    public CandidateProfileTypeBuilder setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        candidateProfileType.distributionGuidelines = distributionGuidelines;
        return this;
    }

    public CandidateProfileTypeBuilder setAssociatedPositionOpenings(List<AssociatedPositionOpeningType> associatedPositionOpenings) {
        candidateProfileType.associatedPositionOpenings = associatedPositionOpenings;
        return this;
    }

    public CandidateProfileTypeBuilder setObjective(String objective) {
        candidateProfileType.objective = objective;
        return this;
    }

    public CandidateProfileTypeBuilder setExecutiveSummary(String executiveSummary) {
        candidateProfileType.executiveSummary = executiveSummary;
        return this;
    }

    public CandidateProfileTypeBuilder setEmployerPreferences(List<EmployerPreferenceType> employerPreferences) {
        candidateProfileType.employerPreferences = employerPreferences;
        return this;
    }

    public CandidateProfileTypeBuilder setPositionPreferences(List<PositionPreferenceType> positionPreferences) {
        candidateProfileType.positionPreferences = positionPreferences;
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateRelationships(List<CandidateRelationshipType> candidateRelationships) {
        candidateProfileType.candidateRelationships = candidateRelationships;
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateSources(List<CandidateSourceType> candidateSources) {
        candidateProfileType.candidateSources = candidateSources;
        return this;
    }

    public CandidateProfileTypeBuilder setApplicationProcessHistory(ProcessHistoryType applicationProcessHistory) {
        candidateProfileType.applicationProcessHistory = applicationProcessHistory;
        return this;
    }

    public CandidateProfileTypeBuilder setWorkLifeCycles(List<WorkLifeCycleType> workLifeCycles) {
        candidateProfileType.workLifeCycles = workLifeCycles;
        return this;
    }

    public CandidateProfileType build() {
        return candidateProfileType;
    }

    public se.arbetsformedlingen.matchning.portability.builder.CandidateProfileTypeBuilder withProfile(ArbetsSokandeProfil profil) {
        setProfileName(profil.getNamn());
        setObjective(profil.getBeskrivning());
        setExecutiveSummary(profil.getPresentation());


        if (profil.getKorkort() != null){
            setLicenses(new LicensesBuilder().withKorkort(profil.getKorkort()).build());
        }

        if (profil.getKompetenser() != null){
            for (Kompetens kompetens : profil.getKompetenser()){
                //TODO Adjust this to use the new taxonomy.
                setQualifications(new QualificationsBuilder().withKompetenser(profil.getKompetenser()).build());
            }
        }

        if (profil.getYrkeserfarenheter() != null) {
            for (Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                //TODO Adjust this to use the new taxonomy.
                setEmployment(new EmploymentBuilder().withCodes(String.valueOf(yrkeserfarenhet.getYrkesbenamning())).build());
            }
        }

        if (profil.getYrkesroller() != null) {
            for (Yrkesroll yrkesroll : profil.getYrkesroller()) {
                setEmployment(new EmploymentBuilder().withCodes(yrkesroll.getKod()).build());
            }
        }

        if (profil.getAnstallningar() != null) {
            setEmployment(new EmploymentBuilder().withAnstallningar(profil.getAnstallningar()).build());
        }

        if (profil.getUtbildningar() != null) {
            setEducation(new EducationBuilder().withUtbildningar(profil.getUtbildningar()).build());
        }

        if (profil.getOvrigaMeriter() != null) {
            setCertifications(new CertificationsBuilder().withOvrigaMeriter(profil.getOvrigaMeriter()).build());
        }

        if (profil.getArbetsorter() != null) {
            setPositionPreferences(new PositionPreferencesBuilder().withArbetsorter(profil.getArbetsorter()).build());
        }



        return this;
    }
}