package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.ArrayList;
import java.util.List;

public class PersonCompetencyTypeBuilder {
    private PersonCompetencyType personCompetencyType = new PersonCompetencyType();

    public PersonCompetencyTypeBuilder setCompetencyIds(List<IdentifierType> competencyIds) {
        personCompetencyType.competencyIds = competencyIds;
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyName(String competencyName) {
        personCompetencyType.competencyName = competencyName;
        return this;
    }

    public PersonCompetencyTypeBuilder setDescription(String description) {
        personCompetencyType.description = description;
        return this;
    }

    public PersonCompetencyTypeBuilder setProficiencyLevel(BaseScoreType proficiencyLevel) {
        personCompetencyType.proficiencyLevel = proficiencyLevel;
        return this;
    }

    public PersonCompetencyTypeBuilder setLastUsedDate(String lastUsedDate) {
        personCompetencyType.lastUsedDate = lastUsedDate;
        return this;
    }

    public PersonCompetencyTypeBuilder setExperienceMeasure(MeasureType experienceMeasure) {
        personCompetencyType.experienceMeasure = experienceMeasure;
        return this;
    }

    public PersonCompetencyTypeBuilder setInterestLevel(BaseScoreType interestLevel) {
        personCompetencyType.interestLevel = interestLevel;
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyDimensions(List<CompetencyDimensionType> competencyDimensions) {
        personCompetencyType.competencyDimensions = competencyDimensions;
        return this;
    }

    public PersonCompetencyTypeBuilder setCompetencyEvidence(CompetencyEvidenceType competencyEvidence) {
        personCompetencyType.competencyEvidence = competencyEvidence;
        return this;
    }

    public PersonCompetencyTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        personCompetencyType.attachmentReferences = attachmentReferences;
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