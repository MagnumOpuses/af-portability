package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleType {

    protected IdentifierType id;
    protected String name;
    protected String code;
    protected PeriodType period;
    protected String hours;
    protected List<DayScheduleType> schedules;

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

    public PeriodType getPeriod() {
        return period;
    }

    public void setPeriod(final PeriodType period) {
        this.period = period;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(final String hours) {
        this.hours = hours;
    }

    public List<DayScheduleType> getSchedules() {
        if (schedules == null) {
            schedules = new ArrayList<DayScheduleType>();
        }
        return this.schedules;
    }

    public void setSchedules(final List<DayScheduleType> schedules) {
        this.schedules = schedules;
    }
}
