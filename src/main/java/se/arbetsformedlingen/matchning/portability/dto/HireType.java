package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HireType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HireType {

    protected String typeCode;
    protected XMLGregorianCalendar date;
    protected XMLGregorianCalendar firstWorkDate;
    protected XMLGregorianCalendar expectedFirstWorkDate;
    protected XMLGregorianCalendar originalDate;
    protected XMLGregorianCalendar adjustedDate;
    protected List<XMLGregorianCalendar> serviceStartDates;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(final String typeCode) {
        this.typeCode = typeCode;
    }

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(final XMLGregorianCalendar date) {
        this.date = date;
    }

    public XMLGregorianCalendar getFirstWorkDate() {
        return firstWorkDate;
    }

    public void setFirstWorkDate(final XMLGregorianCalendar firstWorkDate) {
        this.firstWorkDate = firstWorkDate;
    }

    public XMLGregorianCalendar getExpectedFirstWorkDate() {
        return expectedFirstWorkDate;
    }

    public void setExpectedFirstWorkDate(final XMLGregorianCalendar expectedFirstWorkDate) {
        this.expectedFirstWorkDate = expectedFirstWorkDate;
    }

    public XMLGregorianCalendar getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(final XMLGregorianCalendar originalDate) {
        this.originalDate = originalDate;
    }

    public XMLGregorianCalendar getAdjustedDate() {
        return adjustedDate;
    }

    public void setAdjustedDate(final XMLGregorianCalendar adjustedDate) {
        this.adjustedDate = adjustedDate;
    }

    public List<XMLGregorianCalendar> getServiceStartDates() {
        if (serviceStartDates == null) {
            serviceStartDates = new ArrayList<XMLGregorianCalendar>();
        }
        return this.serviceStartDates;
    }
}
