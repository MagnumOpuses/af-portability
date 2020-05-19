package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;

import java.util.List;

public class LicenseTypeBuilder {
    private LicenseType licenseType = new LicenseType();

    public LicenseTypeBuilder setId(IdentifierType id) {
        licenseType.id = id;
        return this;
    }

    public LicenseTypeBuilder setName(String name) {
        licenseType.name = name;
        return this;
    }

    public LicenseTypeBuilder setType(EntityType type) {
        licenseType.type = type;
        return this;
    }

    public LicenseTypeBuilder setStatus(String status) {
        licenseType.status = status;
        return this;
    }

    public LicenseTypeBuilder setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        licenseType.effectiveTimePeriod = effectiveTimePeriod;
        return this;
    }

    public LicenseTypeBuilder setIssued(String issued) {
        licenseType.issued = issued;
        return this;
    }

    public LicenseTypeBuilder setFirstIssued(String firstIssued) {
        licenseType.firstIssued = firstIssued;
        return this;
    }

    public LicenseTypeBuilder setIssuingAuthority(OrganizationType issuingAuthority) {
        licenseType.issuingAuthority = issuingAuthority;
        return this;
    }

    public LicenseTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        licenseType.attachmentReferences = attachmentReferences;
        return this;
    }

    public LicenseTypeBuilder setDescriptions(List<String> descriptions) {
        licenseType.descriptions = descriptions;
        return this;
    }

    public LicenseTypeBuilder setEndorsements(LicenseType.Endorsements endorsements) {
        licenseType.endorsements = endorsements;
        return this;
    }

    public LicenseTypeBuilder setRestrictions(LicenseType.Restrictions restrictions) {
        licenseType.restrictions = restrictions;
        return this;
    }

    public LicenseTypeBuilder setViolations(LicenseType.Violations violations) {
        licenseType.violations = violations;
        return this;
    }

    public LicenseType build() {
        return licenseType;
    }

    public LicenseTypeBuilder withKorkort(ArbetsSokandeProfil.Korkort korkort) {
        setType(new EntityTypeBuilder().setId(new IdentifierTypeBuilder().setValue(String.join(" ", korkort.getKorkortsklasser())).build()).build());
        setIssued(String.valueOf(korkort.getSenastUppdaterad()));
        return this;
    }
}