package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmployerHistoryType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.OrganizationType;
import se.arbetsformedlingen.matchning.portability.model.hropen.StringTypeArray;

public class EmployerHistoryTypeBuilder {
    private IdentifierType id;
    private String start;
    private String end;
    private Boolean current;
    private EmployerHistoryType.AttachmentReferences attachmentReferences;
    private StringTypeArray descriptions;
    private OrganizationType organization;
    private EmployerHistoryType.PositionHistories positionHistories;

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

    public EmployerHistoryTypeBuilder setAttachmentReferences(EmployerHistoryType.AttachmentReferences attachmentReferences) {
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

    public EmployerHistoryTypeBuilder setPositionHistories(EmployerHistoryType.PositionHistories positionHistories) {
        this.positionHistories = positionHistories;
        return this;
    }

    public EmployerHistoryType createEmployerHistoryType() {
        return new EmployerHistoryType(id, start, end, current, attachmentReferences, descriptions, organization, positionHistories);
    }

    public EmployerHistoryTypeBuilder withAnstallning(Anstallning anstallning) {
        setOrganization(new OrganizationTypeBuilder().withAnstelning(anstallning).createOrganizationType());
        setPositionHistories(new PositionHistoriesBuilder().withAnstallning(anstallning).createPositionHistories());
        setStart(String.valueOf(anstallning.getStartdatum()));
        setEnd(String.valueOf(anstallning.getSlutdatum()));
        setCurrent(anstallning.isPagaende());

        StringTypeArray descriptions = new StringTypeArray();
        descriptions.getItem().add(anstallning.getBeskrivning());
        setDescriptions(descriptions);

        return this;
    }
}