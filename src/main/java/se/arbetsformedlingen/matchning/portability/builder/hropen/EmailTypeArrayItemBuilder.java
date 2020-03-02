package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmailTypeArray;

import java.math.BigInteger;

public class EmailTypeArrayItemBuilder {
    private EmailTypeArray.Item emailTypeArrayItem = new EmailTypeArray.Item();

    public EmailTypeArrayItemBuilder setAddress(String address) {
        emailTypeArrayItem.setAddress(address);
        return this;
    }

    public EmailTypeArrayItemBuilder setName(String name) {
        emailTypeArrayItem.setName(name);
        return this;
    }

    public EmailTypeArrayItemBuilder setUseCode(String useCode) {
        emailTypeArrayItem.setUseCode(useCode);
        return this;
    }

    public EmailTypeArrayItemBuilder setPreference(BigInteger preference) {
        emailTypeArrayItem.setPreference(preference);
        return this;
    }

    public EmailTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        emailTypeArrayItem.setAvailablePeriod(availablePeriod);
        return this;
    }


    public EmailTypeArray.Item createItem() {
        return emailTypeArrayItem;
    }
}