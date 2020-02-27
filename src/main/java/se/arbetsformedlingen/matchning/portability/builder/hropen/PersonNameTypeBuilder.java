package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.LanguageCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonNameType;

public class PersonNameTypeBuilder {
    private LanguageCodeList language;
    private String formattedName;
    private String legal;
    private String given;
    private String preferred;
    private String middle;
    private String family;
    private String familyPrefix;
    private String alias;
    private String formerFamily;
    private String formerFamilyPrefix;
    private String preferredSalutationCode;
    private String generationAffixCode;
    private String qualificationAffixCode;
    private String titleAffixCode;
    private String initials;

    public PersonNameTypeBuilder setLanguage(LanguageCodeList language) {
        this.language = language;
        return this;
    }

    public PersonNameTypeBuilder setFormattedName(String formattedName) {
        this.formattedName = formattedName;
        return this;
    }

    public PersonNameTypeBuilder setLegal(String legal) {
        this.legal = legal;
        return this;
    }

    public PersonNameTypeBuilder setGiven(String given) {
        this.given = given;
        return this;
    }

    public PersonNameTypeBuilder setPreferred(String preferred) {
        this.preferred = preferred;
        return this;
    }

    public PersonNameTypeBuilder setMiddle(String middle) {
        this.middle = middle;
        return this;
    }

    public PersonNameTypeBuilder setFamily(String family) {
        this.family = family;
        return this;
    }

    public PersonNameTypeBuilder setFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
        return this;
    }

    public PersonNameTypeBuilder setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public PersonNameTypeBuilder setFormerFamily(String formerFamily) {
        this.formerFamily = formerFamily;
        return this;
    }

    public PersonNameTypeBuilder setFormerFamilyPrefix(String formerFamilyPrefix) {
        this.formerFamilyPrefix = formerFamilyPrefix;
        return this;
    }

    public PersonNameTypeBuilder setPreferredSalutationCode(String preferredSalutationCode) {
        this.preferredSalutationCode = preferredSalutationCode;
        return this;
    }

    public PersonNameTypeBuilder setGenerationAffixCode(String generationAffixCode) {
        this.generationAffixCode = generationAffixCode;
        return this;
    }

    public PersonNameTypeBuilder setQualificationAffixCode(String qualificationAffixCode) {
        this.qualificationAffixCode = qualificationAffixCode;
        return this;
    }

    public PersonNameTypeBuilder setTitleAffixCode(String titleAffixCode) {
        this.titleAffixCode = titleAffixCode;
        return this;
    }

    public PersonNameTypeBuilder setInitials(String initials) {
        this.initials = initials;
        return this;
    }

    public PersonNameType createPersonNameType() {
        return new PersonNameType(language, formattedName, legal, given, preferred, middle, family, familyPrefix, alias, formerFamily, formerFamilyPrefix, preferredSalutationCode, generationAffixCode, qualificationAffixCode, titleAffixCode, initials);
    }
}