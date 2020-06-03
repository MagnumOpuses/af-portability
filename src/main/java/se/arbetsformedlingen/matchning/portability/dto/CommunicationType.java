package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommunicationType {

    public List<AddressTypeArray> address;
    public List<PhoneTypeArray> phone;
    public List<EmailTypeArray> email;
    public List<WebTypeArray> web;


    public List<AddressTypeArray> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    public void setAddress(final List<AddressTypeArray> address) {
        this.address = address;
    }

    public List<PhoneTypeArray> getPhone() {
        if (phone == null) {
            phone = new ArrayList<>();
        }
        return phone;
    }

    public void setPhone(final List<PhoneTypeArray> phone) {
        this.phone = phone;
    }

    public List<EmailTypeArray> getEmail() {
        if (email == null) {
            email = new ArrayList<>();
        }
        return this.email;
    }

    public void setEmail(final List<EmailTypeArray> email) {
        this.email = email;
    }

    public List<WebTypeArray> getWeb() {
        if (web == null) {
            web = new ArrayList<>();
        }
        return this.web;
    }

    public void setWeb(final List<WebTypeArray> web) {
        this.web = web;
    }
}