
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareerLevelCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareerLevelCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="EntryLevel"/>
 *     &lt;enumeration value="RecentGraduate"/>
 *     &lt;enumeration value="MidCareer"/>
 *     &lt;enumeration value="Manager"/>
 *     &lt;enumeration value="ExperiencedNonManager"/>
 *     &lt;enumeration value="SeniorExecutive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CareerLevelCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
