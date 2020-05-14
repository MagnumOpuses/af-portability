package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {

})
public class IdentifierType {

    @XmlElement(required = true)
    protected String value;
    protected String schemeId;
    protected String schemeVersionId;
    protected String schemeAgencyId;
    protected String description;
    protected String schemeLink;
    protected String agencyUri;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeVersionId() {
        return schemeVersionId;
    }

    public void setSchemeVersionId(String schemeVersionId) {
        this.schemeVersionId = schemeVersionId;
    }

    public String getSchemeAgencyId() {
        return schemeAgencyId;
    }

    public void setSchemeAgencyId(String schemeAgencyId) {
        this.schemeAgencyId = schemeAgencyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchemeLink() {
        return schemeLink;
    }

    public void setSchemeLink(String schemeLink) {
        this.schemeLink = schemeLink;
    }

    public String getAgencyUri() {
        return agencyUri;
    }

    public void setAgencyUri(String agencyUri) {
        this.agencyUri = agencyUri;
    }
}
