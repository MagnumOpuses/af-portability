package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmployerHistoryType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.OrganizationType;
import se.arbetsformedlingen.matchning.portability.model.hropen.StringTypeArray;

public class EmployerHistoryTypeBuilder {
    private EmployerHistoryType employerHistoryType = new EmployerHistoryType();

    public EmployerHistoryTypeBuilder setId(IdentifierType id) {
        employerHistoryType.setId(id);
        return this;
    }

    public EmployerHistoryTypeBuilder setStart(String start) {
        employerHistoryType.setStart(start);
        return this;
    }

    public EmployerHistoryTypeBuilder setEnd(String end) {
        employerHistoryType.setEnd(end);
        return this;
    }

    public EmployerHistoryTypeBuilder setCurrent(Boolean current) {
        employerHistoryType.setCurrent(current);
        return this;
    }

    public EmployerHistoryTypeBuilder setAttachmentReferences(EmployerHistoryType.AttachmentReferences attachmentReferences) {
        employerHistoryType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public EmployerHistoryTypeBuilder setDescriptions(StringTypeArray descriptions) {
        employerHistoryType.setDescriptions(descriptions);
        return this;
    }

    public EmployerHistoryTypeBuilder setOrganization(OrganizationType organization) {
        employerHistoryType.setOrganization(organization);
        return this;
    }

    public EmployerHistoryTypeBuilder setPositionHistories(EmployerHistoryType.PositionHistories positionHistories) {
        employerHistoryType.setPositionHistories(positionHistories);
        return this;
    }

    public EmployerHistoryType createEmployerHistoryType() {
        return employerHistoryType;
    }

    public EmployerHistoryTypeBuilder withAnstallning(Anstallning anstallning) {
        setOrganization(new OrganizationTypeBuilder().withAnstallning(anstallning).createOrganizationType());
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