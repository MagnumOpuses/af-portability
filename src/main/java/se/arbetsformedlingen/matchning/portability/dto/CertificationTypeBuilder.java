package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.model.asp.Merit;

import java.util.List;

public class CertificationTypeBuilder {
    private CertificationType certificationType = new CertificationType();


    public CertificationTypeBuilder setId(IdentifierType id) {
        certificationType.id = id;
        return this;
    }

    public CertificationTypeBuilder setName(String name) {
        certificationType.name = name;
        return this;
    }

    public CertificationTypeBuilder setType(EntityType type) {
        certificationType.type = type;
        return this;
    }

    public CertificationTypeBuilder setStatus(String status) {
        certificationType.status = status;
        return this;
    }

    public CertificationTypeBuilder setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        certificationType.effectiveTimePeriod = effectiveTimePeriod;
        return this;
    }

    public CertificationTypeBuilder setIssued(String issued) {
        certificationType.issued = issued;
        return this;
    }

    public CertificationTypeBuilder setFirstIssued(String firstIssued) {
        certificationType.firstIssued = firstIssued;
        return this;
    }

    public CertificationTypeBuilder setIssuingAuthority(OrganizationType issuingAuthority) {
        certificationType.issuingAuthority = issuingAuthority;
        return this;
    }

    public CertificationTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        certificationType.attachmentReferences = attachmentReferences;
        return this;
    }

    public CertificationTypeBuilder setDescriptions(List<String> descriptions) {
        certificationType.descriptions = descriptions;
        return this;
    }

    public CertificationType build() {
        return certificationType;
    }

    public se.arbetsformedlingen.matchning.portability.builder.CertificationTypeBuilder withMerit(Merit merit) {
        final StringTypeArray stringTypeArray = new StringTypeArray();
        stringTypeArray.getItem().add(merit.getBeskrivning());

        setName(merit.getRubrik());
        setDescriptions(stringTypeArray);
        return this;
    }
}