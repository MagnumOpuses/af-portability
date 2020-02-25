
package se.arbetsformedlingen.matchning.portability.model.hropen.common.organization;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipTypeCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipTypeCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Public"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="NonProfit"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Joint Venture"/>
 *     &lt;enumeration value="Mutual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipTypeCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum OwnershipTypeCodeList {

    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("NonProfit")
    NON_PROFIT("NonProfit"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Joint Venture")
    JOINT_VENTURE("Joint Venture"),
    @XmlEnumValue("Mutual")
    MUTUAL("Mutual");
    private final String value;

    OwnershipTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipTypeCodeList fromValue(String v) {
        for (OwnershipTypeCodeList c: OwnershipTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
