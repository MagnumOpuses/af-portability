package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;

public class LicenseTypeBuilder {
    private IdentifierType id;
    private String name;
    private EntityType type;
    private String status;
    private EffectiveTimePeriodType effectiveTimePeriod;
    private String issued;
    private String firstIssued;
    private OrganizationType issuingAuthority;
    private List<AttachmentReferenceType> attachmentReferences;
    private List<String> descriptions;
    private LicenseType.Endorsements endorsements;
    private LicenseType.Restrictions restrictions;
    private LicenseType.Violations violations;

    public LicenseTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public LicenseTypeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LicenseTypeBuilder setType(EntityType type) {
        this.type = type;
        return this;
    }

    public LicenseTypeBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public LicenseTypeBuilder setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        this.effectiveTimePeriod = effectiveTimePeriod;
        return this;
    }

    public LicenseTypeBuilder setIssued(String issued) {
        this.issued = issued;
        return this;
    }

    public LicenseTypeBuilder setFirstIssued(String firstIssued) {
        this.firstIssued = firstIssued;
        return this;
    }

    public LicenseTypeBuilder setIssuingAuthority(OrganizationType issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    public LicenseTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public LicenseTypeBuilder setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public LicenseTypeBuilder setEndorsements(LicenseType.Endorsements endorsements) {
        this.endorsements = endorsements;
        return this;
    }

    public LicenseTypeBuilder setRestrictions(LicenseType.Restrictions restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    public LicenseTypeBuilder setViolations(LicenseType.Violations violations) {
        this.violations = violations;
        return this;
    }

    public LicenseType createLicenseType() {
        return new LicenseType(id, name, type, status, effectiveTimePeriod, issued, firstIssued, issuingAuthority, attachmentReferences, descriptions, endorsements, restrictions, violations);
    }
}