package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmailTypeArray;

import java.util.ArrayList;
import java.util.List;

public class EmailTypeArrayBuilder {
    private EmailTypeArray emailTypeArray = new EmailTypeArray();
    private List<EmailTypeArray.Item> item;

    public EmailTypeArrayBuilder setItem(List<EmailTypeArray.Item> item) {
        emailTypeArray.getItem().addAll(item);
        return this;
    }

    public EmailTypeArray build() {
        return emailTypeArray;
    }

    public EmailTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<EmailTypeArray.Item> list = new ArrayList<>();
        list.add(new EmailTypeArrayItemBuilder().setAddress(personUppgifter.getEpostadress()).build());
        setItem(list);
        return this;
    }
}