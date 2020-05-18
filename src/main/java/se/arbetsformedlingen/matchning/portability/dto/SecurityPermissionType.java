package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "SecurityPermissionType")
@XmlEnum
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
