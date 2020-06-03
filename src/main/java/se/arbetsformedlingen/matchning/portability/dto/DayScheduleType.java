package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayScheduleType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DayScheduleType {

    protected IdentifierType id;
    protected String name;
    protected String code;
    protected WeekdayCodeList weekday;
    protected XMLGregorianCalendar date;
    protected XMLGregorianCalendar startTime;
    protected XMLGregorianCalendar endTime;
    protected String hours;
    protected EntityType shift;

    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public WeekdayCodeList getWeekday() {
        return weekday;
    }

    public void setWeekday(final WeekdayCodeList weekday) {
        this.weekday = weekday;
    }

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(final XMLGregorianCalendar date) {
        this.date = date;
    }

    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    public void setStartTime(final XMLGregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    public void setEndTime(final XMLGregorianCalendar endTime) {
        this.endTime = endTime;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(final String hours) {
        this.hours = hours;
    }

    public EntityType getShift() {
        return shift;
    }

    public void setShift(final EntityType shift) {
        this.shift = shift;
    }
}
