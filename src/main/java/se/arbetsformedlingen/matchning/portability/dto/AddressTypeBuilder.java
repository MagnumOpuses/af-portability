package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;

public class AddressTypeBuilder {
    private AddressType addressType = new AddressType();

    public AddressTypeBuilder setLine(String line) {
        addressType.line = line;
        return this;
    }

    public AddressTypeBuilder setExtendedLines(List<AddressComponentType> extendedLines) {
        addressType.extendedLines = extendedLines;
        return this;
    }

    public AddressTypeBuilder setCountryCode(CountryCodeList countryCode) {
        addressType.countryCode = countryCode;
        return this;
    }

    public AddressTypeBuilder setCountrySubDivisions(List<AddressComponentType> countrySubDivisions) {
        addressType.countrySubDivisions = countrySubDivisions;
        return this;
    }

    public AddressTypeBuilder setCity(String city) {
        addressType.city = city;
        return this;
    }

    public AddressTypeBuilder setPostalCode(String postalCode) {
        addressType.postalCode = postalCode;
        return this;
    }

    public AddressTypeBuilder setPostOfficeBox(String postOfficeBox) {
        addressType.postOfficeBox = postOfficeBox;
        return this;
    }

    public AddressTypeBuilder setGeoLocation(GeoType geoLocation) {
        addressType.geoLocation = geoLocation;
        return this;
    }

    public AddressTypeBuilder setFormattedAddress(String formattedAddress) {
        addressType.formattedAddress = formattedAddress;
        return this;
    }

    public AddressType build() {
        return addressType;
    }

}