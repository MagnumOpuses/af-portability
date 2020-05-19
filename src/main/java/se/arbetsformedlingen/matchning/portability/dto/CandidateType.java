package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateType", propOrder = {

})
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

    public void setDocumentId(IdentifierType documentId) {
        this.documentId = documentId;
    }

    public List<IdentifierType> getAlternateIds() {
        if (alternateIds == null) {
            alternateIds = new ArrayList<IdentifierType>();
        }
        return this.alternateIds;
    }

    public LanguageCodeList getLanguage() {
        return language;
    }

    public void setLanguage(LanguageCodeList language) {
        this.language = language;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public DistributionGuidelinesType getDistributionGuidelines() {
        return distributionGuidelines;
    }

    public void setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
    }

    public CandidatePersonType getPerson() {
        return person;
    }

    public void setPerson(CandidatePersonType person) {
        this.person = person;
    }

    public List<CandidateProfileType> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<CandidateProfileType>();
        }
        return this.profiles;
    }
}
