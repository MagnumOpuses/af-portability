package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationAffiliationType", propOrder = {

})
public class OrganizationAffiliationType {

    protected OrganizationType organization;
    protected AffiliatedOrganizationTypeCodeList affiliationTypeCode;
    protected IdentifierType memberId;
    protected String role;
    protected XMLGregorianCalendar startDate;
    protected XMLGregorianCalendar endDate;
    protected StringTypeArray descriptions;
    protected List<AttachmentReferenceType> attachmentReferences;

    public OrganizationType getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    public AffiliatedOrganizationTypeCodeList getAffiliationTypeCode() {
        return affiliationTypeCode;
    }

    public void setAffiliationTypeCode(AffiliatedOrganizationTypeCodeList affiliationTypeCode) {
        this.affiliationTypeCode = affiliationTypeCode;
    }

    public IdentifierType getMemberId() {
        return memberId;
    }

    public void setMemberId(IdentifierType memberId) {
        this.memberId = memberId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(XMLGregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(XMLGregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public void setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }
}
