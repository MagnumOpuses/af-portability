package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.WebTypeArray;

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
        List<WebTypeArray.Item> list = new ArrayList<>();
        list.add(new WebTypeArrayItemBuilder().setUrl(personUppgifter.getAdress()).build());
        setItem(list);
        return this;
    }
}