package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmailTypeArray;
import se.arbetsformedlingen.matchning.portability.model.hropen.PhoneTypeArray;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EmailTypeArrayBuilder {
    private List<EmailTypeArray.Item> item;

    public EmailTypeArrayBuilder setItem(List<EmailTypeArray.Item> item) {
        this.item = item;
        return this;
    }

    public EmailTypeArray createEmailTypeArray() {
        return new EmailTypeArray(item);
    }

    public EmailTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<EmailTypeArray.Item> list = new ArrayList<>();
        list.add(new EmailTypeArrayItemBuilder().setAddress(personUppgifter.getAdress()).createItem());
        setItem(list);
        return this;
    }
}