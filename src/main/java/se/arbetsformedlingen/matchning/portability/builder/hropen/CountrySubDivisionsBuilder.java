package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Arbetsort;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressComponentType;
import se.arbetsformedlingen.matchning.portability.model.hropen.LocationType;

import java.util.ArrayList;
import java.util.List;

public class CountrySubDivisionsBuilder {
    private LocationType.CountrySubDivisions countrySubDivisions = new LocationType.CountrySubDivisions();

    public CountrySubDivisionsBuilder setItem(List<AddressComponentType> item) {
        countrySubDivisions.getItem().addAll(item);
        return this;
    }

    public LocationType.CountrySubDivisions build() {
        return countrySubDivisions;
    }

    public CountrySubDivisionsBuilder withArbetsort(Arbetsort arbetsort) {
        List<AddressComponentType> list = new ArrayList<>();
        list.add(new AddressComponentTypeBuilder().setValue(arbetsort.getArbetsortTyp()).build());
        setItem(list);
        return this;
    }
}