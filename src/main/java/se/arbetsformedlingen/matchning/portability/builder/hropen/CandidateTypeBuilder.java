package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

import java.util.List;

public class CandidateTypeBuilder {
    private IdentifierType documentId;
    private CandidateType.AlternateIds alternateIds;
    private LanguageCodeList language;
    private CandidateType.DataProtectionPolicy dataProtectionPolicy;
    private String uri;
    private DistributionGuidelinesType distributionGuidelines;
    private CandidatePersonType person;
    private CandidateType.Profiles profiles;

    public CandidateTypeBuilder setDocumentId(IdentifierType documentId) {
        this.documentId = documentId;
        return this;
    }

    public CandidateTypeBuilder setAlternateIds(CandidateType.AlternateIds alternateIds) {
        this.alternateIds = alternateIds;
        return this;
    }

    public CandidateTypeBuilder setLanguage(LanguageCodeList language) {
        this.language = language;
        return this;
    }

    public CandidateTypeBuilder setDataProtectionPolicy(CandidateType.DataProtectionPolicy dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
        return this;
    }

    public CandidateTypeBuilder setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public CandidateTypeBuilder setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
        return this;
    }

    public CandidateTypeBuilder setPerson(CandidatePersonType person) {
        this.person = person;
        return this;
    }

    public CandidateTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter){
        setPerson(new CandidatePersonTypeBuilder().withPersonUppgifter(personUppgifter).createCandidatePersonType());
        return this;
    }

    public CandidateTypeBuilder setProfiles(CandidateType.Profiles profiles) {
        this.profiles = profiles;
        return this;
    }

    public CandidateTypeBuilder withProfiles(List<ArbetsSokandeProfil> profiler) {
         this.setProfiles(new ProfilesBuilder().withProfiles(profiler).createProfiles());
         return this;
    }

    public CandidateType createCandidateType() {
        return new CandidateType(documentId, alternateIds, language, dataProtectionPolicy, uri, distributionGuidelines, person, profiles);
    }
}