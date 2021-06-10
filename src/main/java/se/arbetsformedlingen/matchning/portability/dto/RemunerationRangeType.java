package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemunerationRangeType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemunerationRangeType {

    protected PayTypeCodeList typeCode;
    protected AmountType referenceAmount;
    protected AmountType minimumAmount;
    protected AmountType maximumAmount;
    protected PayRateIntervalCodeList intervalCode;

    public PayTypeCodeList getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(final PayTypeCodeList typeCode) {
        this.typeCode = typeCode;
    }

    public AmountType getReferenceAmount() {
        return referenceAmount;
    }

    public void setReferenceAmount(final AmountType referenceAmount) {
        this.referenceAmount = referenceAmount;
    }

    public AmountType getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(final AmountType minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public AmountType getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(final AmountType maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public PayRateIntervalCodeList getIntervalCode() {
        return intervalCode;
    }

    public void setIntervalCode(final PayRateIntervalCodeList intervalCode) {
        this.intervalCode = intervalCode;
    }
}
