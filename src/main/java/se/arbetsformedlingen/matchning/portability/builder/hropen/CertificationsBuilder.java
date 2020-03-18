package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Merit;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CertificationType;

import java.util.ArrayList;
import java.util.List;

public class CertificationsBuilder {
    private CandidateProfileType.Certifications certifications = new CandidateProfileType.Certifications();

    public CertificationsBuilder setItem(List<CertificationType> item) {
        certifications.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType.Certifications build() {
        return certifications;
    }

    public CertificationsBuilder withOvrigaMeriter(List<Merit> ovrigaMeriter) {
        List<CertificationType> list = new ArrayList<>();
        for (Merit merit : ovrigaMeriter) {
            list.add(new CertificationTypeBuilder().withMerit(merit).build());
        }
        setItem(list);
        return this;
    }
}