package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateType;

import java.util.ArrayList;
import java.util.List;

public class ProfilesBuilder {
    private CandidateType.Profiles candidateTypeProfiles = new CandidateType.Profiles();

    public ProfilesBuilder setItem(List<CandidateProfileType> item) {
        candidateTypeProfiles.getItem().addAll(item);
        return this;
    }

    public CandidateType.Profiles build() {
        return candidateTypeProfiles;
    }

    public ProfilesBuilder withProfiles(List<ArbetsSokandeProfil> profiler) {
        List<CandidateProfileType> list = new ArrayList<>();
        for (ArbetsSokandeProfil profil : profiler){
            new CandidateProfileTypeBuilder().withProfile(profil).build();
        }
        setItem(list);
        return this;
    }
}