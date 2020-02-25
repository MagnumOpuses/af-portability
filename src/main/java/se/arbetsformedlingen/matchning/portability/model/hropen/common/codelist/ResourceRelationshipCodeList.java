
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceRelationshipCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceRelationshipCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="VendorEmployee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceRelationshipCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum ResourceRelationshipCodeList {


    /**
     * Employee
     * 
     */
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),

    /**
     * VendorEmployee
     * 
     */
    @XmlEnumValue("VendorEmployee")
    VENDOR_EMPLOYEE("VendorEmployee");
    private final String value;

    ResourceRelationshipCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceRelationshipCodeList fromValue(String v) {
        for (ResourceRelationshipCodeList c: ResourceRelationshipCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
