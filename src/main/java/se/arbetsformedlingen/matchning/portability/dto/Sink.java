package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;

public class Sink {
    public String sinkId;
    public String sinkName;
    public String sourceDescription;
    public List<String> purposeOfUse;


    public String getSinkId() {
        return sinkId;
    }

    public void setSinkId(String sinkId) {
        this.sinkId = sinkId;
    }

    public String getSinkName() {
        return sinkName;
    }

    public void setSinkName(String sinkName) {
        this.sinkName = sinkName;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public List<String> getPurposeOfUse() {
        if (purposeOfUse == null) {
            purposeOfUse = new ArrayList<String>();
        }
        return this.purposeOfUse;
    }

    public void setPurposeOfUse(List<String> purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }
}
