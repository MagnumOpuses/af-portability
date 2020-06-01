package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PatentStatusCodeList")
@XmlEnum
public enum PatentStatusCodeList {

    @XmlEnumValue("Filed")
    FILED("Filed"),
    @XmlEnumValue("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    PatentStatusCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentStatusCodeList fromValue(String v) {
        for (PatentStatusCodeList c: PatentStatusCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
