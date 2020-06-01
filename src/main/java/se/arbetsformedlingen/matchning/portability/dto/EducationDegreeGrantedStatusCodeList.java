package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EducationDegreeGrantedStatusCodeList")
@XmlEnum
public enum EducationDegreeGrantedStatusCodeList {


    /**
     * Granted
     * 
     */
    @XmlEnumValue("Granted")
    GRANTED("Granted"),

    /**
     * In Progress
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Postponed
     * 
     */
    @XmlEnumValue("Postponed")
    POSTPONED("Postponed"),

    /**
     * Not Granted
     * 
     */
    @XmlEnumValue("NotGranted")
    NOT_GRANTED("NotGranted");
    private final String value;

    EducationDegreeGrantedStatusCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationDegreeGrantedStatusCodeList fromValue(String v) {
        for (EducationDegreeGrantedStatusCodeList c: EducationDegreeGrantedStatusCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
