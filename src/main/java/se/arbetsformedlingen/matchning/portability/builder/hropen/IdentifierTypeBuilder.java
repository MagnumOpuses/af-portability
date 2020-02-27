package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;

public class IdentifierTypeBuilder {
    private String value;
    private String schemeId;
    private String schemeVersionId;
    private String schemeAgencyId;
    private String description;
    private String schemeLink;
    private String agencyUri;

    public IdentifierTypeBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public IdentifierTypeBuilder setSchemeId(String schemeId) {
        this.schemeId = schemeId;
        return this;
    }

    public IdentifierTypeBuilder setSchemeVersionId(String schemeVersionId) {
        this.schemeVersionId = schemeVersionId;
        return this;
    }

    public IdentifierTypeBuilder setSchemeAgencyId(String schemeAgencyId) {
        this.schemeAgencyId = schemeAgencyId;
        return this;
    }

    public IdentifierTypeBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public IdentifierTypeBuilder setSchemeLink(String schemeLink) {
        this.schemeLink = schemeLink;
        return this;
    }

    public IdentifierTypeBuilder setAgencyUri(String agencyUri) {
        this.agencyUri = agencyUri;
        return this;
    }

    public IdentifierType createIdentifierType() {
        return new IdentifierType(value, schemeId, schemeVersionId, schemeAgencyId, description, schemeLink, agencyUri);
    }
}