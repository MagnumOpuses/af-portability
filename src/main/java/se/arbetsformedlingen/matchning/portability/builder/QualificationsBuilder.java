package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.asp.Kompetens;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.PersonCompetencyType;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.util.ArrayList;
import java.util.List;

public class QualificationsBuilder {
    private CandidateProfileType.Qualifications candidateProfileTyQequalifications = new CandidateProfileType.Qualifications();

    public QualificationsBuilder setItem(List<PersonCompetencyType> item) {
        candidateProfileTyQequalifications.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType build() {
        return candidateProfileTyQequalifications;
    }

    public QualificationsBuilder withKompetenser(List<Kompetens> kompetenser) {
        List<PersonCompetencyType> list = new ArrayList<>();
        for(Kompetens kompetens : kompetenser){
            list.add(new PersonCompetencyTypeBuilder()
                    .setCompetencyIds(new CompetencyIdsBuilder()
                            .withCompetencyId(String.valueOf(kompetens.getTaxonomiId()))
                            .build())
                    .setDescription(String.valueOf(Concept.EntityType.skill))
                    .build());
        }
        setItem(list);
        return this;
    }

}