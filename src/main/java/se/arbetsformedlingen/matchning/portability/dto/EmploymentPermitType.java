package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentPermitType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(final EntityType type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public EffectiveTimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    public void setEffectiveTimePeriod(final EffectiveTimePeriodType effectiveTimePeriod) {
        this.effectiveTimePeriod = effectiveTimePeriod;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(final String issued) {
        this.issued = issued;
    }

    public String getFirstIssued() {
        return firstIssued;
    }

    public void setFirstIssued(final String firstIssued) {
        this.firstIssued = firstIssued;
    }

    public OrganizationType getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(final OrganizationType issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
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

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }

    public CountryCodeList getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final CountryCodeList countryCode) {
        this.countryCode = countryCode;
    }

    public List<AddressComponentType> getCountrySubDivisions() {
        if (countrySubDivisions == null) {
            countrySubDivisions = new ArrayList<AddressComponentType>();
        }
        return this.countrySubDivisions;
    }

    public void setCountrySubDivisions(final List<AddressComponentType> countrySubDivisions) {
        this.countrySubDivisions = countrySubDivisions;
    }
}
