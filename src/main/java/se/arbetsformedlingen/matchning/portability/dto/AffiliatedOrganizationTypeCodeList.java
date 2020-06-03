package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "AffiliatedOrganizationTypeCodeList")
@XmlEnum
public enum AffiliatedOrganizationTypeCodeList {


    /**
     * Professional
     */
    @XmlEnumValue("Professional")
    @JsonProperty("Professional")
    PROFESSIONAL("Professional"),

    /**
     * Social
     */
    @XmlEnumValue("Social")
    @JsonProperty("Social")
    SOCIAL("Social"),

    /**
     * Community
     */
    @XmlEnumValue("Community")
    @JsonProperty("Community")
    COMMUNITY("Community"),

    /**
     * Non-profit
     */
    @XmlEnumValue("Non-profit")
    @JsonProperty("Non-profit")
    NON_PROFIT("Non-profit"),

    /**
     * Religious
     */
    @XmlEnumValue("Religious")
    @JsonProperty("Religious")
    RELIGIOUS("Religious"),

    /**
     * Political
     */
    @XmlEnumValue("Political")
    @JsonProperty("Political")
    POLITICAL("Political");
    private final String value;

    AffiliatedOrganizationTypeCodeList(final String v) {
        value = v;
    }

    public static AffiliatedOrganizationTypeCodeList fromValue(final String v) {
        for (final AffiliatedOrganizationTypeCodeList c : AffiliatedOrganizationTypeCodeList.values()) {
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
