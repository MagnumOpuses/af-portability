package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "GenderCodeList")
@XmlEnum
public enum GenderCodeList {

    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Female")
    FEMALE("Female");
    private final String value;

    GenderCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderCodeList fromValue(String v) {
        for (GenderCodeList c: GenderCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
