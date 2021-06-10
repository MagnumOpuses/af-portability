package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelocationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelocationType {

    protected Boolean willingToRelocateIndicator;
    protected List<String> descriptions;

    public Boolean getWillingToRelocateIndicator() {
        return willingToRelocateIndicator;
    }

    public void setWillingToRelocateIndicator(final Boolean willingToRelocateIndicator) {
        this.willingToRelocateIndicator = willingToRelocateIndicator;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
