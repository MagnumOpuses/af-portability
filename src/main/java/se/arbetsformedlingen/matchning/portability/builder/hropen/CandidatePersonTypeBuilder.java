package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class CandidatePersonTypeBuilder {
    private IdentifierType legalId;
    private XMLGregorianCalendar birthDate;
    private GenderCodeList gender;
    private CandidatePersonType.Citizenship citizenship;
    private CandidatePersonType.ResidenceCountry residenceCountry;
    private String militaryStatus;
    private StringTypeArray ethnicity;
    private IdentifierType id;
    private PersonNameType name;
    private CommunicationType communication;
    private LanguageCodeList primaryLanguage;
    private MeasureType height;
    private MeasureType weight;
    private DisabilityType disability;
    private Boolean tobaccoUserIndicator;
    private String hairColor;
    private String eyeColor;
    private StringTypeArray identifyingMarks;
    private BigInteger age;
    private String bloodType;
    private IdentifierType passportId;
    private String fatherName;
    private String motherName;
    private CandidatePersonType.Race race;
    private String birthPlace;
    private XMLGregorianCalendar deathDate;
    private CandidatePersonType.Nationality nationality;
    private String maritalStatus;
    private XMLGregorianCalendar maritalStatusDate;
    private CandidatePersonType.Visa visa;
    private CandidatePersonType.Religion religion;
    private String studentType;
    private Boolean studentIndicator;
    private String studentStatus;
    private CandidatePersonType.LegalDocuments legalDocuments;
    private CandidatePersonType.EmploymentPermits employmentPermits;

    public CandidatePersonTypeBuilder setLegalId(IdentifierType legalId) {
        this.legalId = legalId;
        return this;
    }

    public CandidatePersonTypeBuilder setBirthDate(XMLGregorianCalendar birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public CandidatePersonTypeBuilder setGender(GenderCodeList gender) {
        this.gender = gender;
        return this;
    }

    public CandidatePersonTypeBuilder setCitizenship(CandidatePersonType.Citizenship citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    public CandidatePersonTypeBuilder setResidenceCountry(CandidatePersonType.ResidenceCountry residenceCountry) {
        this.residenceCountry = residenceCountry;
        return this;
    }

    public CandidatePersonTypeBuilder setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
        return this;
    }

    public CandidatePersonTypeBuilder setEthnicity(StringTypeArray ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    public CandidatePersonTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public CandidatePersonTypeBuilder setName(PersonNameType name) {
        this.name = name;
        return this;
    }

    public CandidatePersonTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter){

        this.setName(new PersonNameTypeBuilder()
                .setGiven(personUppgifter.getFornamn())
                .setFamily(personUppgifter.getEfternamn())
                .createPersonNameType());
        this.setCommunication(new CommunicationTypeBuilder().withPersonUppgifter(personUppgifter).createCommunicationType());
        return this;
    }
    public CandidatePersonTypeBuilder setCommunication(CommunicationType communication) {
        this.communication = communication;
        return this;
    }

    public CandidatePersonTypeBuilder setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
        return this;
    }

    public CandidatePersonTypeBuilder setHeight(MeasureType height) {
        this.height = height;
        return this;
    }

    public CandidatePersonTypeBuilder setWeight(MeasureType weight) {
        this.weight = weight;
        return this;
    }

    public CandidatePersonTypeBuilder setDisability(DisabilityType disability) {
        this.disability = disability;
        return this;
    }

    public CandidatePersonTypeBuilder setTobaccoUserIndicator(Boolean tobaccoUserIndicator) {
        this.tobaccoUserIndicator = tobaccoUserIndicator;
        return this;
    }

    public CandidatePersonTypeBuilder setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public CandidatePersonTypeBuilder setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public CandidatePersonTypeBuilder setIdentifyingMarks(StringTypeArray identifyingMarks) {
        this.identifyingMarks = identifyingMarks;
        return this;
    }

    public CandidatePersonTypeBuilder setAge(BigInteger age) {
        this.age = age;
        return this;
    }

    public CandidatePersonTypeBuilder setBloodType(String bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    public CandidatePersonTypeBuilder setPassportId(IdentifierType passportId) {
        this.passportId = passportId;
        return this;
    }

    public CandidatePersonTypeBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public CandidatePersonTypeBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public CandidatePersonTypeBuilder setRace(CandidatePersonType.Race race) {
        this.race = race;
        return this;
    }

    public CandidatePersonTypeBuilder setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public CandidatePersonTypeBuilder setDeathDate(XMLGregorianCalendar deathDate) {
        this.deathDate = deathDate;
        return this;
    }

    public CandidatePersonTypeBuilder setNationality(CandidatePersonType.Nationality nationality) {
        this.nationality = nationality;
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatusDate(XMLGregorianCalendar maritalStatusDate) {
        this.maritalStatusDate = maritalStatusDate;
        return this;
    }

    public CandidatePersonTypeBuilder setVisa(CandidatePersonType.Visa visa) {
        this.visa = visa;
        return this;
    }

    public CandidatePersonTypeBuilder setReligion(CandidatePersonType.Religion religion) {
        this.religion = religion;
        return this;
    }

    public CandidatePersonTypeBuilder setStudentType(String studentType) {
        this.studentType = studentType;
        return this;
    }

    public CandidatePersonTypeBuilder setStudentIndicator(Boolean studentIndicator) {
        this.studentIndicator = studentIndicator;
        return this;
    }

    public CandidatePersonTypeBuilder setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
        return this;
    }

    public CandidatePersonTypeBuilder setLegalDocuments(CandidatePersonType.LegalDocuments legalDocuments) {
        this.legalDocuments = legalDocuments;
        return this;
    }

    public CandidatePersonTypeBuilder setEmploymentPermits(CandidatePersonType.EmploymentPermits employmentPermits) {
        this.employmentPermits = employmentPermits;
        return this;
    }

    public CandidatePersonType createCandidatePersonType() {
        return new CandidatePersonType(legalId, birthDate, gender, citizenship, residenceCountry, militaryStatus, ethnicity, id, name, communication, primaryLanguage, height, weight, disability, tobaccoUserIndicator, hairColor, eyeColor, identifyingMarks, age, bloodType, passportId, fatherName, motherName, race, birthPlace, deathDate, nationality, maritalStatus, maritalStatusDate, visa, religion, studentType, studentIndicator, studentStatus, legalDocuments, employmentPermits);
    }
}