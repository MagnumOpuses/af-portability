package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.LanguageCodeList;
import se.arbetsformedlingen.matchning.portability.dto.PersonNameType;

public class PersonNameTypeBuilder {
    private PersonNameType personNameType = new PersonNameType();


    public PersonNameTypeBuilder setLanguage(LanguageCodeList language) {
        personNameType.setLanguage(language);
        return this;
    }

    public PersonNameTypeBuilder setFormattedName(String formattedName) {
        personNameType.setFormattedName(formattedName);
        return this;
    }

    public PersonNameTypeBuilder setLegal(String legal) {
        personNameType.setLegal(legal);
        return this;
    }

    public PersonNameTypeBuilder setGiven(String given) {
        personNameType.setGiven(given);
        return this;
    }

    public PersonNameTypeBuilder setPreferred(String preferred) {
        personNameType.setPreferred(preferred);
        return this;
    }

    public PersonNameTypeBuilder setMiddle(String middle) {
        personNameType.setMiddle(middle);
        return this;
    }

    public PersonNameTypeBuilder setFamily(String family) {
        personNameType.setFamily(family);
        return this;
    }

    public PersonNameTypeBuilder setFamilyPrefix(String familyPrefix) {
        personNameType.setFamilyPrefix(familyPrefix);
        return this;
    }

    public PersonNameTypeBuilder setAlias(String alias) {
        personNameType.setAlias(alias);
        return this;
    }

    public PersonNameTypeBuilder setFormerFamily(String formerFamily) {
        personNameType.setFormerFamily(formerFamily);
        return this;
    }

    public PersonNameTypeBuilder setFormerFamilyPrefix(String formerFamilyPrefix) {
        personNameType.setFormerFamilyPrefix(formerFamilyPrefix);
        return this;
    }

    public PersonNameTypeBuilder setPreferredSalutationCode(String preferredSalutationCode) {
        personNameType.setPreferredSalutationCode(preferredSalutationCode);
        return this;
    }

    public PersonNameTypeBuilder setGenerationAffixCode(String generationAffixCode) {
        personNameType.setGenerationAffixCode(generationAffixCode);
        return this;
    }

    public PersonNameTypeBuilder setQualificationAffixCode(String qualificationAffixCode) {
        personNameType.setQualificationAffixCode(qualificationAffixCode);
        return this;
    }

    public PersonNameTypeBuilder setTitleAffixCode(String titleAffixCode) {
        personNameType.setTitleAffixCode(titleAffixCode);
        return this;
    }

    public PersonNameTypeBuilder setInitials(String initials) {
        personNameType.setInitials(initials);
        return this;
    }

    public PersonNameType build() {
        return personNameType;
    }
}