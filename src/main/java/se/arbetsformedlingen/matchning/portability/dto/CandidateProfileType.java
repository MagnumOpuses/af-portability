package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateProfileType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateProfileType {
    public IdentifierType profileId;
    public String profileName;
    public LanguageCodeList languageCode;
    public List<EducationAttendanceType> education;
    public List<EmployerHistoryType> employment;
    public List<MilitaryServiceType> militaryService;
    public List<LicenseType> licenses;
    public List<CertificationType> certifications;
    public List<PatentType> patents;
    public List<PublicationType> publications;
    public List<PersonCompetencyType> qualifications;
    public List<OrganizationAffiliationType> affiliations;
    public List<CertificationType> securityCredentials;
    public List<RefereeType> references;
    public List<AttachmentType> attachments;
    public List<IdentifierType> alternateIds;
    public PersonAvailabilityType personAvailability;
    public String processingInformation;
    public DistributionGuidelinesType distributionGuidelines;
    public List<AssociatedPositionOpeningType> associatedPositionOpenings;
    public String objective;
    public String executiveSummary;
    public List<EmployerPreferenceType> employerPreferences;
    public List<PositionPreferenceType> positionPreferences;
    public List<CandidateRelationshipType> candidateRelationships;
    public List<CandidateSourceType> candidateSources;
    public ProcessHistoryType applicationProcessHistory;
    public List<WorkLifeCycleType> workLifeCycles;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(final String profileName) {
        this.profileName = profileName;
    }

    public LanguageCodeList getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(final LanguageCodeList languageCode) {
        this.languageCode = languageCode;
    }

    public List<EducationAttendanceType> getEducation() {
        if (education == null) {
            education = new ArrayList<EducationAttendanceType>();
        }
        return this.education;
    }

    public void setEducation(final List<EducationAttendanceType> education) {
        this.education = education;
    }

    public List<EmployerHistoryType> getEmployment() {
        if (employment == null) {
            employment = new ArrayList<EmployerHistoryType>();
        }
        return this.employment;
    }

    public void setEmployment(final List<EmployerHistoryType> employment) {
        this.employment = employment;
    }

    public List<MilitaryServiceType> getMilitaryService() {
        if (militaryService == null) {
            militaryService = new ArrayList<MilitaryServiceType>();
        }
        return this.militaryService;
    }

    public void setMilitaryService(final List<MilitaryServiceType> militaryService) {
        this.militaryService = militaryService;
    }

    public List<LicenseType> getLicenses() {
        if (licenses == null) {
            licenses = new ArrayList<LicenseType>();
        }
        return this.licenses;
    }

    public void setLicenses(final List<LicenseType> licenses) {
        this.licenses = licenses;
    }

    public List<CertificationType> getCertifications() {
        if (certifications == null) {
            certifications = new ArrayList<CertificationType>();
        }
        return this.certifications;
    }

    public void setCertifications(final List<CertificationType> certifications) {
        this.certifications = certifications;
    }

    public List<PatentType> getPatents() {
        if (patents == null) {
            patents = new ArrayList<PatentType>();
        }
        return this.patents;
    }

    public void setPatents(final List<PatentType> patents) {
        this.patents = patents;
    }

    public List<PublicationType> getPublications() {
        if (publications == null) {
            publications = new ArrayList<PublicationType>();
        }
        return this.publications;
    }

    public void setPublications(final List<PublicationType> publications) {
        this.publications = publications;
    }

    public List<PersonCompetencyType> getQualifications() {
        if (qualifications == null) {
            qualifications = new ArrayList<PersonCompetencyType>();
        }
        return this.qualifications;
    }

    public void setQualifications(final List<PersonCompetencyType> qualifications) {
        this.qualifications = qualifications;
    }

    public List<OrganizationAffiliationType> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<OrganizationAffiliationType>();
        }
        return this.affiliations;
    }

    public void setAffiliations(final List<OrganizationAffiliationType> affiliations) {
        this.affiliations = affiliations;
    }

    public List<CertificationType> getSecurityCredentials() {
        if (securityCredentials == null) {
            securityCredentials = new ArrayList<CertificationType>();
        }
        return this.securityCredentials;
    }

    public void setSecurityCredentials(final List<CertificationType> securityCredentials) {
        this.securityCredentials = securityCredentials;
    }

    public List<RefereeType> getReferences() {
        if (references == null) {
            references = new ArrayList<RefereeType>();
        }
        return this.references;
    }

    public void setReferences(final List<RefereeType> references) {
        this.references = references;
    }

    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentType>();
        }
        return this.attachments;
    }

    public void setAttachments(final List<AttachmentType> attachments) {
        this.attachments = attachments;
    }

    public IdentifierType getProfileId() {
        return profileId;
    }

    public void setProfileId(final IdentifierType profileId) {
        this.profileId = profileId;
    }

    public List<IdentifierType> getAlternateIds() {
        if (alternateIds == null) {
            alternateIds = new ArrayList<IdentifierType>();
        }
        return this.alternateIds;
    }

    public void setAlternateIds(final List<IdentifierType> alternateIds) {
        this.alternateIds = alternateIds;
    }

    public PersonAvailabilityType getPersonAvailability() {
        return personAvailability;
    }

    public void setPersonAvailability(final PersonAvailabilityType personAvailability) {
        this.personAvailability = personAvailability;
    }

    public String getProcessingInformation() {
        return processingInformation;
    }

    public void setProcessingInformation(final String processingInformation) {
        this.processingInformation = processingInformation;
    }

    public DistributionGuidelinesType getDistributionGuidelines() {
        return distributionGuidelines;
    }

    public void setDistributionGuidelines(final DistributionGuidelinesType distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
    }

    public List<AssociatedPositionOpeningType> getAssociatedPositionOpenings() {
        if (associatedPositionOpenings == null) {
            associatedPositionOpenings = new ArrayList<AssociatedPositionOpeningType>();
        }
        return this.associatedPositionOpenings;
    }

    public void setAssociatedPositionOpenings(final List<AssociatedPositionOpeningType> associatedPositionOpenings) {
        this.associatedPositionOpenings = associatedPositionOpenings;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(final String objective) {
        this.objective = objective;
    }

    public String getExecutiveSummary() {
        return executiveSummary;
    }

    public void setExecutiveSummary(final String executiveSummary) {
        this.executiveSummary = executiveSummary;
    }

    public List<EmployerPreferenceType> getEmployerPreferences() {
        if (employerPreferences == null) {
            employerPreferences = new ArrayList<EmployerPreferenceType>();
        }
        return this.employerPreferences;
    }

    public void setEmployerPreferences(final List<EmployerPreferenceType> employerPreferences) {
        this.employerPreferences = employerPreferences;
    }

    public List<PositionPreferenceType> getPositionPreferences() {
        if (positionPreferences == null) {
            positionPreferences = new ArrayList<PositionPreferenceType>();
        }
        return this.positionPreferences;
    }

    public void setPositionPreferences(final List<PositionPreferenceType> positionPreferences) {
        this.positionPreferences = positionPreferences;
    }

    public List<CandidateRelationshipType> getCandidateRelationships() {
        if (candidateRelationships == null) {
            candidateRelationships = new ArrayList<CandidateRelationshipType>();
        }
        return this.candidateRelationships;
    }

    public void setCandidateRelationships(final List<CandidateRelationshipType> candidateRelationships) {
        this.candidateRelationships = candidateRelationships;
    }

    public List<CandidateSourceType> getCandidateSources() {
        if (candidateSources == null) {
            candidateSources = new ArrayList<CandidateSourceType>();
        }
        return this.candidateSources;
    }

    public void setCandidateSources(final List<CandidateSourceType> candidateSources) {
        this.candidateSources = candidateSources;
    }

    public ProcessHistoryType getApplicationProcessHistory() {
        return applicationProcessHistory;
    }

    public void setApplicationProcessHistory(final ProcessHistoryType applicationProcessHistory) {
        this.applicationProcessHistory = applicationProcessHistory;
    }

    public List<WorkLifeCycleType> getWorkLifeCycles() {
        if (workLifeCycles == null) {
            workLifeCycles = new ArrayList<WorkLifeCycleType>();
        }
        return this.workLifeCycles;
    }

    public void setWorkLifeCycles(final List<WorkLifeCycleType> workLifeCycles) {
        this.workLifeCycles = workLifeCycles;
    }
}




