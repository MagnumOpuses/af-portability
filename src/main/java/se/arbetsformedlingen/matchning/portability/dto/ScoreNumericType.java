package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreNumericType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScoreNumericType {

    @XmlElement(required = true)
    protected BigDecimal value;
    protected ScoreNumericCodeList scoreCode;
    protected BigDecimal interval;
    protected BigDecimal minimum;
    protected BigDecimal maximum;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(final BigDecimal value) {
        this.value = value;
    }

    public ScoreNumericCodeList getScoreCode() {
        return scoreCode;
    }

    public void setScoreCode(final ScoreNumericCodeList scoreCode) {
        this.scoreCode = scoreCode;
    }

    public BigDecimal getInterval() {
        return interval;
    }

    public void setInterval(final BigDecimal interval) {
        this.interval = interval;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(final BigDecimal minimum) {
        this.minimum = minimum;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }

    public void setMaximum(final BigDecimal maximum) {
        this.maximum = maximum;
    }
}
