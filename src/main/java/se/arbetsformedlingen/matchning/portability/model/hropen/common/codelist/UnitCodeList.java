
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACR"/>
 *     &lt;enumeration value="ARE"/>
 *     &lt;enumeration value="CMT"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="EA"/>
 *     &lt;enumeration value="FOT"/>
 *     &lt;enumeration value="GRM"/>
 *     &lt;enumeration value="HAR"/>
 *     &lt;enumeration value="HUR"/>
 *     &lt;enumeration value="INH"/>
 *     &lt;enumeration value="KGM"/>
 *     &lt;enumeration value="KMT"/>
 *     &lt;enumeration value="LTR"/>
 *     &lt;enumeration value="MTR"/>
 *     &lt;enumeration value="SMI"/>
 *     &lt;enumeration value="MGM"/>
 *     &lt;enumeration value="MLT"/>
 *     &lt;enumeration value="MMT"/>
 *     &lt;enumeration value="C26"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="C62"/>
 *     &lt;enumeration value="ONZ"/>
 *     &lt;enumeration value="PTI"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="QTI"/>
 *     &lt;enumeration value="QT"/>
 *     &lt;enumeration value="SEC"/>
 *     &lt;enumeration value="STI"/>
 *     &lt;enumeration value="WEE"/>
 *     &lt;enumeration value="YRD"/>
 *     &lt;enumeration value="ANN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum UnitCodeList {


    /**
     * acre
     * 
     */
    ACR("ACR"),

    /**
     * are
     * 
     */
    ARE("ARE"),

    /**
     * centimeter
     * 
     */
    CMT("CMT"),

    /**
     * day
     * 
     */
    DAY("DAY"),

    /**
     * each
     * 
     */
    EA("EA"),

    /**
     * foot
     * 
     */
    FOT("FOT"),

    /**
     * gram
     * 
     */
    GRM("GRM"),

    /**
     * hectare
     * 
     */
    HAR("HAR"),

    /**
     * hour
     * 
     */
    HUR("HUR"),

    /**
     * inch
     * 
     */
    INH("INH"),

    /**
     * kilogram
     * 
     */
    KGM("KGM"),

    /**
     * kilometre
     * 
     */
    KMT("KMT"),

    /**
     * litre
     * 
     */
    LTR("LTR"),

    /**
     * metre
     * 
     */
    MTR("MTR"),

    /**
     * mile
     * 
     */
    SMI("SMI"),

    /**
     * milligram
     * 
     */
    MGM("MGM"),

    /**
     * millilitre
     * 
     */
    MLT("MLT"),

    /**
     * millimetre
     * 
     */
    MMT("MMT"),

    /**
     * millisecond
     * 
     */
    @XmlEnumValue("C26")
    C_26("C26"),

    /**
     * minute
     * 
     */
    MIN("MIN"),

    /**
     * month
     * 
     */
    MON("MON"),

    /**
     * one [piece]
     * 
     */
    @XmlEnumValue("C62")
    C_62("C62"),

    /**
     * ounce
     * 
     */
    ONZ("ONZ"),

    /**
     * pint [UK]
     * 
     */
    PTI("PTI"),

    /**
     * pint [US]
     * 
     */
    PT("PT"),

    /**
     * pound
     * 
     */
    LBR("LBR"),

    /**
     * quart [UK]
     * 
     */
    QTI("QTI"),

    /**
     * quart [US]
     * 
     */
    QT("QT"),

    /**
     * second
     * 
     */
    SEC("SEC"),

    /**
     * stone
     * 
     */
    STI("STI"),

    /**
     * week
     * 
     */
    WEE("WEE"),

    /**
     * yard
     * 
     */
    YRD("YRD"),

    /**
     * year
     * 
     */
    ANN("ANN");
    private final String value;

    UnitCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitCodeList fromValue(String v) {
        for (UnitCodeList c: UnitCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
