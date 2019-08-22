package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferredLocation {
    private Measure maximumCommuteDuration;
    private Measure maximumCommuteDistance;
    private Address referenceLocation;

    public Measure getMaximumCommuteDuration() {
        return maximumCommuteDuration;
    }

    public void setMaximumCommuteDuration(Measure maximumCommuteDuration) {
        this.maximumCommuteDuration = maximumCommuteDuration;
    }

    public Measure getMaximumCommuteDistance() {
        return maximumCommuteDistance;
    }

    public void setMaximumCommuteDistance(Measure maximumCommuteDistance) {
        this.maximumCommuteDistance = maximumCommuteDistance;
    }

    public Address getReferenceLocation() {
        return referenceLocation;
    }

    public void setReferenceLocation(Address referenceLocation) {
        this.referenceLocation = referenceLocation;
    }

    public PreferredLocation withKommunKod(String kommunkod) {
        if (referenceLocation == null) {
            referenceLocation = new Address();
        }
        referenceLocation.setCountrySubDivision(new Identifier(kommunkod, "kommun"));
        return this;
    }
}
