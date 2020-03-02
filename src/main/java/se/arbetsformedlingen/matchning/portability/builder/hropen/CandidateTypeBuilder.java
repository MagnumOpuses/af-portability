package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

import java.util.List;

public class CandidateTypeBuilder {
    private CandidateType candidateType = new CandidateType();

    public CandidateTypeBuilder setDocumentId(IdentifierType documentId) {
        candidateType.setDocumentId(documentId);
        return this;
    }

    public CandidateTypeBuilder setAlternateIds(CandidateType.AlternateIds alternateIds) {
        candidateType.setAlternateIds(alternateIds);
        return this;
    }

    public CandidateTypeBuilder setLanguage(LanguageCodeList language) {
        candidateType.setLanguage(language);
        return this;
    }

    public CandidateTypeBuilder setDataProtectionPolicy(CandidateType.DataProtectionPolicy dataProtectionPolicy) {
        candidateType.setDataProtectionPolicy(dataProtectionPolicy);
        return this;
    }

    public CandidateTypeBuilder setUri(String uri) {
        candidateType.setUri(uri);
        return this;
    }

    public CandidateTypeBuilder setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        candidateType.setDistributionGuidelines(distributionGuidelines);
        return this;
    }

    public CandidateTypeBuilder setPerson(CandidatePersonType person) {
        candidateType.setPerson(person);
        return this;
    }

    public CandidateTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter){
        setPerson(new CandidatePersonTypeBuilder().withPersonUppgifter(personUppgifter).createCandidatePersonType());
        return this;
    }

    public CandidateTypeBuilder setProfiles(CandidateType.Profiles profiles) {
        candidateType.setProfiles(profiles);
        return this;
    }

    public CandidateType createCandidateType() {
        return candidateType;
    }

    public CandidateTypeBuilder withProfiles(List<ArbetsSokandeProfil> profiler) {
        setProfiles(new ProfilesBuilder().withProfiles(profiler).createProfiles());
        return this;
    }
}