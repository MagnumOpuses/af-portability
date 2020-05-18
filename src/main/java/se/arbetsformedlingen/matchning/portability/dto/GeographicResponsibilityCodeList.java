package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GeographicResponsibilityCodeList")
@XmlEnum
public enum GeographicResponsibilityCodeList {

    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    GeographicResponsibilityCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeographicResponsibilityCodeList fromValue(String v) {
        for (GeographicResponsibilityCodeList c: GeographicResponsibilityCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
