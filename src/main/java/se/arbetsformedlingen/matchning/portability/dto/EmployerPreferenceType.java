package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerPreferenceType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployerPreferenceType {

    protected List<String> organizationNames;
    protected List<String> organizationTypes;
    protected List<IdentifierType> industryCodes;
    protected EmployerPreferenceType.HeadcountRange headcountRange;
    protected List<String> descriptions;

    public List<String> getOrganizationNames() {
        return organizationNames;
    }

    public void setOrganizationNames(final List<String> organizationNames) {
        this.organizationNames = organizationNames;
    }

    public List<String> getOrganizationTypes() {
        return organizationTypes;
    }

    public void setOrganizationTypes(final List<String> organizationTypes) {
        this.organizationTypes = organizationTypes;
    }

    public List<IdentifierType> getIndustryCodes() {
        if (industryCodes == null) {
            industryCodes = new ArrayList<IdentifierType>();
        }
        return this.industryCodes;
    }

    public void setIndustryCodes(final List<IdentifierType> industryCodes) {
        this.industryCodes = industryCodes;
    }

    public HeadcountRange getHeadcountRange() {
        return headcountRange;
    }

    public void setHeadcountRange(final HeadcountRange headcountRange) {
        this.headcountRange = headcountRange;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class HeadcountRange {

        protected BigDecimal minimum;
        protected BigDecimal maximum;

        public BigDecimal getMinimum() {
            return minimum;
        }

        public void setMinimum(final BigDecimal minimum) {
            this.minimum = minimum;
        }

        public BigDecimal getMaximum() {
            return maximum;
        }

        public void setMaximum(final BigDecimal maximum) {
            this.maximum = maximum;
        }
    }


}
