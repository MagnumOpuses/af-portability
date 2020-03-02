package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;

public class IdentifierTypeBuilder {
    private IdentifierType identifierType = new IdentifierType();

    public IdentifierTypeBuilder setValue(String value) {
        identifierType.setValue(value);
        return this;
    }

    public IdentifierTypeBuilder setSchemeId(String schemeId) {
        identifierType.setSchemeId(schemeId);
        return this;
    }

    public IdentifierTypeBuilder setSchemeVersionId(String schemeVersionId) {
        identifierType.setSchemeVersionId(schemeVersionId);
        return this;
    }

    public IdentifierTypeBuilder setSchemeAgencyId(String schemeAgencyId) {
        identifierType.setSchemeAgencyId(schemeAgencyId);
        return this;
    }

    public IdentifierTypeBuilder setDescription(String description) {
        identifierType.setDescription(description);
        return this;
    }

    public IdentifierTypeBuilder setSchemeLink(String schemeLink) {
        identifierType.setSchemeLink(schemeLink);
        return this;
    }

    public IdentifierTypeBuilder setAgencyUri(String agencyUri) {
        identifierType.setAgencyUri(agencyUri);
        return this;
    }

    public IdentifierType build() {
        return identifierType;
    }
}