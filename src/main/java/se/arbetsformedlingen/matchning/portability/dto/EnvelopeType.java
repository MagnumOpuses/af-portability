package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidatePersonType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvelopeType {
    public String sessionToken;
    public Source source;
    public Sink sink;
    public Consent consent;
    public TransferObject transferObject;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(final String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(final Source source) {
        this.source = source;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(final Sink sink) {
        this.sink = sink;
    }

    public Consent getConsent() {
        return consent;
    }

    public void setConsent(final Consent consent) {
        this.consent = consent;
    }

    public TransferObject getTransferObject() {
        return transferObject;
    }

    public void setTransferObject(final TransferObject transferObject) {
        this.transferObject = transferObject;
    }
}