package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class PersonBaseTypeBuilder {
    private PersonBaseType personBaseType = new PersonBaseType();

    public PersonBaseTypeBuilder setId(IdentifierType id) {
        personBaseType.setId(id);
        return this;
    }

    public PersonBaseTypeBuilder setName(PersonNameType name) {
        personBaseType.setName(name);
        return this;
    }

    public PersonBaseTypeBuilder setCommunication(CommunicationType communication) {
        personBaseType.setCommunication(communication);
        return this;
    }

    public PersonBaseTypeBuilder setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        personBaseType.setPrimaryLanguage(primaryLanguage);
        return this;
    }

    public PersonBaseTypeBuilder setLegalId(IdentifierType legalId) {
        personBaseType.setLegalId(legalId);
        return this;
    }

    public PersonBaseTypeBuilder setBirthDate(XMLGregorianCalendar birthDate) {
        personBaseType.setBirthDate(birthDate);
        return this;
    }

    public PersonBaseTypeBuilder setGender(GenderCodeList gender) {
        personBaseType.setGender(gender);
        return this;
    }

    public PersonBaseTypeBuilder setCitizenship(List<CountryCodeList> citizenship) {
        personBaseType.getCitizenship().addAll(citizenship);
        return this;
    }

    public PersonBaseTypeBuilder setResidenceCountry(List<CountryCodeList> residenceCountry) {
        personBaseType.getResidenceCountry().addAll(residenceCountry);
        return this;
    }

    public PersonBaseTypeBuilder setMilitaryStatus(String militaryStatus) {
        personBaseType.setMilitaryStatus(militaryStatus);
        return this;
    }

    public PersonBaseTypeBuilder setEthnicity(StringTypeArray ethnicity) {
        personBaseType.setEthnicity(ethnicity);
        return this;
    }

    public PersonBaseType build() {
        return personBaseType;
    }
}