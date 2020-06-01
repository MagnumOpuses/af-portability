package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisabilityType", propOrder = {

})
public class DisabilityType {

    protected Boolean indicator;
    protected List<DisabilitySummaryType> summary;

    public Boolean getIndicator() {
        return indicator;
    }

    public void setIndicator(Boolean indicator) {
        this.indicator = indicator;
    }

    public List<DisabilitySummaryType> getSummary() {
        if (summary == null) {
            summary = new ArrayList<DisabilitySummaryType>();
        }
        return this.summary;
    }

    public void setSummary(List<DisabilitySummaryType> summary) {
        this.summary = summary;
    }
}
