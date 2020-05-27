package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.ArrayList;
import java.util.List;

public class PersonCompetencyTypeBuilder {
    private PersonCompetencyType personCompetencyType = new PersonCompetencyType();

    public PersonCompetencyTypeBuilder setCompetencyIds(List<IdentifierType> competencyIds) {
        personCompetencyType.getCompetencyIds().addAll(competencyIds);
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

    public PersonCompetencyTypeBuilder setCompetencyDimensions(List<CompetencyDimensionType> competencyDimensions) {
        personCompetencyType.getCompetencyDimensions().addAll(competencyDimensions);
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyEvidence(CompetencyEvidenceType competencyEvidence) {
        personCompetencyType.setCompetencyEvidence(competencyEvidence);
        return this;
    }

    public PersonCompetencyTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        personCompetencyType.getAttachmentReferences().addAll(attachmentReferences);
        return this;
    }

    public PersonCompetencyType build() {
        return personCompetencyType;
    }


    public PersonCompetencyTypeBuilder withKompetens(String kompetenseId) {
        List<IdentifierType> list = new ArrayList<>();
        list.add(new IdentifierTypeBuilder().setValue(kompetenseId).build());
        setCompetencyIds(list);
        return this;
    }
}