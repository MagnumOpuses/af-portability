package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebTypeArray")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebTypeArray {

    @XmlElement(required = true)
    protected String url;
    protected String name;
    protected String useCode;
    protected BigInteger preference;
    protected DateTimePeriodType availablePeriod;

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
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
