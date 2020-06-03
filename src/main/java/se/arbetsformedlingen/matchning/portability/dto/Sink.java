package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sink {
    public String sinkId;
    public String sinkName;
    public List<String> purposeOfUse;


    public String getSinkId() {
        return sinkId;
    }

    public void setSinkId(final String sinkId) {
        this.sinkId = sinkId;
    }

    public String getSinkName() {
        return sinkName;
    }

    public void setSinkName(final String sinkName) {
        this.sinkName = sinkName;
    }

    public List<String> getPurposeOfUse() {
        if (purposeOfUse == null) {
            purposeOfUse = new ArrayList<String>();
        }
        return this.purposeOfUse;
    }

    public void setPurposeOfUse(final List<String> purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }
}
