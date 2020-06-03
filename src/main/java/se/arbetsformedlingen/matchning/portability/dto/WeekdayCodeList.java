package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "WeekdayCodeList")
@XmlEnum
@JsonInclude(JsonInclude.Include.NON_NULL)
public enum WeekdayCodeList {

    @XmlEnumValue("Monday")
    @JsonProperty("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Tuesday")
    @JsonProperty("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    @JsonProperty("Wednesday")
    WEDNESDAY("Wednesday"),
    @XmlEnumValue("Thursday")
    @JsonProperty("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Friday")
    @JsonProperty("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Saturday")
    @JsonProperty("Saturday")
    SATURDAY("Saturday"),
    @XmlEnumValue("Sunday")
    @JsonProperty("Sunday")
    SUNDAY("Sunday");
    private final String value;

    WeekdayCodeList(final String v) {
        value = v;
    }

    public static WeekdayCodeList fromValue(final String v) {
        for (final WeekdayCodeList c : WeekdayCodeList.values()) {
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
