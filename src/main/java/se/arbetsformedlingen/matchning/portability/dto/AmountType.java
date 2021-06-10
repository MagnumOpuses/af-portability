package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmountType {

    @XmlElement(required = true)
    protected BigDecimal value;
    protected CurrencyCodeList currency;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(final BigDecimal value) {
        this.value = value;
    }

    public CurrencyCodeList getCurrency() {
        return currency;
    }

    public void setCurrency(final CurrencyCodeList currency) {
        this.currency = currency;
    }
}
