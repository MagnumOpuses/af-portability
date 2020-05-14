//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 05:13:24 PM CEST 
//


package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicResponsibilityCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeographicResponsibilityCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Global"/>
 *     &lt;enumeration value="National"/>
 *     &lt;enumeration value="Regional"/>
 *     &lt;enumeration value="Local"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeographicResponsibilityCodeList")
@XmlEnum
public enum GeographicResponsibilityCodeList {

    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    GeographicResponsibilityCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeographicResponsibilityCodeList fromValue(String v) {
        for (GeographicResponsibilityCodeList c: GeographicResponsibilityCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
