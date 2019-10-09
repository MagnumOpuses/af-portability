package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;
import se.arbetsformedlingen.matchning.taxonomy.model.TaxonomyConcept;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class  Profile {
    private String languageCode = "sv-SE";
    private String executiveSummary;
    private Identifier profileId;
    private List<Identifier> alternateIds;
    private String profileName;
    private PersonAvailability personAvailability;
    private DistributionGuidelines distributionGuidelines;
    private EmployerPreference employerPreferences;
    private String description;
    private PositionPreference positionPreferences;
    private List<Employment> employment;
    private List<Education> education;
    private List<License> licenses;
    private List<Certificate> certifications;
    private List<Patent> patents;
    private List<Publication> publications;
    private List<Qualification> qualifications;
    private List<Organization> affiliations;
    private List<Certificate> securityCredentials;
    private List<Reference> references;
    private List<Attachment> attachments;


    public String getExecutiveSummary() { return executiveSummary; }

    public void setExecutiveSummary(String executiveSummary) {  this.executiveSummary = executiveSummary;  }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Identifier getProfileId() {
        return profileId;
    }

    public void setProfileId(Identifier profileId) {
        this.profileId = profileId;
    }

    public List<Identifier> getAlternateIds() {
        return alternateIds;
    }

    public void setAlternateIds(List<Identifier> alternateIds) {
        this.alternateIds = alternateIds;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public PersonAvailability getPersonAvailability() {
        return personAvailability;
    }

    public void setPersonAvailability(PersonAvailability personAvailability) {
        this.personAvailability = personAvailability;
    }

    public DistributionGuidelines getDistributionGuidelines() {
        return distributionGuidelines;
    }

    public void setDistributionGuidelines(DistributionGuidelines distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
    }

    public EmployerPreference getEmployerPreferences() {
        return employerPreferences;
    }

    public void setEmployerPreferences(EmployerPreference employerPreferences) {
        this.employerPreferences = employerPreferences;
    }

    public PositionPreference getPositionPreferences() {
        return positionPreferences;
    }

    public void setPositionPreferences(PositionPreference positionPreferences) {
        this.positionPreferences = positionPreferences;
    }

    public List<Employment> getEmployment() {
        return employment;
    }

    public void setEmployment(List<Employment> employment) {
        this.employment = employment;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<License> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Certificate> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certificate> certifications) {
        this.certifications = certifications;
    }

    public List<Patent> getPatents() {
        return patents;
    }

    public void setPatents(List<Patent> patents) {
        this.patents = patents;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public List<Organization> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<Organization> affiliations) {
        this.affiliations = affiliations;
    }

    public List<Certificate> getSecurityCredentials() {
        return securityCredentials;
    }

    public void setSecurityCredentials(List<Certificate> securityCredentials) {
        this.securityCredentials = securityCredentials;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /* Builder methods */
    public Profile withDriversLicence(String type, String description) {
        License license = new License();
        license.setName("Körkort");
        license.setType(new Entity("Körkort", "Drivers license"));
        LicenseDetail detail = new LicenseDetail();
        detail.setValue(type);
        detail.setDescription(description);
        license.withEndorsement(detail);
        getCreateLicenses().add(license);
        return this;
    }

    // TODO: Set all relevant values in positionproferences and employerpreferences
    public Profile withWantedConcept(TaxonomyConcept t) {
        if (t != null && t.getType() == Concept.EntityType.jobterm) {
            // Add term to positionpreferences and field to employerpreferences
            getCreateEmployerPreferences().withIndustryCode(t.getParent().getId() + " - " + t.getParent().getLabel(), "SSYK");
            getCreatePositionPreferences().withPositionTitle(t.getLabel()).withJobCategory(t.getField().getId() +  " - " + t.getField().getLabel(), "AF Taxonomy Field");
        }
        return this;
    }

    public Profile withConcept(Concept c) {
        if (c.getType() == Concept.EntityType.jobterm) {
            getCreateEmployment().add(new Employment().withTitle(c.getLabel()).withIndustryCodes(c.getId(), "AF Taxonomy Occupation"));
        } else if(c.getType() == Concept.EntityType.skill) {
            //getCreateEmployment().add(new Employment().withTitle(c.getLabel()).withIndustryCodes(c.getId(), "AF Taxonomy"));
            getCreateQualifications().add(new Qualification().withCompetencyName(c.getLabel()).withIdentifier(c.getId(), "AF Taxonomy Skill"));
        } else {
            throw new RuntimeException("DON'T KNOW TO HANDLE CONCEPT OF TYPE " + c.getType());
        }
        return this;
    }

    public Profile withEmployment(Employment employment) {
        getCreateEmployment().add(employment);
        return this;
    }

    public Profile withQualification(Qualification qualification) {
        getCreateQualifications().add(qualification);
        return this;
    }

    public Profile withEducation(Education education) {
        getCreateEducation().add(education);
        return this;
    }

    public Profile withWantedLocation(String kommunkod) {
        getCreatePositionPreferences().withLocation(kommunkod);
        return this;
    }

    /* Get-methods that create object if null */
    private List<License> getCreateLicenses() {
        if (this.licenses == null) {
            this.licenses = new ArrayList<>();
        }
        return this.licenses;
    }

    private PositionPreference getCreatePositionPreferences() {
        if (this.positionPreferences == null) {
            this.positionPreferences = new PositionPreference();
        }
        return this.positionPreferences;
    }

    private EmployerPreference getCreateEmployerPreferences() {
        if (this.employerPreferences == null) {
            this.employerPreferences = new EmployerPreference();
        }
        return this.employerPreferences;
    }

    private List<Employment> getCreateEmployment() {
        if (this.employment == null) {
            this.employment = new ArrayList<>();
        }
        return this.employment;
    }

    private List<Qualification> getCreateQualifications() {
        if (this.qualifications == null) {
            this.qualifications = new ArrayList<>();
        }
        return this.qualifications;
    }

    private List<Education> getCreateEducation() {
        if (this.education == null) {
            this.education = new ArrayList<>();
        }
        return this.education;
    }

}
