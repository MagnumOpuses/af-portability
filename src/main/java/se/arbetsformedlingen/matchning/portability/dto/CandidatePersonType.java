package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidatePersonType", propOrder = {

})
public class CandidatePersonType {

    public IdentifierType legalId;
    @JsonSerialize(using = DateType.DateTypeSerializer.class)
    @JsonDeserialize(using = DateType.DateTypeDeserializer.class)
    public DateType birthDate;
    public GenderCodeList gender;
    public List<CountryCodeList> citizenship;
    public List<CountryCodeList> residenceCountry;
    public String militaryStatus;
    public List<String> ethnicity;
    public IdentifierType id;
    public PersonNameType name;
    public CommunicationType communication;
    public LanguageCodeList primaryLanguage;
    public MeasureType height;
    public MeasureType weight;
    public DisabilityType disability;
    public Boolean tobaccoUserIndicator;
    public String hairColor;
    public String eyeColor;
    public List<String> identifyingMarks;
    public BigInteger age;
    public String bloodType;
    public IdentifierType passportId;
    public String fatherName;
    public String motherName;
    public List<String> race;
    public String birthPlace;
    public XMLGregorianCalendar deathDate;
    public List<String> nationality;
    public String maritalStatus;
    public XMLGregorianCalendar maritalStatusDate;
    public List<String> visa;
    public List<String> religion;
    public String studentType;
    public Boolean studentIndicator;
    public String studentStatus;
    public List<LegalDocumentType> legalDocuments;
    public List<EmploymentPermitType> employmentPermits;


    public IdentifierType getLegalId() {
        return legalId;
    }

    public void setLegalId(final IdentifierType legalId) {
        this.legalId = legalId;
    }

    public DateType getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final DateType birthDate) {
        this.birthDate = birthDate;
    }

    public GenderCodeList getGender() {
        return gender;
    }

    public void setGender(final GenderCodeList gender) {
        this.gender = gender;
    }

    public List<CountryCodeList> getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(final List<CountryCodeList> citizenship) {
        this.citizenship = citizenship;
    }

    public List<CountryCodeList> getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(final List<CountryCodeList> residenceCountry) {
        this.residenceCountry = residenceCountry;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(final String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public List<String> getEthnicity() {
        if (ethnicity == null) {
            ethnicity = new ArrayList<String>();
        }
        return this.ethnicity;
    }

    public void setEthnicity(final List<String> ethnicity) {
        this.ethnicity = ethnicity;
    }

    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public PersonNameType getName() {
        return name;
    }

    public void setName(final PersonNameType name) {
        this.name = name;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(final CommunicationType communication) {
        this.communication = communication;
    }

    public LanguageCodeList getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(final LanguageCodeList primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public MeasureType getHeight() {
        return height;
    }

    public void setHeight(final MeasureType height) {
        this.height = height;
    }

    public MeasureType getWeight() {
        return weight;
    }

    public void setWeight(final MeasureType weight) {
        this.weight = weight;
    }

    public DisabilityType getDisability() {
        return disability;
    }

    public void setDisability(final DisabilityType disability) {
        this.disability = disability;
    }

    public Boolean getTobaccoUserIndicator() {
        return tobaccoUserIndicator;
    }

    public void setTobaccoUserIndicator(final Boolean tobaccoUserIndicator) {
        this.tobaccoUserIndicator = tobaccoUserIndicator;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(final String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(final String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public List<String> getIdentifyingMarks() {
        if (identifyingMarks == null) {
            identifyingMarks = new ArrayList<String>();
        }
        return this.identifyingMarks;
    }

    public void setIdentifyingMarks(final List<String> identifyingMarks) {
        this.identifyingMarks = identifyingMarks;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(final BigInteger age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(final String bloodType) {
        this.bloodType = bloodType;
    }

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
        if (race == null) {
            race = new ArrayList<String>();
        }
        return this.race;
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
        return this.race;
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
