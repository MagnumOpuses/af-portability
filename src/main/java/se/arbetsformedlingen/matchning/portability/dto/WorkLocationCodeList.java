package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "WorkLocationCodeList")
@XmlEnum
public enum WorkLocationCodeList {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual"),
    @XmlEnumValue("Colocation")
    COLOCATION("Colocation");
    private final String value;

    WorkLocationCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkLocationCodeList fromValue(String v) {
        for (WorkLocationCodeList c: WorkLocationCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
