package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class LocationTypeBuilder {
    private LocationType locationType = new LocationType();

    public LocationTypeBuilder setLine(String line) {
        locationType.line = line;
        return this;
    }

    public LocationTypeBuilder setExtendedLines(List<AddressComponentType> extendedLines) {
        locationType.extendedLines = extendedLines;
        return this;
    }

    public LocationTypeBuilder setCountryCode(CountryCodeList countryCode) {
        locationType.countryCode = countryCode;
        return this;
    }

    public LocationTypeBuilder setCountrySubDivisions(List<AddressComponentType> countrySubDivisions) {
        locationType.countrySubDivisions = countrySubDivisions;
        return this;
    }

    public LocationTypeBuilder setCity(String city) {
        locationType.city = city;
        return this;
    }

    public LocationTypeBuilder setPostalCode(String postalCode) {
        locationType.postalCode = postalCode;
        return this;
    }

    public LocationTypeBuilder setPostOfficeBox(String postOfficeBox) {
        locationType.postOfficeBox = postOfficeBox;
        return this;
    }

    public LocationTypeBuilder setGeoLocation(GeoType geoLocation) {
        locationType.geoLocation = geoLocation;
        return this;
    }

    public LocationTypeBuilder setFormattedAddress(String formattedAddress) {
        locationType.formattedAddress = formattedAddress;
        return this;
    }

    public LocationTypeBuilder setId(IdentifierType id) {
        locationType.id = id;
        return this;
    }

    public LocationType build() {
        return locationType;
    }
}