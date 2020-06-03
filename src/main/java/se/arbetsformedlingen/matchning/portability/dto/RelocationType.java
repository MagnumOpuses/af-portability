package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelocationType", propOrder = {

})
public class RelocationType {

    protected Boolean willingToRelocateIndicator;
    protected List<String> descriptions;

    public Boolean getWillingToRelocateIndicator() {
        return willingToRelocateIndicator;
    }

    public void setWillingToRelocateIndicator(Boolean willingToRelocateIndicator) {
        this.willingToRelocateIndicator = willingToRelocateIndicator;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
