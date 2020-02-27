package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.WebTypeArray;

import java.math.BigInteger;

public class WebTypeArrayItemBuilder {
    private String url;
    private String name;
    private String useCode;
    private BigInteger preference;
    private DateTimePeriodType availablePeriod;

    public WebTypeArrayItemBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public WebTypeArrayItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public WebTypeArrayItemBuilder setUseCode(String useCode) {
        this.useCode = useCode;
        return this;
    }

    public WebTypeArrayItemBuilder setPreference(BigInteger preference) {
        this.preference = preference;
        return this;
    }

    public WebTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        this.availablePeriod = availablePeriod;
        return this;
    }

    public WebTypeArray.Item createItem() {
        return new WebTypeArray.Item(url, name, useCode, preference, availablePeriod);
    }
}