package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Kompetens;
import se.arbetsformedlingen.matchning.portability.model.hropen.BaseScoreType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CompetencyEvidenceType;
import se.arbetsformedlingen.matchning.portability.model.hropen.MeasureType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;

import java.util.ArrayList;
import java.util.List;

public class PersonCompetencyTypeBuilder {
    private PersonCompetencyType personCompetencyType = new PersonCompetencyType();

    public PersonCompetencyTypeBuilder setCompetencyIds(PersonCompetencyType.CompetencyIds competencyIds) {
        personCompetencyType.setCompetencyIds(competencyIds);
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyName(String competencyName) {
        personCompetencyType.setCompetencyName(competencyName);
        return this;
    }

    public PersonCompetencyTypeBuilder setDescription(String description) {
        personCompetencyType.setDescription(description);
        return this;
    }

    public PersonCompetencyTypeBuilder setProficiencyLevel(BaseScoreType proficiencyLevel) {
        personCompetencyType.setProficiencyLevel(proficiencyLevel);
        return this;
    }

    public PersonCompetencyTypeBuilder setLastUsedDate(String lastUsedDate) {
        personCompetencyType.setLastUsedDate(lastUsedDate);
        return this;
    }

    public PersonCompetencyTypeBuilder setExperienceMeasure(MeasureType experienceMeasure) {
        personCompetencyType.setExperienceMeasure(experienceMeasure);
        return this;
    }

    public PersonCompetencyTypeBuilder setInterestLevel(BaseScoreType interestLevel) {
        personCompetencyType.setInterestLevel(interestLevel);
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyDimensions(PersonCompetencyType.CompetencyDimensions competencyDimensions) {
        personCompetencyType.setCompetencyDimensions(competencyDimensions);
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyEvidence(CompetencyEvidenceType competencyEvidence) {
        personCompetencyType.setCompetencyEvidence(competencyEvidence);
        return this;
    }

    public PersonCompetencyTypeBuilder setAttachmentReferences(PersonCompetencyType.AttachmentReferences attachmentReferences) {
        personCompetencyType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public PersonCompetencyType build() {
        return personCompetencyType;
    }

}