package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.AddressComponentType;

public class AddressComponentTypeBuilder {
    private String type;
    private String value;

    public AddressComponentTypeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public AddressComponentTypeBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public AddressComponentType createAddressComponentType() {
        return new AddressComponentType(type, value);
    }
}