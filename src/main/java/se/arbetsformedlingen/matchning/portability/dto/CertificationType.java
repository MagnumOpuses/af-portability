package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationType", propOrder = {

})
public class CertificationType {

    protected IdentifierType id;
    protected String name;
    protected EntityType type;
    protected String status;
    protected EffectiveTimePeriodType effectiveTimePeriod;
    protected String issued;
    protected String firstIssued;
    protected OrganizationType issuingAuthority;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected List<String> descriptions;

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
        return attachmentReferences;
    }

    public void setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public List<String> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        return this.descriptions;
    }
}
