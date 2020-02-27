package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PositionPreferenceType;

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
}