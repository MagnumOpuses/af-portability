package se.arbetsformedlingen.matchning.portability.builder.hropen;

import jdk.nashorn.internal.ir.LiteralNode;
import se.arbetsformedlingen.matchning.portability.model.asp.Anstallning;
import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;
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

    public EmploymentBuilder withAnstallningar(List<Anstallning> anstallningar) {
        List<EmployerHistoryType> list = new ArrayList<>();
        for (Anstallning anstallning : anstallningar) {
            list.add(new EmployerHistoryTypeBuilder().withAnstallning(anstallning).createEmployerHistoryType());

        }
        return this;
    }
}