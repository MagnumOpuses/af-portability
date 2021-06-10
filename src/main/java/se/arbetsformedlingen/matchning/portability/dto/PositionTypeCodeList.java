package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PositionTypeCodeList")
@XmlEnum
public enum PositionTypeCodeList {


    /**
     * Direct Hire
     */
    @XmlEnumValue("DirectHire")
    @JsonProperty("DirectHire")
    DIRECT_HIRE("DirectHire"),

    /**
     * Temporary
     */
    @XmlEnumValue("Temporary")
    @JsonProperty("Temporary")
    TEMPORARY("Temporary"),

    /**
     * Temporary To Hire
     */
    @XmlEnumValue("TemporaryToHire")
    @JsonProperty("TemporaryToHire")
    TEMPORARY_TO_HIRE("TemporaryToHire"),

    /**
     * Contract To Hire
     */
    @XmlEnumValue("ContractToHire")
    @JsonProperty("ContractToHire")
    CONTRACT_TO_HIRE("ContractToHire"),

    /**
     * Contract
     */
    @XmlEnumValue("Contract")
    @JsonProperty("Contract")
    CONTRACT("Contract"),

    /**
     * Internship
     */
    @XmlEnumValue("Internship")
    @JsonProperty("Internship")
    INTERNSHIP("Internship"),

    /**
     * Externship
     */
    @XmlEnumValue("Externship")
    @JsonProperty("Externship")
    EXTERNSHIP("Externship"),

    /**
     * Apprenticeship
     */
    @XmlEnumValue("Apprenticeship")
    @JsonProperty("Apprenticeship")
    APPRENTICESHIP("Apprenticeship"),

    /**
     * Seasonal
     */
    @XmlEnumValue("Seasonal")
    @JsonProperty("Seasonal")
    SEASONAL("Seasonal"),

    /**
     * Student
     */
    @XmlEnumValue("Student")
    @JsonProperty("Student")
    STUDENT("Student"),

    /**
     * Volunteer
     */
    @XmlEnumValue("Volunteer")
    @JsonProperty("Volunteer")
    VOLUNTEER("Volunteer");
    private final String value;

    PositionTypeCodeList(final String v) {
        value = v;
    }

    public static PositionTypeCodeList fromValue(final String v) {
        for (final PositionTypeCodeList c : PositionTypeCodeList.values()) {
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
