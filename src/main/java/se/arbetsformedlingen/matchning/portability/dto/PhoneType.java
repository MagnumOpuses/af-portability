package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", propOrder = {

})
public class PhoneType {

    public String countryDialingCode;
    public String areaDialingCode;
    public String dialNumber;
    public String phoneExtension;
    public String access;
    @XmlElement(required = true)
    public String formattedNumber;

    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    public void setCountryDialingCode(final String countryDialingCode) {
        this.countryDialingCode = countryDialingCode;
    }

    public String getAreaDialingCode() {
        return areaDialingCode;
    }

    public void setAreaDialingCode(final String areaDialingCode) {
        this.areaDialingCode = areaDialingCode;
    }

    public String getDialNumber() {
        return dialNumber;
    }

    public void setDialNumber(final String dialNumber) {
        this.dialNumber = dialNumber;
    }

    public String getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(final String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(final String access) {
        this.access = access;
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }

    public void setFormattedNumber(final String formattedNumber) {
        this.formattedNumber = formattedNumber;
    }
}
