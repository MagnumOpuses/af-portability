package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {

})
public class MeasureType {

    @XmlElement(required = true)
    protected BigDecimal value;
    protected UnitCodeList unitCode;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public UnitCodeList getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(UnitCodeList unitCode) {
        this.unitCode = unitCode;
    }
}
