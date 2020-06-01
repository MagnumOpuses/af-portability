package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaveType", propOrder = {

})
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

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getRemunerationCode() {
        return remunerationCode;
    }

    public void setRemunerationCode(String remunerationCode) {
        this.remunerationCode = remunerationCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(XMLGregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public XMLGregorianCalendar getLastWorkedDate() {
        return lastWorkedDate;
    }

    public void setLastWorkedDate(XMLGregorianCalendar lastWorkedDate) {
        this.lastWorkedDate = lastWorkedDate;
    }

    public XMLGregorianCalendar getLastPaidDate() {
        return lastPaidDate;
    }

    public void setLastPaidDate(XMLGregorianCalendar lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public XMLGregorianCalendar getScheduledWorkReturnDate() {
        return scheduledWorkReturnDate;
    }

    public void setScheduledWorkReturnDate(XMLGregorianCalendar scheduledWorkReturnDate) {
        this.scheduledWorkReturnDate = scheduledWorkReturnDate;
    }

    public XMLGregorianCalendar getWorkReturnDate() {
        return workReturnDate;
    }

    public void setWorkReturnDate(XMLGregorianCalendar workReturnDate) {
        this.workReturnDate = workReturnDate;
    }
}
