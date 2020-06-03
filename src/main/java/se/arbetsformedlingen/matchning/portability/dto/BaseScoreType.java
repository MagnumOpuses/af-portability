package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseScoreType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseScoreType {

    protected List<ScoreNumericType> scoresNumeric;
    protected List<ScoreTextType> scoresText;

    public List<ScoreNumericType> getScoresNumeric() {
        if (scoresNumeric == null) {
            scoresNumeric = new ArrayList<ScoreNumericType>();
        }
        return this.scoresNumeric;
    }

    public void setScoresNumeric(final List<ScoreNumericType> scoresNumeric) {
        this.scoresNumeric = scoresNumeric;
    }

    public List<ScoreTextType> getScoresText() {
        if (scoresText == null) {
            scoresText = new ArrayList<ScoreTextType>();
        }
        return this.scoresText;
    }

    public void setScoresText(final List<ScoreTextType> scoresText) {
        this.scoresText = scoresText;
    }
}
