package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.builder.AddressTypeArrayBuilder;
import se.arbetsformedlingen.matchning.portability.builder.EmailTypeArrayBuilder;
import se.arbetsformedlingen.matchning.portability.builder.PhoneTypeArrayBuilder;
import se.arbetsformedlingen.matchning.portability.builder.WebTypeArrayBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.util.List;

public class CommunicationTypeBuilder {
    private CommunicationType communicationType = new

    public CommunicationTypeBuilder setAddress(List<AddressType> address) {
        communicationType.address = address;
        return this;
    }

    public CommunicationTypeBuilder setPhone(List<PhoneType> phone) {
        communicationType.phone = phone;
        return this;
    }

    public CommunicationTypeBuilder setEmail(List<EmailType> email) {
        communicationType.email = email;
        return this;
    }

    public CommunicationTypeBuilder setWeb(List<WebType> web) {
        communicationType.web = web;
        return this;
    }

    public CommunicationType build() {
        return communicationType;
    }

    public se.arbetsformedlingen.matchning.portability.builder.CommunicationTypeBuilder withPersonUppgifter(PersonUppgifter personUppgifter) {
        setAddress(new AddressTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setPhone(new PhoneTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setEmail(new EmailTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setWeb(new WebTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        return this;
    }}