package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;

public class EmailTypeArrayBuilder {
    private final EmailTypeArray emailTypeArray = new EmailTypeArray();

    public EmailTypeArrayBuilder setAddress(final String address) {
        emailTypeArray.setAddress(address);
        return this;
    }

    public EmailTypeArrayBuilder setName(final String name) {
        emailTypeArray.setName(name);
        return this;
    }

    public EmailTypeArrayBuilder setUseCode(final String useCode) {
        emailTypeArray.setUseCode(useCode);
        return this;
    }

    public EmailTypeArrayBuilder setPreference(final BigInteger preference) {
        emailTypeArray.setPreference(preference);
        return this;
    }

    public EmailTypeArrayBuilder setAvailablePeriod(final DateTimePeriodType availablePeriod) {
        emailTypeArray.setAvailablePeriod(availablePeriod);
        return this;
    }

    public EmailTypeArray build() {
        return emailTypeArray;
    }
}