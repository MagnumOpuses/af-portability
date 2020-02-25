
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EducationDegreeGrantedStatusCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationDegreeGrantedStatusCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Granted"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Postponed"/>
 *     &lt;enumeration value="NotGranted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationDegreeGrantedStatusCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum EducationDegreeGrantedStatusCodeList {


    /**
     * Granted
     * 
     */
    @XmlEnumValue("Granted")
    GRANTED("Granted"),

    /**
     * In Progress
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Postponed
     * 
     */
    @XmlEnumValue("Postponed")
    POSTPONED("Postponed"),

    /**
     * Not Granted
     * 
     */
    @XmlEnumValue("NotGranted")
    NOT_GRANTED("NotGranted");
    private final String value;

    EducationDegreeGrantedStatusCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationDegreeGrantedStatusCodeList fromValue(String v) {
        for (EducationDegreeGrantedStatusCodeList c: EducationDegreeGrantedStatusCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
