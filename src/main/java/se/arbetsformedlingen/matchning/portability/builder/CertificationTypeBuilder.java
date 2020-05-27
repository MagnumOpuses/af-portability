package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class CertificationTypeBuilder {
    private CertificationType certificationType = new CertificationType();

    public CertificationTypeBuilder setId(IdentifierType id) {
        certificationType.setId(id);
        return this;
    }

    public CertificationTypeBuilder setName(String name) {
        certificationType.setName(name);
        return this;
    }

    public CertificationTypeBuilder setType(EntityType type) {
        certificationType.setType(type);
        return this;
    }

    public CertificationTypeBuilder setStatus(String status) {
        certificationType.setStatus(status);
        return this;
    }

    public CertificationTypeBuilder setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        certificationType.setEffectiveTimePeriod(effectiveTimePeriod);
        return this;
    }

    public CertificationTypeBuilder setIssued(String issued) {
        certificationType.setIssued(issued);
        return this;
    }

    public CertificationTypeBuilder setFirstIssued(String firstIssued) {
        certificationType.setFirstIssued(firstIssued);
        return this;
    }

    public CertificationTypeBuilder setIssuingAuthority(OrganizationType issuingAuthority) {
        certificationType.setIssuingAuthority(issuingAuthority);
        return this;
    }

    public CertificationTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        certificationType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public CertificationTypeBuilder setDescriptions(List<String> descriptions) {
        certificationType.setDescriptions(descriptions);
        return this;
    }

    public CertificationType build() {
        return certificationType;
    }

}