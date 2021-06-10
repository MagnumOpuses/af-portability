package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CareerLevelCodeList")
@XmlEnum
public enum CareerLevelCodeList {


    /**
     * Student
     */
    @XmlEnumValue("Student")
    @JsonProperty("Student")
    STUDENT("Student"),

    /**
     * Entry Level
     */
    @XmlEnumValue("EntryLevel")
    @JsonProperty("EntryLevel")
    ENTRY_LEVEL("EntryLevel"),

    /**
     * Recent Graduate
     */
    @XmlEnumValue("RecentGraduate")
    @JsonProperty("RecentGraduate")
    RECENT_GRADUATE("RecentGraduate"),

    /**
     * Mid Career
     */
    @XmlEnumValue("MidCareer")
    @JsonProperty("MidCareer")
    MID_CAREER("MidCareer"),

    /**
     * Manager
     */
    @XmlEnumValue("Manager")
    @JsonProperty("Manager")
    MANAGER("Manager"),

    /**
     * Experienced Non-Manager
     */
    @XmlEnumValue("ExperiencedNonManager")
    @JsonProperty("ExperiencedNonManager")
    EXPERIENCED_NON_MANAGER("ExperiencedNonManager"),

    /**
     * Senior Executive
     */
    @XmlEnumValue("SeniorExecutive")
    @JsonProperty("SeniorExecutive")
    SENIOR_EXECUTIVE("SeniorExecutive");
    private final String value;

    CareerLevelCodeList(final String v) {
        value = v;
    }

    public static CareerLevelCodeList fromValue(final String v) {
        for (final CareerLevelCodeList c : CareerLevelCodeList.values()) {
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
