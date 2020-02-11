package se.arbetsformedlingen.matchning.portability.model.hropen;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Communication;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.Measure;
import se.arbetsformedlingen.matchning.portability.model.hropen.types.PersonName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Modelled without inclusion of PersonLegalInclusion or PersonPhysicalInclusion
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private Identifier id;
    private Identifier legalId;
    private PersonName name;
    private Measure height;
    private Measure weight;
    private String gender;
    private Date birthDate;
    private String primaryLanguage;
    private List<String> citizenship;
    private List<String> residenceCountry;
    private String militaryStatus;
    private List<String> ethnicity;
    private Communication communication;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Person() { }
    public Person(String name) {
        setName(name);
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public void setName(String name) {
        String givenName = null;
        String familyName = null;
        if (name.contains(",")) {
            String[] parts = name.split(",");
            if (parts.length > 1) {
                givenName = parts[1].trim();
            }
            familyName = parts[0].trim();
        } else if (name.contains(" ")) {
            String[] parts = name.split(" ");
            if (parts.length > 1) {
                familyName = parts[1].trim();
            }
            givenName = parts[0].trim();
        }
        setName(givenName, familyName);
    }

    public void setName(String givenName, String familyName) {
        setName(new PersonName(givenName, familyName));
    }

    public Measure getHeight() {
        return height;
    }

    public void setHeight(Measure height) {
        this.height = height;
    }

    public Measure getWeight() {
        return weight;
    }

    public void setWeight(Measure weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonIgnore
    public Date getBirthDateAsDate() {
        return birthDate;
    }

    public String getBirthDate() {
        if (this.birthDate != null) {
            return sdf.format(this.birthDate);
        }
        return null;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public Identifier getLegalId() {
        return legalId;
    }

    public void setLegalId(Identifier legalId) {
        this.legalId = legalId;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public List<String> getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(List<String> citizenship) {
        this.citizenship = citizenship;
    }

    public List<String> getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(List<String> residenceCountry) {
        this.residenceCountry = residenceCountry;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public List<String> getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(List<String> ethnicity) {
        this.ethnicity = ethnicity;
    }

    /* Create methods */
    public Person withEmail(String email) {
        createGetCommunication().addEmail(email);
        return this;
    }

    public Person withPhone(String phoneNumber) {
        createGetCommunication().addPhone(phoneNumber);
        return this;
    }

    public Person withPhone(String phoneNumber, String type) {
        createGetCommunication().addPhone(phoneNumber, type);
        return this;
    }

    public Person withAddress(String type, String l1, String l2, String pnr, String stad, String land) {
        createGetCommunication().addAddrees(type, l1, l2, pnr, stad, land);
        return this;
    }

    public Person withGivenname(String firstname) {
        createGetPersonName().setGiven(firstname);
        return this;
    }

    public Person withFamilyname(String lastname) {
        createGetPersonName().setFamily(lastname);
        return this;
    }

    public Person withWebpage(String hemsida) {
        createGetCommunication().addWeb(hemsida);
        return this;
    }

    /* Create-Get-methods */
    private Communication createGetCommunication() {
        if (this.communication == null) {
            this.communication = new Communication();
        }
        return this.communication;
    }

    private PersonName createGetPersonName() {
        if (this.name == null) {
            this.name = new PersonName();
        }
        return this.name;
    }

}
