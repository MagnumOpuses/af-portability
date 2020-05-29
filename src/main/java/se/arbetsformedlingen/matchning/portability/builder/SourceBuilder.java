package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.Source;

import java.util.List;

public class SourceBuilder {
    private Source source = new Source();
    private List<String> termsAndConditions;

    public SourceBuilder setSourceId(String sourceId) {
       source.setSourceId(sourceId);
        return this;
    }

    public SourceBuilder setSourceName(String sourceName) {
        source.setSourceName(sourceName);
        return this;
    }

    public SourceBuilder setSourceDescription(String sourceDescription) {
        source.setSourceDescription(sourceDescription);
        return this;
    }

    public SourceBuilder setTermsAndConditions(List<String> termsAndConditions) {
        source.setTermsAndConditions(termsAndConditions);
        return this;
    }

    public Source createSource() {
        return source;
    }
}