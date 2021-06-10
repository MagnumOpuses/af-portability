package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Source {
    public String sourceId;
    public String sourceName;
    public List<String> termsAndConditions;


    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(final String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(final String sourceName) {
        this.sourceName = sourceName;
    }

    public List<String> getTermsAndConditions() {

        if (termsAndConditions == null) {
            termsAndConditions = new ArrayList<String>();
        }
        return this.termsAndConditions;
    }

    public void setTermsAndConditions(final List<String> termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }
}
