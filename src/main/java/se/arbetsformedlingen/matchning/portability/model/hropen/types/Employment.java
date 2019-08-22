package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.models.auth.In;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.ArrayList;
import java.util.List;

/*
Osäker på om det här är den korrekta modellen för employment. Stämmer inte med spec.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employment extends BaseHistory {
    private String title;
    private Organization organization;
    private String organizationUnit;
    private ResourceRelationshipCode resourceRelationshipCode;
    private String internetDomainName;
    private Integer headcount;
    private List<Identifier> industryCodes;
    private DateRange employmentPeriod;
    private Address location;
    private List<Entity> jobCategories;
    private List<Entity> jobLevels;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    public String getInternetDomainName() {
        return internetDomainName;
    }

    public void setInternetDomainName(String internetDomainName) {
        this.internetDomainName = internetDomainName;
    }

    public Integer getHeadcount() {
        return headcount;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }

    public List<Identifier> getIndustryCodes() {
        return industryCodes;
    }

    public void setIndustryCodes(List<Identifier> industyCodes) {
        this.industryCodes = industyCodes;
    }

    public DateRange getEmploymentPeriod() {
        return employmentPeriod;
    }

    public void setEmploymentPeriod(DateRange employmentPeriod) {
        this.employmentPeriod = employmentPeriod;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public ResourceRelationshipCode getResourceRelationshipCode() {
        return resourceRelationshipCode;
    }

    public void setResourceRelationshipCode(ResourceRelationshipCode resourceRelationshipCode) {
        this.resourceRelationshipCode = resourceRelationshipCode;
    }

    public List<Entity> getJobCategories() {
        return jobCategories;
    }

    public void setJobCategories(List<Entity> jobCategories) {
        this.jobCategories = jobCategories;
    }

    public List<Entity> getJobLevels() {
        return jobLevels;
    }

    public void setJobLevels(List<Entity> jobLevels) {
        this.jobLevels = jobLevels;
    }

    public enum ResourceRelationshipCode {
        employee, vendor;
    }

    /* Builder methods */
    public Employment withTitle(String title) {
        setTitle(title);
        return this;
    }

    public Employment withIndustryCodes(String id, String scheme) {
        getCreateIndustryCodes().add(new Identifier(id, scheme));
        return this;
    }

    public Employment withEmploymentPeriod(String fromYear, String fromMonth, String toYear, String toMonth) {
        if (toYear == null ||toMonth == null) {
            getCreateEmploymentPeriod().setCurrentIndicator(true);
        } else {
            getCreateEmploymentPeriod().setEnd(toYear, toMonth);
        }
        getCreateEmploymentPeriod().setStart(fromYear, fromMonth);
        return this;
    }

    public Employment withEmploymentFrom(String fromYear, String fromMonth) {
        getCreateEmploymentPeriod().setStart(fromYear, fromMonth);
        return this;
    }

    public Employment withEmploymentTo(String toYear, String toMonth) {
        getCreateEmploymentPeriod().setEnd(toYear, toMonth);
        return this;
    }

    public Employment withOrganization(String organizationName) {
        getCreateOrganization().withName(organizationName);
        return this;
    }

    /* Get-create-methods */
    private List<Identifier> getCreateIndustryCodes() {
        if (this.industryCodes == null) {
            this.industryCodes = new ArrayList<>();
        }
        return this.industryCodes;
    }

    private DateRange getCreateEmploymentPeriod() {
        if (this.employmentPeriod == null) {
            this.employmentPeriod = new DateRange();
        }
        return this.employmentPeriod;
    }

    private Organization getCreateOrganization() {
        if (this.organization == null) {
            this.organization = new Organization();
        }
        return this.organization;
    }
}
