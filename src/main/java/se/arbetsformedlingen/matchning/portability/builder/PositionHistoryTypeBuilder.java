package se.arbetsformedlingen.matchning.portability.builder;

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

    public PositionHistoryTypeBuilder setAttachmentReferences(PositionHistoryType.AttachmentReferences attachmentReferences) {
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

    public PositionHistoryTypeBuilder setJobCategories(PositionHistoryType.JobCategories jobCategories) {
        positionHistoryType.setJobCategories(jobCategories);
        return this;
    }

    public PositionHistoryTypeBuilder setJobLevels(PositionHistoryType.JobLevels jobLevels) {
        positionHistoryType.setJobLevels(jobLevels);
        return this;
    }

    public PositionHistoryType build() {
        return positionHistoryType;
    }
}