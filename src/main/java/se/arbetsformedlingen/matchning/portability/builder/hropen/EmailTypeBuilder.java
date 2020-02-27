package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EmailType;

public class EmailTypeBuilder {
    private String address;

    public EmailTypeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmailType createEmailType() {
        return new EmailType(address);
    }
}