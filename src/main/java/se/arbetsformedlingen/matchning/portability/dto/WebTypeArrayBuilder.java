package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;

public class WebTypeArrayBuilder {
    private final WebTypeArray webTypeArray = new WebTypeArray();

    public WebTypeArrayBuilder setUrl(final String url) {
        webTypeArray.setUrl(url);
        return this;
    }

    public WebTypeArrayBuilder setName(final String name) {
        webTypeArray.setName(name);
        return this;
    }

    public WebTypeArrayBuilder setUseCode(final String useCode) {
        webTypeArray.setUseCode(useCode);
        return this;
    }

    public WebTypeArrayBuilder setPreference(final BigInteger preference) {
        webTypeArray.setPreference(preference);
        return this;
    }

    public WebTypeArrayBuilder setAvailablePeriod(final DateTimePeriodType availablePeriod) {
        webTypeArray.setAvailablePeriod(availablePeriod);
        return this;
    }

    public WebTypeArray build() {
        return webTypeArray;
    }
}