package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class PersonBaseTypeBuilder {
    private final PersonBaseType personBaseType = new PersonBaseType();

    public PersonBaseTypeBuilder setId(final IdentifierType id) {
        personBaseType.setId(id);
        return this;
    }

    public PersonBaseTypeBuilder setName(final PersonNameType name) {
        personBaseType.setName(name);
        return this;
    }

    public PersonBaseTypeBuilder setCommunication(final CommunicationType communication) {
        personBaseType.setCommunication(communication);
        return this;
    }

    public PersonBaseTypeBuilder setPrimaryLanguage(final LanguageCodeList primaryLanguage) {
        personBaseType.setPrimaryLanguage(primaryLanguage);
        return this;
    }

    public PersonBaseTypeBuilder setLegalId(final IdentifierType legalId) {
        personBaseType.setLegalId(legalId);
        return this;
    }

    public PersonBaseTypeBuilder setBirthDate(final DateType birthDate) {
        personBaseType.setBirthDate(birthDate);
        return this;
    }

    public PersonBaseTypeBuilder setGender(final GenderCodeList gender) {
        personBaseType.setGender(gender);
        return this;
    }

    public PersonBaseTypeBuilder setCitizenship(final List<CountryCodeList> citizenship) {
        personBaseType.getCitizenship().addAll(citizenship);
        return this;
    }

    public PersonBaseTypeBuilder setResidenceCountry(final List<CountryCodeList> residenceCountry) {
        personBaseType.getResidenceCountry().addAll(residenceCountry);
        return this;
    }

    public PersonBaseTypeBuilder setMilitaryStatus(final String militaryStatus) {
        personBaseType.setMilitaryStatus(militaryStatus);
        return this;
    }

    public PersonBaseTypeBuilder setEthnicity(final List<String> ethnicity) {
        personBaseType.setEthnicity(ethnicity);
        return this;
    }

    public PersonBaseType build() {
        return personBaseType;
    }
}