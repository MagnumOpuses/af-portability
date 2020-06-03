package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {

})
public class OrganizationType extends OrganizationReferenceType {

    public IdentifierType taxId;
    public IdentifierType legalId;
    public List<String> industryCodes;
    public List<IdentifierType> industryIdentifiers;
    public BigDecimal headCount;
    public AmountType revenue;
    public TextType description;
    public GeographicResponsibilityCodeList geographicResponsibilityCode;
    public OwnershipTypeCodeList ownershipType;
    public String stockSymbol;
    public String workEnvironmentCode;
    public List<SpecifiedPersonType> contacts;
    public String domainName;

    public IdentifierType getTaxId() {
        return taxId;
    }

    public void setTaxId(final IdentifierType taxId) {
        this.taxId = taxId;
    }

    public IdentifierType getLegalId() {
        return legalId;
    }

    public void setLegalId(final IdentifierType legalId) {
        this.legalId = legalId;
    }

    public List<String> getIndustryCodes() {
        if (industryCodes == null) {
            industryCodes = new ArrayList<String>();
        }
        return this.industryCodes;
    }

    public void setIndustryCodes(final List<String> industryCodes) {
        this.industryCodes = industryCodes;
    }

    public List<IdentifierType> getIndustryIdentifiers() {
        if (industryIdentifiers == null) {
            industryIdentifiers = new ArrayList<IdentifierType>();
        }
        return this.industryIdentifiers;
    }

    public void setIndustryIdentifiers(final List<IdentifierType> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    public BigDecimal getHeadCount() {
        return headCount;
    }

    public void setHeadCount(final BigDecimal headCount) {
        this.headCount = headCount;
    }

    public AmountType getRevenue() {
        return revenue;
    }

    public void setRevenue(final AmountType revenue) {
        this.revenue = revenue;
    }

    public TextType getDescription() {
        return description;
    }

    public void setDescription(final TextType description) {
        this.description = description;
    }

    public GeographicResponsibilityCodeList getGeographicResponsibilityCode() {
        return geographicResponsibilityCode;
    }

    public void setGeographicResponsibilityCode(final GeographicResponsibilityCodeList geographicResponsibilityCode) {
        this.geographicResponsibilityCode = geographicResponsibilityCode;
    }

    public OwnershipTypeCodeList getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(final OwnershipTypeCodeList ownershipType) {
        this.ownershipType = ownershipType;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(final String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getWorkEnvironmentCode() {
        return workEnvironmentCode;
    }

    public void setWorkEnvironmentCode(final String workEnvironmentCode) {
        this.workEnvironmentCode = workEnvironmentCode;
    }

    public List<SpecifiedPersonType> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<SpecifiedPersonType>();
        }
        return this.contacts;
    }

    public void setContacts(final List<SpecifiedPersonType> contacts) {
        this.contacts = contacts;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(final String domainName) {
        this.domainName = domainName;
    }
}


