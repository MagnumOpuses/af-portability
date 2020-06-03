package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "WorkLocationCodeList")
@XmlEnum
public enum WorkLocationCodeList {

    @XmlEnumValue("Home")
    @JsonProperty("Home")
    HOME("Home"),
    @XmlEnumValue("Virtual")
    @JsonProperty("Virtual")
    VIRTUAL("Virtual"),
    @XmlEnumValue("Colocation")
    @JsonProperty("Colocation")
    COLOCATION("Colocation");
    private final String value;

    WorkLocationCodeList(final String v) {
        value = v;
    }

    public static WorkLocationCodeList fromValue(final String v) {
        for (final WorkLocationCodeList c : WorkLocationCodeList.values()) {
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
