package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionGuidelinesType", propOrder = {

})
public class DistributionGuidelinesType {

    protected Boolean doNotRedistributeIndicator;
    protected List<DistributeToType> distributeTo;
    protected List<DoNotDistributeToType> doNotDistributeTo;

    public Boolean getDoNotRedistributeIndicator() {
        return doNotRedistributeIndicator;
    }

    public void setDoNotRedistributeIndicator(Boolean doNotRedistributeIndicator) {
        this.doNotRedistributeIndicator = doNotRedistributeIndicator;
    }

    public List<DistributeToType> getDistributeTo() {
        if (distributeTo == null) {
            distributeTo = new ArrayList<DistributeToType>();
        }
        return this.distributeTo;
    }

    public void setDistributeTo(List<DistributeToType> distributeTo) {
        this.distributeTo = distributeTo;
    }

    public List<DoNotDistributeToType> getDoNotDistributeTo() {
        if (doNotDistributeTo == null) {
            doNotDistributeTo = new ArrayList<DoNotDistributeToType>();
        }
        return this.doNotDistributeTo;
    }

    public void setDoNotDistributeTo(List<DoNotDistributeToType> doNotDistributeTo) {
        this.doNotDistributeTo = doNotDistributeTo;
    }
}
