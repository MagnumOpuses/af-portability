package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EntityType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PositionHistoryType;

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