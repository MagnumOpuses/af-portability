package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressComponentType;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressType;
import se.arbetsformedlingen.matchning.portability.model.hropen.AddressTypeArray;

import java.util.ArrayList;
import java.util.List;

public class ExtendedLinesBuilder {

    private AddressTypeArray.Item.ExtendedLines extendedLines = new AddressTypeArray.Item.ExtendedLines();

    public ExtendedLinesBuilder setAddressComponentTypeList(List<AddressComponentType> item) {
        extendedLines.getItem().addAll(item);
        return this;
    }

    public AddressTypeArray.Item.ExtendedLines createExtendedLines() {
        return extendedLines;
    }


    public ExtendedLinesBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<AddressComponentType> list = new ArrayList<>();
        list.add(new AddressComponentTypeBuilder().setValue(personUppgifter.getCo()).createAddressComponentType());
        setAddressComponentTypeList(list);
        return this;
    }
}