
package se.arbetsformedlingen.matchning.portability.model.hropen.common.base;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Single date/timespan/month/year or period between two dates/months/years.
 * 
 * <p>Java class for PeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}FormattedDateTime"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}DateTimePeriod"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}DatePeriod"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}YearMonthPeriod"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}YearPeriod"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodType", propOrder = {
    "formattedDateTime",
    "dateTimePeriod",
    "datePeriod",
    "yearMonthPeriod",
    "yearPeriod"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PeriodType {

    @XmlElement(name = "FormattedDateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String formattedDateTime;
    @XmlElement(name = "DateTimePeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DateTimePeriodType dateTimePeriod;
    @XmlElement(name = "DatePeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DatePeriodType datePeriod;
    @XmlElement(name = "YearMonthPeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected YearMonthPeriodType yearMonthPeriod;
    @XmlElement(name = "YearPeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected YearPeriodType yearPeriod;

    /**
     * Gets the value of the formattedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFormattedDateTime() {
        return formattedDateTime;
    }

    /**
     * Sets the value of the formattedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFormattedDateTime(String value) {
        this.formattedDateTime = value;
    }

    /**
     * Gets the value of the dateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DateTimePeriodType getDateTimePeriod() {
        return dateTimePeriod;
    }

    /**
     * Sets the value of the dateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDateTimePeriod(DateTimePeriodType value) {
        this.dateTimePeriod = value;
    }

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DatePeriodType getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDatePeriod(DatePeriodType value) {
        this.datePeriod = value;
    }

    /**
     * Gets the value of the yearMonthPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link YearMonthPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public YearMonthPeriodType getYearMonthPeriod() {
        return yearMonthPeriod;
    }

    /**
     * Sets the value of the yearMonthPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearMonthPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setYearMonthPeriod(YearMonthPeriodType value) {
        this.yearMonthPeriod = value;
    }

    /**
     * Gets the value of the yearPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link YearPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public YearPeriodType getYearPeriod() {
        return yearPeriod;
    }

    /**
     * Sets the value of the yearPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setYearPeriod(YearPeriodType value) {
        this.yearPeriod = value;
    }

}
