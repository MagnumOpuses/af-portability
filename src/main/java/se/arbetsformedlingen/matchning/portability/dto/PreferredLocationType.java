package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferredLocationType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferredLocationType {

    public MeasureType maximumCommuteDuration;
    public MeasureType maximumCommuteDistance;
    public AddressType referenceLocation;


    public MeasureType getMaximumCommuteDuration() {
        return maximumCommuteDuration;
    }

    public void setMaximumCommuteDuration(final MeasureType maximumCommuteDuration) {
        this.maximumCommuteDuration = maximumCommuteDuration;
    }

    public MeasureType getMaximumCommuteDistance() {
        return maximumCommuteDistance;
    }

    public void setMaximumCommuteDistance(final MeasureType maximumCommuteDistance) {
        this.maximumCommuteDistance = maximumCommuteDistance;
    }

    public AddressType getReferenceLocation() {
        return referenceLocation;
    }

    public void setReferenceLocation(final AddressType referenceLocation) {
        this.referenceLocation = referenceLocation;
    }
}
