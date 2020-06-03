package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisabilitySummaryType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public void setDisabilityId(final IdentifierType disabilityId) {
        this.disabilityId = disabilityId;
    }

    public String getDisabilityLevelCode() {
        return disabilityLevelCode;
    }

    public void setDisabilityLevelCode(final String disabilityLevelCode) {
        this.disabilityLevelCode = disabilityLevelCode;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(final BigDecimal percentage) {
        this.percentage = percentage;
    }

    public EntityType getDisabilityType() {
        return disabilityType;
    }

    public void setDisabilityType(final EntityType disabilityType) {
        this.disabilityType = disabilityType;
    }

    public String getDisabilityDate() {
        return disabilityDate;
    }

    public void setDisabilityDate(final String disabilityDate) {
        this.disabilityDate = disabilityDate;
    }

    public String getDisabilityCertifiedDate() {
        return disabilityCertifiedDate;
    }

    public void setDisabilityCertifiedDate(final String disabilityCertifiedDate) {
        this.disabilityCertifiedDate = disabilityCertifiedDate;
    }

    public String getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(final String recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    public List<String> getAccommodationTypeCode() {
        if (accommodationTypeCode == null) {
            accommodationTypeCode = new ArrayList<String>();
        }
        return this.accommodationTypeCode;
    }

    public void setAccommodationTypeCode(final List<String> accommodationTypeCode) {
        this.accommodationTypeCode = accommodationTypeCode;
    }

    public CommentType getComment() {
        return comment;
    }

    public void setComment(final CommentType comment) {
        this.comment = comment;
    }

    public EffectiveTimePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(final EffectiveTimePeriodType effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<AttachmentType> getAttachments() {
        return attachments;
    }

    public void setAttachments(final List<AttachmentType> attachments) {
        this.attachments = attachments;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        return attachmentReferences;
    }

    public void setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }
}
