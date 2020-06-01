package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


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
