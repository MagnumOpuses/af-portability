package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationDegreeType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationDegreeType {

    protected IdentifierType id;
    protected String name;
    protected List<String> codes;
    protected String date;
    protected List<EducationSpecializationType> specializations;
    protected ScoreType score;
    protected List<String> academicHonors;
    protected EducationDegreeGrantedStatusCodeList degreeGrantedStatus;
    protected String iscedEducationLevelCode;

    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<String> getCodes() {
        if (codes == null) {
            codes = new ArrayList<String>();
        }
        return this.codes;
    }

    public void setCodes(final List<String> codes) {
        this.codes = codes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public List<EducationSpecializationType> getSpecializations() {
        if (specializations == null) {
            specializations = new ArrayList<EducationSpecializationType>();
        }
        return this.specializations;
    }

    public void setSpecializations(final List<EducationSpecializationType> specializations) {
        this.specializations = specializations;
    }

    public ScoreType getScore() {
        return score;
    }

    public void setScore(final ScoreType score) {
        this.score = score;
    }

    public List<String> getAcademicHonors() {
        if (academicHonors == null) {
            academicHonors = new ArrayList<String>();
        }
        return this.academicHonors;
    }

    public void setAcademicHonors(final List<String> academicHonors) {
        this.academicHonors = academicHonors;
    }

    public EducationDegreeGrantedStatusCodeList getDegreeGrantedStatus() {
        return degreeGrantedStatus;
    }

    public void setDegreeGrantedStatus(final EducationDegreeGrantedStatusCodeList degreeGrantedStatus) {
        this.degreeGrantedStatus = degreeGrantedStatus;
    }

    public String getIscedEducationLevelCode() {
        return iscedEducationLevelCode;
    }

    public void setIscedEducationLevelCode(final String iscedEducationLevelCode) {
        this.iscedEducationLevelCode = iscedEducationLevelCode;
    }
}
