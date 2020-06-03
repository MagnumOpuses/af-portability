package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TerminationType {

    protected IdentifierType reasonCode;
    protected XMLGregorianCalendar date;
    protected XMLGregorianCalendar lastWorkedDate;
    protected XMLGregorianCalendar lastPaidDate;
    protected XMLGregorianCalendar intendedDate;

    public IdentifierType getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(final IdentifierType reasonCode) {
        this.reasonCode = reasonCode;
    }

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(final XMLGregorianCalendar date) {
        this.date = date;
    }

    public XMLGregorianCalendar getLastWorkedDate() {
        return lastWorkedDate;
    }

    public void setLastWorkedDate(final XMLGregorianCalendar lastWorkedDate) {
        this.lastWorkedDate = lastWorkedDate;
    }

    public XMLGregorianCalendar getLastPaidDate() {
        return lastPaidDate;
    }

    public void setLastPaidDate(final XMLGregorianCalendar lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public XMLGregorianCalendar getIntendedDate() {
        return intendedDate;
    }

    public void setIntendedDate(final XMLGregorianCalendar intendedDate) {
        this.intendedDate = intendedDate;
    }
}
