package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.EducationAttendanceType;

import java.util.List;

public class EducationBuilder {
    private List<EducationAttendanceType> item;

    public EducationBuilder setItem(List<EducationAttendanceType> item) {
        this.item = item;
        return this;
    }

    public CandidateProfileType.Education createEducation() {
        return new CandidateProfileType.Education(item);
    }
}