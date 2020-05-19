package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.IdentifierType;

public class IdentifierTypeBuilder {
    private IdentifierType identifierType = new IdentifierType();


    public IdentifierTypeBuilder setValue(String value) {
        identifierType.value = value;
        return this;
    }

    public IdentifierTypeBuilder setSchemeId(String schemeId) {
        identifierType.schemeId = schemeId;
        return this;
    }

    public IdentifierTypeBuilder setSchemeVersionId(String schemeVersionId) {
        identifierType.schemeVersionId = schemeVersionId;
        return this;
    }

    public IdentifierTypeBuilder setSchemeAgencyId(String schemeAgencyId) {
        identifierType.schemeAgencyId = schemeAgencyId;
        return this;
    }

    public IdentifierTypeBuilder setDescription(String description) {
        identifierType.description = description;
        return this;
    }

    public IdentifierTypeBuilder setSchemeLink(String schemeLink) {
        identifierType.schemeLink = schemeLink;
        return this;
    }

    public IdentifierTypeBuilder setAgencyUri(String agencyUri) {
        identifierType.agencyUri = agencyUri;
        return this;
    }

    public IdentifierType build() {
        return identifierType;
    }
}