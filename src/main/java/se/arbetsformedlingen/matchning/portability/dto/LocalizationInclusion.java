package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizationInclusion", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalizationInclusion {

    protected LanguageCodeList language;

    public LanguageCodeList getLanguage() {
        return language;
    }

    public void setLanguage(final LanguageCodeList language) {
        this.language = language;
    }
}
