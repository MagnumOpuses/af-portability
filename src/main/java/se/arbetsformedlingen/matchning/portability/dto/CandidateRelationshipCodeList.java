package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "CandidateRelationshipCodeList")
@XmlEnum
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
