package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.Sink;

import java.util.List;

public class SinkBuilder {
    private Sink sinkBuilder = new Sink();

    public SinkBuilder setSinkId(String sinkId) {
        sinkBuilder.setSinkId(sinkId);
        return this;
    }

    public SinkBuilder setSinkName(String sinkName) {
        sinkBuilder.setSinkName(sinkName);
        return this;
    }


    public SinkBuilder setPurposeOfUse(List<String> purposeOfUse) {
        sinkBuilder.setPurposeOfUse(purposeOfUse);
        return this;
    }

    public Sink build() {
        return sinkBuilder;
    }
}