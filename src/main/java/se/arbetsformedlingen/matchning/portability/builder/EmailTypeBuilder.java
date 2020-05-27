package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.EmailType;

public class EmailTypeBuilder {
    private EmailType emailType = new EmailType();

    public EmailTypeBuilder setAddress(String address) {
        emailType.address = address;
        return this;
    }

    public EmailType build() {
        return emailType;
    }
}