package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ResourceRelationshipCodeList")
@XmlEnum
public enum ResourceRelationshipCodeList {


    /**
     * Employee
     */
    @XmlEnumValue("Employee")
    @JsonProperty("Employee")
    EMPLOYEE("Employee"),

    /**
     * VendorEmployee
     */
    @XmlEnumValue("VendorEmployee")
    @JsonProperty("VendorEmployee")
    VENDOR_EMPLOYEE("VendorEmployee");
    private final String value;

    ResourceRelationshipCodeList(final String v) {
        value = v;
    }

    public static ResourceRelationshipCodeList fromValue(final String v) {
        for (final ResourceRelationshipCodeList c : ResourceRelationshipCodeList.values()) {
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
