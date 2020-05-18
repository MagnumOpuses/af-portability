package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearMonthPeriodType", propOrder = {

})
public class YearMonthPeriodType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar start;
    @XmlElement(required = true)
    protected XMLGregorianCalendar end;

    public XMLGregorianCalendar getStart() {
        return start;
    }

    public void setStart(XMLGregorianCalendar start) {
        this.start = start;
    }

    public XMLGregorianCalendar getEnd() {
        return end;
    }

    public void setEnd(XMLGregorianCalendar end) {
        this.end = end;
    }
}
