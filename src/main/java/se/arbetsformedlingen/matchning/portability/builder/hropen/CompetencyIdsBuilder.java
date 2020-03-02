package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;

import java.util.ArrayList;
import java.util.List;

public class CompetencyIdsBuilder {
    private PersonCompetencyType.CompetencyIds competencyIds = new PersonCompetencyType.CompetencyIds();

    public CompetencyIdsBuilder setItem(List<IdentifierType> item) {
        competencyIds.getItem().addAll(item);
        return this;
    }

    public PersonCompetencyType.CompetencyIds createCompetencyIds() {
        return competencyIds;
    }


    public CompetencyIdsBuilder withCompetencyId(String identifierValue) {
        List<IdentifierType> list = new ArrayList<>();
        list.add(new IdentifierTypeBuilder().setValue(identifierValue).createIdentifierType());
        setItem(list);
        return this;
    }
}