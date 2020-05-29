package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.Consent;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class ConsentBuilder {
    private Consent consent = new Consent();

    public ConsentBuilder setConsentTimestamp(XMLGregorianCalendar consentTimestamp) {
        consent.setConsentTimestamp(consentTimestamp);
        return this;
    }

    public ConsentBuilder setConsentStatus(String consentStatus) {
        consent.setConsentStatus(consentStatus);
        return this;
    }

    public ConsentBuilder setConsentRevokedTimestamp(XMLGregorianCalendar consentRevokedTimestamp) {
        consent.setConsentRevokedTimestamp(consentRevokedTimestamp);
        return this;
    }

    public ConsentBuilder setConsentedTimePeriod(String consentedTimePeriod) {
        consent.setConsentedTimePeriod(consentedTimePeriod);
        return this;
    }

    public ConsentBuilder setAcceptedTerms(List<String> acceptedTerms) {
        consent.setAcceptedTerms(acceptedTerms);
        return this;
    }

    public ConsentBuilder setAcceptedPurposes(List<String> acceptedPurposes) {
        setAcceptedPurposes(acceptedPurposes);
        return this;
    }

    public Consent createConsent() {
        return consent;
    }
}