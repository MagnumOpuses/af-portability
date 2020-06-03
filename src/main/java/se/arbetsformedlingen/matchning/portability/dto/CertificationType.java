package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CertificationType {

    public IdentifierType id;
    public String name;
    public EntityType type;
    public String status;
    public EffectiveTimePeriodType effectiveTimePeriod;
    public String issued;
    public String firstIssued;
    public OrganizationType issuingAuthority;
    public List<AttachmentReferenceType> attachmentReferences;
    public List<String> descriptions;


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
        return attachmentReferences;
    }

    public void setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public List<String> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        return this.descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
