package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

public class PositionHistoryTypeBuilder {
    private IdentifierType id;
    private String start;
    private String end;
    private Boolean current;
    private PositionHistoryType.AttachmentReferences attachmentReferences;
    private StringTypeArray descriptions;
    private String title;
    private ResourceRelationshipCodeList resourceRelationshipCode;
    private OrganizationType organization;
    private LocationType location;
    private PositionHistoryType.JobCategories jobCategories;
    private PositionHistoryType.JobLevels jobLevels;

    public PositionHistoryTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public PositionHistoryTypeBuilder setStart(String start) {
        this.start = start;
        return this;
    }

    public PositionHistoryTypeBuilder setEnd(String end) {
        this.end = end;
        return this;
    }

    public PositionHistoryTypeBuilder setCurrent(Boolean current) {
        this.current = current;
        return this;
    }

    public PositionHistoryTypeBuilder setAttachmentReferences(PositionHistoryType.AttachmentReferences attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public PositionHistoryTypeBuilder setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public PositionHistoryTypeBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public PositionHistoryTypeBuilder setResourceRelationshipCode(ResourceRelationshipCodeList resourceRelationshipCode) {
        this.resourceRelationshipCode = resourceRelationshipCode;
        return this;
    }

    public PositionHistoryTypeBuilder setOrganization(OrganizationType organization) {
        this.organization = organization;
        return this;
    }

    public PositionHistoryTypeBuilder setLocation(LocationType location) {
        this.location = location;
        return this;
    }

    public PositionHistoryTypeBuilder setJobCategories(PositionHistoryType.JobCategories jobCategories) {
        this.jobCategories = jobCategories;
        return this;
    }

    public PositionHistoryTypeBuilder setJobLevels(PositionHistoryType.JobLevels jobLevels) {
        this.jobLevels = jobLevels;
        return this;
    }

    public PositionHistoryType createPositionHistoryType() {
        return new PositionHistoryType(id, start, end, current, attachmentReferences, descriptions, title, resourceRelationshipCode, organization, location, jobCategories, jobLevels);
    }
}