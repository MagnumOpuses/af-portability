package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.LicenseType;

import java.util.ArrayList;
import java.util.List;

public class LicensesBuilder {
    private List<LicenseType> item;

    public LicensesBuilder setItem(List<LicenseType> item) {
        this.item = item;
        return this;
    }

    public CandidateProfileType.Licenses createLicenses() {
        return new CandidateProfileType.Licenses(item);
    }


    public LicensesBuilder withKorkort(ArbetsSokandeProfil.Korkort korkort) {
        List<LicenseType> list = new ArrayList<>();
        list.add(new LicenseTypeBuilder().withKorkort(korkort).createLicenseType());
        return this;
    }

}