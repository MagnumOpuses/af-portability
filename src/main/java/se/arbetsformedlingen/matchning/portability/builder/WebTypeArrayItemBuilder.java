package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.WebType;
import se.arbetsformedlingen.matchning.portability.dto.WebTypeBuilder;

public class WebTypeArrayItemBuilder {
    private WebType webType = new WebTypeBuilder().createWebType();

    public WebTypeArrayItemBuilder setUrl(String url) {
        webType.setUrl(url);
        return this;
    }

    public WebType build() {
        return webType;
    }
}