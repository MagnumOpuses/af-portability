package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressTypeArray;
import se.arbetsformedlingen.matchning.portability.model.hropen.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.GeoType;

import java.math.BigInteger;

public class AddressTypeArrayItemBuilder {
    private String line;
    private AddressTypeArray.Item.ExtendedLines extendedLines;
    private CountryCodeList countryCode;
    private AddressTypeArray.Item.CountrySubDivisions countrySubDivisions;
    private String city;
    private String postalCode;
    private String postOfficeBox;
    private GeoType geoLocation;
    private String formattedAddress;
    private String name;
    private String useCode;
    private BigInteger preference;
    private DateTimePeriodType availablePeriod;

    public AddressTypeArrayItemBuilder setLine(String line) {
        this.line = line;
        return this;
    }

    public AddressTypeArrayItemBuilder setExtendedLines(AddressTypeArray.Item.ExtendedLines extendedLines) {
        this.extendedLines = extendedLines;
        return this;
    }

    public AddressTypeArrayItemBuilder setCountryCode(CountryCodeList countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public AddressTypeArrayItemBuilder setCountrySubDivisions(AddressTypeArray.Item.CountrySubDivisions countrySubDivisions) {
        this.countrySubDivisions = countrySubDivisions;
        return this;
    }

    public AddressTypeArrayItemBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressTypeArrayItemBuilder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressTypeArrayItemBuilder setPostOfficeBox(String postOfficeBox) {
        this.postOfficeBox = postOfficeBox;
        return this;
    }

    public AddressTypeArrayItemBuilder setGeoLocation(GeoType geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    public AddressTypeArrayItemBuilder setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
        return this;
    }

    public AddressTypeArrayItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AddressTypeArrayItemBuilder setUseCode(String useCode) {
        this.useCode = useCode;
        return this;
    }

    public AddressTypeArrayItemBuilder setPreference(BigInteger preference) {
        this.preference = preference;
        return this;
    }

    public AddressTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        this.availablePeriod = availablePeriod;
        return this;
    }

    public AddressTypeArray.Item createItem() {
        return new AddressTypeArray.Item(line, extendedLines, countryCode, countrySubDivisions, city, postalCode, postOfficeBox, geoLocation, formattedAddress, name, useCode, preference, availablePeriod);
    }

    public AddressTypeArrayItemBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        setLine(personUppgifter.getAdress());
        setExtendedLines(new ExtendedLinesBuilder().withPersonUppgifter(personUppgifter).createExtendedLines());
        setCity(personUppgifter.getPostort());
        setCountryCode(CountryCodeList.valueOf(personUppgifter.getLand()));
        setPostalCode(personUppgifter.getPersonnummer());
        return this;
    }
}