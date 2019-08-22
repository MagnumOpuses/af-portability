package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class License extends Certificate {
    private List<LicenseDetail> endorsements;
    private List<LicenseDetail> restrictions;
    private List<LicenseDetail> violations;
    private List<String> descriptions;

    public List<LicenseDetail> getEndorsements() {
        return endorsements;
    }

    public void setEndorsements(List<LicenseDetail> endorsements) {
        this.endorsements = endorsements;
    }

    public List<LicenseDetail> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<LicenseDetail> restrictions) {
        this.restrictions = restrictions;
    }

    public List<LicenseDetail> getViolations() {
        return violations;
    }

    public void setViolations(List<LicenseDetail> violations) {
        this.violations = violations;
    }

    @Override
    public List<String> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    /* Builder methods */
    public License withEndorsement(LicenseDetail detail) {
        getCreateEndorsements().add(detail);
        return this;
    }

    /* Get-create-methods */
    private List<LicenseDetail> getCreateEndorsements() {
        if (this.endorsements == null) {
            this.endorsements = new ArrayList<>();
        }
        return this.endorsements;
    }
}
