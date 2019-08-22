package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonAvailability {
    private List<DateRange> availabilityDates;
    private Measure noticePeriodMeasure;
    private boolean immediateStartIndicator;

    public List<DateRange> getAvailabilityDates() {
        return availabilityDates;
    }

    public void setAvailabilityDates(List<DateRange> availabilityDates) {
        this.availabilityDates = availabilityDates;
    }

    public Measure getNoticePeriodMeasure() {
        return noticePeriodMeasure;
    }

    public void setNoticePeriodMeasure(Measure noticePeriodMeasure) {
        this.noticePeriodMeasure = noticePeriodMeasure;
    }

    public boolean isImmediateStartIndicator() {
        return immediateStartIndicator;
    }

    public void setImmediateStartIndicator(boolean immediateStartIndicator) {
        this.immediateStartIndicator = immediateStartIndicator;
    }
}
