package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePeriodType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateTimePeriodType {

    @XmlElement(required = true)
    protected DateTimeType start;
    @XmlElement(required = true)
    @JsonSerialize(using = DateTimeType.DateTypeSerializer.class)
    @JsonDeserialize(using = DateTimeType.DateTypeDeserializer.class)
    protected DateTimeType end;

    public DateTimeType getStart() {
        return start;
    }

    public void setStart(final DateTimeType start) {
        this.start = start;
    }

    public DateTimeType getEnd() {
        return end;
    }

    public void setEnd(final DateTimeType end) {
        this.end = end;
    }
}
