package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearPeriodType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class YearPeriodType {

    @XmlElement(namespace = "", required = true)
    protected XMLGregorianCalendar start;
    @XmlElement(namespace = "", required = true)
    protected XMLGregorianCalendar end;

    public XMLGregorianCalendar getStart() {
        return start;
    }

    public void setStart(final XMLGregorianCalendar start) {
        this.start = start;
    }

    public XMLGregorianCalendar getEnd() {
        return end;
    }

    public void setEnd(final XMLGregorianCalendar end) {
        this.end = end;
    }
}
