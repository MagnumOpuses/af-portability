package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationItemInclusion", propOrder = {

})
public class CommunicationItemInclusion {

    protected String name;
    protected String useCode;
    protected BigInteger preference;
    protected DateTimePeriodType availablePeriod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseCode() {
        return useCode;
    }

    public void setUseCode(String useCode) {
        this.useCode = useCode;
    }

    public BigInteger getPreference() {
        return preference;
    }

    public void setPreference(BigInteger preference) {
        this.preference = preference;
    }

    public DateTimePeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    public void setAvailablePeriod(DateTimePeriodType availablePeriod) {
        this.availablePeriod = availablePeriod;
    }
}
