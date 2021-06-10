package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegalInclusion", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonLegalInclusion {

    protected IdentifierType passportId;
    protected String fatherName;
    protected String motherName;
    protected List<String> race;
    protected String birthPlace;
    protected XMLGregorianCalendar deathDate;
    protected List<String> nationality;
    protected String maritalStatus;
    protected XMLGregorianCalendar maritalStatusDate;
    protected List<String> visa;
    protected List<String> religion;
    protected String studentType;
    protected Boolean studentIndicator;
    protected String studentStatus;
    protected List<LegalDocumentType> legalDocuments;
    protected List<EmploymentPermitType> employmentPermits;

    public IdentifierType getPassportId() {
        return passportId;
    }

    public void setPassportId(final IdentifierType passportId) {
        this.passportId = passportId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(final String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(final String motherName) {
        this.motherName = motherName;
    }

    public List<String> getRace() {
        return race;
    }

    public void setRace(final List<String> race) {
        this.race = race;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(final String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(final XMLGregorianCalendar deathDate) {
        this.deathDate = deathDate;
    }

    public List<String> getNationality() {
        if (nationality == null) {
            nationality = new ArrayList<String>();
        }
        return this.nationality;
    }

    public void setNationality(final List<String> nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(final String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public XMLGregorianCalendar getMaritalStatusDate() {
        return maritalStatusDate;
    }

    public void setMaritalStatusDate(final XMLGregorianCalendar maritalStatusDate) {
        this.maritalStatusDate = maritalStatusDate;
    }

    public List<String> getVisa() {
        if (visa == null) {
            visa = new ArrayList<String>();
        }
        return this.visa;
    }

    public void setVisa(final List<String> visa) {
        this.visa = visa;
    }

    public List<String> getReligion() {
        if (religion == null) {
            religion = new ArrayList<String>();
        }
        return this.religion;
    }

    public void setReligion(final List<String> religion) {
        this.religion = religion;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(final String studentType) {
        this.studentType = studentType;
    }

    public Boolean getStudentIndicator() {
        return studentIndicator;
    }

    public void setStudentIndicator(final Boolean studentIndicator) {
        this.studentIndicator = studentIndicator;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(final String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public List<LegalDocumentType> getLegalDocuments() {
        if (legalDocuments == null) {
            legalDocuments = new ArrayList<LegalDocumentType>();
        }
        return this.legalDocuments;
    }

    public void setLegalDocuments(final List<LegalDocumentType> legalDocuments) {
        this.legalDocuments = legalDocuments;
    }

    public List<EmploymentPermitType> getEmploymentPermits() {
        if (employmentPermits == null) {
            employmentPermits = new ArrayList<EmploymentPermitType>();
        }
        return this.employmentPermits;
    }

    public void setEmploymentPermits(final List<EmploymentPermitType> employmentPermits) {
        this.employmentPermits = employmentPermits;
    }
}
