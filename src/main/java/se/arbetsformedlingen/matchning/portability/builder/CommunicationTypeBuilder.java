package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.util.ArrayList;
import java.util.List;

public class CommunicationTypeBuilder {
    private CommunicationType communicationType = new CommunicationType();

    public CommunicationTypeBuilder setAddress(List<AddressType> address) {
        communicationType.getAddress().addAll(address);
        return this;
    }

    public CommunicationTypeBuilder setPhone(List<PhoneType> phone) {
        communicationType.getPhone().addAll(phone);
        return this;
    }

    public CommunicationTypeBuilder setEmail(List<EmailType> email) {
        communicationType.getEmail().addAll(email);
        return this;
    }

    public CommunicationTypeBuilder setWeb(List<WebType> web) {
        communicationType.getWeb().addAll(web);
        return this;
    }

    public CommunicationType build() {
        return communicationType;
    }

    public CommunicationTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        List<AddressType> address = new ArrayList<>();
        address.add(new AddressTypeBuilder().withPersonUppgifter(personUppgifter).build());
        setAddress(address);

        List<PhoneType> phone = new ArrayList<>();
        phone.add(new PhoneTypeBuilder().setFormattedNumber(personUppgifter.getTelefonnummerHem()).build());
        setPhone(phone);

        List<EmailType> email = new ArrayList<>();
        email.add(new EmailTypeBuilder().setAddress(personUppgifter.getAdress()).build());
        setEmail(email);

        List<WebType> web = new ArrayList<>();
        web.add(new WebTypeBuilder().setUrl(personUppgifter.getHemsida()).build());
        setWeb(web);
        return this;
    }}