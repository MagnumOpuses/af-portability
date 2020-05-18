package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelocationType", propOrder = {

})
public class RelocationType {

    protected Boolean willingToRelocateIndicator;
    protected StringTypeArray descriptions;

    public Boolean getWillingToRelocateIndicator() {
        return willingToRelocateIndicator;
    }

    public void setWillingToRelocateIndicator(Boolean willingToRelocateIndicator) {
        this.willingToRelocateIndicator = willingToRelocateIndicator;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }
}
