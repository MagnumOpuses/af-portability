package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.EmployerHistoryType;

import java.util.ArrayList;
import java.util.List;

public class EmploymentBuilder {
    private CandidateProfileType.Employment employment = new CandidateProfileType.Employment();

    public EmploymentBuilder setItem(List<EmployerHistoryType> item) {
        employment.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType.Employment build() {
        return employment;
    }

    public EmploymentBuilder withCodes(String valueOf) {
        List<EmployerHistoryType> list = new ArrayList<>();
        list.add(new EmployerHistoryTypeBuilder().setPositionHistories(new PositionHistoriesBuilder().withCodes(valueOf).build()).build());
        setItem(list);
        return this;
    }

    public EmploymentBuilder withAnstallningar(List<Anstallning> anstallningar) {
        List<EmployerHistoryType> list = new ArrayList<>();
        for (Anstallning anstallning : anstallningar) {
            list.add(new EmployerHistoryTypeBuilder().withAnstallning(anstallning).build());
        }
        setItem(list);
        return this;
    }
}