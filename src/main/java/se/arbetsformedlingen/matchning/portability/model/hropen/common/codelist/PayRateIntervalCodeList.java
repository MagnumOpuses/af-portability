
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayRateIntervalCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayRateIntervalCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="TwoWeek24"/>
 *     &lt;enumeration value="TwoWeek26"/>
 *     &lt;enumeration value="TwoWeeks"/>
 *     &lt;enumeration value="FourWeeks"/>
 *     &lt;enumeration value="HalfMonth"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="TwoMonths"/>
 *     &lt;enumeration value="Quarter"/>
 *     &lt;enumeration value="SeasonalTerm"/>
 *     &lt;enumeration value="HalfYear"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="QuarterToDate"/>
 *     &lt;enumeration value="YearToDate"/>
 *     &lt;enumeration value="Once"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayRateIntervalCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PayRateIntervalCodeList {


    /**
     * Hour
     * 
     */
    @XmlEnumValue("Hour")
    HOUR("Hour"),

    /**
     * Day
     * 
     */
    @XmlEnumValue("Day")
    DAY("Day"),

    /**
     * Week
     * 
     */
    @XmlEnumValue("Week")
    WEEK("Week"),

    /**
     * Two Week 24
     * 
     */
    @XmlEnumValue("TwoWeek24")
    TWO_WEEK_24("TwoWeek24"),

    /**
     * Two Week 26
     * 
     */
    @XmlEnumValue("TwoWeek26")
    TWO_WEEK_26("TwoWeek26"),

    /**
     * Two Weeks
     * 
     */
    @XmlEnumValue("TwoWeeks")
    TWO_WEEKS("TwoWeeks"),

    /**
     * Four Weeks
     * 
     */
    @XmlEnumValue("FourWeeks")
    FOUR_WEEKS("FourWeeks"),

    /**
     * Half Month
     * 
     */
    @XmlEnumValue("HalfMonth")
    HALF_MONTH("HalfMonth"),

    /**
     * Month
     * 
     */
    @XmlEnumValue("Month")
    MONTH("Month"),

    /**
     * Two Months
     * 
     */
    @XmlEnumValue("TwoMonths")
    TWO_MONTHS("TwoMonths"),

    /**
     * Quarter
     * 
     */
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),

    /**
     * Seasonal Term
     * 
     */
    @XmlEnumValue("SeasonalTerm")
    SEASONAL_TERM("SeasonalTerm"),

    /**
     * Half Year
     * 
     */
    @XmlEnumValue("HalfYear")
    HALF_YEAR("HalfYear"),

    /**
     * Year
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * Quarter To Date
     * 
     */
    @XmlEnumValue("QuarterToDate")
    QUARTER_TO_DATE("QuarterToDate"),

    /**
     * Year To Date
     * 
     */
    @XmlEnumValue("YearToDate")
    YEAR_TO_DATE("YearToDate"),

    /**
     * Once
     * 
     */
    @XmlEnumValue("Once")
    ONCE("Once");
    private final String value;

    PayRateIntervalCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayRateIntervalCodeList fromValue(String v) {
        for (PayRateIntervalCodeList c: PayRateIntervalCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
