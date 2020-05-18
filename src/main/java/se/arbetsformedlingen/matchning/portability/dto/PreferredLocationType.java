package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferredLocationType", propOrder = {

})
public class PreferredLocationType {

    protected MeasureType maximumCommuteDuration;
    protected MeasureType maximumCommuteDistance;
    protected AddressType referenceLocation;

    public MeasureType getMaximumCommuteDuration() {
        return maximumCommuteDuration;
    }

    public void setMaximumCommuteDuration(MeasureType maximumCommuteDuration) {
        this.maximumCommuteDuration = maximumCommuteDuration;
    }

    public MeasureType getMaximumCommuteDistance() {
        return maximumCommuteDistance;
    }

    public void setMaximumCommuteDistance(MeasureType maximumCommuteDistance) {
        this.maximumCommuteDistance = maximumCommuteDistance;
    }

    public AddressType getReferenceLocation() {
        return referenceLocation;
    }

    public void setReferenceLocation(AddressType referenceLocation) {
        this.referenceLocation = referenceLocation;
    }
}
