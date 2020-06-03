package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdentifierType {

    @XmlElement(required = true)
    public String value;
    public String schemeId;
    public String schemeVersionId;
    public String schemeAgencyId;
    public String description;
    public String schemeLink;
    public String agencyUri;


    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(final String schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeVersionId() {
        return schemeVersionId;
    }

    public void setSchemeVersionId(final String schemeVersionId) {
        this.schemeVersionId = schemeVersionId;
    }

    public String getSchemeAgencyId() {
        return schemeAgencyId;
    }

    public void setSchemeAgencyId(final String schemeAgencyId) {
        this.schemeAgencyId = schemeAgencyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getSchemeLink() {
        return schemeLink;
    }

    public void setSchemeLink(final String schemeLink) {
        this.schemeLink = schemeLink;
    }

    public String getAgencyUri() {
        return agencyUri;
    }

    public void setAgencyUri(final String agencyUri) {
        this.agencyUri = agencyUri;
    }
}
