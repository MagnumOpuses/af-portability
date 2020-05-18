package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "RestrictionCodeList")
@XmlEnum
public enum RestrictionCodeList {

    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Timezone")
    TIMEZONE("Timezone"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Territory")
    TERRITORY("Territory"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RestrictionCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictionCodeList fromValue(String v) {
        for (RestrictionCodeList c: RestrictionCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
