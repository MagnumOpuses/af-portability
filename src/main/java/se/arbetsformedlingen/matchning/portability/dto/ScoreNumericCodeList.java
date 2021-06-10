package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ScoreNumericCodeList")
@XmlEnum
public enum ScoreNumericCodeList {


    /**
     * Percentile
     */
    @XmlEnumValue("Percentile")
    @JsonProperty("Percentile")
    PERCENTILE("Percentile"),

    /**
     * RawScore
     */
    @XmlEnumValue("RawScore")
    @JsonProperty("RawScore")
    RAW_SCORE("RawScore"),

    /**
     * Stanine
     */
    @XmlEnumValue("Stanine")
    @JsonProperty("Stanine")
    STANINE("Stanine"),

    /**
     * Sten
     */
    @XmlEnumValue("Sten")
    @JsonProperty("Sten")
    STEN("Sten"),

    /**
     * T-score
     */
    @XmlEnumValue("T-score")
    @JsonProperty("T-score")
    T_SCORE("T-score"),

    /**
     * Z-score
     */
    @XmlEnumValue("Z-score")
    @JsonProperty("Z-score")
    Z_SCORE("Z-score"),

    /**
     * IntelligenceQuotient
     */
    @XmlEnumValue("IntelligenceQuotient")
    @JsonProperty("IntelligenceQuotient")
    INTELLIGENCE_QUOTIENT("IntelligenceQuotient"),

    /**
     * Scaled
     */
    @XmlEnumValue("Scaled")
    @JsonProperty("Scaled")
    SCALED("Scaled"),

    /**
     * NormalCurve
     */
    @XmlEnumValue("NormalCurve")
    @JsonProperty("NormalCurve")
    NORMAL_CURVE("NormalCurve"),

    /**
     * GPA
     */
    GPA("GPA");
    private final String value;

    ScoreNumericCodeList(final String v) {
        value = v;
    }

    public static ScoreNumericCodeList fromValue(final String v) {
        for (final ScoreNumericCodeList c : ScoreNumericCodeList.values()) {
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
