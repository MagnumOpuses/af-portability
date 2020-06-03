package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodType", propOrder = {
        "formattedDateTime",
        "dateTimePeriod",
        "datePeriod",
        "yearMonthPeriod",
        "yearPeriod"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeriodType {

    @XmlElement(name = "FormattedDateTime")
    protected String formattedDateTime;
    @XmlElement(name = "DateTimePeriod")
    protected DateTimePeriodType dateTimePeriod;
    @XmlElement(name = "DatePeriod")
    protected DatePeriodType datePeriod;
    @XmlElement(name = "YearMonthPeriod")
    protected YearMonthPeriodType yearMonthPeriod;
    @XmlElement(name = "YearPeriod")
    protected YearPeriodType yearPeriod;

    public String getFormattedDateTime() {
        return formattedDateTime;
    }

    public void setFormattedDateTime(final String formattedDateTime) {
        this.formattedDateTime = formattedDateTime;
    }

    public DateTimePeriodType getDateTimePeriod() {
        return dateTimePeriod;
    }

    public void setDateTimePeriod(final DateTimePeriodType dateTimePeriod) {
        this.dateTimePeriod = dateTimePeriod;
    }

    public DatePeriodType getDatePeriod() {
        return datePeriod;
    }

    public void setDatePeriod(final DatePeriodType datePeriod) {
        this.datePeriod = datePeriod;
    }

    public YearMonthPeriodType getYearMonthPeriod() {
        return yearMonthPeriod;
    }

    public void setYearMonthPeriod(final YearMonthPeriodType yearMonthPeriod) {
        this.yearMonthPeriod = yearMonthPeriod;
    }

    public YearPeriodType getYearPeriod() {
        return yearPeriod;
    }

    public void setYearPeriod(final YearPeriodType yearPeriod) {
        this.yearPeriod = yearPeriod;
    }
}
