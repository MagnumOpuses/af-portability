package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EducationDegreeGrantedStatusCodeList")
@XmlEnum
public enum EducationDegreeGrantedStatusCodeList {


    /**
     * Granted
     */
    @XmlEnumValue("Granted")
    @JsonProperty("Granted")
    GRANTED("Granted"),

    /**
     * In Progress
     */
    @XmlEnumValue("InProgress")
    @JsonProperty("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Postponed
     */
    @XmlEnumValue("Postponed")
    @JsonProperty("Postponed")
    POSTPONED("Postponed"),

    /**
     * Not Granted
     */
    @XmlEnumValue("NotGranted")
    @JsonProperty("NotGranted")
    NOT_GRANTED("NotGranted");
    private final String value;

    EducationDegreeGrantedStatusCodeList(final String v) {
        value = v;
    }

    public static EducationDegreeGrantedStatusCodeList fromValue(final String v) {
        for (final EducationDegreeGrantedStatusCodeList c : EducationDegreeGrantedStatusCodeList.values()) {
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
