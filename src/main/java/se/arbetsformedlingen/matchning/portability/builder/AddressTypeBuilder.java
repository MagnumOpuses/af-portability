package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.AddressComponentType;
import se.arbetsformedlingen.matchning.portability.dto.AddressType;
import se.arbetsformedlingen.matchning.portability.dto.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.dto.GeoType;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.util.ArrayList;
import java.util.List;

public class AddressTypeBuilder {
    private AddressType addressType = new AddressType();

    public AddressTypeBuilder setLine(String line) {
        addressType.setLine(line);
        return this;
    }

    public AddressTypeBuilder setExtendedLines(List<AddressComponentType> extendedLines) {
        addressType.setExtendedLines(extendedLines);
        return this;
    }

    public AddressTypeBuilder setCountryCode(CountryCodeList countryCode) {
        addressType.setCountryCode(countryCode);
        return this;
    }

    public AddressTypeBuilder setCountrySubDivisions(List<AddressComponentType> countrySubDivisions) {
        addressType.setCountrySubDivisions(countrySubDivisions);
        return this;
    }

    public AddressTypeBuilder setCity(String city) {
        addressType.setCity(city);
        return this;
    }

    public AddressTypeBuilder setPostalCode(String postalCode) {
        addressType.setPostalCode(postalCode);
        return this;
    }

    public AddressTypeBuilder setPostOfficeBox(String postOfficeBox) {
        addressType.setPostOfficeBox(postOfficeBox);
        return this;
    }

    public AddressTypeBuilder setGeoLocation(GeoType geoLocation) {
        addressType.setGeoLocation(geoLocation);
        return this;
    }

    public AddressTypeBuilder setFormattedAddress(String formattedAddress) {
        addressType.setFormattedAddress(formattedAddress);
        return this;
    }

    public AddressType build() {
        return addressType;
    }

    public AddressTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        setLine(personUppgifter.getAdress());
        List<AddressComponentType> extendedLines = new ArrayList<>();
        extendedLines.add(new AddressComponentTypeBuilder().setValue(personUppgifter.getCo()).build());
        setExtendedLines(extendedLines).build();
        setCity(personUppgifter.getPostort());
        setCountryCode(CountryCodeList.valueOf(personUppgifter.getLand()));
        setPostalCode(personUppgifter.getPostnummer());
        return this;
    }

}