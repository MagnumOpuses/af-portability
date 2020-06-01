package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PositionScheduleTypeCodeList")
@XmlEnum
public enum PositionScheduleTypeCodeList {


    /**
     * Full-Time
     * 
     */
    @XmlEnumValue("FullTime")
    FULL_TIME("FullTime"),

    /**
     * Part-Time
     * 
     */
    @XmlEnumValue("PartTime")
    PART_TIME("PartTime"),

    /**
     * Flex Time
     * 
     */
    @XmlEnumValue("FlexTime")
    FLEX_TIME("FlexTime"),

    /**
     * Shared Time
     * 
     */
    @XmlEnumValue("SharedTime")
    SHARED_TIME("SharedTime");
    private final String value;

    PositionScheduleTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionScheduleTypeCodeList fromValue(String v) {
        for (PositionScheduleTypeCodeList c: PositionScheduleTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
