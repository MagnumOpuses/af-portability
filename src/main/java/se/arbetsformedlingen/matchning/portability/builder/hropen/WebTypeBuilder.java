package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.WebType;

public class WebTypeBuilder {
    private WebType webType = new WebType();

    public WebTypeBuilder setUrl(String url) {
        webType.setUrl(url);
        return this;
    }

    public WebType build() {
        return webType;
    }
}