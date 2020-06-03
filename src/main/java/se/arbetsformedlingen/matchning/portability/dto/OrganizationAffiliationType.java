package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationAffiliationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationAffiliationType {

    protected OrganizationType organization;
    protected AffiliatedOrganizationTypeCodeList affiliationTypeCode;
    protected IdentifierType memberId;
    protected String role;
    protected XMLGregorianCalendar startDate;
    protected XMLGregorianCalendar endDate;
    protected List<String> descriptions;
    protected List<AttachmentReferenceType> attachmentReferences;

    public OrganizationType getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationType organization) {
        this.organization = organization;
    }

    public AffiliatedOrganizationTypeCodeList getAffiliationTypeCode() {
        return affiliationTypeCode;
    }

    public void setAffiliationTypeCode(final AffiliatedOrganizationTypeCodeList affiliationTypeCode) {
        this.affiliationTypeCode = affiliationTypeCode;
    }

    public IdentifierType getMemberId() {
        return memberId;
    }

    public void setMemberId(final IdentifierType memberId) {
        this.memberId = memberId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(final XMLGregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(final XMLGregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public void setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }
}
