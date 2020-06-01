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


}