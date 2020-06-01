package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "RemunerationBasisCodeList")
@XmlEnum
public enum RemunerationBasisCodeList {


    /**
     * Hourly
     * 
     */
    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),

    /**
     * Salaried
     * 
     */
    @XmlEnumValue("Salaried")
    SALARIED("Salaried"),

    /**
     * Salaried Plus Bonus
     * 
     */
    @XmlEnumValue("SalariedPlusBonus")
    SALARIED_PLUS_BONUS("SalariedPlusBonus"),

    /**
     * Salaried Plus Commission
     * 
     */
    @XmlEnumValue("SalariedPlusCommission")
    SALARIED_PLUS_COMMISSION("SalariedPlusCommission"),

    /**
     * Commission Only
     * 
     */
    @XmlEnumValue("CommissionOnly")
    COMMISSION_ONLY("CommissionOnly");
    private final String value;

    RemunerationBasisCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemunerationBasisCodeList fromValue(String v) {
        for (RemunerationBasisCodeList c: RemunerationBasisCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
