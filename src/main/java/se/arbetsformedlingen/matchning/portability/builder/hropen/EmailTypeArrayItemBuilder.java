package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmailTypeArray;

import java.math.BigInteger;

public class EmailTypeArrayItemBuilder {
    private String address;
    private String name;
    private String useCode;
    private BigInteger preference;
    private DateTimePeriodType availablePeriod;

    public EmailTypeArrayItemBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmailTypeArrayItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmailTypeArrayItemBuilder setUseCode(String useCode) {
        this.useCode = useCode;
        return this;
    }

    public EmailTypeArrayItemBuilder setPreference(BigInteger preference) {
        this.preference = preference;
        return this;
    }

    public EmailTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        this.availablePeriod = availablePeriod;
        return this;
    }

    public EmailTypeArray.Item createItem() {
        return new EmailTypeArray.Item(address, name, useCode, preference, availablePeriod);
    }
}