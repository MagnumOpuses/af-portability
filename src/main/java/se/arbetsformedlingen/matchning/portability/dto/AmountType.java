package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {

})
public class AmountType {

    @XmlElement(required = true)
    protected BigDecimal value;
    protected CurrencyCodeList currency;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public CurrencyCodeList getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyCodeList currency) {
        this.currency = currency;
    }
}
