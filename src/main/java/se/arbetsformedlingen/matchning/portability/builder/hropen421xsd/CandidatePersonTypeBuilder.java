package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class CandidatePersonTypeBuilder {
    private CandidatePersonType candidatePersonType = new CandidatePersonType();

    public CandidatePersonTypeBuilder setLegalId(IdentifierType legalId) {
        candidatePersonType.setLegalId(legalId);
        return this;
    }

    public CandidatePersonTypeBuilder setBirthDate(XMLGregorianCalendar birthDate) {
        candidatePersonType.setBirthDate(birthDate);
        return this;
    }

    public CandidatePersonTypeBuilder setGender(GenderCodeList gender) {
        candidatePersonType.setGender(gender);
        return this;
    }

    public CandidatePersonTypeBuilder setCitizenship(CandidatePersonType.Citizenship citizenship) {
        candidatePersonType.setCitizenship(citizenship);
        return this;
    }

    public CandidatePersonTypeBuilder setResidenceCountry(CandidatePersonType.ResidenceCountry residenceCountry) {
        candidatePersonType.setResidenceCountry(residenceCountry);
        return this;
    }

    public CandidatePersonTypeBuilder setMilitaryStatus(String militaryStatus) {
        candidatePersonType.setMilitaryStatus(militaryStatus);
        return this;
    }

    public CandidatePersonTypeBuilder setEthnicity(StringTypeArray ethnicity) {
        candidatePersonType.setEthnicity(ethnicity);
        return this;
    }

    public CandidatePersonTypeBuilder setId(IdentifierType id) {
        candidatePersonType.setId(id);
        return this;
    }

    public CandidatePersonTypeBuilder setName(PersonNameType name) {
        candidatePersonType.setName(name);
        return this;
    }

    public CandidatePersonTypeBuilder setCommunication(CommunicationType communication) {
        candidatePersonType.setCommunication(communication);
        return this;
    }

    public CandidatePersonTypeBuilder setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        candidatePersonType.setPrimaryLanguage(primaryLanguage);
        return this;
    }

    public CandidatePersonTypeBuilder setHeight(MeasureType height) {
        candidatePersonType.setHeight(height);
        return this;
    }

    public CandidatePersonTypeBuilder setWeight(MeasureType weight) {
        candidatePersonType.setWeight(weight);
        return this;
    }

    public CandidatePersonTypeBuilder setDisability(DisabilityType disability) {
        candidatePersonType.setDisability(disability);
        return this;
    }

    public CandidatePersonTypeBuilder setTobaccoUserIndicator(Boolean tobaccoUserIndicator) {
        candidatePersonType.setTobaccoUserIndicator(tobaccoUserIndicator);
        return this;
    }

    public CandidatePersonTypeBuilder setHairColor(String hairColor) {
        candidatePersonType.setHairColor(hairColor);
        return this;
    }

    public CandidatePersonTypeBuilder setEyeColor(String eyeColor) {
        candidatePersonType.setEyeColor(eyeColor);
        return this;
    }

    public CandidatePersonTypeBuilder setIdentifyingMarks(StringTypeArray identifyingMarks) {
        candidatePersonType.setIdentifyingMarks(identifyingMarks);
        return this;
    }

    public CandidatePersonTypeBuilder setAge(BigInteger age) {
        candidatePersonType.setAge(age);
        return this;
    }

    public CandidatePersonTypeBuilder setBloodType(String bloodType) {
        candidatePersonType.setBloodType(bloodType);
        return this;
    }

    public CandidatePersonTypeBuilder setPassportId(IdentifierType passportId) {
        candidatePersonType.setPassportId(passportId);
        return this;
    }

    public CandidatePersonTypeBuilder setFatherName(String fatherName) {
        candidatePersonType.setFatherName(fatherName);
        return this;
    }

    public CandidatePersonTypeBuilder setMotherName(String motherName) {
        candidatePersonType.setMotherName(motherName);
        return this;
    }

    public CandidatePersonTypeBuilder setRace(CandidatePersonType.Race race) {
        candidatePersonType.setRace(race);
        return this;
    }

    public CandidatePersonTypeBuilder setBirthPlace(String birthPlace) {
        candidatePersonType.setBirthPlace(birthPlace);
        return this;
    }

    public CandidatePersonTypeBuilder setDeathDate(XMLGregorianCalendar deathDate) {
        candidatePersonType.setDeathDate(deathDate);
        return this;
    }

    public CandidatePersonTypeBuilder setNationality(CandidatePersonType.Nationality nationality) {
        candidatePersonType.setNationality(nationality);
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatus(String maritalStatus) {
        candidatePersonType.setMaritalStatus(maritalStatus);
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatusDate(XMLGregorianCalendar maritalStatusDate) {
        candidatePersonType.setMaritalStatusDate(maritalStatusDate);
        return this;
    }

    public CandidatePersonTypeBuilder setVisa(CandidatePersonType.Visa visa) {
        candidatePersonType.setVisa(visa);
        return this;
    }

    public CandidatePersonTypeBuilder setReligion(CandidatePersonType.Religion religion) {
        candidatePersonType.setReligion(religion);
        return this;
    }

    public CandidatePersonTypeBuilder setStudentType(String studentType) {
        candidatePersonType.setStudentType(studentType);
        return this;
    }

    public CandidatePersonTypeBuilder setStudentIndicator(Boolean studentIndicator) {
        candidatePersonType.setStudentIndicator(studentIndicator);
        return this;
    }

    public CandidatePersonTypeBuilder setStudentStatus(String studentStatus) {
        candidatePersonType.setStudentStatus(studentStatus);
        return this;
    }

    public CandidatePersonTypeBuilder setLegalDocuments(CandidatePersonType.LegalDocuments legalDocuments) {
        candidatePersonType.setLegalDocuments(legalDocuments);
        return this;
    }

    public CandidatePersonTypeBuilder setEmploymentPermits(CandidatePersonType.EmploymentPermits employmentPermits) {
        candidatePersonType.setEmploymentPermits(employmentPermits);
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