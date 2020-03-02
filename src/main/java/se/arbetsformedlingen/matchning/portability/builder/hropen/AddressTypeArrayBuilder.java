package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressComponentType;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressTypeArray;

import java.util.ArrayList;
import java.util.List;

public class AddressTypeArrayBuilder {
    private AddressTypeArray addressTypeArray = new AddressTypeArray();

    public AddressTypeArrayBuilder setItem(List<AddressTypeArray.Item> item) {
        addressTypeArray.getItem().addAll(item);
        return this;
    }

    public AddressTypeArray createAddressTypeArray() {
        return addressTypeArray;
    }

    public AddressTypeArrayBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<AddressTypeArray.Item> list = new ArrayList<>();
        list.add(new AddressTypeArrayItemBuilder().withPersonUppgifter(personUppgifter).createItem());
        setItem(list);
        return this;
    }
}