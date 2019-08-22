package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployerPreference {
    private List<String> organizationNames;
    private List<String> organizationTypes;
    private Set<Identifier> industryCodes;
    private IntRange headcountRange;
    private List<String> descriptions;

    public List<String> getOrganizationNames() {
        return organizationNames;
    }

    public void setOrganizationNames(List<String> organizationNames) {
        this.organizationNames = organizationNames;
    }

    public List<String> getOrganizationTypes() {
        return organizationTypes;
    }

    public void setOrganizationTypes(List<String> organizationTypes) {
        this.organizationTypes = organizationTypes;
    }

    public Set<Identifier> getIndustryCodes() {
        return industryCodes;
    }

    public void setIndustryCodes(Set<Identifier> industryCodes) {
        this.industryCodes = industryCodes;
    }

    public IntRange getHeadcountRange() {
        return headcountRange;
    }

    public void setHeadcountRange(IntRange headcountRange) {
        this.headcountRange = headcountRange;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public EmployerPreference withIndustryCode(String id, String identifierScheme) {
        getCreateIndustryCode().add(new Identifier(id, identifierScheme));
        return this;
    }

    private Set<Identifier> getCreateIndustryCode() {
       if (industryCodes == null) {
           this.industryCodes = new HashSet<>();
       }
       return industryCodes;
    }
}
