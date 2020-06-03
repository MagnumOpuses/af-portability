package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonCompetencyType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonCompetencyType {

    public List<IdentifierType> competencyIds;
    public String competencyName;
    public String description;
    public BaseScoreType proficiencyLevel;
    public String lastUsedDate;
    public MeasureType experienceMeasure;
    public BaseScoreType interestLevel;
    public List<CompetencyDimensionType> competencyDimensions;
    public CompetencyEvidenceType competencyEvidence;
    public List<AttachmentReferenceType> attachmentReferences;

    public List<IdentifierType> getCompetencyIds() {
        if (competencyIds == null) {
            competencyIds = new ArrayList<IdentifierType>();
        }
        return this.competencyIds;
    }

    public void setCompetencyIds(final List<IdentifierType> competencyIds) {
        this.competencyIds = competencyIds;
    }

    public String getCompetencyName() {
        return competencyName;
    }

    public void setCompetencyName(final String competencyName) {
        this.competencyName = competencyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public BaseScoreType getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(final BaseScoreType proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getLastUsedDate() {
        return lastUsedDate;
    }

    public void setLastUsedDate(final String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    public MeasureType getExperienceMeasure() {
        return experienceMeasure;
    }

    public void setExperienceMeasure(final MeasureType experienceMeasure) {
        this.experienceMeasure = experienceMeasure;
    }

    public BaseScoreType getInterestLevel() {
        return interestLevel;
    }

    public void setInterestLevel(final BaseScoreType interestLevel) {
        this.interestLevel = interestLevel;
    }

    public List<CompetencyDimensionType> getCompetencyDimensions() {
        if (competencyDimensions == null) {
            competencyDimensions = new ArrayList<CompetencyDimensionType>();
        }
        return this.competencyDimensions;
    }

    public void setCompetencyDimensions(final List<CompetencyDimensionType> competencyDimensions) {
        this.competencyDimensions = competencyDimensions;
    }

    public CompetencyEvidenceType getCompetencyEvidence() {
        return competencyEvidence;
    }

    public void setCompetencyEvidence(final CompetencyEvidenceType competencyEvidence) {
        this.competencyEvidence = competencyEvidence;
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
