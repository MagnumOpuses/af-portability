package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class PositionHistoryTypeBuilder {
    private final PositionHistoryType positionHistoryType = new PositionHistoryType();

    public PositionHistoryTypeBuilder setId(final IdentifierType id) {
        positionHistoryType.setId(id);
        return this;
    }

    public PositionHistoryTypeBuilder setStart(final String start) {
        positionHistoryType.setStart(start);
        return this;
    }

    public PositionHistoryTypeBuilder setEnd(final String end) {
        positionHistoryType.setEnd(end);
        return this;
    }

    public PositionHistoryTypeBuilder setCurrent(final Boolean current) {
        positionHistoryType.setCurrent(current);
        return this;
    }

    public PositionHistoryTypeBuilder setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        positionHistoryType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public PositionHistoryTypeBuilder setDescriptions(final List<String> descriptions) {
        positionHistoryType.setDescriptions(descriptions);
        return this;
    }

    public PositionHistoryTypeBuilder setTitle(final String title) {
        positionHistoryType.setTitle(title);
        return this;
    }

    public PositionHistoryTypeBuilder setResourceRelationshipCode(final ResourceRelationshipCodeList resourceRelationshipCode) {
        positionHistoryType.setResourceRelationshipCode(resourceRelationshipCode);
        return this;
    }

    public PositionHistoryTypeBuilder setOrganization(final OrganizationType organization) {
        positionHistoryType.setOrganization(organization);
        return this;
    }

    public PositionHistoryTypeBuilder setLocation(final LocationType location) {
        positionHistoryType.setLocation(location);
        return this;
    }

    public PositionHistoryTypeBuilder setJobCategories(final List<EntityType> jobCategories) {
        positionHistoryType.getJobCategories().addAll(jobCategories);
        return this;
    }

    public PositionHistoryTypeBuilder setJobLevels(final List<EntityType> jobLevels) {
        positionHistoryType.getJobLevels().addAll(jobLevels);
        return this;
    }

    public PositionHistoryType build() {
        return positionHistoryType;
    }
}