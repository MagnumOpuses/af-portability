package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;

import java.util.ArrayList;
import java.util.List;

public class CommunicationTypeBuilder {
    private final CommunicationType communicationType = new CommunicationType();

    public CommunicationTypeBuilder setAddress(final List<AddressTypeArray> addressTypeArray) {
        communicationType.getAddress().addAll(addressTypeArray);
        return this;
    }

    public CommunicationTypeBuilder setPhone(final List<PhoneTypeArray> phoneTypeArray) {
        communicationType.getPhone().addAll(phoneTypeArray);
        return this;
    }

    public CommunicationTypeBuilder setEmail(final List<EmailTypeArray> emailTypeArray) {
        communicationType.getEmail().addAll(emailTypeArray);
        return this;
    }

    public CommunicationTypeBuilder setWeb(final List<WebTypeArray> webTypeArray) {
        communicationType.getWeb().addAll(webTypeArray);
        return this;
    }

    public CommunicationType build() {
        return communicationType;
    }

    public CommunicationTypeBuilder withPersonUppgifter(final PersonUppgifter personUppgifter) {
        final List<AddressTypeArray> address = new ArrayList<>();
        address.add(new AddressTypeArrayBuilder().withPersonUppgifter(personUppgifter).build());
        setAddress(address);

        final List<PhoneTypeArray> phoneTypeArray = new ArrayList<>();
        phoneTypeArray.add(new PhoneTypeArrayBuilder().setFormattedNumber(personUppgifter.getTelefonnummerHem()).build());
        phoneTypeArray.add(new PhoneTypeArrayBuilder().setFormattedNumber(personUppgifter.getTelefonnummerMobil()).build());
        phoneTypeArray.add(new PhoneTypeArrayBuilder().setFormattedNumber(personUppgifter.getTelefonnummerOvrig()).build());
        setPhone(phoneTypeArray);

        final List<EmailTypeArray> email = new ArrayList<>();
        email.add(new EmailTypeArrayBuilder().setAddress(personUppgifter.getEpostadress()).build());
        setEmail(email);

        final List<WebTypeArray> web = new ArrayList<>();
        web.add(new WebTypeArrayBuilder().setUrl(personUppgifter.getHemsida()).build());
        setWeb(web);
        return this;
    }
}