package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "RelationshipTypeCodeList")
@XmlEnum
public enum RelationshipTypeCodeList {

    @XmlEnumValue("Personal")
    @JsonProperty("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Professional")
    @JsonProperty("Professional")
    PROFESSIONAL("Professional");
    private final String value;

    RelationshipTypeCodeList(final String v) {
        value = v;
    }

    public static RelationshipTypeCodeList fromValue(final String v) {
        for (final RelationshipTypeCodeList c : RelationshipTypeCodeList.values()) {
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
