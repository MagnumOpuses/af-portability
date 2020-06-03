package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelType", propOrder = {

})
public class TravelType {

    protected Boolean willingToTravelIndicator;
    protected BigDecimal percentage;
    protected List<String> descriptions;


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

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
