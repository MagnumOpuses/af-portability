package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class PersonBaseTypeBuilder {
    private PersonBaseType personBaseType = new PersonBaseType();

    public PersonBaseTypeBuilder setId(IdentifierType id) {
        personBaseType.id = id;
        return this;
    }

    public PersonBaseTypeBuilder setName(PersonNameType name) {
        personBaseType.name = name;
        return this;
    }

    public PersonBaseTypeBuilder setCommunication(CommunicationType communication) {
        personBaseType.communication = communication;
        return this;
    }

    public PersonBaseTypeBuilder setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        personBaseType.primaryLanguage = primaryLanguage;
        return this;
    }

    public PersonBaseTypeBuilder setLegalId(IdentifierType legalId) {
        personBaseType.legalId = legalId;
        return this;
    }

    public PersonBaseTypeBuilder setBirthDate(XMLGregorianCalendar birthDate) {
        personBaseType.birthDate = birthDate;
        return this;
    }

    public PersonBaseTypeBuilder setGender(GenderCodeList gender) {
        personBaseType.gender = gender;
        return this;
    }

    public PersonBaseTypeBuilder setCitizenship(List<CountryCodeList> citizenship) {
        personBaseType.citizenship = citizenship;
        return this;
    }

    public PersonBaseTypeBuilder setResidenceCountry(List<CountryCodeList> residenceCountry) {
        personBaseType.residenceCountry = residenceCountry;
        return this;
    }

    public PersonBaseTypeBuilder setMilitaryStatus(String militaryStatus) {
        personBaseType.militaryStatus = militaryStatus;
        return this;
    }

    public PersonBaseTypeBuilder setEthnicity(StringTypeArray ethnicity) {
        personBaseType.ethnicity = ethnicity;
        return this;
    }

    public PersonBaseType build() {
        return personBaseType;
    }
}