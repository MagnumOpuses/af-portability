package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Consent {
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    public XMLGregorianCalendar consentTimestamp;
    public boolean consentStatus;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    public XMLGregorianCalendar consentRevokedTimestamp;
    public String consentedTimePeriod;
    public List<String> acceptedTerms;
    public List<String> acceptedPurposes;


    public XMLGregorianCalendar getConsentTimestamp() {
        return consentTimestamp;
    }

    public void setConsentTimestamp(final XMLGregorianCalendar consentTimestamp) {
        this.consentTimestamp = consentTimestamp;
    }

    public boolean getConsentStatus() {
        return consentStatus;
    }

    public void setConsentStatus(final boolean consentStatus) {
        this.consentStatus = consentStatus;
    }

    public XMLGregorianCalendar getConsentRevokedTimestamp() {
        return consentRevokedTimestamp;
    }

    public void setConsentRevokedTimestamp(final XMLGregorianCalendar consentRevokedTimestamp) {
        this.consentRevokedTimestamp = consentRevokedTimestamp;
    }

    public String getConsentedTimePeriod() {
        return consentedTimePeriod;
    }

    public void setConsentedTimePeriod(final String consentedTimePeriod) {
        this.consentedTimePeriod = consentedTimePeriod;
    }

    public List<String> getAcceptedTerms() {
        if (acceptedTerms == null) {
            acceptedTerms = new ArrayList<String>();
        }
        return this.acceptedTerms;
    }

    public void setAcceptedTerms(final List<String> acceptedTerms) {
        this.acceptedTerms = acceptedTerms;
    }

    public List<String> getAcceptedPurposes() {
        if (acceptedPurposes == null) {
            acceptedPurposes = new ArrayList<String>();
        }
        return this.acceptedPurposes;
    }

    public void setAcceptedPurposes(final List<String> acceptedPurposes) {
        this.acceptedPurposes = acceptedPurposes;
    }
}

