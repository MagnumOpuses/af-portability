package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.ArbetsSokandeProfil;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class LicenseTypeBuilder {
    private final LicenseType licenseType = new LicenseType();

    public LicenseTypeBuilder setId(final IdentifierType id) {
        licenseType.setId(id);
        return this;
    }

    public LicenseTypeBuilder setName(final String name) {
        licenseType.setName(name);
        return this;
    }

    public LicenseTypeBuilder setType(final EntityType type) {
        licenseType.setType(type);
        return this;
    }

    public LicenseTypeBuilder setStatus(final String status) {
        licenseType.setStatus(status);
        return this;
    }

    public LicenseTypeBuilder setEffectiveTimePeriod(final EffectiveTimePeriodType effectiveTimePeriod) {
        licenseType.setEffectiveTimePeriod(effectiveTimePeriod);
        return this;
    }

    public LicenseTypeBuilder setIssued(final DateType issued) {
        licenseType.setIssued(issued);
        return this;
    }

    public LicenseTypeBuilder setFirstIssued(final String firstIssued) {
        licenseType.setFirstIssued(firstIssued);
        return this;
    }

    public LicenseTypeBuilder setIssuingAuthority(final OrganizationType issuingAuthority) {
        licenseType.setIssuingAuthority(issuingAuthority);
        return this;
    }

    public LicenseTypeBuilder setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        licenseType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public LicenseTypeBuilder setDescriptions(final List<String> descriptions) {
        licenseType.setDescriptions(descriptions);
        return this;
    }

    public LicenseTypeBuilder setEndorsements(final List<LicenseType.Endorsements.Item> endorsements) {
        licenseType.setEndorsements(endorsements);
        return this;
    }

    public LicenseTypeBuilder setRestrictions(final List<LicenseType.Restrictions.Item> restrictions) {
        licenseType.setRestrictions(restrictions);
        return this;
    }

    public LicenseTypeBuilder setViolations(final List<LicenseType.Violations.Item> violations) {
        licenseType.setViolations(violations);
        return this;
    }

    public LicenseType build() {
        return licenseType;
    }

    public LicenseTypeBuilder withKorkort(final ArbetsSokandeProfil.Korkort korkort) {
        setType(new EntityTypeBuilder().setId(new IdentifierTypeBuilder().setValue(String.join(" ", korkort.getKorkortsklasser())).build()).build());

        try {
            final XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(korkort.getSenastUppdaterad().toInstant().toString());
            final DateType dateType = new DateType();
            dateType.setDate(xcal);
            setIssued(dateType);
        } catch (final DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        return this;
    }
}