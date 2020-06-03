package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "GenderCodeList")
@XmlEnum
public enum GenderCodeList {

    @XmlEnumValue("Male")
    @JsonProperty("Male")
    MALE("Male"),
    @XmlEnumValue("Female")
    @JsonProperty("Female")
    FEMALE("Female");
    private final String value;

    GenderCodeList(final String v) {
        value = v;
    }

    public static GenderCodeList fromValue(final String v) {
        for (final GenderCodeList c : GenderCodeList.values()) {
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
