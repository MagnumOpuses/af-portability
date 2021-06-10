package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "SecurityPermissionType")
@XmlEnum
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    SecurityPermissionType(final String v) {
        value = v;
    }

    public static SecurityPermissionType fromValue(final String v) {
        for (final SecurityPermissionType c : SecurityPermissionType.values()) {
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
