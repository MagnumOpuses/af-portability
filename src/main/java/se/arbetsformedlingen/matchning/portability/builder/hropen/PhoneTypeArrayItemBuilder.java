package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PhoneTypeArray;

import java.math.BigInteger;

public class PhoneTypeArrayItemBuilder {
    private String countryDialingCode;
    private String areaDialingCode;
    private String dialNumber;
    private String phoneExtension;
    private String access;
    private String formattedNumber;
    private String name;
    private String useCode;
    private BigInteger preference;
    private DateTimePeriodType availablePeriod;

    public PhoneTypeArrayItemBuilder setCountryDialingCode(String countryDialingCode) {
        this.countryDialingCode = countryDialingCode;
        return this;
    }

    public PhoneTypeArrayItemBuilder setAreaDialingCode(String areaDialingCode) {
        this.areaDialingCode = areaDialingCode;
        return this;
    }

    public PhoneTypeArrayItemBuilder setDialNumber(String dialNumber) {
        this.dialNumber = dialNumber;
        return this;
    }

    public PhoneTypeArrayItemBuilder setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
        return this;
    }

    public PhoneTypeArrayItemBuilder setAccess(String access) {
        this.access = access;
        return this;
    }

    public PhoneTypeArrayItemBuilder setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        return this;
    }

    public PhoneTypeArrayItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneTypeArrayItemBuilder setUseCode(String useCode) {
        this.useCode = useCode;
        return this;
    }

    public PhoneTypeArrayItemBuilder setPreference(BigInteger preference) {
        this.preference = preference;
        return this;
    }

    public PhoneTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        this.availablePeriod = availablePeriod;
        return this;
    }

    public PhoneTypeArray.Item createItem() {
        return new PhoneTypeArray.Item(countryDialingCode, areaDialingCode, dialNumber, phoneExtension, access, formattedNumber, name, useCode, preference, availablePeriod);
    }
}