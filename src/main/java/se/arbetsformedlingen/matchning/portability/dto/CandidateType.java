package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateType {

    public IdentifierType documentId;
    public List<IdentifierType> alternateIds;
    public LanguageCodeList language;
    public String uri;
    public DistributionGuidelinesType distributionGuidelines;
    public CandidatePersonType person;
    public List<CandidateProfileType> profiles;


    public IdentifierType getDocumentId() {
        return documentId;
    }

    public void setDocumentId(final IdentifierType documentId) {
        this.documentId = documentId;
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

    public LanguageCodeList getLanguage() {
        return language;
    }

    public void setLanguage(final LanguageCodeList language) {
        this.language = language;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public DistributionGuidelinesType getDistributionGuidelines() {
        return distributionGuidelines;
    }

    public void setDistributionGuidelines(final DistributionGuidelinesType distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
    }

    public CandidatePersonType getPerson() {
        return person;
    }

    public void setPerson(final CandidatePersonType person) {
        this.person = person;
    }

    public List<CandidateProfileType> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<CandidateProfileType>();
        }
        return this.profiles;
    }

    public void setProfiles(final List<CandidateProfileType> profiles) {
        this.profiles = profiles;
    }
}
