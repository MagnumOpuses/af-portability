package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

import java.math.BigDecimal;

public class OrganizationTypeBuilder {
    private IdentifierType taxId;
    private IdentifierType legalId;
    private OrganizationType.IndustryCodes industryCodes;
    private OrganizationType.IndustryIdentifiers industryIdentifiers;
    private BigDecimal headCount;
    private AmountType revenue;
    private TextType description;
    private GeographicResponsibilityCodeList geographicResponsibilityCode;
    private OwnershipTypeCodeList ownershipType;
    private String stockSymbol;
    private String workEnvironmentCode;
    private OrganizationType.Contacts contacts;
    private String domainName;

    public OrganizationTypeBuilder setTaxId(IdentifierType taxId) {
        this.taxId = taxId;
        return this;
    }

    public OrganizationTypeBuilder setLegalId(IdentifierType legalId) {
        this.legalId = legalId;
        return this;
    }

    public OrganizationTypeBuilder setIndustryCodes(OrganizationType.IndustryCodes industryCodes) {
        this.industryCodes = industryCodes;
        return this;
    }

    public OrganizationTypeBuilder setIndustryIdentifiers(OrganizationType.IndustryIdentifiers industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
        return this;
    }

    public OrganizationTypeBuilder setHeadCount(BigDecimal headCount) {
        this.headCount = headCount;
        return this;
    }

    public OrganizationTypeBuilder setRevenue(AmountType revenue) {
        this.revenue = revenue;
        return this;
    }

    public OrganizationTypeBuilder setDescription(TextType description) {
        this.description = description;
        return this;
    }

    public OrganizationTypeBuilder setGeographicResponsibilityCode(GeographicResponsibilityCodeList geographicResponsibilityCode) {
        this.geographicResponsibilityCode = geographicResponsibilityCode;
        return this;
    }

    public OrganizationTypeBuilder setOwnershipType(OwnershipTypeCodeList ownershipType) {
        this.ownershipType = ownershipType;
        return this;
    }

    public OrganizationTypeBuilder setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
        return this;
    }

    public OrganizationTypeBuilder setWorkEnvironmentCode(String workEnvironmentCode) {
        this.workEnvironmentCode = workEnvironmentCode;
        return this;
    }

    public OrganizationTypeBuilder setContacts(OrganizationType.Contacts contacts) {
        this.contacts = contacts;
        return this;
    }

    public OrganizationTypeBuilder setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public OrganizationType createOrganizationType() {
        return new OrganizationType(taxId, legalId, industryCodes, industryIdentifiers, headCount, revenue, description, geographicResponsibilityCode, ownershipType, stockSymbol, workEnvironmentCode, contacts, domainName);
    }

    public OrganizationTypeBuilder withUtbildning(Utbildning utbildning) {
        setLegalId(new IdentifierTypeBuilder().setValue(utbildning.getSkola()).createIdentifierType());
        return this;
    }

    public OrganizationTypeBuilder withAnstelning(Anstallning anstallning) {
        setLegalId(new IdentifierTypeBuilder().setValue(anstallning.getArbetsgivare()).createIdentifierType());
        return this;
    }
}