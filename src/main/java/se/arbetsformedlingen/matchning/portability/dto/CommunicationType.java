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

    protected List<AddressType> address;
    protected List<PhoneType> phone;
    protected List<EmailType> email;
    protected List<WebType> web;

    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    public List<WebType> getWeb() {
        if (web == null) {
            web = new ArrayList<WebType>();
        }
        return this.web;
    }
}