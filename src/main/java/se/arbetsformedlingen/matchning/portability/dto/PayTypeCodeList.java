package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PayTypeCodeList")
@XmlEnum
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
