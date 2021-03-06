package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "UnitCodeList")
@XmlEnum
@JsonInclude(JsonInclude.Include.NON_NULL)
public enum UnitCodeList {


    /**
     * acre
     */
    ACR("ACR"),

    /**
     * are
     */
    ARE("ARE"),

    /**
     * centimeter
     */
    CMT("CMT"),

    /**
     * day
     */
    DAY("DAY"),

    /**
     * each
     */
    EA("EA"),

    /**
     * foot
     */
    FOT("FOT"),

    /**
     * gram
     */
    GRM("GRM"),

    /**
     * hectare
     */
    HAR("HAR"),

    /**
     * hour
     */
    HUR("HUR"),

    /**
     * inch
     */
    INH("INH"),

    /**
     * kilogram
     */
    KGM("KGM"),

    /**
     * kilometre
     */
    KMT("KMT"),

    /**
     * litre
     */
    LTR("LTR"),

    /**
     * metre
     */
    MTR("MTR"),

    /**
     * mile
     */
    SMI("SMI"),

    /**
     * milligram
     */
    MGM("MGM"),

    /**
     * millilitre
     */
    MLT("MLT"),

    /**
     * millimetre
     */
    MMT("MMT"),

    /**
     * millisecond
     */
    @XmlEnumValue("C26")
    @JsonProperty("C26")
    C_26("C26"),

    /**
     * minute
     */
    MIN("MIN"),

    /**
     * month
     */
    MON("MON"),

    /**
     * one [piece]
     */
    @XmlEnumValue("C62")
    @JsonProperty("C62")
    C_62("C62"),

    /**
     * ounce
     */
    ONZ("ONZ"),

    /**
     * pint [UK]
     */
    PTI("PTI"),

    /**
     * pint [US]
     */
    PT("PT"),

    /**
     * pound
     */
    LBR("LBR"),

    /**
     * quart [UK]
     */
    QTI("QTI"),

    /**
     * quart [US]
     */
    QT("QT"),

    /**
     * second
     */
    SEC("SEC"),

    /**
     * stone
     */
    STI("STI"),

    /**
     * week
     */
    WEE("WEE"),

    /**
     * yard
     */
    YRD("YRD"),

    /**
     * year
     */
    ANN("ANN");
    private final String value;

    UnitCodeList(final String v) {
        value = v;
    }

    public static UnitCodeList fromValue(final String v) {
        for (final UnitCodeList c : UnitCodeList.values()) {
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
