package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.BaseScoreType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CompetencyEvidenceType;
import se.arbetsformedlingen.matchning.portability.model.hropen.MeasureType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;

public class PersonCompetencyTypeBuilder {
    private PersonCompetencyType.CompetencyIds competencyIds;
    private String competencyName;
    private String description;
    private BaseScoreType proficiencyLevel;
    private String lastUsedDate;
    private MeasureType experienceMeasure;
    private BaseScoreType interestLevel;
    private PersonCompetencyType.CompetencyDimensions competencyDimensions;
    private CompetencyEvidenceType competencyEvidence;
    private PersonCompetencyType.AttachmentReferences attachmentReferences;

    public PersonCompetencyTypeBuilder(PersonCompetencyType.CompetencyIds competencyIds, String competencyName, String description, BaseScoreType proficiencyLevel, String lastUsedDate, MeasureType experienceMeasure, BaseScoreType interestLevel, PersonCompetencyType.CompetencyDimensions competencyDimensions, CompetencyEvidenceType competencyEvidence, PersonCompetencyType.AttachmentReferences attachmentReferences) {
        this.competencyIds = competencyIds;
        this.competencyName = competencyName;
        this.description = description;
        this.proficiencyLevel = proficiencyLevel;
        this.lastUsedDate = lastUsedDate;
        this.experienceMeasure = experienceMeasure;
        this.interestLevel = interestLevel;
        this.competencyDimensions = competencyDimensions;
        this.competencyEvidence = competencyEvidence;
        this.attachmentReferences = attachmentReferences;
    }

    public PersonCompetencyTypeBuilder setCompetencyIds(PersonCompetencyType.CompetencyIds competencyIds) {
        this.competencyIds = competencyIds;
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyName(String competencyName) {
        this.competencyName = competencyName;
        return this;
    }

    public PersonCompetencyTypeBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public PersonCompetencyTypeBuilder setProficiencyLevel(BaseScoreType proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
        return this;
    }

    public PersonCompetencyTypeBuilder setLastUsedDate(String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
        return this;
    }

    public PersonCompetencyTypeBuilder setExperienceMeasure(MeasureType experienceMeasure) {
        this.experienceMeasure = experienceMeasure;
        return this;
    }

    public PersonCompetencyTypeBuilder setInterestLevel(BaseScoreType interestLevel) {
        this.interestLevel = interestLevel;
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyDimensions(PersonCompetencyType.CompetencyDimensions competencyDimensions) {
        this.competencyDimensions = competencyDimensions;
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyEvidence(CompetencyEvidenceType competencyEvidence) {
        this.competencyEvidence = competencyEvidence;
        return this;
    }

    public PersonCompetencyTypeBuilder setAttachmentReferences(PersonCompetencyType.AttachmentReferences attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public PersonCompetencyType createPersonCompetencyType() {
        return new PersonCompetencyType(competencyIds, competencyName, description, proficiencyLevel, lastUsedDate, experienceMeasure, interestLevel, competencyDimensions, competencyEvidence, attachmentReferences);
    }
}