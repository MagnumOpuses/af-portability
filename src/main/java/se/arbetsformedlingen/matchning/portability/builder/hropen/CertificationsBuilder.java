package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Merit;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CertificationType;
import se.arbetsformedlingen.matchning.portability.model.hropen.StringTypeArray;

import java.util.ArrayList;
import java.util.List;

public class CertificationsBuilder {
    private CandidateProfileType.Certifications certifications = new CandidateProfileType.Certifications();

    public CertificationsBuilder setItem(List<CertificationType> item) {
        certifications.getItem().addAll(item);
        return this;
    }

    public CandidateProfileType.Certifications createCertifications() {
        return certifications;
    }

    public CertificationsBuilder withOvrigaMeriter(List<Merit> ovrigaMeriter) {
        List<CertificationType> list = new ArrayList<>();
        for (Merit merit : ovrigaMeriter) {
            list.add(new CertificationTypeBuilder().withMerit(merit).createCertificationType());
        }
        setItem(list);
        return this;
    }
}