package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;

public class EmployerHistoryTypeBuilder {
    private IdentifierType id;
    private String start;
    private String end;
    private Boolean current;
    private List<AttachmentReferenceType> attachmentReferences;
    private StringTypeArray descriptions;
    private OrganizationType organization;
    private List<PositionHistoryType> positionHistories;

    public EmployerHistoryTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public EmployerHistoryTypeBuilder setStart(String start) {
        this.start = start;
        return this;
    }

    public EmployerHistoryTypeBuilder setEnd(String end) {
        this.end = end;
        return this;
    }

    public EmployerHistoryTypeBuilder setCurrent(Boolean current) {
        this.current = current;
        return this;
    }

    public EmployerHistoryTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public EmployerHistoryTypeBuilder setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public EmployerHistoryTypeBuilder setOrganization(OrganizationType organization) {
        this.organization = organization;
        return this;
    }

    public EmployerHistoryTypeBuilder setPositionHistories(List<PositionHistoryType> positionHistories) {
        this.positionHistories = positionHistories;
        return this;
    }

    public EmployerHistoryType createEmployerHistoryType() {
        return new EmployerHistoryType(id, start, end, current, attachmentReferences, descriptions, organization, positionHistories);
    }
}