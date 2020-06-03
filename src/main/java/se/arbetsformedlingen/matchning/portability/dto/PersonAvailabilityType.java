package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAvailabilityType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonAvailabilityType {

    protected List<AvailabilityDatesType> availabilityDates;
    protected MeasureType noticePeriodMeasure;
    protected Boolean immediateStartIndicator;

    public List<AvailabilityDatesType> getAvailabilityDates() {
        if (availabilityDates == null) {
            availabilityDates = new ArrayList<AvailabilityDatesType>();
        }
        return this.availabilityDates;
    }

    public void setAvailabilityDates(final List<AvailabilityDatesType> availabilityDates) {
        this.availabilityDates = availabilityDates;
    }

    public MeasureType getNoticePeriodMeasure() {
        return noticePeriodMeasure;
    }

    public void setNoticePeriodMeasure(final MeasureType noticePeriodMeasure) {
        this.noticePeriodMeasure = noticePeriodMeasure;
    }

    public Boolean getImmediateStartIndicator() {
        return immediateStartIndicator;
    }

    public void setImmediateStartIndicator(final Boolean immediateStartIndicator) {
        this.immediateStartIndicator = immediateStartIndicator;
    }
}
