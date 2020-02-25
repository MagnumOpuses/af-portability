
package se.arbetsformedlingen.matchning.portability.model.hropen.common.organization;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsibilityCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponsibilityCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Division"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Plant"/>
 *     &lt;enumeration value="Subsidiary"/>
 *     &lt;enumeration value="Joint Venture"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Holding Affiliate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponsibilityCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum ResponsibilityCodeList {

    @XmlEnumValue("Unit")
    UNIT("Unit"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Division")
    DIVISION("Division"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Plant")
    PLANT("Plant"),
    @XmlEnumValue("Subsidiary")
    SUBSIDIARY("Subsidiary"),
    @XmlEnumValue("Joint Venture")
    JOINT_VENTURE("Joint Venture"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Holding Affiliate")
    HOLDING_AFFILIATE("Holding Affiliate");
    private final String value;

    ResponsibilityCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponsibilityCodeList fromValue(String v) {
        for (ResponsibilityCodeList c: ResponsibilityCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
