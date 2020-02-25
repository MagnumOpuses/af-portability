
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionTypeCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionTypeCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DirectHire"/>
 *     &lt;enumeration value="Temporary"/>
 *     &lt;enumeration value="TemporaryToHire"/>
 *     &lt;enumeration value="ContractToHire"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Internship"/>
 *     &lt;enumeration value="Externship"/>
 *     &lt;enumeration value="Apprenticeship"/>
 *     &lt;enumeration value="Seasonal"/>
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="Volunteer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionTypeCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
