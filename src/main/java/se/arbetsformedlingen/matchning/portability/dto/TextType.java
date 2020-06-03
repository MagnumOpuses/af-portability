package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextType {

    protected String value;
    protected LanguageCodeList languageCode;

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public LanguageCodeList getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(final LanguageCodeList languageCode) {
        this.languageCode = languageCode;
    }
}
