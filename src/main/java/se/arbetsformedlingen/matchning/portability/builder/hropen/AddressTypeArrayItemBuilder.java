package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressTypeArray;
import se.arbetsformedlingen.matchning.portability.model.hropen.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.GeoType;

import java.math.BigInteger;

public class AddressTypeArrayItemBuilder {
    private AddressTypeArray.Item addressTypeArrayItem = new AddressTypeArray.Item();

    public AddressTypeArrayItemBuilder setLine(String line) {
        addressTypeArrayItem.setLine(line);
        return this;
    }

    public AddressTypeArrayItemBuilder setExtendedLines(AddressTypeArray.Item.ExtendedLines extendedLines) {
        addressTypeArrayItem.setExtendedLines(extendedLines);
        return this;
    }

    public AddressTypeArrayItemBuilder setCountryCode(CountryCodeList countryCode) {
        addressTypeArrayItem.setCountryCode(countryCode);
        return this;
    }

    public AddressTypeArrayItemBuilder setCountrySubDivisions(AddressTypeArray.Item.CountrySubDivisions countrySubDivisions) {
        addressTypeArrayItem.setCountrySubDivisions(countrySubDivisions);
        return this;
    }

    public AddressTypeArrayItemBuilder setCity(String city) {
        addressTypeArrayItem.setCity(city);
        return this;
    }

    public AddressTypeArrayItemBuilder setPostalCode(String postalCode) {
        addressTypeArrayItem.setPostalCode(postalCode);
        return this;
    }

    public AddressTypeArrayItemBuilder setPostOfficeBox(String postOfficeBox) {
        addressTypeArrayItem.setPostOfficeBox(postOfficeBox);
        return this;
    }

    public AddressTypeArrayItemBuilder setGeoLocation(GeoType geoLocation) {
        addressTypeArrayItem.setGeoLocation(geoLocation);
        return this;
    }

    public AddressTypeArrayItemBuilder setFormattedAddress(String formattedAddress) {
        addressTypeArrayItem.setFormattedAddress(formattedAddress);
        return this;
    }

    public AddressTypeArrayItemBuilder setName(String name) {
        addressTypeArrayItem.setName(name);
        return this;
    }

    public AddressTypeArrayItemBuilder setUseCode(String useCode) {
        addressTypeArrayItem.setUseCode(useCode);
        return this;
    }

    public AddressTypeArrayItemBuilder setPreference(BigInteger preference) {
        addressTypeArrayItem.setPreference(preference);
        return this;
    }

    public AddressTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        addressTypeArrayItem.setAvailablePeriod(availablePeriod);
        return this;
    }

    public AddressTypeArray.Item createItem() {
        return addressTypeArrayItem;
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