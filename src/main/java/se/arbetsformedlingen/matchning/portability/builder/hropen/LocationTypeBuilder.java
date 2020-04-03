package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.GeoType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.LocationType;

public class LocationTypeBuilder {
    private LocationType locationType = new LocationType();

    public LocationTypeBuilder setLine(String line) {
        locationType.setLine(line);
        return this;
    }

    public LocationTypeBuilder setExtendedLines(LocationType.ExtendedLines extendedLines) {
        locationType.setExtendedLines(extendedLines);
        return this;
    }

    public LocationTypeBuilder setCountryCode(CountryCodeList countryCode) {
        locationType.setCountryCode(countryCode);
        return this;
    }

    public LocationTypeBuilder setCountrySubDivisions(LocationType.CountrySubDivisions countrySubDivisions) {
        locationType.setCountrySubDivisions(countrySubDivisions);
        return this;
    }

    public LocationTypeBuilder setCity(String city) {
        locationType.setCity(city);
        return this;
    }

    public LocationTypeBuilder setPostalCode(String postalCode) {
        locationType.setPostalCode(postalCode);
        return this;
    }

    public LocationTypeBuilder setPostOfficeBox(String postOfficeBox) {
        locationType.setPostOfficeBox(postOfficeBox);
        return this;
    }

    public LocationTypeBuilder setGeoLocation(GeoType geoLocation) {
        locationType.setGeoLocation(geoLocation);
        return this;
    }

    public LocationTypeBuilder setFormattedAddress(String formattedAddress) {
        locationType.setFormattedAddress(formattedAddress);
        return this;
    }

    public LocationTypeBuilder setId(IdentifierType id) {
        locationType.setId(id);
        return this;
    }

    public LocationType build() {
        return locationType;
    }
}