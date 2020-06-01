package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;

import java.math.BigDecimal;
import java.util.List;

public class OrganizationTypeBuilder {
    private OrganizationType organizationType = new OrganizationType();

    public OrganizationTypeBuilder setTaxId(IdentifierType taxId) {
        organizationType.setTaxId(taxId);
        return this;
    }

    public OrganizationTypeBuilder setLegalId(IdentifierType legalId) {
        organizationType.setLegalId(legalId);
        return this;
    }

    public OrganizationTypeBuilder setIndustryCodes(List<String> industryCodes) {
        organizationType.getIndustryCodes().addAll(industryCodes);
        return this;
    }

    public OrganizationTypeBuilder setIndustryIdentifiers(List<IdentifierType> industryIdentifiers) {
        organizationType.getIndustryIdentifiers().addAll(industryIdentifiers);
        return this;
    }

    public OrganizationTypeBuilder setHeadCount(BigDecimal headCount) {
        organizationType.setHeadCount(headCount);
        return this;
    }

    public OrganizationTypeBuilder setRevenue(AmountType revenue) {
        organizationType.setRevenue(revenue);
        return this;
    }

    public OrganizationTypeBuilder setDescription(TextType description) {
        organizationType.setDescription(description);
        return this;
    }

    public OrganizationTypeBuilder setGeographicResponsibilityCode(GeographicResponsibilityCodeList geographicResponsibilityCode) {
        organizationType.setGeographicResponsibilityCode(geographicResponsibilityCode);
        return this;
    }

    public OrganizationTypeBuilder setOwnershipType(OwnershipTypeCodeList ownershipType) {
        organizationType.setOwnershipType(ownershipType);
        return this;
    }

    public OrganizationTypeBuilder setStockSymbol(String stockSymbol) {
        organizationType.setStockSymbol(stockSymbol);
        return this;
    }

    public OrganizationTypeBuilder setWorkEnvironmentCode(String workEnvironmentCode) {
        organizationType.setWorkEnvironmentCode(workEnvironmentCode);
        return this;
    }

    public OrganizationTypeBuilder setContacts(List<SpecifiedPersonType> contacts) {
        organizationType.setContacts(contacts);
        return this;
    }

    public OrganizationTypeBuilder setDomainName(String domainName) {
        organizationType.setDomainName(domainName);
        return this;
    }

    public OrganizationType build() {
        return organizationType;
    }

    public OrganizationTypeBuilder withAnstallning(Anstallning anstallning) {
        setLegalId(new IdentifierTypeBuilder().setValue(anstallning.getArbetsgivare()).build());
        return this;
    }
}