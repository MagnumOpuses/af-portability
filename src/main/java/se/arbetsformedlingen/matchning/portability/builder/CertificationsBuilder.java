package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.asp.Merit;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen421xsd.CertificationType;

import java.util.ArrayList;
import java.util.List;

public class CertificationsBuilder {
    private CandidateProfileType.Certifications certifications = new CandidateProfileType.Certifications();

    public CertificationsBuilder setItem(List<CertificationType> item) {
        certifications.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType build() {
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