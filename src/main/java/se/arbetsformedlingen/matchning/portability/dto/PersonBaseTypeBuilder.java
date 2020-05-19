package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class PersonBaseTypeBuilder {
    private IdentifierType id;
    private PersonNameType name;
    private CommunicationType communication;
    private LanguageCodeList primaryLanguage;
    private IdentifierType legalId;
    private XMLGregorianCalendar birthDate;
    private GenderCodeList gender;
    private List<CountryCodeList> citizenship;
    private List<CountryCodeList> residenceCountry;
    private String militaryStatus;
    private StringTypeArray ethnicity;

    public PersonBaseTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public PersonBaseTypeBuilder setName(PersonNameType name) {
        this.name = name;
        return this;
    }

    public PersonBaseTypeBuilder setCommunication(CommunicationType communication) {
        this.communication = communication;
        return this;
    }

    public PersonBaseTypeBuilder setPrimaryLanguage(LanguageCodeList primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
        return this;
    }

    public PersonBaseTypeBuilder setLegalId(IdentifierType legalId) {
        this.legalId = legalId;
        return this;
    }

    public PersonBaseTypeBuilder setBirthDate(XMLGregorianCalendar birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public PersonBaseTypeBuilder setGender(GenderCodeList gender) {
        this.gender = gender;
        return this;
    }

    public PersonBaseTypeBuilder setCitizenship(List<CountryCodeList> citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    public PersonBaseTypeBuilder setResidenceCountry(List<CountryCodeList> residenceCountry) {
        this.residenceCountry = residenceCountry;
        return this;
    }

    public PersonBaseTypeBuilder setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
        return this;
    }

    public PersonBaseTypeBuilder setEthnicity(StringTypeArray ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    public PersonBaseType createPersonBaseType() {
        return new PersonBaseType(id, name, communication, primaryLanguage, legalId, birthDate, gender, citizenship, residenceCountry, militaryStatus, ethnicity);
    }
}