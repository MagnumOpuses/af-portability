
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayTypeCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayTypeCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BasePay"/>
 *     &lt;enumeration value="Commission"/>
 *     &lt;enumeration value="Bonus"/>
 *     &lt;enumeration value="ShortTermIncentive"/>
 *     &lt;enumeration value="ShiftPay"/>
 *     &lt;enumeration value="OnCall"/>
 *     &lt;enumeration value="Hazard"/>
 *     &lt;enumeration value="VariablePay"/>
 *     &lt;enumeration value="Allowance"/>
 *     &lt;enumeration value="Overtime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayTypeCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PayTypeCodeList {


    /**
     * Base Pay
     * 
     */
    @XmlEnumValue("BasePay")
    BASE_PAY("BasePay"),

    /**
     * Commission
     * 
     */
    @XmlEnumValue("Commission")
    COMMISSION("Commission"),

    /**
     * Bonus
     * 
     */
    @XmlEnumValue("Bonus")
    BONUS("Bonus"),

    /**
     * Short-Term Incentive
     * 
     */
    @XmlEnumValue("ShortTermIncentive")
    SHORT_TERM_INCENTIVE("ShortTermIncentive"),

    /**
     * Shift Pay
     * 
     */
    @XmlEnumValue("ShiftPay")
    SHIFT_PAY("ShiftPay"),

    /**
     * On Call
     * 
     */
    @XmlEnumValue("OnCall")
    ON_CALL("OnCall"),

    /**
     * Hazard
     * 
     */
    @XmlEnumValue("Hazard")
    HAZARD("Hazard"),

    /**
     * Variable Pay
     * 
     */
    @XmlEnumValue("VariablePay")
    VARIABLE_PAY("VariablePay"),

    /**
     * Allowance
     * 
     */
    @XmlEnumValue("Allowance")
    ALLOWANCE("Allowance"),

    /**
     * Overtime
     * 
     */
    @XmlEnumValue("Overtime")
    OVERTIME("Overtime");
    private final String value;

    PayTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayTypeCodeList fromValue(String v) {
        for (PayTypeCodeList c: PayTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
