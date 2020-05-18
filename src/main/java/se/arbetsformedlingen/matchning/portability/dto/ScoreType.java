package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreType", propOrder = {

})
public class ScoreType {

    protected List<ScoreNumericType> scoresNumeric;
    protected List<ScoreTextType> scoresText;
    protected XMLGregorianCalendar validFrom;
    protected XMLGregorianCalendar validTo;

    public List<ScoreNumericType> getScoresNumeric() {
        if (scoresNumeric == null) {
            scoresNumeric = new ArrayList<ScoreNumericType>();
        }
        return this.scoresNumeric;
    }

    public List<ScoreTextType> getScoresText() {
        if (scoresText == null) {
            scoresText = new ArrayList<ScoreTextType>();
        }
        return this.scoresText;
    }

    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(XMLGregorianCalendar validFrom) {
        this.validFrom = validFrom;
    }

    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    public void setValidTo(XMLGregorianCalendar validTo) {
        this.validTo = validTo;
    }
}
