package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmailTypeArray;
import se.arbetsformedlingen.matchning.portability.model.hropen.WebTypeArray;

import java.util.ArrayList;
import java.util.List;

public class WebTypeArrayBuilder {
    private List<WebTypeArray.Item> item;

    public WebTypeArrayBuilder setItem(List<WebTypeArray.Item> item) {
        this.item = item;
        return this;
    }

    public WebTypeArray createWebTypeArray() {
        return new WebTypeArray(item);
    }

    public WebTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<WebTypeArray.Item> list = new ArrayList<>();
        list.add(new WebTypeArrayItemBuilder().setUrl(personUppgifter.getAdress()).createItem());
        setItem(list);
        return this;
    }
}