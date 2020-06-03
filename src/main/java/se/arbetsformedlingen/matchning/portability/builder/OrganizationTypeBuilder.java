package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;

import java.math.BigDecimal;
import java.util.List;

public class OrganizationTypeBuilder {
    private final OrganizationType organizationType = new OrganizationType();

    public OrganizationTypeBuilder setId(final IdentifierType id) {
        organizationType.setId(id);
        return this;
    }

    public OrganizationTypeBuilder setName(final String name) {
        organizationType.setName(name);
        return this;
    }

    public OrganizationTypeBuilder setCode(final String code) {
        organizationType.setCode(code);
        return this;
    }

    public OrganizationTypeBuilder setResponsibilityCode(final ResponsibilityCodeList responsibilityCode) {
        organizationType.setResponsibilityCode(responsibilityCode);
        return this;
    }

    public OrganizationTypeBuilder setCommunication(final CommunicationType communication) {
        organizationType.setCommunication(communication);
        return this;
    }

    public OrganizationTypeBuilder setTaxId(final IdentifierType taxId) {
        organizationType.setTaxId(taxId);
        return this;
    }

    public OrganizationTypeBuilder setLegalId(final IdentifierType legalId) {
        organizationType.setLegalId(legalId);
        return this;
    }

    public OrganizationTypeBuilder setIndustryCodes(final List<String> industryCodes) {
        organizationType.getIndustryCodes().addAll(industryCodes);
        return this;
    }

    public OrganizationTypeBuilder setIndustryIdentifiers(final List<IdentifierType> industryIdentifiers) {
        organizationType.getIndustryIdentifiers().addAll(industryIdentifiers);
        return this;
    }

    public OrganizationTypeBuilder setHeadCount(final BigDecimal headCount) {
        organizationType.setHeadCount(headCount);
        return this;
    }

    public OrganizationTypeBuilder setRevenue(final AmountType revenue) {
        organizationType.setRevenue(revenue);
        return this;
    }

    public OrganizationTypeBuilder setDescription(final TextType description) {
        organizationType.setDescription(description);
        return this;
    }

    public OrganizationTypeBuilder setGeographicResponsibilityCode(final GeographicResponsibilityCodeList geographicResponsibilityCode) {
        organizationType.setGeographicResponsibilityCode(geographicResponsibilityCode);
        return this;
    }

    public OrganizationTypeBuilder setOwnershipType(final OwnershipTypeCodeList ownershipType) {
        organizationType.setOwnershipType(ownershipType);
        return this;
    }

    public OrganizationTypeBuilder setStockSymbol(final String stockSymbol) {
        organizationType.setStockSymbol(stockSymbol);
        return this;
    }

    public OrganizationTypeBuilder setWorkEnvironmentCode(final String workEnvironmentCode) {
        organizationType.setWorkEnvironmentCode(workEnvironmentCode);
        return this;
    }

    public OrganizationTypeBuilder setContacts(final List<SpecifiedPersonType> contacts) {
        organizationType.setContacts(contacts);
        return this;
    }

    public OrganizationTypeBuilder setDomainName(final String domainName) {
        organizationType.setDomainName(domainName);
        return this;
    }

    public OrganizationType build() {
        return organizationType;
    }

    public OrganizationTypeBuilder withAnstallning(final Anstallning anstallning) {
        setLegalId(new IdentifierTypeBuilder().setValue(anstallning.getArbetsgivare()).build());
        return this;
    }
}