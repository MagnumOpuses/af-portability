package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecruitingAndStaffingType", propOrder = {

})
public class RecruitingAndStaffingType {

    protected XMLGregorianCalendar applicationDate;
    protected List<XMLGregorianCalendar> interviewDates;
    protected XMLGregorianCalendar rejectionDate;
    protected String rejectionReasonCode;
    protected XMLGregorianCalendar offeredOnDate;
    protected XMLGregorianCalendar offerAcceptedDate;

    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(XMLGregorianCalendar applicationDate) {
        this.applicationDate = applicationDate;
    }

    public List<XMLGregorianCalendar> getInterviewDates() {
        if (interviewDates == null) {
            interviewDates = new ArrayList<XMLGregorianCalendar>();
        }
        return this.interviewDates;
    }

    public void setInterviewDates(List<XMLGregorianCalendar> interviewDates) {
        this.interviewDates = interviewDates;
    }

    public XMLGregorianCalendar getRejectionDate() {
        return rejectionDate;
    }

    public void setRejectionDate(XMLGregorianCalendar rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    public String getRejectionReasonCode() {
        return rejectionReasonCode;
    }

    public void setRejectionReasonCode(String rejectionReasonCode) {
        this.rejectionReasonCode = rejectionReasonCode;
    }

    public XMLGregorianCalendar getOfferedOnDate() {
        return offeredOnDate;
    }

    public void setOfferedOnDate(XMLGregorianCalendar offeredOnDate) {
        this.offeredOnDate = offeredOnDate;
    }

    public XMLGregorianCalendar getOfferAcceptedDate() {
        return offerAcceptedDate;
    }

    public void setOfferAcceptedDate(XMLGregorianCalendar offerAcceptedDate) {
        this.offerAcceptedDate = offerAcceptedDate;
    }
}
