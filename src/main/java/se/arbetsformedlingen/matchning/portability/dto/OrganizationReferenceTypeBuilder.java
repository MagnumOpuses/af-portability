package se.arbetsformedlingen.matchning.portability.dto;

public class OrganizationReferenceTypeBuilder {
    private final OrganizationReferenceType organizationReferenceType = new OrganizationReferenceType();

    public OrganizationReferenceTypeBuilder setId(final IdentifierType id) {
        organizationReferenceType.setId(id);
        return this;
    }

    public OrganizationReferenceTypeBuilder setName(final String name) {
        organizationReferenceType.setName(name);
        return this;
    }

    public OrganizationReferenceTypeBuilder setCode(final String code) {
        organizationReferenceType.setCode(code);
        return this;
    }

    public OrganizationReferenceTypeBuilder setResponsibilityCode(final ResponsibilityCodeList responsibilityCode) {
        organizationReferenceType.setResponsibilityCode(responsibilityCode);
        return this;
    }

    public OrganizationReferenceTypeBuilder setCommunication(final CommunicationType communication) {
        organizationReferenceType.setCommunication(communication);
        return this;
    }

    public OrganizationReferenceType build() {
        return organizationReferenceType;
    }
}