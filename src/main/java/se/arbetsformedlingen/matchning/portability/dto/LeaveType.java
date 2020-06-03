package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaveType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeaveType {

    protected String statusCode;
    protected String remunerationCode;
    protected String reasonCode;
    protected XMLGregorianCalendar startDate;
    protected XMLGregorianCalendar lastWorkedDate;
    protected XMLGregorianCalendar lastPaidDate;
    protected XMLGregorianCalendar scheduledWorkReturnDate;
    protected XMLGregorianCalendar workReturnDate;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(final String statusCode) {
        this.statusCode = statusCode;
    }

    public String getRemunerationCode() {
        return remunerationCode;
    }

    public void setRemunerationCode(final String remunerationCode) {
        this.remunerationCode = remunerationCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(final String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(final XMLGregorianCalendar startDate) {
        this.startDate = startDate;
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

    public XMLGregorianCalendar getScheduledWorkReturnDate() {
        return scheduledWorkReturnDate;
    }

    public void setScheduledWorkReturnDate(final XMLGregorianCalendar scheduledWorkReturnDate) {
        this.scheduledWorkReturnDate = scheduledWorkReturnDate;
    }

    public XMLGregorianCalendar getWorkReturnDate() {
        return workReturnDate;
    }

    public void setWorkReturnDate(final XMLGregorianCalendar workReturnDate) {
        this.workReturnDate = workReturnDate;
    }
}
