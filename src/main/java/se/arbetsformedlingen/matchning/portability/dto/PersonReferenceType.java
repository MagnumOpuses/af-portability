package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonReferenceType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonReferenceType {

    protected IdentifierType id;
    protected PersonNameType name;
    protected CommunicationType communication;
    protected LanguageCodeList primaryLanguage;

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
}
