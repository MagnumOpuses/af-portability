package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;

public class LocationTypeBuilder {
    private String line;
    private List<AddressComponentType> extendedLines;
    private CountryCodeList countryCode;
    private List<AddressComponentType> countrySubDivisions;
    private String city;
    private String postalCode;
    private String postOfficeBox;
    private GeoType geoLocation;
    private String formattedAddress;
    private IdentifierType id;

    public LocationTypeBuilder setLine(String line) {
        this.line = line;
        return this;
    }

    public LocationTypeBuilder setExtendedLines(List<AddressComponentType> extendedLines) {
        this.extendedLines = extendedLines;
        return this;
    }

    public LocationTypeBuilder setCountryCode(CountryCodeList countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public LocationTypeBuilder setCountrySubDivisions(List<AddressComponentType> countrySubDivisions) {
        this.countrySubDivisions = countrySubDivisions;
        return this;
    }

    public LocationTypeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public LocationTypeBuilder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public LocationTypeBuilder setPostOfficeBox(String postOfficeBox) {
        this.postOfficeBox = postOfficeBox;
        return this;
    }

    public LocationTypeBuilder setGeoLocation(GeoType geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    public LocationTypeBuilder setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
        return this;
    }

    public LocationTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public LocationType createLocationType() {
        return new LocationType(line, extendedLines, countryCode, countrySubDivisions, city, postalCode, postOfficeBox, geoLocation, formattedAddress, id);
    }
}