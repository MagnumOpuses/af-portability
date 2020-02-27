package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Merit;
import se.arbetsformedlingen.matchning.portability.model.hropen.CandidateProfileType;
import se.arbetsformedlingen.matchning.portability.model.hropen.CertificationType;
import se.arbetsformedlingen.matchning.portability.model.hropen.StringTypeArray;

import java.util.ArrayList;
import java.util.List;

public class CertificationsBuilder {
    private List<CertificationType> item;

    public CertificationsBuilder setItem(List<CertificationType> item) {
        this.item = item;
        return this;
    }

    public CandidateProfileType.Certifications createCertifications() {
        return new CandidateProfileType.Certifications(item);
    }

    public CertificationsBuilder withOvrigaMeriter(List<Merit> ovrigaMeriter) {
        List<CertificationType> list = new ArrayList<>();
        for (Merit merit : ovrigaMeriter) {
            list.add(new CertificationTypeBuilder().withMerit(merit).createCertificationType());
        }
        return this;
    }
}