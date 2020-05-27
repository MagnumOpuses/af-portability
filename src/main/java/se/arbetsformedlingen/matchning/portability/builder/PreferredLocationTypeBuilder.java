package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.AddressType;
import se.arbetsformedlingen.matchning.portability.dto.MeasureType;
import se.arbetsformedlingen.matchning.portability.dto.PreferredLocationType;

public class PreferredLocationTypeBuilder {
    private PreferredLocationType preferredLocationType = new PreferredLocationType();

    public PreferredLocationTypeBuilder setMaximumCommuteDuration(MeasureType maximumCommuteDuration) {
        preferredLocationType.setMaximumCommuteDuration(maximumCommuteDuration);
        return this;
    }

    public PreferredLocationTypeBuilder setMaximumCommuteDistance(MeasureType maximumCommuteDistance) {
        preferredLocationType.setMaximumCommuteDistance(maximumCommuteDistance);
        return this;
    }

    public PreferredLocationTypeBuilder setReferenceLocation(AddressType referenceLocation) {
        preferredLocationType.setReferenceLocation(referenceLocation);
        return this;
    }

    public PreferredLocationType build() {
        return preferredLocationType;
    }
}