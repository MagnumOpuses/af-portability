package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.asp.Arbetsort;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.PositionPreferenceType;

import java.util.ArrayList;
import java.util.List;

public class PositionPreferencesBuilder {
    private CandidateProfileType.PositionPreferences candidateProfileTypePositionPreferences = new CandidateProfileType.PositionPreferences();

    public PositionPreferencesBuilder setItem(List<PositionPreferenceType> item) {
        candidateProfileTypePositionPreferences.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType build() {
        return candidateProfileTypePositionPreferences;
    }

    public PositionPreferencesBuilder withArbetsorter(List<Arbetsort> arbetsorter) {
        List<PositionPreferenceType> list = new ArrayList<>();
        for (Arbetsort arbetsort : arbetsorter) {
            list.add(new PositionPreferenceTypeBuilder().withArbetsort(arbetsort).build());
        }
        setItem(list);
        return this;
    }
}