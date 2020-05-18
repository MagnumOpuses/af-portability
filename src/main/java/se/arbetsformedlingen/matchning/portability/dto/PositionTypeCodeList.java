package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PositionTypeCodeList")
@XmlEnum
public enum PositionTypeCodeList {


    /**
     * Direct Hire
     * 
     */
    @XmlEnumValue("DirectHire")
    DIRECT_HIRE("DirectHire"),

    /**
     * Temporary
     * 
     */
    @XmlEnumValue("Temporary")
    TEMPORARY("Temporary"),

    /**
     * Temporary To Hire
     * 
     */
    @XmlEnumValue("TemporaryToHire")
    TEMPORARY_TO_HIRE("TemporaryToHire"),

    /**
     * Contract To Hire
     * 
     */
    @XmlEnumValue("ContractToHire")
    CONTRACT_TO_HIRE("ContractToHire"),

    /**
     * Contract
     * 
     */
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),

    /**
     * Internship
     * 
     */
    @XmlEnumValue("Internship")
    INTERNSHIP("Internship"),

    /**
     * Externship
     * 
     */
    @XmlEnumValue("Externship")
    EXTERNSHIP("Externship"),

    /**
     * Apprenticeship
     * 
     */
    @XmlEnumValue("Apprenticeship")
    APPRENTICESHIP("Apprenticeship"),

    /**
     * Seasonal
     * 
     */
    @XmlEnumValue("Seasonal")
    SEASONAL("Seasonal"),

    /**
     * Student
     * 
     */
    @XmlEnumValue("Student")
    STUDENT("Student"),

    /**
     * Volunteer
     * 
     */
    @XmlEnumValue("Volunteer")
    VOLUNTEER("Volunteer");
    private final String value;

    PositionTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionTypeCodeList fromValue(String v) {
        for (PositionTypeCodeList c: PositionTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
