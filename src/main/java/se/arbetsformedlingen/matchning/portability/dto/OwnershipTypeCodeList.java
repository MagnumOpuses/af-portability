package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "OwnershipTypeCodeList")
@XmlEnum
public enum OwnershipTypeCodeList {

    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("NonProfit")
    NON_PROFIT("NonProfit"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Joint Venture")
    JOINT_VENTURE("Joint Venture"),
    @XmlEnumValue("Mutual")
    MUTUAL("Mutual");
    private final String value;

    OwnershipTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipTypeCodeList fromValue(String v) {
        for (OwnershipTypeCodeList c: OwnershipTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
