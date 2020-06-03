package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBaseType", propOrder = {

})
public class PersonBaseType {

    public IdentifierType id;
    public PersonNameType name;
    public CommunicationType communication;
    public LanguageCodeList primaryLanguage;
    public IdentifierType legalId;
    @JsonSerialize(using = DateType.DateTypeSerializer.class)
    @JsonDeserialize(using = DateType.DateTypeDeserializer.class)
    public DateType birthDate;
    public GenderCodeList gender;
    public List<CountryCodeList> citizenship;
    public List<CountryCodeList> residenceCountry;
    public String militaryStatus;
    public List<String> ethnicity;

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
        if (citizenship == null) {
            citizenship = new ArrayList<CountryCodeList>();
        }
        return this.citizenship;
    }

    public void setCitizenship(final List<CountryCodeList> citizenship) {
        this.citizenship = citizenship;
    }

    public List<CountryCodeList> getResidenceCountry() {
        if (residenceCountry == null) {
            residenceCountry = new ArrayList<CountryCodeList>();
        }
        return this.residenceCountry;
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
        return ethnicity;
    }

    public void setEthnicity(final List<String> ethnicity) {
        this.ethnicity = ethnicity;
    }
}
