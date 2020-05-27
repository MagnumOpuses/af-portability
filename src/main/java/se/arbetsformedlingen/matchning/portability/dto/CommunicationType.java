package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationType", propOrder = {

})
public class CommunicationType {

    public List<AddressType> address;
    public List<PhoneType> phone;
    public List<EmailType> email;
    public List<WebType> web;


    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    public void setAddress(List<AddressType> address) {
        this.address = address;
    }

    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    public void setPhone(List<PhoneType> phone) {
        this.phone = phone;
    }

    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    public void setEmail(List<EmailType> email) {
        this.email = email;
    }

    public List<WebType> getWeb() {
        if (web == null) {
            web = new ArrayList<WebType>();
        }
        return this.web;
    }

    public void setWeb(List<WebType> web) {
        this.web = web;
    }
}