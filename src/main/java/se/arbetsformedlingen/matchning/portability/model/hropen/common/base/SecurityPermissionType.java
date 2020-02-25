
package se.arbetsformedlingen.matchning.portability.model.hropen.common.base;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityPermissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityPermissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="Full Control"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityPermissionType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum SecurityPermissionType {

    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("Full Control")
    FULL_CONTROL("Full Control");
    private final String value;

    SecurityPermissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityPermissionType fromValue(String v) {
        for (SecurityPermissionType c: SecurityPermissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
