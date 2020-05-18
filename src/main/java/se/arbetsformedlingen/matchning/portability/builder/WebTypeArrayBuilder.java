package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.WebTypeArray;

import java.util.ArrayList;
import java.util.List;

public class WebTypeArrayBuilder {
    private WebTypeArray webTypeArray = new WebTypeArray();

    public WebTypeArrayBuilder setItem(List<WebTypeArray.Item> item) {
        webTypeArray.getItem().addAll(item);
        return this;
    }

    public WebTypeArray build() {
        return webTypeArray;
    }

    public WebTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<WebType> list = new ArrayList<>();
        list.add(new WebTypeBuilder().setUrl(personUppgifter.getHemsida()).build());
        setItem(list);
        return this;
    }
}