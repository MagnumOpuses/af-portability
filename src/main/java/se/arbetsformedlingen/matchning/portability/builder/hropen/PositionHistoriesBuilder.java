package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmployerHistoryType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EntityType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PositionHistoryType;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.util.ArrayList;
import java.util.List;

public class PositionHistoriesBuilder {
    private EmployerHistoryType.PositionHistories employerHistoryTypePositionHistories = new EmployerHistoryType.PositionHistories();

    public PositionHistoriesBuilder setItem(List<PositionHistoryType> item) {
        employerHistoryTypePositionHistories.getItem().addAll(item);
        return this;
    }

    public EmployerHistoryType.PositionHistories createPositionHistories() {
        return employerHistoryTypePositionHistories;
    }

    public PositionHistoriesBuilder withCodes(String valueOf) {
        List<PositionHistoryType> list = new ArrayList<>();
        List<EntityType> entityList = new ArrayList<>();

        EntityType entityType = new EntityTypeBuilder()
                .setId(new IdentifierTypeBuilder()
                        .setValue(valueOf).createIdentifierType())
                .setName(String.valueOf(Concept.EntityType.jobterm)).createEntityType();

        entityList.add(entityType);
        list.add(new PositionHistoryTypeBuilder()
                .setJobLevels(new JobLevelsBuilder().setItem(entityList)
                        .createJobLevels()).createPositionHistoryType());
        return this;
    }


    public PositionHistoriesBuilder withAnstallning(Anstallning anstallning) {
        List<PositionHistoryType> list = new ArrayList<>();

        list.add(new PositionHistoryTypeBuilder().setTitle(anstallning.getRubrik()).createPositionHistoryType());
        setItem(list);
        return this;
    }
}