package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

public class CommunicationTypeBuilder {
    private CommunicationType communicationType = new se.arbetsformedlingen.matchning.portability.dto.CommunicationTypeBuilder().createCommunicationType();

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

    public CommunicationTypeBuilder setWeb(WebType web) {
        communicationType.getWeb(web);
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