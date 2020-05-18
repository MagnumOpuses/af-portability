package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", propOrder = {

})
public class TextType {

    protected String value;
    protected LanguageCodeList languageCode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LanguageCodeList getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCodeList languageCode) {
        this.languageCode = languageCode;
    }
}
