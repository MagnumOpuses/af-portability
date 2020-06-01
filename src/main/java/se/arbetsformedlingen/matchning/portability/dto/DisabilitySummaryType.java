package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisabilitySummaryType", propOrder = {

})
public class DisabilitySummaryType {

    protected IdentifierType disabilityId;
    protected String disabilityLevelCode;
    protected BigDecimal percentage;
    protected EntityType disabilityType;
    protected String disabilityDate;
    protected String disabilityCertifiedDate;
    protected String recoveryDate;
    protected List<String> accommodationTypeCode;
    protected CommentType comment;
    protected EffectiveTimePeriodType effectiveDate;
    protected List<AttachmentType> attachments;
    protected List<AttachmentReferenceType> attachmentReferences;


    public IdentifierType getDisabilityId() {
        return disabilityId;
    }

    public void setDisabilityId(IdentifierType disabilityId) {
        this.disabilityId = disabilityId;
    }

    public String getDisabilityLevelCode() {
        return disabilityLevelCode;
    }

    public void setDisabilityLevelCode(String disabilityLevelCode) {
        this.disabilityLevelCode = disabilityLevelCode;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public EntityType getDisabilityType() {
        return disabilityType;
    }

    public void setDisabilityType(EntityType disabilityType) {
        this.disabilityType = disabilityType;
    }

    public String getDisabilityDate() {
        return disabilityDate;
    }

    public void setDisabilityDate(String disabilityDate) {
        this.disabilityDate = disabilityDate;
    }

    public String getDisabilityCertifiedDate() {
        return disabilityCertifiedDate;
    }

    public void setDisabilityCertifiedDate(String disabilityCertifiedDate) {
        this.disabilityCertifiedDate = disabilityCertifiedDate;
    }

    public String getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(String recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    public List<String> getAccommodationTypeCode() {
        if (accommodationTypeCode == null) {
            accommodationTypeCode = new ArrayList<String>();
        }
        return this.accommodationTypeCode;
    }

    public void setAccommodationTypeCode(List<String> accommodationTypeCode) {
        this.accommodationTypeCode = accommodationTypeCode;
    }

    public CommentType getComment() {
        return comment;
    }

    public void setComment(CommentType comment) {
        this.comment = comment;
    }

    public EffectiveTimePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(EffectiveTimePeriodType effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<AttachmentType> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentType> attachments) {
        this.attachments = attachments;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        return attachmentReferences;
    }

    public void setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }
}
