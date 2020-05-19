package se.arbetsformedlingen.matchning.portability.dto;

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