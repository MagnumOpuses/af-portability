package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.PhoneType;

public class PhoneTypeBuilder {
    private PhoneType phoneType = new PhoneType();

    public PhoneTypeBuilder setCountryDialingCode(String countryDialingCode) {
        phoneType.setCountryDialingCode(countryDialingCode);
        return this;
    }

    public PhoneTypeBuilder setAreaDialingCode(String areaDialingCode) {
        phoneType.setAreaDialingCode(areaDialingCode);
        return this;
    }

    public PhoneTypeBuilder setDialNumber(String dialNumber) {
        phoneType.setDialNumber(dialNumber);
        return this;
    }

    public PhoneTypeBuilder setPhoneExtension(String phoneExtension) {
        phoneType.setPhoneExtension(phoneExtension);
        return this;
    }

    public PhoneTypeBuilder setAccess(String access) {
        phoneType.setAccess(access);
        return this;
    }

    public PhoneTypeBuilder setFormattedNumber(String formattedNumber) {
        phoneType.setFormattedNumber(formattedNumber);
        return this;
    }

    public PhoneType build() {
        return phoneType;
    }
}