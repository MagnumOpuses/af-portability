
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentStatusCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PatentStatusCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Filed"/>
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PatentStatusCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PatentStatusCodeList {

    @XmlEnumValue("Filed")
    FILED("Filed"),
    @XmlEnumValue("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    PatentStatusCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentStatusCodeList fromValue(String v) {
        for (PatentStatusCodeList c: PatentStatusCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
