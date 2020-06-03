package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GeographicResponsibilityCodeList")
@XmlEnum
public enum GeographicResponsibilityCodeList {

    @XmlEnumValue("Global")
    @JsonProperty("Global")
    GLOBAL("Global"),
    @XmlEnumValue("National")
    @JsonProperty("National")
    NATIONAL("National"),
    @XmlEnumValue("Regional")
    @JsonProperty("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Local")
    @JsonProperty("Local")
    LOCAL("Local");
    private final String value;

    GeographicResponsibilityCodeList(final String v) {
        value = v;
    }

    public static GeographicResponsibilityCodeList fromValue(final String v) {
        for (final GeographicResponsibilityCodeList c : GeographicResponsibilityCodeList.values()) {
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
