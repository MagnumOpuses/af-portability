package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;

public class PhoneTypeArrayBuilder {
    private final PhoneTypeArray phoneTypeArray = new PhoneTypeArray();

    public PhoneTypeArrayBuilder setCountryDialingCode(final String countryDialingCode) {
        phoneTypeArray.setCountryDialingCode(countryDialingCode);
        return this;
    }

    public PhoneTypeArrayBuilder setAreaDialingCode(final String areaDialingCode) {
        phoneTypeArray.setAreaDialingCode(areaDialingCode);
        return this;
    }

    public PhoneTypeArrayBuilder setDialNumber(final String dialNumber) {
        phoneTypeArray.setDialNumber(dialNumber);
        return this;
    }

    public PhoneTypeArrayBuilder setPhoneExtension(final String phoneExtension) {
        phoneTypeArray.setPhoneExtension(phoneExtension);
        return this;
    }

    public PhoneTypeArrayBuilder setAccess(final String access) {
        phoneTypeArray.setAccess(access);
        return this;
    }

    public PhoneTypeArrayBuilder setFormattedNumber(final String formattedNumber) {
        phoneTypeArray.setFormattedNumber(formattedNumber);
        return this;
    }

    public PhoneTypeArrayBuilder setName(final String name) {
        phoneTypeArray.setName(name);
        return this;
    }

    public PhoneTypeArrayBuilder setUseCode(final String useCode) {
        phoneTypeArray.setUseCode(useCode);
        return this;
    }

    public PhoneTypeArrayBuilder setPreference(final BigInteger preference) {
        phoneTypeArray.setPreference(preference);
        return this;
    }

    public PhoneTypeArrayBuilder setAvailablePeriod(final DateTimePeriodType availablePeriod) {
        phoneTypeArray.setAvailablePeriod(availablePeriod);
        return this;
    }

    public PhoneTypeArray build() {
        return phoneTypeArray;
    }
}