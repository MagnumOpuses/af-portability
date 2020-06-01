package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreTextType", propOrder = {

})
public class ScoreTextType {

    @XmlElement(required = true)
    protected String value;
    protected String scoreTextCode;
    protected String minimum;
    protected String maximum;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getScoreTextCode() {
        return scoreTextCode;
    }

    public void setScoreTextCode(String scoreTextCode) {
        this.scoreTextCode = scoreTextCode;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }
}
