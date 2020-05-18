package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateProfileType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonProfileInclusion", propOrder = {

})
public class PersonProfileInclusion {

    protected String profileName;
    protected LanguageCodeList languageCode;
    protected List<EducationAttendanceType> education;
    protected List<EmployerHistoryType> employment;
    protected List<MilitaryServiceType> militaryService;
    protected List<LicenseType> licenses;
    protected List<CertificationType> certifications;
    protected List<PatentType> patents;
    protected List<PublicationType> publications;
    protected List<PersonCompetencyType> qualifications;
    protected List<OrganizationAffiliationType> affiliations;
    protected List<CertificationType> securityCredentials;
    protected List<RefereeType> references;
    protected List<AttachmentType> attachments;

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
}
