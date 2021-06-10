package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "CandidateRelationshipCodeList")
@XmlEnum
public enum CandidateRelationshipCodeList {

    @XmlEnumValue("Applicant")
    @JsonProperty("Applicant")
    APPLICANT("Applicant"),
    @XmlEnumValue("Employee")
    @JsonProperty("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Intern")
    @JsonProperty("Intern")
    INTERN("Intern"),
    @XmlEnumValue("Alumnus")
    @JsonProperty("Alumnus")
    ALUMNUS("Alumnus"),
    @XmlEnumValue("Contractor")
    @JsonProperty("Contractor")
    CONTRACTOR("Contractor"),
    @XmlEnumValue("VendorEmployee")
    @JsonProperty("VendorEmployee")
    VENDOR_EMPLOYEE("VendorEmployee"),
    @XmlEnumValue("RelatedCompanyEmployee")
    @JsonProperty("RelatedCompanyEmployee")
    RELATED_COMPANY_EMPLOYEE("RelatedCompanyEmployee");
    private final String value;

    CandidateRelationshipCodeList(final String v) {
        value = v;
    }

    public static CandidateRelationshipCodeList fromValue(final String v) {
        for (final CandidateRelationshipCodeList c : CandidateRelationshipCodeList.values()) {
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
