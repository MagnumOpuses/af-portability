package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

public class CommunicationTypeBuilder {
    private CommunicationType communicationType = new CommunicationType();

    public CommunicationTypeBuilder setAddress(AddressTypeArray address) {
        communicationType.setAddress(address);
        return this;
    }

    public CommunicationTypeBuilder setPhone(PhoneTypeArray phone) {
        communicationType.setPhone(phone);
        return this;
    }

    public CommunicationTypeBuilder setEmail(EmailTypeArray email) {
        communicationType.setEmail(email);
        return this;
    }

    public CommunicationTypeBuilder setWeb(WebTypeArray web) {
        communicationType.setWeb(web);
        return this;
    }

    public CommunicationType build() {
        return communicationType;
    }

    public CommunicationTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        setAddress(new AddressTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setPhone(new PhoneTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setEmail(new EmailTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setWeb(new WebTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        return this;
    }
}