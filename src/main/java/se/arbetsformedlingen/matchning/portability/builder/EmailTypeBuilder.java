package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.EmailType;

public class EmailTypeBuilder {
    private EmailType emailType = new EmailType();

    public EmailTypeBuilder setAddress(String address) {
        emailType.setAddress(address);
        return this;
    }

    public EmailType build() {
        return emailType;
    }
}