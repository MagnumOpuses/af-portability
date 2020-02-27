package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.WebType;

public class WebTypeBuilder {
    private String url;

    public WebTypeBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public WebType createWebType() {
        return new WebType(url);
    }
}