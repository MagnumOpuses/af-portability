package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class PositionHistoryTypeBuilder {
    private PositionHistoryType positionHistoryType = new PositionHistoryType();

    public PositionHistoryTypeBuilder setId(IdentifierType id) {
        positionHistoryType.id = id;
        return this;
    }

    public PositionHistoryTypeBuilder setStart(String start) {
        positionHistoryType.start = start;
        return this;
    }

    public PositionHistoryTypeBuilder setEnd(String end) {
        positionHistoryType.end = end;
        return this;
    }

    public PositionHistoryTypeBuilder setCurrent(Boolean current) {
        positionHistoryType.current = current;
        return this;
    }

    public PositionHistoryTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        positionHistoryType.attachmentReferences = attachmentReferences;
        return this;
    }

    public PositionHistoryTypeBuilder setDescriptions(StringTypeArray descriptions) {
        positionHistoryType.descriptions = descriptions;
        return this;
    }

    public PositionHistoryTypeBuilder setTitle(String title) {
        positionHistoryType.title = title;
        return this;
    }

    public PositionHistoryTypeBuilder setResourceRelationshipCode(ResourceRelationshipCodeList resourceRelationshipCode) {
        positionHistoryType.resourceRelationshipCode = resourceRelationshipCode;
        return this;
    }

    public PositionHistoryTypeBuilder setOrganization(OrganizationType organization) {
        positionHistoryType.organization = organization;
        return this;
    }

    public PositionHistoryTypeBuilder setLocation(LocationType location) {
        positionHistoryType.location = location;
        return this;
    }

    public PositionHistoryTypeBuilder setJobCategories(List<EntityType> jobCategories) {
        positionHistoryType.jobCategories = jobCategories;
        return this;
    }

    public PositionHistoryTypeBuilder setJobLevels(List<EntityType> jobLevels) {
        positionHistoryType.jobLevels = jobLevels;
        return this;
    }

    public PositionHistoryType build() {
        return positionHistoryType;
    }
}