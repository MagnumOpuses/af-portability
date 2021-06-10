package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationType {

    public String line;
    public List<AddressComponentType> extendedLines;
    public CountryCodeList countryCode;
    public List<AddressComponentType> countrySubDivisions;
    public String city;
    public String postalCode;
    public String postOfficeBox;
    public GeoType geoLocation;
    public String formattedAddress;
    public IdentifierType id;

    public String getLine() {
        return line;
    }

    public void setLine(final String line) {
        this.line = line;
    }

    public List<AddressComponentType> getExtendedLines() {
        if (extendedLines == null) {
            extendedLines = new ArrayList<AddressComponentType>();
        }
        return this.extendedLines;
    }

    public void setExtendedLines(final List<AddressComponentType> extendedLines) {
        this.extendedLines = extendedLines;
    }

    public CountryCodeList getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final CountryCodeList countryCode) {
        this.countryCode = countryCode;
    }

    public List<AddressComponentType> getCountrySubDivisions() {
        if (countrySubDivisions == null) {
            countrySubDivisions = new ArrayList<AddressComponentType>();
        }
        return this.countrySubDivisions;
    }

    public void setCountrySubDivisions(final List<AddressComponentType> countrySubDivisions) {
        this.countrySubDivisions = countrySubDivisions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    public void setPostOfficeBox(final String postOfficeBox) {
        this.postOfficeBox = postOfficeBox;
    }

    public GeoType getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(final GeoType geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(final String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }
}
