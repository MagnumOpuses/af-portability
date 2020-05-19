package se.arbetsformedlingen.matchning.portability.dto;

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