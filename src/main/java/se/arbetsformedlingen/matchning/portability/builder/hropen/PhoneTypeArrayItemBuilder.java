package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PhoneTypeArray;

import java.math.BigInteger;

public class PhoneTypeArrayItemBuilder {
    private PhoneTypeArray.Item phoneTypeArrayItem = new PhoneTypeArray.Item();

    public PhoneTypeArrayItemBuilder setCountryDialingCode(String countryDialingCode) {
        phoneTypeArrayItem.setCountryDialingCode(countryDialingCode);
        return this;
    }

    public PhoneTypeArrayItemBuilder setAreaDialingCode(String areaDialingCode) {
        phoneTypeArrayItem.setAreaDialingCode(areaDialingCode);
        return this;
    }

    public PhoneTypeArrayItemBuilder setDialNumber(String dialNumber) {
        phoneTypeArrayItem.setDialNumber(dialNumber);
        return this;
    }

    public PhoneTypeArrayItemBuilder setPhoneExtension(String phoneExtension) {
        phoneTypeArrayItem.setPhoneExtension(phoneExtension);
        return this;
    }

    public PhoneTypeArrayItemBuilder setAccess(String access) {
        phoneTypeArrayItem.setAccess(access);
        return this;
    }

    public PhoneTypeArrayItemBuilder setFormattedNumber(String formattedNumber) {
        phoneTypeArrayItem.setFormattedNumber(formattedNumber);
        return this;
    }

    public PhoneTypeArrayItemBuilder setName(String name) {
        phoneTypeArrayItem.setName(name);
        return this;
    }

    public PhoneTypeArrayItemBuilder setUseCode(String useCode) {
        phoneTypeArrayItem.setUseCode(useCode);
        return this;
    }

    public PhoneTypeArrayItemBuilder setPreference(BigInteger preference) {
        phoneTypeArrayItem.setPreference(preference);
        return this;
    }

    public PhoneTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        phoneTypeArrayItem.setAvailablePeriod(availablePeriod);
        return this;
    }

    public PhoneTypeArray.Item createItem() {
        return phoneTypeArrayItem;
    }
}