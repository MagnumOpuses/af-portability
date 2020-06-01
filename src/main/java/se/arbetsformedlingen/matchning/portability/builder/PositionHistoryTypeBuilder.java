package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class PositionHistoryTypeBuilder {
    private PositionHistoryType positionHistoryType = new PositionHistoryType();

    public PositionHistoryTypeBuilder setId(IdentifierType id) {
        positionHistoryType.setId(id);
        return this;
    }

    public PositionHistoryTypeBuilder setStart(String start) {
        positionHistoryType.setStart(start);
        return this;
    }

    public PositionHistoryTypeBuilder setEnd(String end) {
        positionHistoryType.setEnd(end);
        return this;
    }

    public PositionHistoryTypeBuilder setCurrent(Boolean current) {
        positionHistoryType.setCurrent(current);
        return this;
    }

    public PositionHistoryTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        positionHistoryType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public PositionHistoryTypeBuilder setDescriptions(StringTypeArray descriptions) {
        positionHistoryType.setDescriptions(descriptions);
        return this;
    }

    public PositionHistoryTypeBuilder setTitle(String title) {
        positionHistoryType.setTitle(title);
        return this;
    }

    public PositionHistoryTypeBuilder setResourceRelationshipCode(ResourceRelationshipCodeList resourceRelationshipCode) {
        positionHistoryType.setResourceRelationshipCode(resourceRelationshipCode);
        return this;
    }

    public PositionHistoryTypeBuilder setOrganization(OrganizationType organization) {
        positionHistoryType.setOrganization(organization);
        return this;
    }

    public PositionHistoryTypeBuilder setLocation(LocationType location) {
        positionHistoryType.setLocation(location);
        return this;
    }

    public PositionHistoryTypeBuilder setJobCategories(List<EntityType> jobCategories) {
        positionHistoryType.getJobCategories().addAll(jobCategories);
        return this;
    }

    public PositionHistoryTypeBuilder setJobLevels(List<EntityType> jobLevels) {
        positionHistoryType.getJobLevels().addAll(jobLevels);
        return this;
    }

    public PositionHistoryType build() {
        return positionHistoryType;
    }
}