package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetencyDimensionType", propOrder = {

})
public class CompetencyDimensionType {

    protected String dimensionType;
    protected ScoreType score;

    public String getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
    }

    public ScoreType getScore() {
        return score;
    }

    public void setScore(ScoreType score) {
        this.score = score;
    }
}
