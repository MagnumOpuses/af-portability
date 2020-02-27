package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EmployerHistoryType;

import java.util.ArrayList;
import java.util.List;

public class EmploymentBuilder {
    private List<EmployerHistoryType> item;

    public EmploymentBuilder setItem(List<EmployerHistoryType> item) {
        this.item = item;
        return this;
    }

    public CandidateProfileType.Employment createEmployment() {
        return new CandidateProfileType.Employment(item);
    }

    public EmploymentBuilder withCodes(String valueOf) {
        List<EmployerHistoryType> list = new ArrayList<>();
        list.add(new EmployerHistoryTypeBuilder().setPositionHistories(new PositionHistoriesBuilder().withCodes(valueOf).createPositionHistories()).createEmployerHistoryType());
        return this;
    }
}