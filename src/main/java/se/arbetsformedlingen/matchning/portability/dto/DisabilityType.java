package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisabilityType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisabilityType {

    protected Boolean indicator;
    protected List<DisabilitySummaryType> summary;

    public Boolean getIndicator() {
        return indicator;
    }

    public void setIndicator(final Boolean indicator) {
        this.indicator = indicator;
    }

    public List<DisabilitySummaryType> getSummary() {
        if (summary == null) {
            summary = new ArrayList<DisabilitySummaryType>();
        }
        return this.summary;
    }

    public void setSummary(final List<DisabilitySummaryType> summary) {
        this.summary = summary;
    }
}
