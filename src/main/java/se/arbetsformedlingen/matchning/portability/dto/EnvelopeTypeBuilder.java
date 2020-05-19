package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;

public class EnvelopeTypeBuilder {
    private String sessionToken;
    private EnvelopeType.Source source;
    private EnvelopeType.Sink sink;
    private EnvelopeType.Consent consent;
    private List<CandidateType> data;

    public EnvelopeTypeBuilder setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    public EnvelopeTypeBuilder setSource(EnvelopeType.Source source) {
        this.source = source;
        return this;
    }

    public EnvelopeTypeBuilder setSink(EnvelopeType.Sink sink) {
        this.sink = sink;
        return this;
    }

    public EnvelopeTypeBuilder setConsent(EnvelopeType.Consent consent) {
        this.consent = consent;
        return this;
    }

    public EnvelopeTypeBuilder setData(List<CandidateType> data) {
        this.data = data;
        return this;
    }

    public EnvelopeType createEnvelopeType() {
        return new EnvelopeType(sessionToken, source, sink, consent, data);
    }
}