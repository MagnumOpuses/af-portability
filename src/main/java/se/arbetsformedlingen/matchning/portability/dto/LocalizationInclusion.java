package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizationInclusion", propOrder = {

})
public class LocalizationInclusion {

    protected LanguageCodeList language;

    public LanguageCodeList getLanguage() {
        return language;
    }

    public void setLanguage(LanguageCodeList language) {
        this.language = language;
    }
}
