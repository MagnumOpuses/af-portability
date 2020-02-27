package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressComponentType;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressType;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressTypeArray;

import java.util.ArrayList;
import java.util.List;

public class ExtendedLinesBuilder {
    private List<AddressComponentType> addressComponentTypeList;

    public ExtendedLinesBuilder setAddressComponentTypeList(List<AddressComponentType> item) {
        this.addressComponentTypeList = item;
        return this;
    }

    public AddressTypeArray.Item.ExtendedLines createExtendedLines() {
        return new AddressTypeArray.Item.ExtendedLines(addressComponentTypeList);
    }


    public ExtendedLinesBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<AddressComponentType> list = new ArrayList<>();
        AddressComponentType addressComponentType = new AddressComponentTypeBuilder().setValue(personUppgifter.getCo()).createAddressComponentType();
        list.add(addressComponentType);
        setAddressComponentTypeList(list);
        return this;
    }
}