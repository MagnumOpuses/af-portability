package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneTypeArray")
public class PhoneTypeArray {
    public String countryDialingCode;
    public String areaDialingCode;
    public String dialNumber;
    public String phoneExtension;
    public String access;
    @XmlElement(required = true)
    public String formattedNumber;
    public String name;
    public String useCode;
    public BigInteger preference;
    public DateTimePeriodType availablePeriod;

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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUseCode() {
        return useCode;
    }

    public void setUseCode(final String useCode) {
        this.useCode = useCode;
    }

    public BigInteger getPreference() {
        return preference;
    }

    public void setPreference(final BigInteger preference) {
        this.preference = preference;
    }

    public DateTimePeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    public void setAvailablePeriod(final DateTimePeriodType availablePeriod) {
        this.availablePeriod = availablePeriod;
    }
}
