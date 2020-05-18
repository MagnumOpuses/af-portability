package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "AffiliatedOrganizationTypeCodeList")
@XmlEnum
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
