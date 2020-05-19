package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.LanguageCodeList;
import se.arbetsformedlingen.matchning.portability.dto.PersonNameType;

public class PersonNameTypeBuilder {
    private PersonNameType personNameType = new PersonNameType();


    public PersonNameTypeBuilder setLanguage(LanguageCodeList language) {
        personNameType.language = language;
        return this;
    }

    public PersonNameTypeBuilder setFormattedName(String formattedName) {
        personNameType.formattedName = formattedName;
        return this;
    }

    public PersonNameTypeBuilder setLegal(String legal) {
        personNameType.legal = legal;
        return this;
    }

    public PersonNameTypeBuilder setGiven(String given) {
        personNameType.given = given;
        return this;
    }

    public PersonNameTypeBuilder setPreferred(String preferred) {
        personNameType.preferred = preferred;
        return this;
    }

    public PersonNameTypeBuilder setMiddle(String middle) {
        personNameType.middle = middle;
        return this;
    }

    public PersonNameTypeBuilder setFamily(String family) {
        personNameType.family = family;
        return this;
    }

    public PersonNameTypeBuilder setFamilyPrefix(String familyPrefix) {
        personNameType.familyPrefix = familyPrefix;
        return this;
    }

    public PersonNameTypeBuilder setAlias(String alias) {
        personNameType.alias = alias;
        return this;
    }

    public PersonNameTypeBuilder setFormerFamily(String formerFamily) {
        personNameType.formerFamily = formerFamily;
        return this;
    }

    public PersonNameTypeBuilder setFormerFamilyPrefix(String formerFamilyPrefix) {
        personNameType.formerFamilyPrefix = formerFamilyPrefix;
        return this;
    }

    public PersonNameTypeBuilder setPreferredSalutationCode(String preferredSalutationCode) {
        personNameType.preferredSalutationCode = preferredSalutationCode;
        return this;
    }

    public PersonNameTypeBuilder setGenerationAffixCode(String generationAffixCode) {
        personNameType.generationAffixCode = generationAffixCode;
        return this;
    }

    public PersonNameTypeBuilder setQualificationAffixCode(String qualificationAffixCode) {
        personNameType.qualificationAffixCode = qualificationAffixCode;
        return this;
    }

    public PersonNameTypeBuilder setTitleAffixCode(String titleAffixCode) {
        personNameType.titleAffixCode = titleAffixCode;
        return this;
    }

    public PersonNameTypeBuilder setInitials(String initials) {
        personNameType.initials = initials;
        return this;
    }

    public PersonNameType build() {
        return personNameType;
    }
}