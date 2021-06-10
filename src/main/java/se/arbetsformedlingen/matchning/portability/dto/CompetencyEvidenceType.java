package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetencyEvidenceType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompetencyEvidenceType {

    protected List<IdentifierType> ids;
    protected String evidenceTypeCode;
    protected String evidenceName;
    protected List<String> descriptions;
    protected IdentifierType evidenceRequirementsId;
    protected List<ScoreType> scores;
    protected OpenEndPeriodType effectivePeriod;
    protected String verificationDate;
    protected String verificationSourceName;
    protected AttachmentReferenceType attachmentReference;

    public List<IdentifierType> getIds() {
        return ids;
    }

    public void setIds(final List<IdentifierType> ids) {
        this.ids = ids;
    }

    public String getEvidenceTypeCode() {
        return evidenceTypeCode;
    }

    public void setEvidenceTypeCode(final String evidenceTypeCode) {
        this.evidenceTypeCode = evidenceTypeCode;
    }

    public String getEvidenceName() {
        return evidenceName;
    }

    public void setEvidenceName(final String evidenceName) {
        this.evidenceName = evidenceName;
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

    public IdentifierType getEvidenceRequirementsId() {
        return evidenceRequirementsId;
    }

    public void setEvidenceRequirementsId(final IdentifierType evidenceRequirementsId) {
        this.evidenceRequirementsId = evidenceRequirementsId;
    }

    public List<ScoreType> getScores() {
        if (scores == null) {
            scores = new ArrayList<ScoreType>();
        }
        return this.scores;
    }

    public void setScores(final List<ScoreType> scores) {
        this.scores = scores;
    }

    public OpenEndPeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    public void setEffectivePeriod(final OpenEndPeriodType effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
    }

    public String getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(final String verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getVerificationSourceName() {
        return verificationSourceName;
    }

    public void setVerificationSourceName(final String verificationSourceName) {
        this.verificationSourceName = verificationSourceName;
    }

    public AttachmentReferenceType getAttachmentReference() {
        return attachmentReference;
    }

    public void setAttachmentReference(final AttachmentReferenceType attachmentReference) {
        this.attachmentReference = attachmentReference;
    }
}
