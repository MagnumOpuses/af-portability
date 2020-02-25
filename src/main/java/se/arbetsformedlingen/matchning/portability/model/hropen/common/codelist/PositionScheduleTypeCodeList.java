
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionScheduleTypeCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionScheduleTypeCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullTime"/>
 *     &lt;enumeration value="PartTime"/>
 *     &lt;enumeration value="FlexTime"/>
 *     &lt;enumeration value="SharedTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionScheduleTypeCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PositionScheduleTypeCodeList {


    /**
     * Full-Time
     * 
     */
    @XmlEnumValue("FullTime")
    FULL_TIME("FullTime"),

    /**
     * Part-Time
     * 
     */
    @XmlEnumValue("PartTime")
    PART_TIME("PartTime"),

    /**
     * Flex Time
     * 
     */
    @XmlEnumValue("FlexTime")
    FLEX_TIME("FlexTime"),

    /**
     * Shared Time
     * 
     */
    @XmlEnumValue("SharedTime")
    SHARED_TIME("SharedTime");
    private final String value;

    PositionScheduleTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionScheduleTypeCodeList fromValue(String v) {
        for (PositionScheduleTypeCodeList c: PositionScheduleTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
