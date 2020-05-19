package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.builder.IdentifierTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;

import java.math.BigDecimal;
import java.util.List;

public class OrganizationTypeBuilder {
    private OrganizationType organizationType = new OrganizationType();

    public OrganizationTypeBuilder setTaxId(IdentifierType taxId) {
        organizationType.taxId = taxId;
        return this;
    }

    public OrganizationTypeBuilder setLegalId(IdentifierType legalId) {
        organizationType.legalId = legalId;
        return this;
    }

    public OrganizationTypeBuilder setIndustryCodes(List<String> industryCodes) {
        organizationType.industryCodes = industryCodes;
        return this;
    }

    public OrganizationTypeBuilder setIndustryIdentifiers(List<IdentifierType> industryIdentifiers) {
        organizationType.industryIdentifiers = industryIdentifiers;
        return this;
    }

    public OrganizationTypeBuilder setHeadCount(BigDecimal headCount) {
        organizationType.headCount = headCount;
        return this;
    }

    public OrganizationTypeBuilder setRevenue(AmountType revenue) {
        organizationType.revenue = revenue;
        return this;
    }

    public OrganizationTypeBuilder setDescription(TextType description) {
        organizationType.description = description;
        return this;
    }

    public OrganizationTypeBuilder setGeographicResponsibilityCode(GeographicResponsibilityCodeList geographicResponsibilityCode) {
        organizationType.geographicResponsibilityCode = geographicResponsibilityCode;
        return this;
    }

    public OrganizationTypeBuilder setOwnershipType(OwnershipTypeCodeList ownershipType) {
        organizationType.ownershipType = ownershipType;
        return this;
    }

    public OrganizationTypeBuilder setStockSymbol(String stockSymbol) {
        organizationType.stockSymbol = stockSymbol;
        return this;
    }

    public OrganizationTypeBuilder setWorkEnvironmentCode(String workEnvironmentCode) {
        organizationType.workEnvironmentCode = workEnvironmentCode;
        return this;
    }

    public OrganizationTypeBuilder setContacts(List<SpecifiedPersonType> contacts) {
        organizationType.contacts = contacts;
        return this;
    }

    public OrganizationTypeBuilder setDomainName(String domainName) {
        organizationType.domainName = domainName;
        return this;
    }

    public OrganizationType build() {
        return organizationType;
    }

    public se.arbetsformedlingen.matchning.portability.builder.OrganizationTypeBuilder withUtbildning(Utbildning utbildning) {
        setLegalId(new se.arbetsformedlingen.matchning.portability.builder.IdentifierTypeBuilder().setValue(utbildning.getSkola()).build());
        return this;
    }

    public se.arbetsformedlingen.matchning.portability.builder.OrganizationTypeBuilder withAnstallning(Anstallning anstallning) {
        setLegalId(new IdentifierTypeBuilder().setValue(anstallning.getArbetsgivare()).build());
        return this;
    }
}