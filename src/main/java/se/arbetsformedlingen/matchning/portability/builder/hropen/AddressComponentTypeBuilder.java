package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.AddressComponentType;

public class AddressComponentTypeBuilder {
    private AddressComponentType addressComponentType = new AddressComponentType();

    public AddressComponentTypeBuilder setType(String type) {
        addressComponentType.setType(type);
        return this;
    }

    public AddressComponentTypeBuilder setValue(String value) {
        addressComponentType.setValue(value);
        return this;
    }

    public AddressComponentType build() {
        return addressComponentType;
    }
}