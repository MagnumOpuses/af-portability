package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class EnvelopeTypeBuilder {
    private EnvelopeType envelopeType = new EnvelopeType();

    public EnvelopeTypeBuilder setSessionToken(String sessionToken) {
        envelopeType.setSessionToken(sessionToken);
        return this;
    }

    public EnvelopeTypeBuilder setSource(Source source) {
        envelopeType.setSource(source);
        return this;
    }

    public EnvelopeTypeBuilder setSink(Sink sink) {
        envelopeType.setSink(sink);
        return this;
    }

    public EnvelopeTypeBuilder setConsent(Consent consent) {
        envelopeType.setConsent(consent);
        return this;
    }

    public EnvelopeTypeBuilder setTransferObject(TransferObject transferObject) {
        envelopeType.setTransferObject(transferObject);
        return this;
    }

    public EnvelopeType build() {
        return envelopeType;
    }
}