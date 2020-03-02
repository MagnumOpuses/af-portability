package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.DateTimePeriodType;
import se.arbetsformedlingen.matchning.portability.model.hropen.WebTypeArray;

import java.math.BigInteger;

public class WebTypeArrayItemBuilder {
    private WebTypeArray.Item webTypeArrayItem = new WebTypeArray.Item();

    public WebTypeArrayItemBuilder setUrl(String url) {
        webTypeArrayItem.setUrl(url);
        return this;
    }

    public WebTypeArrayItemBuilder setName(String name) {
        webTypeArrayItem.setName(name);
        return this;
    }

    public WebTypeArrayItemBuilder setUseCode(String useCode) {
        webTypeArrayItem.setUseCode(useCode);
        return this;
    }

    public WebTypeArrayItemBuilder setPreference(BigInteger preference) {
        webTypeArrayItem.setPreference(preference);
        return this;
    }

    public WebTypeArrayItemBuilder setAvailablePeriod(DateTimePeriodType availablePeriod) {
        webTypeArrayItem.setAvailablePeriod(availablePeriod);
        return this;
    }

    public WebTypeArray.Item build() {
        return webTypeArrayItem;
    }
}