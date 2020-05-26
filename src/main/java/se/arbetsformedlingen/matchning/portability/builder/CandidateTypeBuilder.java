package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.util.ArrayList;
import java.util.List;

public class CandidateTypeBuilder {
    private CandidateType candidateType = new CandidateType();

    public CandidateTypeBuilder setDocumentId(IdentifierType documentId) {
        candidateType.documentId = documentId;
        return this;
    }

    public CandidateTypeBuilder setAlternateIds(List<IdentifierType> alternateIds) {
        candidateType.alternateIds = alternateIds;
        return this;
    }

    public CandidateTypeBuilder setLanguage(LanguageCodeList language) {
        candidateType.language = language;
        return this;
    }

    public CandidateTypeBuilder setUri(String uri) {
        candidateType.uri = uri;
        return this;
    }

    public CandidateTypeBuilder setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        candidateType.distributionGuidelines = distributionGuidelines;
        return this;
    }

    public CandidateTypeBuilder setPerson(CandidatePersonType person) {
        candidateType.person = person;
        return this;
    }

    public CandidateTypeBuilder setProfiles(List<CandidateProfileType> profiles) {
        candidateType.profiles = profiles;
        return this;
    }

    public CandidateType build() {
        return candidateType;
    }

    public CandidateTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter){
        setDocumentId(new IdentifierTypeBuilder().setValue(personUppgifter.getKundnummer()).build());
        setPerson(new CandidatePersonTypeBuilder().withPersonUppgifter(personUppgifter).build());
        return this;
    }

    public CandidateTypeBuilder withProfiles(List<ArbetsSokandeProfil> profiler) {
        List<CandidateProfileType> profiles = new ArrayList<>();
        for (ArbetsSokandeProfil profile : profiler) {
            profiles.add(new CandidateProfileTypeBuilder().withProfiles(profile).build());
        }
        setProfiles(profiles);
        return this;
    }

}