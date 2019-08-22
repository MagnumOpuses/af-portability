package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.net.URI;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Identifier {
    private String valueId;
    private String schemeId;
    private String schemeAgencyId;
    private String schemeVersionId;
    private String description;
    private URI schemeLink;
    private URI agencyURI;

    public Identifier() {}

    public Identifier(String idValue) {
        valueId = idValue;
    }

    public Identifier(String idValue, String idScheme) {
        valueId = idValue;
        schemeId = idScheme;
    }

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeAgencyId() {
        return schemeAgencyId;
    }

    public void setSchemeAgencyId(String schemeAgencyId) {
        this.schemeAgencyId = schemeAgencyId;
    }

    public String getSchemeVersionId() {
        return schemeVersionId;
    }

    public void setSchemeVersionId(String schemeVersionId) {
        this.schemeVersionId = schemeVersionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchemeLink() {
        return (schemeLink == null ? null: schemeLink.toString());
    }

    public void setSchemeLink(URI schemeLink) {
        this.schemeLink = schemeLink;
    }

    public String getAgencyURI() {
        return (agencyURI == null ? null : agencyURI.toString());
    }

    public void setAgencyURI(URI agencyURI) {
        this.agencyURI = agencyURI;
    }

    @Override
    public String toString() {
        return valueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identifier)) return false;
        Identifier that = (Identifier) o;
        return Objects.equals(getValueId(), that.getValueId()) &&
                Objects.equals(getSchemeId(), that.getSchemeId()) &&
                Objects.equals(getSchemeAgencyId(), that.getSchemeAgencyId()) &&
                Objects.equals(getSchemeVersionId(), that.getSchemeVersionId()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getSchemeLink(), that.getSchemeLink()) &&
                Objects.equals(getAgencyURI(), that.getAgencyURI());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getValueId(), getSchemeId(), getSchemeAgencyId(), getSchemeVersionId(), getDescription(), getSchemeLink(), getAgencyURI());
    }
}
