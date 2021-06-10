package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityDatesType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvailabilityDatesType {

    protected String startDateTime;
    protected String endDateTime;

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(final String endDateTime) {
        this.endDateTime = endDateTime;
    }
}
