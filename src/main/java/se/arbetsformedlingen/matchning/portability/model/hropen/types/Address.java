package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

/**
 * Differs from AddressType in that it's simplified.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String useCode;
    // Omitting countrySubDivisions by design
    private Identifier countrySubDivision;
    private String line1;
    private String line2;
    private String postalCode;
    private String city;
    private String countryCode;
    private GeoLocation geoLocation;
    private String formattedAddress;

    public String getUseCode() {
        return useCode;
    }

    public void setUseCode(String useCode) {
        this.useCode = useCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Identifier getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(Identifier countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    /* Build methods */
    public Address withGeoLocation(double longitud, double latitud) {
        setGeoLocation(new GeoLocation(longitud, latitud));
        return this;
    }

    public Address withFormattedAddress(String formattedAddress) {
        setFormattedAddress(formattedAddress);
        return this;
    }
}
