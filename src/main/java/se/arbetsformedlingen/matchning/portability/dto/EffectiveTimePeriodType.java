package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveTimePeriodType", propOrder = {

})
public class EffectiveTimePeriodType {

    protected XMLGregorianCalendar validFrom;
    protected XMLGregorianCalendar validTo;

    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(XMLGregorianCalendar validFrom) {
        this.validFrom = validFrom;
    }

    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    public void setValidTo(XMLGregorianCalendar validTo) {
        this.validTo = validTo;
    }
}
