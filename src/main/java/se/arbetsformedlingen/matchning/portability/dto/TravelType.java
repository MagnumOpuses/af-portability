package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelType {

    protected Boolean willingToTravelIndicator;
    protected BigDecimal percentage;
    protected List<String> descriptions;


    public Boolean getWillingToTravelIndicator() {
        return willingToTravelIndicator;
    }

    public void setWillingToTravelIndicator(final Boolean willingToTravelIndicator) {
        this.willingToTravelIndicator = willingToTravelIndicator;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(final BigDecimal percentage) {
        this.percentage = percentage;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
