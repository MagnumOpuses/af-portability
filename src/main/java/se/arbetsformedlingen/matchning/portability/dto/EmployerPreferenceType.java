package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerPreferenceType", propOrder = {

})
public class EmployerPreferenceType {

    protected StringTypeArray organizationNames;
    protected StringTypeArray organizationTypes;
    protected List<IdentifierType> industryCodes;
    protected EmployerPreferenceType.HeadcountRange headcountRange;
    protected StringTypeArray descriptions;

    public StringTypeArray getOrganizationNames() {
        return organizationNames;
    }

    public void setOrganizationNames(StringTypeArray organizationNames) {
        this.organizationNames = organizationNames;
    }

    public StringTypeArray getOrganizationTypes() {
        return organizationTypes;
    }

    public void setOrganizationTypes(StringTypeArray organizationTypes) {
        this.organizationTypes = organizationTypes;
    }

    public List<IdentifierType> getIndustryCodes() {
        if (industryCodes == null) {
            industryCodes = new ArrayList<IdentifierType>();
        }
        return this.industryCodes;
    }

    public void setIndustryCodes(List<IdentifierType> industryCodes) {
        this.industryCodes = industryCodes;
    }

    public HeadcountRange getHeadcountRange() {
        return headcountRange;
    }

    public void setHeadcountRange(HeadcountRange headcountRange) {
        this.headcountRange = headcountRange;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
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

        public void setMinimum(BigDecimal minimum) {
            this.minimum = minimum;
        }

        public BigDecimal getMaximum() {
            return maximum;
        }

        public void setMaximum(BigDecimal maximum) {
            this.maximum = maximum;
        }
    }


}
