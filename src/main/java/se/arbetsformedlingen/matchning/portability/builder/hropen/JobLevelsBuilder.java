package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EntityType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PositionHistoryType;

import java.util.List;

public class JobLevelsBuilder {
    private List<EntityType> item;

    public JobLevelsBuilder setItem(List<EntityType> item) {
        this.item = item;
        return this;
    }

    public PositionHistoryType.JobLevels createJobLevels() {
        return new PositionHistoryType.JobLevels(item);
    }
}