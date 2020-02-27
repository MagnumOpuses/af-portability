package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.BaseScoreType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CompetencyEvidenceType;
import se.arbetsformedlingen.matchning.portability.model.hropen.MeasureType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;

public class PersonCompetencyTypeBuilderBuilder {
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

    public PersonCompetencyTypeBuilderBuilder setCompetencyIds(PersonCompetencyType.CompetencyIds competencyIds) {
        this.competencyIds = competencyIds;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setCompetencyName(String competencyName) {
        this.competencyName = competencyName;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setProficiencyLevel(BaseScoreType proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setLastUsedDate(String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setExperienceMeasure(MeasureType experienceMeasure) {
        this.experienceMeasure = experienceMeasure;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setInterestLevel(BaseScoreType interestLevel) {
        this.interestLevel = interestLevel;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setCompetencyDimensions(PersonCompetencyType.CompetencyDimensions competencyDimensions) {
        this.competencyDimensions = competencyDimensions;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setCompetencyEvidence(CompetencyEvidenceType competencyEvidence) {
        this.competencyEvidence = competencyEvidence;
        return this;
    }

    public PersonCompetencyTypeBuilderBuilder setAttachmentReferences(PersonCompetencyType.AttachmentReferences attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public PersonCompetencyTypeBuilder createPersonCompetencyTypeBuilder() {
        return new PersonCompetencyTypeBuilder(competencyIds, competencyName, description, proficiencyLevel, lastUsedDate, experienceMeasure, interestLevel, competencyDimensions, competencyEvidence, attachmentReferences);
    }
}