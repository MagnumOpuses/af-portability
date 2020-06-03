package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonNameType {

    public LanguageCodeList language;
    public String formattedName;
    public String legal;
    public String given;
    public String preferred;
    public String middle;
    public String family;
    public String familyPrefix;
    public String alias;
    public String formerFamily;
    public String formerFamilyPrefix;
    public String preferredSalutationCode;
    public String generationAffixCode;
    public String qualificationAffixCode;
    public String titleAffixCode;
    public String initials;

    public LanguageCodeList getLanguage() {
        return language;
    }

    public void setLanguage(final LanguageCodeList language) {
        this.language = language;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(final String formattedName) {
        this.formattedName = formattedName;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(final String legal) {
        this.legal = legal;
    }

    public String getGiven() {
        return given;
    }

    public void setGiven(final String given) {
        this.given = given;
    }

    public String getPreferred() {
        return preferred;
    }

    public void setPreferred(final String preferred) {
        this.preferred = preferred;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(final String middle) {
        this.middle = middle;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(final String family) {
        this.family = family;
    }

    public String getFamilyPrefix() {
        return familyPrefix;
    }

    public void setFamilyPrefix(final String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public String getFormerFamily() {
        return formerFamily;
    }

    public void setFormerFamily(final String formerFamily) {
        this.formerFamily = formerFamily;
    }

    public String getFormerFamilyPrefix() {
        return formerFamilyPrefix;
    }

    public void setFormerFamilyPrefix(final String formerFamilyPrefix) {
        this.formerFamilyPrefix = formerFamilyPrefix;
    }

    public String getPreferredSalutationCode() {
        return preferredSalutationCode;
    }

    public void setPreferredSalutationCode(final String preferredSalutationCode) {
        this.preferredSalutationCode = preferredSalutationCode;
    }

    public String getGenerationAffixCode() {
        return generationAffixCode;
    }

    public void setGenerationAffixCode(final String generationAffixCode) {
        this.generationAffixCode = generationAffixCode;
    }

    public String getQualificationAffixCode() {
        return qualificationAffixCode;
    }

    public void setQualificationAffixCode(final String qualificationAffixCode) {
        this.qualificationAffixCode = qualificationAffixCode;
    }

    public String getTitleAffixCode() {
        return titleAffixCode;
    }

    public void setTitleAffixCode(final String titleAffixCode) {
        this.titleAffixCode = titleAffixCode;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(final String initials) {
        this.initials = initials;
    }
}
