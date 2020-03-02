package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EducationAttendanceType;

import java.util.ArrayList;
import java.util.List;

public class EducationBuilder {
    private CandidateProfileType.Education education = new CandidateProfileType.Education();

    public EducationBuilder setItem(List<EducationAttendanceType> item) {
        education.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType.Education createEducation() {
        return education;
    }

    public EducationBuilder withUtbildningar(List<Utbildning> utbildningar) {
        List<EducationAttendanceType> list = new ArrayList<>();
        for (Utbildning utbildning : utbildningar) {
            list.add(new EducationAttendanceTypeBuilder().withUtbildning(utbildning).createEducationAttendanceType());
        }
        setItem(list);

        return this;
    }
}