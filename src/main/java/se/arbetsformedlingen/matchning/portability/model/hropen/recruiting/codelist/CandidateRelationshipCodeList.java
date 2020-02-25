
package se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CandidateRelationshipCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CandidateRelationshipCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Applicant"/>
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="Intern"/>
 *     &lt;enumeration value="Alumnus"/>
 *     &lt;enumeration value="Contractor"/>
 *     &lt;enumeration value="VendorEmployee"/>
 *     &lt;enumeration value="RelatedCompanyEmployee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CandidateRelationshipCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum CandidateRelationshipCodeList {

    @XmlEnumValue("Applicant")
    APPLICANT("Applicant"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Intern")
    INTERN("Intern"),
    @XmlEnumValue("Alumnus")
    ALUMNUS("Alumnus"),
    @XmlEnumValue("Contractor")
    CONTRACTOR("Contractor"),
    @XmlEnumValue("VendorEmployee")
    VENDOR_EMPLOYEE("VendorEmployee"),
    @XmlEnumValue("RelatedCompanyEmployee")
    RELATED_COMPANY_EMPLOYEE("RelatedCompanyEmployee");
    private final String value;

    CandidateRelationshipCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateRelationshipCodeList fromValue(String v) {
        for (CandidateRelationshipCodeList c: CandidateRelationshipCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
