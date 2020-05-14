package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.EntityType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.PositionHistoryType;

import java.util.List;

public class JobLevelsBuilder {
    private PositionHistoryType.JobLevels jobLevels = new PositionHistoryType.JobLevels();

    public JobLevelsBuilder setItem(List<EntityType> item) {
        jobLevels.getItem().addAll(item);
        return this;
    }

    public PositionHistoryType.JobLevels build() {
        return jobLevels;
    }
}