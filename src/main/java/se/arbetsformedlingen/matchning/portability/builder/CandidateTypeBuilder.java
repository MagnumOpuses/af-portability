package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.util.List;

public class CandidateTypeBuilder {
    private CandidateType candidateType = new se.arbetsformedlingen.matchning.portability.dto.CandidateTypeBuilder().createCandidateType();

    public CandidateTypeBuilder setDocumentId(IdentifierType documentId) {
        candidateType.getDocumentId(documentId);
        return this;
    }

    public CandidateTypeBuilder setAlternateIds(CandidateType alternateIds) {
        candidateType.getAlternateIds(alternateIds);
        return this;
    }

    public CandidateTypeBuilder setLanguage(LanguageCodeList language) {
        candidateType.setLanguage(language);
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

    public CandidateTypeBuilder setProfiles(CandidateType profiles) {
        candidateType.getProfiles(profiles);
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
        setProfiles(new ProfilesBuilder().withProfiles(profiler).build());
        return this;
    }
}