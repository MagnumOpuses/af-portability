package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeasureType {

    @XmlElement(required = true)
    protected BigDecimal value;
    protected UnitCodeList unitCode;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(final BigDecimal value) {
        this.value = value;
    }

    public UnitCodeList getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(final UnitCodeList unitCode) {
        this.unitCode = unitCode;
    }
}
