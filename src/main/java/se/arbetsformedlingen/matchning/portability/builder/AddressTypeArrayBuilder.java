package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.AddressTypeArray;

import java.util.ArrayList;
import java.util.List;

public class AddressTypeArrayBuilder {
    private AddressTypeArray addressTypeArray = new AddressTypeArray();

    public AddressTypeArrayBuilder setItem(List<AddressTypeArray.Item> item) {
        addressTypeArray.getItem().addAll(item);
        return this;
    }

    public AddressTypeArray build() {
        return addressTypeArray;
    }

    public AddressTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<AddressTypeArray.Item> list = new ArrayList<>();
        list.add(new AddressTypeArrayItemBuilder().withPersonUppgifter(personUppgifter).build());
        setItem(list);
        return this;
    }
}