package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
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
        return address;
    }

    public void setAddress(List<AddressType> address) {
        this.address = address;
    }

    public List<PhoneType> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneType> phone) {
        this.phone = phone;
    }

    public List<EmailType> getEmail() {
        return email;
    }

    public void setEmail(List<EmailType> email) {
        this.email = email;
    }

    public List<WebType> getWeb() {
        return web;
    }

    public void setWeb(List<WebType> web) {
        this.web = web;
    }
}