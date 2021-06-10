package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ResponsibilityCodeList")
@XmlEnum
public enum ResponsibilityCodeList {

    @XmlEnumValue("Unit")
    @JsonProperty("Unit")
    UNIT("Unit"),
    @XmlEnumValue("Department")
    @JsonProperty("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Division")
    @JsonProperty("Division")
    DIVISION("Division"),
    @XmlEnumValue("Parent")
    @JsonProperty("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Group")
    @JsonProperty("Group")
    GROUP("Group"),
    @XmlEnumValue("Plant")
    @JsonProperty("Plant")
    PLANT("Plant"),
    @XmlEnumValue("Subsidiary")
    @JsonProperty("Subsidiary")
    SUBSIDIARY("Subsidiary"),
    @XmlEnumValue("Joint Venture")
    @JsonProperty("Joint Venture")
    JOINT_VENTURE("Joint Venture"),
    @XmlEnumValue("Branch")
    @JsonProperty("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Holding Affiliate")
    @JsonProperty("Holding Affiliate")
    HOLDING_AFFILIATE("Holding Affiliate");
    private final String value;

    ResponsibilityCodeList(final String v) {
        value = v;
    }

    public static ResponsibilityCodeList fromValue(final String v) {
        for (final ResponsibilityCodeList c : ResponsibilityCodeList.values()) {
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
