package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionGuidelinesType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DistributionGuidelinesType {

    protected Boolean doNotRedistributeIndicator;
    protected List<DistributeToType> distributeTo;
    protected List<DoNotDistributeToType> doNotDistributeTo;

    public Boolean getDoNotRedistributeIndicator() {
        return doNotRedistributeIndicator;
    }

    public void setDoNotRedistributeIndicator(final Boolean doNotRedistributeIndicator) {
        this.doNotRedistributeIndicator = doNotRedistributeIndicator;
    }

    public List<DistributeToType> getDistributeTo() {
        if (distributeTo == null) {
            distributeTo = new ArrayList<DistributeToType>();
        }
        return this.distributeTo;
    }

    public void setDistributeTo(final List<DistributeToType> distributeTo) {
        this.distributeTo = distributeTo;
    }

    public List<DoNotDistributeToType> getDoNotDistributeTo() {
        if (doNotDistributeTo == null) {
            doNotDistributeTo = new ArrayList<DoNotDistributeToType>();
        }
        return this.doNotDistributeTo;
    }

    public void setDoNotDistributeTo(final List<DoNotDistributeToType> doNotDistributeTo) {
        this.doNotDistributeTo = doNotDistributeTo;
    }
}
