package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Merit;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

public class CertificationTypeBuilder {
    private IdentifierType id;
    private String name;
    private EntityType type;
    private String status;
    private EffectiveTimePeriodType effectiveTimePeriod;
    private String issued;
    private String firstIssued;
    private OrganizationType issuingAuthority;
    private CertificationType.AttachmentReferences attachmentReferences;
    private StringTypeArray descriptions;

    public CertificationTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public CertificationTypeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CertificationTypeBuilder setType(EntityType type) {
        this.type = type;
        return this;
    }

    public CertificationTypeBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public CertificationTypeBuilder setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        this.effectiveTimePeriod = effectiveTimePeriod;
        return this;
    }

    public CertificationTypeBuilder setIssued(String issued) {
        this.issued = issued;
        return this;
    }

    public CertificationTypeBuilder setFirstIssued(String firstIssued) {
        this.firstIssued = firstIssued;
        return this;
    }

    public CertificationTypeBuilder setIssuingAuthority(OrganizationType issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    public CertificationTypeBuilder setAttachmentReferences(CertificationType.AttachmentReferences attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public CertificationTypeBuilder setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public CertificationType createCertificationType() {
        return new CertificationType(id, name, type, status, effectiveTimePeriod, issued, firstIssued, issuingAuthority, attachmentReferences, descriptions);
    }

    public CertificationTypeBuilder withMerit(Merit merit) {
        final StringTypeArray stringTypeArray = new StringTypeArray();
        stringTypeArray.getItem().add(merit.getBeskrivning());

        setName(merit.getRubrik());
        setDescriptions(stringTypeArray);
        return this;
    }
}