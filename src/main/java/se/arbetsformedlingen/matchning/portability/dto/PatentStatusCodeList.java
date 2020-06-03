package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PatentStatusCodeList")
@XmlEnum
public enum PatentStatusCodeList {

    @XmlEnumValue("Filed")
    @JsonProperty("Filed")
    FILED("Filed"),
    @XmlEnumValue("Issued")
    @JsonProperty("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("Pending")
    @JsonProperty("Pending")
    PENDING("Pending");
    private final String value;

    PatentStatusCodeList(final String v) {
        value = v;
    }

    public static PatentStatusCodeList fromValue(final String v) {
        for (final PatentStatusCodeList c : PatentStatusCodeList.values()) {
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
