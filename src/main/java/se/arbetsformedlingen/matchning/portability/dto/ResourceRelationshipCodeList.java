package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ResourceRelationshipCodeList")
@XmlEnum
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
