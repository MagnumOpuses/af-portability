package se.arbetsformedlingen.matchning.portability.dto;

public class AddressComponentTypeBuilder {
    private AddressComponentType addressComponentType = new AddressComponentType();

    public AddressComponentTypeBuilder setType(String type) {
        addressComponentType.type = type;
        return this;
    }

    public AddressComponentTypeBuilder setValue(String value) {
        addressComponentType.value = value;
        return this;
    }

    public AddressComponentType build() {
        return addressComponentType;
    }
}