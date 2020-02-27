package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateType;

import java.util.ArrayList;
import java.util.List;

public class ProfilesBuilder {
    private List<CandidateProfileType> item;

    public ProfilesBuilder setItem(List<CandidateProfileType> item) {
        this.item = item;
        return this;
    }

    public CandidateType.Profiles createProfiles() {
        return new CandidateType.Profiles(item);
    }

    public ProfilesBuilder withProfiles(List<ArbetsSokandeProfil> profiler) {
        List<CandidateProfileType> list = new ArrayList<>();
        for (ArbetsSokandeProfil profil : profiler){
            new CandidateProfileTypeBuilder().withProfile(profil).createCandidateProfileType();
        }

        return this;
    }
}