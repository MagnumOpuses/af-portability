package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ResponsibilityCodeList")
@XmlEnum
public enum ResponsibilityCodeList {

    @XmlEnumValue("Unit")
    UNIT("Unit"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Division")
    DIVISION("Division"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Plant")
    PLANT("Plant"),
    @XmlEnumValue("Subsidiary")
    SUBSIDIARY("Subsidiary"),
    @XmlEnumValue("Joint Venture")
    JOINT_VENTURE("Joint Venture"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Holding Affiliate")
    HOLDING_AFFILIATE("Holding Affiliate");
    private final String value;

    ResponsibilityCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponsibilityCodeList fromValue(String v) {
        for (ResponsibilityCodeList c: ResponsibilityCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
