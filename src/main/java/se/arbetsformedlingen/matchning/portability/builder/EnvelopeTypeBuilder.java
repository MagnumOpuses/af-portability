package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateType;
import se.arbetsformedlingen.matchning.portability.dto.EnvelopeType;

import java.util.List;

public class EnvelopeTypeBuilder {
    private EnvelopeType envelopeType = new EnvelopeType();

    public EnvelopeTypeBuilder setSessionToken(String sessionToken) {
        envelopeType.setSessionToken(sessionToken);
        return this;
    }

    public EnvelopeTypeBuilder setSource(EnvelopeType.Source source) {
        envelopeType.setSource(source);
        return this;
    }

    public EnvelopeTypeBuilder setSink(EnvelopeType.Sink sink) {
        envelopeType.setSink(sink);
        return this;
    }

    public EnvelopeTypeBuilder setConsent(EnvelopeType.Consent consent) {
        envelopeType.setConsent(consent);
        return this;
    }

    public EnvelopeTypeBuilder setData(List<CandidateType> data) {
        envelopeType.getData().addAll(data);
        return this;
    }

    public EnvelopeType build() {
        return envelopeType;
    }
}