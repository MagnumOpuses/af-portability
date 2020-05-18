package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.LicenseType;

import java.util.ArrayList;
import java.util.List;

public class LicensesBuilder {
    private CandidateProfileType.Licenses licenses = new CandidateProfileType.Licenses();

    public LicensesBuilder setItem(List<LicenseType> item) {
        licenses.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType build() {
        return licenses;
    }


    public LicensesBuilder withKorkort(ArbetsSokandeProfil.Korkort korkort) {
        List<LicenseType> list = new ArrayList<>();
        list.add(new LicenseTypeBuilder().withKorkort(korkort).build());
        setItem(list);
        return this;
    }

}