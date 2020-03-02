package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

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

    public CommunicationType createCommunicationType() {
        return communicationType;
    }

    public CommunicationTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        setAddress(new AddressTypeArrayBuilder().withPersonUppgifter(personUppgifter).createAddressTypeArray());
        setPhone(new PhoneTypeArrayBuilder().withPersonUppgifter(personUppgifter).createPhoneTypeArray());
        setEmail(new EmailTypeArrayBuilder().withPersonUppgifter(personUppgifter).createEmailTypeArray());
        setWeb(new WebTypeArrayBuilder().withPersonUppgifter(personUppgifter).createWebTypeArray());
        return this;
    }
}