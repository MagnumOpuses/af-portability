package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

public class CommunicationTypeBuilder {
    private AddressTypeArray address;
    private PhoneTypeArray phone;
    private EmailTypeArray email;
    private WebTypeArray web;

    public CommunicationTypeBuilder setAddress(AddressTypeArray address) {
        this.address = address;
        return this;
    }

    public CommunicationTypeBuilder setPhone(PhoneTypeArray phone) {
        this.phone = phone;
        return this;
    }

    public CommunicationTypeBuilder setEmail(EmailTypeArray email) {
        this.email = email;
        return this;
    }

    public CommunicationTypeBuilder setWeb(WebTypeArray web) {
        this.web = web;
        return this;
    }

    public CommunicationType createCommunicationType() {
        return new CommunicationType(address, phone, email, web);
    }

    public CommunicationTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        setAddress(new AddressTypeArrayBuilder().withPersonUppgifter(personUppgifter).createAddressTypeArray());
        setPhone(new PhoneTypeArrayBuilder().withPersonUppgifter(personUppgifter).createPhoneTypeArray());
        setEmail(new EmailTypeArrayBuilder().withPersonUppgifter(personUppgifter).createEmailTypeArray());
        setWeb(new WebTypeArrayBuilder().withPersonUppgifter(personUppgifter).createWebTypeArray());
        return this;
    }
}