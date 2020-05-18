package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelType", propOrder = {

})
public class TravelType {

    protected Boolean willingToTravelIndicator;
    protected BigDecimal percentage;
    protected StringTypeArray descriptions;


    public Boolean getWillingToTravelIndicator() {
        return willingToTravelIndicator;
    }

    public void setWillingToTravelIndicator(Boolean willingToTravelIndicator) {
        this.willingToTravelIndicator = willingToTravelIndicator;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }
}
