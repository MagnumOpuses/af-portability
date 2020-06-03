package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveTimePeriodType", propOrder = {

})
public class EffectiveTimePeriodType {

    @JsonSerialize(using = DateTimeType.DateTypeSerializer.class)
    @JsonDeserialize(using = DateTimeType.DateTypeDeserializer.class)
    protected DateTimeType validFrom;
    @JsonSerialize(using = DateTimeType.DateTypeSerializer.class)
    @JsonDeserialize(using = DateTimeType.DateTypeDeserializer.class)
    protected DateTimeType validTo;

    public DateTimeType getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(final DateTimeType validFrom) {
        this.validFrom = validFrom;
    }

    public DateTimeType getValidTo() {
        return validTo;
    }

    public void setValidTo(final DateTimeType validTo) {
        this.validTo = validTo;
    }
}
