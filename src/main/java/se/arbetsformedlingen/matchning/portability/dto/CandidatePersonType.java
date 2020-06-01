package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.PreferenceChangeEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidatePersonType", propOrder = {

})
public class CandidatePersonType {

    public IdentifierType legalId;
    public XMLGregorianCalendar birthDate;
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

    public void setLegalId(IdentifierType legalId) {
        this.legalId = legalId;
    }

    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(XMLGregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    public GenderCodeList getGender() {
        return gender;
    }

    public void setGender(GenderCodeList gender) {
        this.gender = gender;
    }

    public List<CountryCodeList> getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(List<CountryCodeList> citizenship) {
        this.citizenship = citizenship;
    }

    public List<CountryCodeList> getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(List<CountryCodeList> residenceCountry) {
        this.residenceCountry = residenceCountry;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public List<String> getEthnicity() {
        if (ethnicity == null) {
            ethnicity = new ArrayList<String>();
        }
        return this.ethnicity;
    }

    public void setEthnicity(List<String> ethnicity){
        this.ethnicity = ethnicity;
    }

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public PersonNameType getName() {
        return name;
    }

    public void setName(PersonNameType name) {
        this.name = name;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(CommunicationType communication) {
        this.communication = communication;
    }

    public LanguageCodeList getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public MeasureType getHeight() {
        return height;
    }

    public void setHeight(MeasureType height) {
        this.height = height;
    }

    public MeasureType getWeight() {
        return weight;
    }

    public void setWeight(MeasureType weight) {
        this.weight = weight;
    }

    public DisabilityType getDisability() {
        return disability;
    }

    public void setDisability(DisabilityType disability) {
        this.disability = disability;
    }

    public Boolean getTobaccoUserIndicator() {
        return tobaccoUserIndicator;
    }

    public void setTobaccoUserIndicator(Boolean tobaccoUserIndicator) {
        this.tobaccoUserIndicator = tobaccoUserIndicator;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public List<String> getIdentifyingMarks() {
        if (identifyingMarks == null) {
            identifyingMarks = new ArrayList<String>();
        }
        return this.identifyingMarks;
    }

    public void setIdentifyingMarks(List<String> identifyingMarks){
        this.identifyingMarks = identifyingMarks;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public IdentifierType getPassportId() {
        return passportId;
    }

    public void setPassportId(IdentifierType passportId) {
        this.passportId = passportId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public List<String> getRace() {
        if (race == null) {
            race = new ArrayList<String>();
        }
        return this.race;
    }

    public void setRace(List<String> race) {
        this.race = race;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(XMLGregorianCalendar deathDate) {
        this.deathDate = deathDate;
    }

    public List<String> getNationality() {
        if (nationality == null) {
            nationality = new ArrayList<String>();
        }
        return this.race;
    }

    public void setNationality(List<String> nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public XMLGregorianCalendar getMaritalStatusDate() {
        return maritalStatusDate;
    }

    public void setMaritalStatusDate(XMLGregorianCalendar maritalStatusDate) {
        this.maritalStatusDate = maritalStatusDate;
    }

    public List<String> getVisa() {
        if (visa == null) {
            visa = new ArrayList<String>();
        }
        return this.visa;
    }

    public void setVisa(List<String> visa) {
        this.visa = visa;
    }

    public List<String> getReligion() {
        if (religion == null) {
            religion = new ArrayList<String>();
        }
        return this.religion;
    }

    public void setReligion(List<String> religion) {
        this.religion = religion;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public Boolean getStudentIndicator() {
        return studentIndicator;
    }

    public void setStudentIndicator(Boolean studentIndicator) {
        this.studentIndicator = studentIndicator;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public List<LegalDocumentType> getLegalDocuments() {
        if (legalDocuments == null) {
            legalDocuments = new ArrayList<LegalDocumentType>();
        }
        return this.legalDocuments;
    }

    public void setLegalDocuments(List<LegalDocumentType> legalDocuments) {
        this.legalDocuments = legalDocuments;
    }

    public List<EmploymentPermitType> getEmploymentPermits() {
        if (employmentPermits == null) {
            employmentPermits = new ArrayList<EmploymentPermitType>();
        }
        return this.employmentPermits;
    }

    public void setEmploymentPermits(List<EmploymentPermitType> employmentPermits) {
        this.employmentPermits = employmentPermits;
    }
}
