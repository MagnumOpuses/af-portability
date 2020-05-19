package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateType;
import se.arbetsformedlingen.matchning.portability.dto.EnvelopeType;

import java.util.List;

public class EnvelopeTypeBuilder {
    private EnvelopeType envelopeType = new EnvelopeType();

    public EnvelopeTypeBuilder setSessionToken(String sessionToken) {
        envelopeType.sessionToken = sessionToken;
        return this;
    }

    public EnvelopeTypeBuilder setSource(EnvelopeType.Source source) {
        envelopeType.source = source;
        return this;
    }

    public EnvelopeTypeBuilder setSink(EnvelopeType.Sink sink) {
        envelopeType.sink = sink;
        return this;
    }

    public EnvelopeTypeBuilder setConsent(EnvelopeType.Consent consent) {
        envelopeType.consent = consent;
        return this;
    }

    public EnvelopeTypeBuilder setData(List<CandidateType> data) {
        envelopeType.data = data;
        return this;
    }

    public EnvelopeType build() {
        return envelopeType;
    }
}