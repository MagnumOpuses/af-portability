package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Kompetens;
import se.arbetsformedlingen.matchning.portability.model.asp.PersonUppgifter;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmailTypeArray;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.util.ArrayList;
import java.util.List;

public class QualificationsBuilder {
    private List<PersonCompetencyType> item;

    public QualificationsBuilder setItem(List<PersonCompetencyType> item) {
        this.item = item;
        return this;
    }

    public CandidateProfileType.Qualifications createQualifications() {
        return new CandidateProfileType.Qualifications(item);
    }

    public QualificationsBuilder withKompetenser(List<Kompetens> kompetenser) {
        List<PersonCompetencyType> list = new ArrayList<>();
        for(Kompetens kompetens : kompetenser){
            list.add(new PersonCompetencyTypeBuilder()
                    .setCompetencyIds(new CompetencyIdsBuilder()
                            .withCompetencyId(String.valueOf(kompetens.getTaxonomiId()))
                            .createCompetencyIds())
                    .setDescription(String.valueOf(Concept.EntityType.skill))
                    .createPersonCompetencyType());
        }
        setItem(list);
        return this;
    }

}