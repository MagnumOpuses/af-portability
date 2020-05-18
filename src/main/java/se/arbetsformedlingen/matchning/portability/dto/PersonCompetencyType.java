package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonCompetencyType", propOrder = {

})
public class PersonCompetencyType {

    protected List<IdentifierType> competencyIds;
    protected String competencyName;
    protected String description;
    protected BaseScoreType proficiencyLevel;
    protected String lastUsedDate;
    protected MeasureType experienceMeasure;
    protected BaseScoreType interestLevel;
    protected List<CompetencyDimensionType> competencyDimensions;
    protected CompetencyEvidenceType competencyEvidence;
    protected List<AttachmentReferenceType> attachmentReferences;

    public List<IdentifierType> getCompetencyIds() {
        if (competencyIds == null) {
            competencyIds = new ArrayList<IdentifierType>();
        }
        return this.competencyIds;
    }

    public String getCompetencyName() {
        return competencyName;
    }

    public void setCompetencyName(String competencyName) {
        this.competencyName = competencyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BaseScoreType getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(BaseScoreType proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getLastUsedDate() {
        return lastUsedDate;
    }

    public void setLastUsedDate(String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    public MeasureType getExperienceMeasure() {
        return experienceMeasure;
    }

    public void setExperienceMeasure(MeasureType experienceMeasure) {
        this.experienceMeasure = experienceMeasure;
    }

    public BaseScoreType getInterestLevel() {
        return interestLevel;
    }

    public void setInterestLevel(BaseScoreType interestLevel) {
        this.interestLevel = interestLevel;
    }

    public List<CompetencyDimensionType> getCompetencyDimensions() {
        if (competencyDimensions == null) {
            competencyDimensions = new ArrayList<CompetencyDimensionType>();
        }
        return this.competencyDimensions;
    }

    public CompetencyEvidenceType getCompetencyEvidence() {
        return competencyEvidence;
    }

    public void setCompetencyEvidence(CompetencyEvidenceType competencyEvidence) {
        this.competencyEvidence = competencyEvidence;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }
}
