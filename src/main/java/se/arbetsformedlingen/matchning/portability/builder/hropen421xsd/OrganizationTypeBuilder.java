package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;

import java.math.BigDecimal;

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

    public OrganizationTypeBuilder setIndustryCodes(OrganizationType.IndustryCodes industryCodes) {
        organizationType.setIndustryCodes(industryCodes);
        return this;
    }

    public OrganizationTypeBuilder setIndustryIdentifiers(OrganizationType.IndustryIdentifiers industryIdentifiers) {
        organizationType.setIndustryIdentifiers(industryIdentifiers);
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

    public OrganizationTypeBuilder setContacts(OrganizationType.Contacts contacts) {
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

    public OrganizationTypeBuilder withUtbildning(Utbildning utbildning) {
        setLegalId(new IdentifierTypeBuilder().setValue(utbildning.getSkola()).build());
        return this;
    }

    public OrganizationTypeBuilder withAnstallning(Anstallning anstallning) {
        setLegalId(new IdentifierTypeBuilder().setValue(anstallning.getArbetsgivare()).build());
        return this;
    }
}