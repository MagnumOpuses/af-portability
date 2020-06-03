package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "RemunerationBasisCodeList")
@XmlEnum
public enum RemunerationBasisCodeList {


    /**
     * Hourly
     */
    @XmlEnumValue("Hourly")
    @JsonProperty("Hourly")
    HOURLY("Hourly"),

    /**
     * Salaried
     */
    @XmlEnumValue("Salaried")
    @JsonProperty("Salaried")
    SALARIED("Salaried"),

    /**
     * Salaried Plus Bonus
     */
    @XmlEnumValue("SalariedPlusBonus")
    @JsonProperty("SalariedPlusBonus")
    SALARIED_PLUS_BONUS("SalariedPlusBonus"),

    /**
     * Salaried Plus Commission
     */
    @XmlEnumValue("SalariedPlusCommission")
    @JsonProperty("SalariedPlusCommission")
    SALARIED_PLUS_COMMISSION("SalariedPlusCommission"),

    /**
     * Commission Only
     */
    @XmlEnumValue("CommissionOnly")
    @JsonProperty("CommissionOnly")
    COMMISSION_ONLY("CommissionOnly");
    private final String value;

    RemunerationBasisCodeList(final String v) {
        value = v;
    }

    public static RemunerationBasisCodeList fromValue(final String v) {
        for (final RemunerationBasisCodeList c : RemunerationBasisCodeList.values()) {
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
