package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeoType {

    @XmlElement(required = true)
    protected BigDecimal latitude;
    @XmlElement(required = true)
    protected BigDecimal longitude;
    protected MeasureType altitude;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(final BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(final BigDecimal longitude) {
        this.longitude = longitude;
    }

    public MeasureType getAltitude() {
        return altitude;
    }

    public void setAltitude(final MeasureType altitude) {
        this.altitude = altitude;
    }
}
