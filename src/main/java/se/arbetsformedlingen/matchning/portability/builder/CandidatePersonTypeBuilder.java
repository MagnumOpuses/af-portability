package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.List;

public class CandidatePersonTypeBuilder {
    private final CandidatePersonType candidatePersonType = new CandidatePersonType();


    public CandidatePersonTypeBuilder setLegalId(final IdentifierType legalId) {
        candidatePersonType.setLegalId(legalId);
        return this;
    }

    public CandidatePersonTypeBuilder setBirthDate(final DateType birthDate) {
        candidatePersonType.setBirthDate(birthDate);
        return this;
    }

    public CandidatePersonTypeBuilder setGender(final GenderCodeList gender) {
        candidatePersonType.setGender(gender);
        return this;
    }

    public CandidatePersonTypeBuilder setCitizenship(final List<CountryCodeList> citizenship) {
        candidatePersonType.setCitizenship(citizenship);
        return this;
    }

    public CandidatePersonTypeBuilder setResidenceCountry(final List<CountryCodeList> residenceCountry) {
        candidatePersonType.setResidenceCountry(residenceCountry);
        return this;
    }

    public CandidatePersonTypeBuilder setMilitaryStatus(final String militaryStatus) {
        candidatePersonType.setMilitaryStatus(militaryStatus);
        return this;
    }

    public CandidatePersonTypeBuilder setEthnicity(final List<String> ethnicity) {
        candidatePersonType.setEthnicity(ethnicity);
        return this;
    }

    public CandidatePersonTypeBuilder setId(final IdentifierType id) {
        candidatePersonType.setId(id);
        return this;
    }

    public CandidatePersonTypeBuilder setName(final PersonNameType name) {
        candidatePersonType.setName(name);
        return this;
    }

    public CandidatePersonTypeBuilder setCommunication(final CommunicationType communication) {
        candidatePersonType.setCommunication(communication);
        return this;
    }

    public CandidatePersonTypeBuilder setPrimaryLanguage(final LanguageCodeList primaryLanguage) {
        candidatePersonType.setPrimaryLanguage(primaryLanguage);
        return this;
    }

    public CandidatePersonTypeBuilder setHeight(final MeasureType height) {
        candidatePersonType.setHeight(height);
        return this;
    }

    public CandidatePersonTypeBuilder setWeight(final MeasureType weight) {
        candidatePersonType.setWeight(weight);
        return this;
    }

    public CandidatePersonTypeBuilder setDisability(final DisabilityType disability) {
        candidatePersonType.setDisability(disability);
        return this;
    }

    public CandidatePersonTypeBuilder setTobaccoUserIndicator(final Boolean tobaccoUserIndicator) {
        candidatePersonType.setTobaccoUserIndicator(tobaccoUserIndicator);
        return this;
    }

    public CandidatePersonTypeBuilder setHairColor(final String hairColor) {
        candidatePersonType.setHairColor(hairColor);
        return this;
    }

    public CandidatePersonTypeBuilder setEyeColor(final String eyeColor) {
        candidatePersonType.setEyeColor(eyeColor);
        return this;
    }

    public CandidatePersonTypeBuilder setIdentifyingMarks(final List<String> identifyingMarks) {
        candidatePersonType.setIdentifyingMarks(identifyingMarks);
        return this;
    }

    public CandidatePersonTypeBuilder setAge(final BigInteger age) {
        candidatePersonType.setAge(age);
        return this;
    }

    public CandidatePersonTypeBuilder setBloodType(final String bloodType) {
        candidatePersonType.setBloodType(bloodType);
        return this;
    }

    public CandidatePersonTypeBuilder setPassportId(final IdentifierType passportId) {
        candidatePersonType.setPassportId(passportId);
        return this;
    }

    public CandidatePersonTypeBuilder setFatherName(final String fatherName) {
        candidatePersonType.setFatherName(fatherName);
        return this;
    }

    public CandidatePersonTypeBuilder setMotherName(final String motherName) {
        candidatePersonType.setMotherName(motherName);
        return this;
    }

    public CandidatePersonTypeBuilder setRace(final List<String> race) {
        candidatePersonType.setRace(race);
        return this;
    }

    public CandidatePersonTypeBuilder setBirthPlace(final String birthPlace) {
        candidatePersonType.setBirthPlace(birthPlace);
        return this;
    }

    public CandidatePersonTypeBuilder setDeathDate(final XMLGregorianCalendar deathDate) {
        candidatePersonType.setDeathDate(deathDate);
        return this;
    }

    public CandidatePersonTypeBuilder setNationality(final List<String> nationality) {
        candidatePersonType.setNationality(nationality);
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatus(final String maritalStatus) {
        candidatePersonType.setMaritalStatus(maritalStatus);
        return this;
    }

    public CandidatePersonTypeBuilder setMaritalStatusDate(final XMLGregorianCalendar maritalStatusDate) {
        candidatePersonType.setMaritalStatusDate(maritalStatusDate);
        return this;
    }

    public CandidatePersonTypeBuilder setVisa(final List<String> visa) {
        candidatePersonType.visa = visa;
        return this;
    }

    public CandidatePersonTypeBuilder setReligion(final List<String> religion) {
        candidatePersonType.setReligion(religion);
        return this;
    }

    public CandidatePersonTypeBuilder setStudentType(final String studentType) {
        candidatePersonType.setStudentType(studentType);
        return this;
    }

    public CandidatePersonTypeBuilder setStudentIndicator(final Boolean studentIndicator) {
        candidatePersonType.setStudentIndicator(studentIndicator);
        return this;
    }

    public CandidatePersonTypeBuilder setStudentStatus(final String studentStatus) {
        candidatePersonType.setStudentStatus(studentStatus);
        return this;
    }

    public CandidatePersonTypeBuilder setLegalDocuments(final List<LegalDocumentType> legalDocuments) {
        candidatePersonType.setLegalDocuments(legalDocuments);
        return this;
    }

    public CandidatePersonTypeBuilder setEmploymentPermits(final List<EmploymentPermitType> employmentPermits) {
        candidatePersonType.setEmploymentPermits(employmentPermits);
        return this;
    }

    public CandidatePersonType build() {
        return candidatePersonType;
    }

    public CandidatePersonTypeBuilder withPersonUppgifter(final PersonUppgifter personUppgifter) {
        setName(new PersonNameTypeBuilder()
                .setGiven(personUppgifter.getFornamn())
                .setFamily(personUppgifter.getEfternamn())
                .build());
        setCommunication(new CommunicationTypeBuilder().withPersonUppgifter(personUppgifter).build());
        return this;
    }
}