package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoType", propOrder = {

})
public class GeoType {

    @XmlElement(required = true)
    protected BigDecimal latitude;
    @XmlElement(required = true)
    protected BigDecimal longitude;
    protected MeasureType altitude;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public MeasureType getAltitude() {
        return altitude;
    }

    public void setAltitude(MeasureType altitude) {
        this.altitude = altitude;
    }
}
