package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.Arbetsort;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.AddressComponentType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.AddressType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.LocationType;

import java.util.ArrayList;
import java.util.List;

public class AddressTypeCountrySubDivisionsBuilder {
    private AddressType.CountrySubDivisions countrySubDivisions = new AddressType.CountrySubDivisions();

    public AddressTypeCountrySubDivisionsBuilder setItem(List<AddressComponentType> item) {
        countrySubDivisions.getItem().addAll(item);
        return this;
    }

    public AddressType.CountrySubDivisions build() {
        return countrySubDivisions;
    }

    public AddressTypeCountrySubDivisionsBuilder withArbetsort(Arbetsort arbetsort) {
        List<AddressComponentType> list = new ArrayList<>();
        list.add(new AddressComponentTypeBuilder().setValue(arbetsort.getArbetsortTyp()).build());
        setItem(list);
        return this;
    }
}