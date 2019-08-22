package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.management.AttributeList;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Communication {
    private List<Address> address;
    private List<Phone> phone;
    private List<Email> email;
    private List<Web> web;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public List<Web> getWeb() {
        return web;
    }

    public void setWeb(List<Web> web) {
        this.web = web;
    }

    /* Conveniance methods */
    public void addEmail(String emailAddress) {
        addEmail(emailAddress, null);
    }

    public void addEmail(String emailAddress, String useCode) {
        Email email= new Email();
        email.setAddress(emailAddress);
        email.setUseCode(useCode);
        email.setPreference(createGetEmail().size()+1);
        createGetEmail().add(email);
    }

    public void addPhone(String phoneNumber) {
        addPhone(phoneNumber, null);
    }

    public void addPhone(String phoneNumber, String useCode) {
        Phone phone = new Phone();
        phone.setFormattedNumber(phoneNumber);
        phone.setUseCode(useCode);
        phone.setPreference(createGetPhone().size()+1);
        createGetPhone().add(phone);
    }

    public void addAddrees(String type, String street1, String street2, String postalCode, String city, String land) {
        Address address = new Address();
        address.setUseCode(type);
        address.setLine1(street1);
        address.setLine2(street2);
        address.setPostalCode(postalCode);
        address.setCity(city);
        address.setCountryCode(land);
        createGetAddress().add(address);
    }

    public void addWeb(String hemsida) {
        Web web = new Web();
        try {
            web.setUrl(new URL(hemsida));
        } catch (MalformedURLException e) {
            web.setName(hemsida);
        }
        createGetWeb().add(web);
    }

    /* Create-get-methods */
    private List<Address> createGetAddress() {
        if (this.address == null) {
           this.address = new ArrayList<Address>();
        }
        return this.address;
    }

    private List<Email> createGetEmail() {
        if (this.email == null) {
            this.email = new ArrayList<>();
        }
        return this.email;
    }

    private List<Phone> createGetPhone() {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        return this.phone;
    }

    private List<Web> createGetWeb() {
        if (this.web == null) {
            this.web = new ArrayList<>();
        }
        return this.web;
    }

}
