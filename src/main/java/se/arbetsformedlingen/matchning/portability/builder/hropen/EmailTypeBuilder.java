package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EmailType;

public class EmailTypeBuilder {
    private EmailType emailType = new EmailType();

    public EmailTypeBuilder setAddress(String address) {
        emailType.setAddress(address);
        return this;
    }

    public EmailType createEmailType() {
        return emailType;
    }
}