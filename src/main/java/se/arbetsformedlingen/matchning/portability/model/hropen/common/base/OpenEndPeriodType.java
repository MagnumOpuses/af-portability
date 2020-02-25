
package se.arbetsformedlingen.matchning.portability.model.hropen.common.base;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Single date/timespan/month/year or period between two dates/months/years. The end date is optional and should be used in cases where the end of the period is unknown or uncertain.
 * 
 * <p>Java class for OpenEndPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenEndPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}FormattedDateTime"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}DateTimeOpenEndPeriod"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}DateOpenEndPeriod"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}YearMonthOpenEndPeriod"/>
 *         &lt;element ref="{https://hropenstandards.org/schema/xml/}YearOpenEndPeriod"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenEndPeriodType", propOrder = {
    "formattedDateTime",
    "dateTimeOpenEndPeriod",
    "dateOpenEndPeriod",
    "yearMonthOpenEndPeriod",
    "yearOpenEndPeriod"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class OpenEndPeriodType {

    @XmlElement(name = "FormattedDateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String formattedDateTime;
    @XmlElement(name = "DateTimeOpenEndPeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DateTimeOpenEndPeriodType dateTimeOpenEndPeriod;
    @XmlElement(name = "DateOpenEndPeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DateOpenEndPeriodType dateOpenEndPeriod;
    @XmlElement(name = "YearMonthOpenEndPeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected YearMonthOpenEndPeriodType yearMonthOpenEndPeriod;
    @XmlElement(name = "YearOpenEndPeriod")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected YearOpenEndPeriodType yearOpenEndPeriod;

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
     * Gets the value of the dateTimeOpenEndPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DateTimeOpenEndPeriodType getDateTimeOpenEndPeriod() {
        return dateTimeOpenEndPeriod;
    }

    /**
     * Sets the value of the dateTimeOpenEndPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDateTimeOpenEndPeriod(DateTimeOpenEndPeriodType value) {
        this.dateTimeOpenEndPeriod = value;
    }

    /**
     * Gets the value of the dateOpenEndPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DateOpenEndPeriodType getDateOpenEndPeriod() {
        return dateOpenEndPeriod;
    }

    /**
     * Sets the value of the dateOpenEndPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDateOpenEndPeriod(DateOpenEndPeriodType value) {
        this.dateOpenEndPeriod = value;
    }

    /**
     * Gets the value of the yearMonthOpenEndPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link YearMonthOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public YearMonthOpenEndPeriodType getYearMonthOpenEndPeriod() {
        return yearMonthOpenEndPeriod;
    }

    /**
     * Sets the value of the yearMonthOpenEndPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearMonthOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setYearMonthOpenEndPeriod(YearMonthOpenEndPeriodType value) {
        this.yearMonthOpenEndPeriod = value;
    }

    /**
     * Gets the value of the yearOpenEndPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link YearOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public YearOpenEndPeriodType getYearOpenEndPeriod() {
        return yearOpenEndPeriod;
    }

    /**
     * Sets the value of the yearOpenEndPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearOpenEndPeriodType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setYearOpenEndPeriod(YearOpenEndPeriodType value) {
        this.yearOpenEndPeriod = value;
    }

}
