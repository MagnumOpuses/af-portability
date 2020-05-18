package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateProfileType", propOrder = {

})
public class CandidateProfileType {

    protected String profileName;
    protected LanguageCodeList languageCode;
    protected List<EducationAttendanceType> education;
    protected List<EmployerHistoryType> employment;
    protected List<MilitaryServiceType> militaryService; //Not used in current implementation
    protected List<LicenseType> licenses;
    protected List<CertificationType> certifications;
    protected List<PatentType> patents; //Not used in current implementation
    protected List<PublicationType> publications; //Not used in current implementation
    protected List<PersonCompetencyType> qualifications;
    protected List<OrganizationAffiliationType> affiliations;
    protected List<CertificationType> securityCredentials; //Not used in current implementation
    protected List<RefereeType> references; //Not used in current implementation
    protected List<AttachmentType> attachments;
    protected IdentifierType profileId;
    protected List<IdentifierType> alternateIds;
    protected PersonAvailabilityType personAvailability;
    protected String processingInformation;
    protected DistributionGuidelinesType distributionGuidelines; //Not used in current implementation
    protected List<AssociatedPositionOpeningType> associatedPositionOpenings;
    protected String objective;
    protected String executiveSummary;
    protected List<EmployerPreferenceType> employerPreferences;
    protected List<PositionPreferenceType> positionPreferences;
    protected List<CandidateRelationshipType> candidateRelationships; //Not used in current implementation
    protected List<CandidateSourceType> candidateSources; //Not used in current implementation
    protected ProcessHistoryType applicationProcessHistory; //Not used in current implementation
    protected List<WorkLifeCycleType> workLifeCycles;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public LanguageCodeList getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCodeList languageCode) {
        this.languageCode = languageCode;
    }

    public List<EducationAttendanceType> getEducation() {
        if (education == null) {
            education = new ArrayList<EducationAttendanceType>();
        }
        return this.education;
    }

    public List<EmployerHistoryType> getEmployment() {
        if (employment == null) {
            employment = new ArrayList<EmployerHistoryType>();
        }
        return this.employment;
    }

    public List<MilitaryServiceType> getMilitaryService() {
        if (militaryService == null) {
            militaryService = new ArrayList<MilitaryServiceType>();
        }
        return this.militaryService;
    }

    public List<LicenseType> getLicenses() {
        if (licenses == null) {
            licenses = new ArrayList<LicenseType>();
        }
        return this.licenses;
    }

    public List<CertificationType> getCertifications() {
        if (certifications == null) {
            certifications = new ArrayList<CertificationType>();
        }
        return this.certifications;
    }

    public List<PatentType> getPatents() {
        if (patents == null) {
            patents = new ArrayList<PatentType>();
        }
        return this.patents;
    }

    public List<PublicationType> getPublications() {
        if (publications == null) {
            publications = new ArrayList<PublicationType>();
        }
        return this.publications;
    }

    public List<PersonCompetencyType> getQualifications() {
        if (qualifications == null) {
            qualifications = new ArrayList<PersonCompetencyType>();
        }
        return this.qualifications;
    }

    public List<OrganizationAffiliationType> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<OrganizationAffiliationType>();
        }
        return this.affiliations;
    }

    public List<CertificationType> getSecurityCredentials() {
        if (securityCredentials == null) {
            securityCredentials = new ArrayList<CertificationType>();
        }
        return this.securityCredentials;
    }

    public List<RefereeType> getReferences() {
        if (references == null) {
            references = new ArrayList<RefereeType>();
        }
        return this.references;
    }

    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentType>();
        }
        return this.attachments;
    }

    public IdentifierType getProfileId() {
        return profileId;
    }

    public void setProfileId(IdentifierType profileId) {
        this.profileId = profileId;
    }

    public List<IdentifierType> getAlternateIds() {
        if (alternateIds == null) {
            alternateIds = new ArrayList<IdentifierType>();
        }
        return this.alternateIds;
    }

    public PersonAvailabilityType getPersonAvailability() {
        return personAvailability;
    }

    public void setPersonAvailability(PersonAvailabilityType personAvailability) {
        this.personAvailability = personAvailability;
    }

    public String getProcessingInformation() {
        return processingInformation;
    }

    public void setProcessingInformation(String processingInformation) {
        this.processingInformation = processingInformation;
    }

    public DistributionGuidelinesType getDistributionGuidelines() {
        return distributionGuidelines;
    }

    public void setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
    }

    public List<AssociatedPositionOpeningType> getAssociatedPositionOpenings() {
        if (associatedPositionOpenings == null) {
            associatedPositionOpenings = new ArrayList<AssociatedPositionOpeningType>();
        }
        return this.associatedPositionOpenings;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getExecutiveSummary() {
        return executiveSummary;
    }

    public void setExecutiveSummary(String executiveSummary) {
        this.executiveSummary = executiveSummary;
    }

    public List<EmployerPreferenceType> getEmployerPreferences() {
        if (employerPreferences == null) {
            employerPreferences = new ArrayList<EmployerPreferenceType>();
        }
        return this.employerPreferences;
    }

    public List<PositionPreferenceType> getPositionPreferences() {
        if (positionPreferences == null) {
        positionPreferences = new ArrayList<PositionPreferenceType>();
    }
        return this.positionPreferences;
    }

    public List<CandidateRelationshipType> getCandidateRelationships() {
        if (candidateRelationships == null) {
            candidateRelationships = new ArrayList<CandidateRelationshipType>();
        }
        return this.candidateRelationships;
    }

    public List<CandidateSourceType> getCandidateSources() {
        if (candidateSources == null) {
            candidateSources = new ArrayList<CandidateSourceType>();
        }
        return this.candidateSources;
    }

    public ProcessHistoryType getApplicationProcessHistory() {
        return applicationProcessHistory;
    }

    public void setApplicationProcessHistory(ProcessHistoryType applicationProcessHistory) {
        this.applicationProcessHistory = applicationProcessHistory;
    }

    public List<WorkLifeCycleType> getWorkLifeCycles() {
        if (workLifeCycles == null) {
            workLifeCycles = new ArrayList<WorkLifeCycleType>(  );
        }
        return this.workLifeCycles;
    }
}




