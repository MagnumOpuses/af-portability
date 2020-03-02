package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.AddressType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.GeoType;

public class AddressTypeBuilder {
    private AddressType addressType = new AddressType();

    public AddressTypeBuilder setLine(String line) {
        addressType.setLine(line);
        return this;
    }

    public AddressTypeBuilder setExtendedLines(AddressType.ExtendedLines extendedLines) {
        addressType.setExtendedLines(extendedLines);
        return this;
    }

    public AddressTypeBuilder setCountryCode(CountryCodeList countryCode) {
        addressType.setCountryCode(countryCode);
        return this;
    }

    public AddressTypeBuilder setCountrySubDivisions(AddressType.CountrySubDivisions countrySubDivisions) {
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

    public AddressType createAddressType() {
        return addressType;
    }
}