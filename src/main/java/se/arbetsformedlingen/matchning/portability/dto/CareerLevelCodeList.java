package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CareerLevelCodeList")
@XmlEnum
public enum CareerLevelCodeList {


    /**
     * Student
     * 
     */
    @XmlEnumValue("Student")
    STUDENT("Student"),

    /**
     * Entry Level
     * 
     */
    @XmlEnumValue("EntryLevel")
    ENTRY_LEVEL("EntryLevel"),

    /**
     * Recent Graduate
     * 
     */
    @XmlEnumValue("RecentGraduate")
    RECENT_GRADUATE("RecentGraduate"),

    /**
     * Mid Career
     * 
     */
    @XmlEnumValue("MidCareer")
    MID_CAREER("MidCareer"),

    /**
     * Manager
     * 
     */
    @XmlEnumValue("Manager")
    MANAGER("Manager"),

    /**
     * Experienced Non-Manager
     * 
     */
    @XmlEnumValue("ExperiencedNonManager")
    EXPERIENCED_NON_MANAGER("ExperiencedNonManager"),

    /**
     * Senior Executive
     * 
     */
    @XmlEnumValue("SeniorExecutive")
    SENIOR_EXECUTIVE("SeniorExecutive");
    private final String value;

    CareerLevelCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CareerLevelCodeList fromValue(String v) {
        for (CareerLevelCodeList c: CareerLevelCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
