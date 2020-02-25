
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemunerationBasisCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemunerationBasisCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Salaried"/>
 *     &lt;enumeration value="SalariedPlusBonus"/>
 *     &lt;enumeration value="SalariedPlusCommission"/>
 *     &lt;enumeration value="CommissionOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemunerationBasisCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
