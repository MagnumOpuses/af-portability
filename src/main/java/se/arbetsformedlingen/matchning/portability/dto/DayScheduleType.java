package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayScheduleType", propOrder = {

})
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

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WeekdayCodeList getWeekday() {
        return weekday;
    }

    public void setWeekday(WeekdayCodeList weekday) {
        this.weekday = weekday;
    }

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(XMLGregorianCalendar date) {
        this.date = date;
    }

    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    public void setStartTime(XMLGregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    public void setEndTime(XMLGregorianCalendar endTime) {
        this.endTime = endTime;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public EntityType getShift() {
        return shift;
    }

    public void setShift(EntityType shift) {
        this.shift = shift;
    }
}
