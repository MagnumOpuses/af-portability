package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Arbetsort;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PositionPreferenceType;

import java.util.ArrayList;
import java.util.List;

public class PositionPreferencesBuilder {
    private List<PositionPreferenceType> item;

    public PositionPreferencesBuilder setItem(List<PositionPreferenceType> item) {
        this.item = item;
        return this;
    }

    public CandidateProfileType.PositionPreferences createPositionPreferences() {
        return new CandidateProfileType.PositionPreferences(item);
    }

    public PositionPreferencesBuilder withArbetsorter(List<Arbetsort> arbetsorter) {
        List<PositionPreferenceType> list = new ArrayList<>();
        for (Arbetsort arbetsort : arbetsorter) {
            list.add(new PositionPreferenceTypeBuilder().withArbetsort(arbetsort).createPositionPreferenceType());
        }
        return this;
    }
}