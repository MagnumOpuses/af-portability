package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreNumericType", propOrder = {

})
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

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public ScoreNumericCodeList getScoreCode() {
        return scoreCode;
    }

    public void setScoreCode(ScoreNumericCodeList scoreCode) {
        this.scoreCode = scoreCode;
    }

    public BigDecimal getInterval() {
        return interval;
    }

    public void setInterval(BigDecimal interval) {
        this.interval = interval;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(BigDecimal minimum) {
        this.minimum = minimum;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }

    public void setMaximum(BigDecimal maximum) {
        this.maximum = maximum;
    }
}
