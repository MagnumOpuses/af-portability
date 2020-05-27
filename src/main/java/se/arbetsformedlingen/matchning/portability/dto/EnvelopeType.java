package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidatePersonType", propOrder = {

})

public class EnvelopeType {
    public String sessionToken;
    public Source source;
    public Sink sink;
    public Consent consent;
    public List<CandidateType> data;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public Consent getConsent() {
        return consent;
    }

    public void setConsent(Consent consent) {
        this.consent = consent;
    }

    public List<CandidateType> getData() {
        if (data == null) {
            data = new ArrayList<CandidateType>();
        }
        return this.data;
    }

    public void setData(List<CandidateType> data) {
        this.data = data;
    }

    public class Sink {
        public String sinkId;
        public String sinkName;
        public String sourceDescription;
        public List<String> purposeOfUse;

        public String getSinkId() {
            return sinkId;
        }

        public void setSinkId(String sinkId) {
            this.sinkId = sinkId;
        }

        public String getSinkName() {
            return sinkName;
        }

        public void setSinkName(String sinkName) {
            this.sinkName = sinkName;
        }

        public String getSourceDescription() {
            return sourceDescription;
        }

        public void setSourceDescription(String sourceDescription) {
            this.sourceDescription = sourceDescription;
        }

        public List<String> getPurposeOfUse() {
            if (purposeOfUse == null) {
                purposeOfUse = new ArrayList<String>();
            }
            return this.purposeOfUse;
        }

        public void setPurposeOfUse(List<String> purposeOfUse) {
            this.purposeOfUse = purposeOfUse;
        }
    }

    public class Source {
        public String sinkId;
        public String sinkName;
        public String sinkDescription;
        public List<String> termsAndConditions;

        public String getSinkId() {
            return sinkId;
        }

        public void setSinkId(String sinkId) {
            this.sinkId = sinkId;
        }

        public String getSinkName() {
            return sinkName;
        }

        public void setSinkName(String sinkName) {
            this.sinkName = sinkName;
        }

        public String getSinkDescription() {
            return sinkDescription;
        }

        public void setSinkDescription(String sinkDescription) {
            this.sinkDescription = sinkDescription;
        }

        public List<String> getTermsAndConditions() {

            if (termsAndConditions == null) {
                termsAndConditions = new ArrayList<String>();
            }
            return this.termsAndConditions;
        }

        public void setTermsAndConditions(List<String> termsAndConditions) {
            this.termsAndConditions = termsAndConditions;
        }
    }

    public class Consent {
        public XMLGregorianCalendar consentTimestamp;
        public String consentStatus;
        public XMLGregorianCalendar consentRevokedTimestamp;
        public String consentedTimePeriod;
        public List<String> acceptedTerms;
        public List<String> acceptedPurposes;

        public XMLGregorianCalendar getConsentTimestamp() {
            return consentTimestamp;
        }

        public void setConsentTimestamp(XMLGregorianCalendar consentTimestamp) {
            this.consentTimestamp = consentTimestamp;
        }

        public String getConsentStatus() {
            return consentStatus;
        }

        public void setConsentStatus(String consentStatus) {
            this.consentStatus = consentStatus;
        }

        public XMLGregorianCalendar getConsentRevokedTimestamp() {
            return consentRevokedTimestamp;
        }

        public void setConsentRevokedTimestamp(XMLGregorianCalendar consentRevokedTimestamp) {
            this.consentRevokedTimestamp = consentRevokedTimestamp;
        }

        public String getConsentedTimePeriod() {
            return consentedTimePeriod;
        }

        public void setConsentedTimePeriod(String consentedTimePeriod) {
            this.consentedTimePeriod = consentedTimePeriod;
        }

        public List<String> getAcceptedTerms() {
            if (acceptedTerms == null) {
                acceptedTerms = new ArrayList<String>();
            }
            return this.acceptedTerms;
        }

        public void setAcceptedTerms(List<String> acceptedTerms) {
            this.acceptedTerms = acceptedTerms;
        }

        public List<String> getAcceptedPurposes() {
            if (acceptedPurposes == null) {
                acceptedPurposes = new ArrayList<String>();
            }
            return this.acceptedPurposes;
        }

        public void setAcceptedPurposes(List<String> acceptedPurposes) {
            this.acceptedPurposes = acceptedPurposes;
        }
    }

}