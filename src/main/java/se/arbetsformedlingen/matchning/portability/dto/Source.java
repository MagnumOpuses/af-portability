package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;

public class Source {
    public String sourceId;
    public String sourceName;
    public List<String> termsAndConditions;


    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public List<String> getTermsAndConditions() {

        if (termsAndConditions == null) {
            termsAndConditions = new ArrayList<String>();
        }
        return this.termsAndConditions;
    }

    public void setTermsAndConditions(List<String> termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }
}
