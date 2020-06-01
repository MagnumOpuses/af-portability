package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "RelationshipTypeCodeList")
@XmlEnum
public enum RelationshipTypeCodeList {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional");
    private final String value;

    RelationshipTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipTypeCodeList fromValue(String v) {
        for (RelationshipTypeCodeList c: RelationshipTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
