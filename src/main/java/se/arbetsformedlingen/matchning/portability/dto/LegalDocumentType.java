package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalDocumentType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegalDocumentType {

    @XmlElement(required = true)
    protected String value;
    protected String schemeId;
    protected String schemeVersionId;
    protected String schemeAgencyId;
    protected String description;
    protected String schemeLink;
    protected String agencyUri;
    protected String documentType;
    protected String issuingAuthority;
    protected XMLGregorianCalendar issueDate;
    protected XMLGregorianCalendar expirationDate;

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

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(final String documentType) {
        this.documentType = documentType;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(final String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(final XMLGregorianCalendar issueDate) {
        this.issueDate = issueDate;
    }

    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final XMLGregorianCalendar expirationDate) {
        this.expirationDate = expirationDate;
    }
}
