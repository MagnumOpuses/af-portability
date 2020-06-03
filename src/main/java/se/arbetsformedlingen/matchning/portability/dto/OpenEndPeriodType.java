package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenEndPeriodType", propOrder = {
        "formattedDateTime",
        "dateTimeOpenEndPeriod",
        "dateOpenEndPeriod",
        "yearMonthOpenEndPeriod",
        "yearOpenEndPeriod"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenEndPeriodType {

    @XmlElement(name = "FormattedDateTime")
    protected String formattedDateTime;
    @XmlElement(name = "DateTimeOpenEndPeriod")
    protected DateTimeOpenEndPeriodType dateTimeOpenEndPeriod;
    @XmlElement(name = "DateOpenEndPeriod")
    protected DateOpenEndPeriodType dateOpenEndPeriod;
    @XmlElement(name = "YearMonthOpenEndPeriod")
    protected YearMonthOpenEndPeriodType yearMonthOpenEndPeriod;
    @XmlElement(name = "YearOpenEndPeriod")
    protected YearOpenEndPeriodType yearOpenEndPeriod;

    public String getFormattedDateTime() {
        return formattedDateTime;
    }

    public void setFormattedDateTime(final String formattedDateTime) {
        this.formattedDateTime = formattedDateTime;
    }

    public DateTimeOpenEndPeriodType getDateTimeOpenEndPeriod() {
        return dateTimeOpenEndPeriod;
    }

    public void setDateTimeOpenEndPeriod(final DateTimeOpenEndPeriodType dateTimeOpenEndPeriod) {
        this.dateTimeOpenEndPeriod = dateTimeOpenEndPeriod;
    }

    public DateOpenEndPeriodType getDateOpenEndPeriod() {
        return dateOpenEndPeriod;
    }

    public void setDateOpenEndPeriod(final DateOpenEndPeriodType dateOpenEndPeriod) {
        this.dateOpenEndPeriod = dateOpenEndPeriod;
    }

    public YearMonthOpenEndPeriodType getYearMonthOpenEndPeriod() {
        return yearMonthOpenEndPeriod;
    }

    public void setYearMonthOpenEndPeriod(final YearMonthOpenEndPeriodType yearMonthOpenEndPeriod) {
        this.yearMonthOpenEndPeriod = yearMonthOpenEndPeriod;
    }

    public YearOpenEndPeriodType getYearOpenEndPeriod() {
        return yearOpenEndPeriod;
    }

    public void setYearOpenEndPeriod(final YearOpenEndPeriodType yearOpenEndPeriod) {
        this.yearOpenEndPeriod = yearOpenEndPeriod;
    }
}
