package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PayTypeCodeList")
@XmlEnum
public enum PayTypeCodeList {


    /**
     * Base Pay
     */
    @XmlEnumValue("BasePay")
    @JsonProperty("BasePay")
    BASE_PAY("BasePay"),

    /**
     * Commission
     */
    @XmlEnumValue("Commission")
    @JsonProperty("Commission")
    COMMISSION("Commission"),

    /**
     * Bonus
     */
    @XmlEnumValue("Bonus")
    @JsonProperty("Bonus")
    BONUS("Bonus"),

    /**
     * Short-Term Incentive
     */
    @XmlEnumValue("ShortTermIncentive")
    @JsonProperty("ShortTermIncentive")
    SHORT_TERM_INCENTIVE("ShortTermIncentive"),

    /**
     * Shift Pay
     */
    @XmlEnumValue("ShiftPay")
    @JsonProperty("ShiftPay")
    SHIFT_PAY("ShiftPay"),

    /**
     * On Call
     */
    @XmlEnumValue("OnCall")
    @JsonProperty("OnCall")
    ON_CALL("OnCall"),

    /**
     * Hazard
     */
    @XmlEnumValue("Hazard")
    @JsonProperty("Hazard")
    HAZARD("Hazard"),

    /**
     * Variable Pay
     */
    @XmlEnumValue("VariablePay")
    @JsonProperty("VariablePay")
    VARIABLE_PAY("VariablePay"),

    /**
     * Allowance
     */
    @XmlEnumValue("Allowance")
    @JsonProperty("Allowance")
    ALLOWANCE("Allowance"),

    /**
     * Overtime
     */
    @XmlEnumValue("Overtime")
    @JsonProperty("Overtime")
    OVERTIME("Overtime");
    private final String value;

    PayTypeCodeList(final String v) {
        value = v;
    }

    public static PayTypeCodeList fromValue(final String v) {
        for (final PayTypeCodeList c : PayTypeCodeList.values()) {
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
