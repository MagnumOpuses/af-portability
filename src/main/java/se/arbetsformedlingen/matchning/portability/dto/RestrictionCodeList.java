package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "RestrictionCodeList")
@XmlEnum
public enum RestrictionCodeList {

    @XmlEnumValue("Local")
    @JsonProperty("Local")
    LOCAL("Local"),
    @XmlEnumValue("Regional")
    @JsonProperty("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Timezone")
    @JsonProperty("Timezone")
    TIMEZONE("Timezone"),
    @XmlEnumValue("Country")
    @JsonProperty("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Territory")
    @JsonProperty("Territory")
    TERRITORY("Territory"),
    @XmlEnumValue("Other")
    @JsonProperty("Other")
    OTHER("Other");
    private final String value;

    RestrictionCodeList(final String v) {
        value = v;
    }

    public static RestrictionCodeList fromValue(final String v) {
        for (final RestrictionCodeList c : RestrictionCodeList.values()) {
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
