package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.builder.AddressComponentTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressTypeArrayBuilder {

    private final AddressTypeArray addressTypeArray = new AddressTypeArray();

    public AddressTypeArrayBuilder setLine(final String line) {
        addressTypeArray.setLine(line);
        return this;
    }

    public AddressTypeArrayBuilder setExtendedLines(final List<AddressComponentType> extendedLines) {
        addressTypeArray.setExtendedLines(extendedLines);
        return this;
    }

    public AddressTypeArrayBuilder setCountryCode(final CountryCodeList countryCode) {
        addressTypeArray.setCountryCode(countryCode);
        return this;
    }

    public AddressTypeArrayBuilder setCountrySubDivisions(final List<AddressComponentType> countrySubDivisions) {
        addressTypeArray.setCountrySubDivisions(countrySubDivisions);
        return this;
    }

    public AddressTypeArrayBuilder setCity(final String city) {
        addressTypeArray.setCity(city);
        return this;
    }

    public AddressTypeArrayBuilder setPostalCode(final String postalCode) {
        addressTypeArray.setPostalCode(postalCode);
        return this;
    }

    public AddressTypeArrayBuilder setPostOfficeBox(final String postOfficeBox) {
        addressTypeArray.setPostOfficeBox(postOfficeBox);
        return this;
    }

    public AddressTypeArrayBuilder setGeoLocation(final GeoType geoLocation) {
        addressTypeArray.setGeoLocation(geoLocation);
        return this;
    }

    public AddressTypeArrayBuilder setFormattedAddress(final String formattedAddress) {
        addressTypeArray.setFormattedAddress(formattedAddress);
        return this;
    }

    public AddressTypeArrayBuilder setName(final String name) {
        addressTypeArray.setName(name);
        return this;
    }

    public AddressTypeArrayBuilder setUseCode(final String useCode) {
        addressTypeArray.setUseCode(useCode);
        return this;
    }

    public AddressTypeArrayBuilder setPreference(final BigInteger preference) {
        addressTypeArray.setPreference(preference);
        return this;
    }

    public AddressTypeArrayBuilder setAvailablePeriod(final DateTimePeriodType availablePeriod) {
        addressTypeArray.setAvailablePeriod(availablePeriod);
        return this;
    }

    public AddressTypeArray build() {
        return addressTypeArray;
    }

    public AddressTypeArrayBuilder withPersonUppgifter(final PersonUppgifter personUppgifter) {
        addressTypeArray.setLine(personUppgifter.getAdress());
        final List<AddressComponentType> extendedLines = new ArrayList<>();
        extendedLines.add(new AddressComponentTypeBuilder().setType("PLACEHOLDER TYPE").setValue(personUppgifter.getCo()).build());
        addressTypeArray.setExtendedLines(extendedLines);
        addressTypeArray.setCity(personUppgifter.getPostort());
        addressTypeArray.setCountryCode(CountryCodeList.valueOf(personUppgifter.getLand()));
        addressTypeArray.setPostalCode(personUppgifter.getPostnummer());
        return this;
    }
}