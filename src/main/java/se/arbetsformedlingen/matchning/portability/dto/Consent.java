package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

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

