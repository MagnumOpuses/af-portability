package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PayRateIntervalCodeList")
@XmlEnum
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
