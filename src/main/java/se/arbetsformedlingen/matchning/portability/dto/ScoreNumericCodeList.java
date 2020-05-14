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
 * <p>Java class for ScoreNumericCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScoreNumericCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Percentile"/>
 *     &lt;enumeration value="RawScore"/>
 *     &lt;enumeration value="Stanine"/>
 *     &lt;enumeration value="Sten"/>
 *     &lt;enumeration value="T-score"/>
 *     &lt;enumeration value="Z-score"/>
 *     &lt;enumeration value="IntelligenceQuotient"/>
 *     &lt;enumeration value="Scaled"/>
 *     &lt;enumeration value="NormalCurve"/>
 *     &lt;enumeration value="GPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScoreNumericCodeList")
@XmlEnum
public enum ScoreNumericCodeList {


    /**
     * Percentile
     * 
     */
    @XmlEnumValue("Percentile")
    PERCENTILE("Percentile"),

    /**
     * RawScore
     * 
     */
    @XmlEnumValue("RawScore")
    RAW_SCORE("RawScore"),

    /**
     * Stanine
     * 
     */
    @XmlEnumValue("Stanine")
    STANINE("Stanine"),

    /**
     * Sten
     * 
     */
    @XmlEnumValue("Sten")
    STEN("Sten"),

    /**
     * T-score
     * 
     */
    @XmlEnumValue("T-score")
    T_SCORE("T-score"),

    /**
     * Z-score
     * 
     */
    @XmlEnumValue("Z-score")
    Z_SCORE("Z-score"),

    /**
     * IntelligenceQuotient
     * 
     */
    @XmlEnumValue("IntelligenceQuotient")
    INTELLIGENCE_QUOTIENT("IntelligenceQuotient"),

    /**
     * Scaled
     * 
     */
    @XmlEnumValue("Scaled")
    SCALED("Scaled"),

    /**
     * NormalCurve
     * 
     */
    @XmlEnumValue("NormalCurve")
    NORMAL_CURVE("NormalCurve"),

    /**
     * GPA
     * 
     */
    GPA("GPA");
    private final String value;

    ScoreNumericCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScoreNumericCodeList fromValue(String v) {
        for (ScoreNumericCodeList c: ScoreNumericCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
