package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.PhoneType;

public class PhoneTypeBuilder {
    private PhoneType phoneType = new PhoneType();


    public PhoneTypeBuilder setCountryDialingCode(String countryDialingCode) {
        phoneType.countryDialingCode = countryDialingCode;
        return this;
    }

    public PhoneTypeBuilder setAreaDialingCode(String areaDialingCode) {
        phoneType.areaDialingCode = areaDialingCode;
        return this;
    }

    public PhoneTypeBuilder setDialNumber(String dialNumber) {
        phoneType.dialNumber = dialNumber;
        return this;
    }

    public PhoneTypeBuilder setPhoneExtension(String phoneExtension) {
        phoneType.phoneExtension = phoneExtension;
        return this;
    }

    public PhoneTypeBuilder setAccess(String access) {
        phoneType.access = access;
        return this;
    }

    public PhoneTypeBuilder setFormattedNumber(String formattedNumber) {
        phoneType.formattedNumber = formattedNumber;
        return this;
    }

    public PhoneType build() {
        return phoneType;
    }
}