package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Kompetens;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.PersonCompetencyType;

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
        
        return this;
    }
}