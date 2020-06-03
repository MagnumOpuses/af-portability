package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PositionScheduleTypeCodeList")
@XmlEnum
public enum PositionScheduleTypeCodeList {


    /**
     * Full-Time
     */
    @XmlEnumValue("FullTime")
    @JsonProperty("FullTime")
    FULL_TIME("FullTime"),

    /**
     * Part-Time
     */
    @XmlEnumValue("PartTime")
    @JsonProperty("PartTime")
    PART_TIME("PartTime"),

    /**
     * Flex Time
     */
    @XmlEnumValue("FlexTime")
    @JsonProperty("FlexTime")
    FLEX_TIME("FlexTime"),

    /**
     * Shared Time
     */
    @XmlEnumValue("SharedTime")
    @JsonProperty("SharedTime")
    SHARED_TIME("SharedTime");
    private final String value;

    PositionScheduleTypeCodeList(final String v) {
        value = v;
    }

    public static PositionScheduleTypeCodeList fromValue(final String v) {
        for (final PositionScheduleTypeCodeList c : PositionScheduleTypeCodeList.values()) {
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
