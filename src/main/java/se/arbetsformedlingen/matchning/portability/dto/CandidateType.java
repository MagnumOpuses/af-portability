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

    protected IdentifierType documentId;
    protected List<IdentifierType> alternateIds;
    protected LanguageCodeList language;
    protected String uri;
    protected DistributionGuidelinesType distributionGuidelines;
    protected CandidatePersonType person;
    protected List<CandidateProfileType> profiles;

    public IdentifierType getDocumentId() {
        return documentId;
    }

    public void setDocumentId(IdentifierType documentId) {
        this.documentId = documentId;
    }

    public List<IdentifierType> getAlternateIds() {
        return alternateIds;
    }

    public void setAlternateIds(List<IdentifierType> alternateIds) {
        this.alternateIds = alternateIds;
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
        return profiles;
    }

    public void setProfiles(List<CandidateProfileType> profiles) {
        this.profiles = profiles;
    }
}
