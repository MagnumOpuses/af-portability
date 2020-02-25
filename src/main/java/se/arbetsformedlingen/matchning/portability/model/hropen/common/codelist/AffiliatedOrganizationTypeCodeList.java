
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffiliatedOrganizationTypeCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AffiliatedOrganizationTypeCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Social"/>
 *     &lt;enumeration value="Community"/>
 *     &lt;enumeration value="Non-profit"/>
 *     &lt;enumeration value="Religious"/>
 *     &lt;enumeration value="Political"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AffiliatedOrganizationTypeCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum AffiliatedOrganizationTypeCodeList {


    /**
     * Professional
     * 
     */
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),

    /**
     * Social
     * 
     */
    @XmlEnumValue("Social")
    SOCIAL("Social"),

    /**
     * Community
     * 
     */
    @XmlEnumValue("Community")
    COMMUNITY("Community"),

    /**
     * Non-profit
     * 
     */
    @XmlEnumValue("Non-profit")
    NON_PROFIT("Non-profit"),

    /**
     * Religious
     * 
     */
    @XmlEnumValue("Religious")
    RELIGIOUS("Religious"),

    /**
     * Political
     * 
     */
    @XmlEnumValue("Political")
    POLITICAL("Political");
    private final String value;

    AffiliatedOrganizationTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AffiliatedOrganizationTypeCodeList fromValue(String v) {
        for (AffiliatedOrganizationTypeCodeList c: AffiliatedOrganizationTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
