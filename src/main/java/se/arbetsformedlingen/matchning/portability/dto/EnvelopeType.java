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
    protected String sessionToken;
    protected Source source;
    protected Sink sink;
    protected Consent consent;
    protected List<CandidateType> data;

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

    private class Sink {
        protected String sinkId;
        protected String sinkName;
        protected String sourceDescription;
        protected List<String> purposeOfUse;

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
    }

    private class Source {
        protected String sinkId;
        protected String sinkName;
        protected String sinkDescription;
        protected List<String> purposeOfUse;

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

        public List<String> getPurposeOfUse() {

            if (purposeOfUse == null) {
                purposeOfUse = new ArrayList<String>();
            }
            return this.purposeOfUse;
        }
    }

    private class Consent {
        protected XMLGregorianCalendar consentTimestamp;
        protected String consentStatus;
        protected XMLGregorianCalendar consentRevokedTimestamp;
        protected String consentedTimePeriod;
        protected List<String> acceptedTerms;
        protected List<String> acceptedPurposes;

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

        public List<String> getAcceptedPurposes() {
            if (acceptedPurposes == null) {
                acceptedPurposes = new ArrayList<String>();
            }
            return this.acceptedPurposes;
        }
    }

}
