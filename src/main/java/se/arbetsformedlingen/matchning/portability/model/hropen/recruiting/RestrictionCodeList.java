
package se.arbetsformedlingen.matchning.portability.model.hropen.recruiting;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Local"/>
 *     &lt;enumeration value="Regional"/>
 *     &lt;enumeration value="Timezone"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Territory"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestrictionCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum RestrictionCodeList {

    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Timezone")
    TIMEZONE("Timezone"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Territory")
    TERRITORY("Territory"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RestrictionCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictionCodeList fromValue(String v) {
        for (RestrictionCodeList c: RestrictionCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
