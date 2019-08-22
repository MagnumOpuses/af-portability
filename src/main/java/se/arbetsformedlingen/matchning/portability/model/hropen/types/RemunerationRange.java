package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemunerationRange {
    private String typeCode;
    private List<Amount> minimumAmount;
    private List<Amount> maximumAmount;
    private String intervalCode;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public List<Amount> getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(List<Amount> minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public List<Amount> getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(List<Amount> maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public String getIntervalCode() {
        return intervalCode;
    }

    public void setIntervalCode(String intervalCode) {
        this.intervalCode = intervalCode;
    }
}
