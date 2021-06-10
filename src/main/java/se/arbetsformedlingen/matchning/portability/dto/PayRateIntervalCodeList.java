package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PayRateIntervalCodeList")
@XmlEnum
public enum PayRateIntervalCodeList {


    /**
     * Hour
     */
    @XmlEnumValue("Hour")
    @JsonProperty("Hour")
    HOUR("Hour"),

    /**
     * Day
     */
    @XmlEnumValue("Day")
    @JsonProperty("Day")
    DAY("Day"),

    /**
     * Week
     */
    @XmlEnumValue("Week")
    @JsonProperty("Week")
    WEEK("Week"),

    /**
     * Two Week 24
     */
    @XmlEnumValue("TwoWeek24")
    @JsonProperty("TwoWeek24")
    TWO_WEEK_24("TwoWeek24"),

    /**
     * Two Week 26
     */
    @XmlEnumValue("TwoWeek26")
    @JsonProperty("TwoWeek26")
    TWO_WEEK_26("TwoWeek26"),

    /**
     * Two Weeks
     */
    @XmlEnumValue("TwoWeeks")
    @JsonProperty("TwoWeeks")
    TWO_WEEKS("TwoWeeks"),

    /**
     * Four Weeks
     */
    @XmlEnumValue("FourWeeks")
    @JsonProperty("FourWeeks")
    FOUR_WEEKS("FourWeeks"),

    /**
     * Half Month
     */
    @XmlEnumValue("HalfMonth")
    @JsonProperty("HalfMonth")
    HALF_MONTH("HalfMonth"),

    /**
     * Month
     */
    @XmlEnumValue("Month")
    @JsonProperty("Month")
    MONTH("Month"),

    /**
     * Two Months
     */
    @XmlEnumValue("TwoMonths")
    @JsonProperty("TwoMonths")
    TWO_MONTHS("TwoMonths"),

    /**
     * Quarter
     */
    @XmlEnumValue("Quarter")
    @JsonProperty("Quarter")
    QUARTER("Quarter"),

    /**
     * Seasonal Term
     */
    @XmlEnumValue("SeasonalTerm")
    @JsonProperty("SeasonalTerm")
    SEASONAL_TERM("SeasonalTerm"),

    /**
     * Half Year
     */
    @XmlEnumValue("HalfYear")
    @JsonProperty("HalfYear")
    HALF_YEAR("HalfYear"),

    /**
     * Year
     */
    @XmlEnumValue("Year")
    @JsonProperty("Year")
    YEAR("Year"),

    /**
     * Quarter To Date
     */
    @XmlEnumValue("QuarterToDate")
    @JsonProperty("QuarterToDate")
    QUARTER_TO_DATE("QuarterToDate"),

    /**
     * Year To Date
     */
    @XmlEnumValue("YearToDate")
    @JsonProperty("YearToDate")
    YEAR_TO_DATE("YearToDate"),

    /**
     * Once
     */
    @XmlEnumValue("Once")
    @JsonProperty("Once")
    ONCE("Once");
    private final String value;

    PayRateIntervalCodeList(final String v) {
        value = v;
    }

    public static PayRateIntervalCodeList fromValue(final String v) {
        for (final PayRateIntervalCodeList c : PayRateIntervalCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
