package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DistributionGuidelines {
    private boolean doNotRedistribute;
    private List<Distribution> distributeTo;
    private List<Distribution> doNotDistributeTo;

    public boolean isDoNotRedistribute() {
        return doNotRedistribute;
    }

    public void setDoNotRedistribute(boolean doNotRedistribute) {
        this.doNotRedistribute = doNotRedistribute;
    }

    public List<Distribution> getDistributeTo() {
        return distributeTo;
    }

    public void setDistributeTo(List<Distribution> distributeTo) {
        this.distributeTo = distributeTo;
    }

    public List<Distribution> getDoNotDistributeTo() {
        return doNotDistributeTo;
    }

    public void setDoNotDistributeTo(List<Distribution> doNotDistributeTo) {
        this.doNotDistributeTo = doNotDistributeTo;
    }
}

