package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;

public class LicenseTypeBuilder {
    private LicenseType licenseType = new LicenseType();

    public LicenseTypeBuilder setId(IdentifierType id) {
        licenseType.setId(id);
        return this;
    }

    public LicenseTypeBuilder setName(String name) {
        licenseType.setName(name);
        return this;
    }

    public LicenseTypeBuilder setType(EntityType type) {
        licenseType.setType(type);
        return this;
    }

    public LicenseTypeBuilder setStatus(String status) {
        licenseType.setStatus(status);
        return this;
    }

    public LicenseTypeBuilder setEffectiveTimePeriod(EffectiveTimePeriodType effectiveTimePeriod) {
        licenseType.setEffectiveTimePeriod(effectiveTimePeriod);
        return this;
    }

    public LicenseTypeBuilder setIssued(String issued) {
        licenseType.setIssued(issued);
        return this;
    }

    public LicenseTypeBuilder setFirstIssued(String firstIssued) {
        licenseType.setFirstIssued(firstIssued);
        return this;
    }

    public LicenseTypeBuilder setIssuingAuthority(OrganizationType issuingAuthority) {
        licenseType.setIssuingAuthority(issuingAuthority);
        return this;
    }

    public LicenseTypeBuilder setAttachmentReferences(LicenseType.AttachmentReferences attachmentReferences) {
        licenseType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public LicenseTypeBuilder setDescriptions(StringTypeArray descriptions) {
        licenseType.setDescriptions(descriptions);
        return this;
    }

    public LicenseTypeBuilder setEndorsements(LicenseType.Endorsements endorsements) {
        licenseType.setEndorsements(endorsements);
        return this;
    }

    public LicenseTypeBuilder setRestrictions(LicenseType.Restrictions restrictions) {
        licenseType.setRestrictions(restrictions);
        return this;
    }

    public LicenseTypeBuilder setViolations(LicenseType.Violations violations) {
        licenseType.setViolations(violations);
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