package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.List;

public class CandidatePersonTypeBuilder {
    private CandidatePersonType candidatePersonType = new CandidatePersonType();


    public CandidatePersonTypeBuilder setLegalId(IdentifierType legalId) {
        candidatePersonType.legalId = legalId;
        return this;
    }

    public CandidatePersonTypeBuilder setBirthDate(XMLGregorianCalendar birthDate) {
        candidatePersonType.birthDate = birthDate;
        return this;
    }

    public CandidatePersonTypeBuilder setGender(GenderCodeList gender) {
        candidatePersonType.gender = gender;
        return this;
    }

    public CandidatePersonTypeBuilder setCitizenship(List<CountryCodeList> citizenship) {
        candidatePersonType.citizenship = citizenship;
        return this;
    }

    public CandidatePersonTypeBuilder setResidenceCountry(List<CountryCodeList> residenceCountry) {
        candidatePersonType.residenceCountry = residenceCountry;
        return this;
    }

    public CandidatePersonTypeBuilder setMilitaryStatus(String militaryStatus) {
        candidatePersonType.militaryStatus = militaryStatus;
        return this;
    }

    public CandidatePersonTypeBuilder setEthnicity(List<String> ethnicity) {
        candidatePersonType.ethnicity = ethnicity;
        return this;
    }

    public CandidatePersonTypeBuilder setId(IdentifierType id) {
        candidatePersonType.id = id;
        return this;
    }

    public CandidatePersonTypeBuilder setName(PersonNameType name) {
        candidatePersonType.name = name;
        return this;
    }

    public CandidatePersonTypeBuilder setCommunication(CommunicationType communication) {
        candidatePersonType.communication = communication;
        return this;
    }

    public CandidatePersonTypeBuilder setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        candidatePersonType.primaryLanguage = primaryLanguage;
        return this;
    }

    public CandidatePersonTypeBuilder setHeight(MeasureType height) {
        candidatePersonType.height = height;
        return this;
    }

    public CandidatePersonTypeBuilder setWeight(MeasureType weight) {
        candidatePersonType.weight = weight;
        return this;
    }

    public CandidatePersonTypeBuilder setDisability(DisabilityType disability) {
        candidatePersonType.disability = disability;
        return this;
    }

    public CandidatePersonTypeBuilder setTobaccoUserIndicator(Boolean tobaccoUserIndicator) {
        candidatePersonType.tobaccoUserIndicator = tobaccoUserIndicator;
        return this;
    }

    public CandidatePersonTypeBuilder setHairColor(String hairColor) {
        candidatePersonType.hairColor = hairColor;
        return this;
    }

    public CandidatePersonTypeBuilder setEyeColor(String eyeColor) {
        candidatePersonType.eyeColor = eyeColor;
        return this;
    }

    public CandidatePersonTypeBuilder setIdentifyingMarks(List<String> identifyingMarks) {
        candidatePersonType.identifyingMarks = identifyingMarks;
        return this;
    }

    public CandidatePersonTypeBuilder setAge(BigInteger age) {
        candidatePersonType.age = age;
        return this;
    }

    public CandidatePersonTypeBuilder setBloodType(String bloodType) {
        candidatePersonType.bloodType = bloodType;
        return this;
    }

    public CandidatePersonTypeBuilder setPassportId(IdentifierType passportId) {
        candidatePersonType.passportId = passportId;
        return this;
    }

    public CandidatePersonTypeBuilder setFatherName(String fatherName) {
        candidatePersonType.fatherName = fatherName;
        return this;
    }

    public CandidatePersonTypeBuilder setMotherName(String motherName) {
        candidatePersonType.motherName = motherName;
        return this;
    }

    public CandidatePersonTypeBuilder setRace(List<String> race) {
        candidatePersonType.race = race;
        return this;
    }

    public CandidatePersonTypeBuilder setBirthPlace(String birthPlace) {
        candidatePersonType.birthPlace = birthPlace;
        return this;
    }

    public CandidatePersonTypeBuilder setDeathDate(XMLGregorianCalendar deathDate) {
        candidatePersonType.deathDate = deathDate;
        return this;
    }

    public CandidatePersonTypeBuilder setNationality(List<String> nationality) {
        candidatePersonType.nationality = nationality;
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatus(String maritalStatus) {
        candidatePersonType.maritalStatus = maritalStatus;
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatusDate(XMLGregorianCalendar maritalStatusDate) {
        candidatePersonType.maritalStatusDate = maritalStatusDate;
        return this;
    }

    public CandidatePersonTypeBuilder setVisa(List<String> visa) {
        candidatePersonType.visa = visa;
        return this;
    }

    public CandidatePersonTypeBuilder setReligion(List<String> religion) {
        candidatePersonType.religion = religion;
        return this;
    }

    public CandidatePersonTypeBuilder setStudentType(String studentType) {
        candidatePersonType.studentType = studentType;
        return this;
    }

    public CandidatePersonTypeBuilder setStudentIndicator(Boolean studentIndicator) {
        candidatePersonType.studentIndicator = studentIndicator;
        return this;
    }

    public CandidatePersonTypeBuilder setStudentStatus(String studentStatus) {
        candidatePersonType.studentStatus = studentStatus;
        return this;
    }

    public CandidatePersonTypeBuilder setLegalDocuments(List<LegalDocumentType> legalDocuments) {
        candidatePersonType.legalDocuments = legalDocuments;
        return this;
    }

    public CandidatePersonTypeBuilder setEmploymentPermits(List<EmploymentPermitType> employmentPermits) {
        candidatePersonType.employmentPermits = employmentPermits;
        return this;
    }

    public CandidatePersonType build() {
        return candidatePersonType;
    }

    public CandidatePersonTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter){
        setName(new PersonNameTypeBuilder()
                .setGiven(personUppgifter.getFornamn())
                .setFamily(personUppgifter.getEfternamn())
                .build());
        setCommunication(new CommunicationTypeBuilder().withPersonUppgifter(personUppgifter).build());
        return this;
    }
}