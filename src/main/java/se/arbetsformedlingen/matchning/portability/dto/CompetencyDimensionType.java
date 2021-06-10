package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetencyDimensionType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompetencyDimensionType {

    protected String dimensionType;
    protected ScoreType score;

    public String getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(final String dimensionType) {
        this.dimensionType = dimensionType;
    }

    public ScoreType getScore() {
        return score;
    }

    public void setScore(final ScoreType score) {
        this.score = score;
    }
}
