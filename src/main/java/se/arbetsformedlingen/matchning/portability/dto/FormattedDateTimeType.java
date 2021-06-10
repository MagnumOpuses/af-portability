package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormattedDateTimeType {
    protected String start;
    protected String end;

    public String getStart() {
        return start;
    }

    public void setStart(final String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(final String end) {
        this.end = end;
    }
}
