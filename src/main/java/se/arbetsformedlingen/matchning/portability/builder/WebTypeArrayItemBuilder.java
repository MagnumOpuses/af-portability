package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.WebType;

public class WebTypeArrayItemBuilder {
    private WebType webType = new WebType();

    public WebTypeArrayItemBuilder setUrl(String url) {
        webType.setUrl(url);
        return this;
    }

    public WebType build() {
        return webType;
    }
}