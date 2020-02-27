package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.PhoneType;

public class PhoneTypeBuilder {
    private String countryDialingCode;
    private String areaDialingCode;
    private String dialNumber;
    private String phoneExtension;
    private String access;
    private String formattedNumber;

    public PhoneTypeBuilder setCountryDialingCode(String countryDialingCode) {
        this.countryDialingCode = countryDialingCode;
        return this;
    }

    public PhoneTypeBuilder setAreaDialingCode(String areaDialingCode) {
        this.areaDialingCode = areaDialingCode;
        return this;
    }

    public PhoneTypeBuilder setDialNumber(String dialNumber) {
        this.dialNumber = dialNumber;
        return this;
    }

    public PhoneTypeBuilder setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
        return this;
    }

    public PhoneTypeBuilder setAccess(String access) {
        this.access = access;
        return this;
    }

    public PhoneTypeBuilder setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        return this;
    }

    public PhoneType createPhoneType() {
        return new PhoneType(countryDialingCode, areaDialingCode, dialNumber, phoneExtension, access, formattedNumber);
    }
}