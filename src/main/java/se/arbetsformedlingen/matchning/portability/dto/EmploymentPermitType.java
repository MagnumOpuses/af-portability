package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentPermitType", propOrder = {

})
public class EmploymentPermitType {

    protected IdentifierType id;
    protected String name;
    protected EntityType type;
    protected String status;
    protected EffectiveTimePeriodType effectiveTimePeriod;
    protected String issued;
    protected String firstIssued;
    protected OrganizationType issuingAuthority;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected StringTypeArray descriptions;
    protected CountryCodeList countryCode;
    protected List<AddressComponentType> countrySubDivisions;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EffectiveTimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    public void setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        this.effectiveTimePeriod = effectiveTimePeriod;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getFirstIssued() {
        return firstIssued;
    }

    public void setFirstIssued(String firstIssued) {
        this.firstIssued = firstIssued;
    }

    public OrganizationType getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(OrganizationType issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }

    public CountryCodeList getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCodeList countryCode) {
        this.countryCode = countryCode;
    }

    public List<AddressComponentType> getCountrySubDivisions() {
        if (countrySubDivisions == null) {
            countrySubDivisions = new ArrayList<AddressComponentType>();
        }
        return this.countrySubDivisions;
    }
}
