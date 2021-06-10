package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecruitingAndStaffingType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public void setApplicationDate(final XMLGregorianCalendar applicationDate) {
        this.applicationDate = applicationDate;
    }

    public List<XMLGregorianCalendar> getInterviewDates() {
        if (interviewDates == null) {
            interviewDates = new ArrayList<XMLGregorianCalendar>();
        }
        return this.interviewDates;
    }

    public void setInterviewDates(final List<XMLGregorianCalendar> interviewDates) {
        this.interviewDates = interviewDates;
    }

    public XMLGregorianCalendar getRejectionDate() {
        return rejectionDate;
    }

    public void setRejectionDate(final XMLGregorianCalendar rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    public String getRejectionReasonCode() {
        return rejectionReasonCode;
    }

    public void setRejectionReasonCode(final String rejectionReasonCode) {
        this.rejectionReasonCode = rejectionReasonCode;
    }

    public XMLGregorianCalendar getOfferedOnDate() {
        return offeredOnDate;
    }

    public void setOfferedOnDate(final XMLGregorianCalendar offeredOnDate) {
        this.offeredOnDate = offeredOnDate;
    }

    public XMLGregorianCalendar getOfferAcceptedDate() {
        return offerAcceptedDate;
    }

    public void setOfferAcceptedDate(final XMLGregorianCalendar offerAcceptedDate) {
        this.offerAcceptedDate = offerAcceptedDate;
    }
}
