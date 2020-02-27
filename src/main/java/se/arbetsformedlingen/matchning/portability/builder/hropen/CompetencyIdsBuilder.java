package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;

import java.util.List;

public class CompetencyIdsBuilder {
    private List<IdentifierType> item;

    public CompetencyIdsBuilder setItem(List<IdentifierType> item) {
        this.item = item;
        return this;
    }

    public PersonCompetencyType.CompetencyIds createCompetencyIds() {
        return new PersonCompetencyType.CompetencyIds(item);
    }
}