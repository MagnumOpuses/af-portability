package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAvailabilityType", propOrder = {

})
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

    public MeasureType getNoticePeriodMeasure() {
        return noticePeriodMeasure;
    }

    public void setNoticePeriodMeasure(MeasureType noticePeriodMeasure) {
        this.noticePeriodMeasure = noticePeriodMeasure;
    }

    public Boolean getImmediateStartIndicator() {
        return immediateStartIndicator;
    }

    public void setImmediateStartIndicator(Boolean immediateStartIndicator) {
        this.immediateStartIndicator = immediateStartIndicator;
    }
}
