package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.AddressType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.GeoType;

public class AddressTypeBuilder {
    private String line;
    private AddressType.ExtendedLines extendedLines;
    private CountryCodeList countryCode;
    private AddressType.CountrySubDivisions countrySubDivisions;
    private String city;
    private String postalCode;
    private String postOfficeBox;
    private GeoType geoLocation;
    private String formattedAddress;

    public AddressTypeBuilder setLine(String line) {
        this.line = line;
        return this;
    }

    public AddressTypeBuilder setExtendedLines(AddressType.ExtendedLines extendedLines) {
        this.extendedLines = extendedLines;
        return this;
    }

    public AddressTypeBuilder setCountryCode(CountryCodeList countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public AddressTypeBuilder setCountrySubDivisions(AddressType.CountrySubDivisions countrySubDivisions) {
        this.countrySubDivisions = countrySubDivisions;
        return this;
    }

    public AddressTypeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressTypeBuilder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressTypeBuilder setPostOfficeBox(String postOfficeBox) {
        this.postOfficeBox = postOfficeBox;
        return this;
    }

    public AddressTypeBuilder setGeoLocation(GeoType geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    public AddressTypeBuilder setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
        return this;
    }

    public AddressType createAddressType() {
        return new AddressType(line, extendedLines, countryCode, countrySubDivisions, city, postalCode, postOfficeBox, geoLocation, formattedAddress);
    }
}