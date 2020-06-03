package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.builder.AddressComponentTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddressTypeArrayBuilder {

    private final AddressTypeArray addressTypeArray = new AddressTypeArray();

    public AddressTypeArrayBuilder setLine(final String line) {
        setLine(line);
        return this;
    }

    public AddressTypeArrayBuilder setExtendedLines(final List<AddressComponentType> extendedLines) {
        setExtendedLines(extendedLines);
        return this;
    }

    public AddressTypeArrayBuilder setCountryCode(final CountryCodeList countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    public AddressTypeArrayBuilder setCountrySubDivisions(final List<AddressComponentType> countrySubDivisions) {
        setCountrySubDivisions(countrySubDivisions);
        return this;
    }

    public AddressTypeArrayBuilder setCity(final String city) {
        setCity(city);
        return this;
    }

    public AddressTypeArrayBuilder setPostalCode(final String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    public AddressTypeArrayBuilder setPostOfficeBox(final String postOfficeBox) {
        setPostOfficeBox(postOfficeBox);
        return this;
    }

    public AddressTypeArrayBuilder setGeoLocation(final GeoType geoLocation) {
        setGeoLocation(geoLocation);
        return this;
    }

    public AddressTypeArrayBuilder setFormattedAddress(final String formattedAddress) {
        setFormattedAddress(formattedAddress);
        return this;
    }

    public AddressTypeArrayBuilder setName(final String name) {
        setName(name);
        return this;
    }

    public AddressTypeArrayBuilder setUseCode(final String useCode) {
        setUseCode(useCode);
        return this;
    }

    public AddressTypeArrayBuilder setPreference(final BigInteger preference) {
        setPreference(preference);
        return this;
    }

    public AddressTypeArrayBuilder setAvailablePeriod(final DateTimePeriodType availablePeriod) {
        setAvailablePeriod(availablePeriod);
        return this;
    }

    public AddressTypeArray build() {
        return addressTypeArray;
    }

    public AddressTypeArrayBuilder withPersonUppgifter(final PersonUppgifter personUppgifter) {
        setLine(personUppgifter.getAdress());
        final List<AddressComponentType> extendedLines = new ArrayList<>();
        extendedLines.add(new AddressComponentTypeBuilder().setValue(personUppgifter.getCo()).build());
        setExtendedLines(extendedLines);
        setCity(personUppgifter.getPostort());
        setCountryCode(CountryCodeList.valueOf(personUppgifter.getLand()));
        setPostalCode(personUppgifter.getPostnummer());
        return this;
    }
}