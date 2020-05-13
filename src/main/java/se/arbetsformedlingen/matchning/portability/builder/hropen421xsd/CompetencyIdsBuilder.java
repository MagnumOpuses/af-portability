package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.PersonCompetencyType;

import java.util.ArrayList;
import java.util.List;

public class CompetencyIdsBuilder {
    private PersonCompetencyType.CompetencyIds competencyIds = new PersonCompetencyType.CompetencyIds();

    public CompetencyIdsBuilder setItem(List<IdentifierType> item) {
        competencyIds.getItem().addAll(item);
        return this;
    }

    public PersonCompetencyType.CompetencyIds build() {
        return competencyIds;
    }


    public CompetencyIdsBuilder withCompetencyId(String identifierValue) {
        List<IdentifierType> list = new ArrayList<>();
        list.add(new IdentifierTypeBuilder().setValue(identifierValue).build());
        setItem(list);
        return this;
    }
}