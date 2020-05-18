package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBaseType", propOrder = {

})
public class PersonBaseType {

    protected IdentifierType id;
    protected PersonNameType name;
    protected CommunicationType communication;
    protected LanguageCodeList primaryLanguage;
    protected IdentifierType legalId;
    protected XMLGregorianCalendar birthDate;
    protected GenderCodeList gender;
    protected List<CountryCodeList> citizenship;
    protected List<CountryCodeList> residenceCountry;
    protected String militaryStatus;
    protected StringTypeArray ethnicity;

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
        if (citizenship == null) {
            citizenship = new ArrayList<CountryCodeList>();
        }
        return this.citizenship;
    }

    public List<CountryCodeList> getResidenceCountry() {
        if (residenceCountry == null) {
            residenceCountry = new ArrayList<CountryCodeList>();
        }
        return this.residenceCountry;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public StringTypeArray getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(StringTypeArray ethnicity) {
        this.ethnicity = ethnicity;
    }
}
