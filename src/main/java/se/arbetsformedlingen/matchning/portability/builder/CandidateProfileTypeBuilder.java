package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CandidateProfileTypeBuilder {
    private final CandidateProfileType candidateProfileType = new CandidateProfileType();

    public CandidateProfileTypeBuilder setProfileName(final String profileName) {
        candidateProfileType.setProfileName(profileName);
        return this;
    }

    public CandidateProfileTypeBuilder setLanguageCode(final LanguageCodeList languageCode) {
        candidateProfileType.setLanguageCode(languageCode);
        return this;
    }

    public CandidateProfileTypeBuilder setEducation(final List<EducationAttendanceType> education) {
        candidateProfileType.setEducation(education);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployment(final List<EmployerHistoryType> employment) {
        candidateProfileType.setEmployment(employment);
        return this;
    }

    public CandidateProfileTypeBuilder setMilitaryService(final List<MilitaryServiceType> militaryService) {
        candidateProfileType.setMilitaryService(militaryService);
        return this;
    }

    public CandidateProfileTypeBuilder setLicenses(final List<LicenseType> licenses) {
        candidateProfileType.setLicenses(licenses);
        return this;
    }

    public CandidateProfileTypeBuilder setCertifications(final List<CertificationType> certifications) {
        candidateProfileType.setCertifications(certifications);
        return this;
    }

    public CandidateProfileTypeBuilder setPatents(final List<PatentType> patents) {
        candidateProfileType.setPatents(patents);
        return this;
    }

    public CandidateProfileTypeBuilder setPublications(final List<PublicationType> publications) {
        candidateProfileType.setPublications(publications);
        return this;
    }

    public CandidateProfileTypeBuilder setQualifications(final List<PersonCompetencyType> qualifications) {
        candidateProfileType.setQualifications(qualifications);
        return this;
    }

    public CandidateProfileTypeBuilder setAffiliations(final List<OrganizationAffiliationType> affiliations) {
        candidateProfileType.setAffiliations(affiliations);
        return this;
    }

    public CandidateProfileTypeBuilder setSecurityCredentials(final List<CertificationType> securityCredentials) {
        candidateProfileType.setSecurityCredentials(securityCredentials);
        return this;
    }

    public CandidateProfileTypeBuilder setReferences(final List<RefereeType> references) {
        candidateProfileType.setReferences(references);
        return this;
    }

    public CandidateProfileTypeBuilder setAttachments(final List<AttachmentType> attachments) {
        candidateProfileType.setAttachments(attachments);
        return this;
    }

    public CandidateProfileTypeBuilder setProfileId(final IdentifierType profileId) {
        candidateProfileType.setProfileId(profileId);
        return this;
    }

    public CandidateProfileTypeBuilder setAlternateIds(final List<IdentifierType> alternateIds) {
        candidateProfileType.setAlternateIds(alternateIds);
        return this;
    }

    public CandidateProfileTypeBuilder setPersonAvailability(final PersonAvailabilityType personAvailability) {
        candidateProfileType.setPersonAvailability(personAvailability);
        return this;
    }

    public CandidateProfileTypeBuilder setProcessingInformation(final String processingInformation) {
        candidateProfileType.setProcessingInformation(processingInformation);
        return this;
    }

    public CandidateProfileTypeBuilder setDistributionGuidelines(final DistributionGuidelinesType distributionGuidelines) {
        candidateProfileType.setDistributionGuidelines(distributionGuidelines);
        return this;
    }

    public CandidateProfileTypeBuilder setAssociatedPositionOpenings(
            final List<AssociatedPositionOpeningType> associatedPositionOpenings) {
        candidateProfileType.setAssociatedPositionOpenings(associatedPositionOpenings);
        return this;
    }

    public CandidateProfileTypeBuilder setObjective(final String objective) {
        candidateProfileType.setObjective(objective);
        return this;
    }

    public CandidateProfileTypeBuilder setExecutiveSummary(final String executiveSummary) {
        candidateProfileType.setExecutiveSummary(executiveSummary);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployerPreferences(final List<EmployerPreferenceType> employerPreferences) {
        candidateProfileType.setEmployerPreferences(employerPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setPositionPreferences(final List<PositionPreferenceType> positionPreferences) {
        candidateProfileType.setPositionPreferences(positionPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateRelationships(
            final List<CandidateRelationshipType> candidateRelationships) {
        candidateProfileType.setCandidateRelationships(candidateRelationships);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateSources(final List<CandidateSourceType> candidateSources) {
        candidateProfileType.setCandidateSources(candidateSources);
        return this;
    }

    public CandidateProfileTypeBuilder setApplicationProcessHistory(final ProcessHistoryType applicationProcessHistory) {
        candidateProfileType.setApplicationProcessHistory(applicationProcessHistory);
        return this;
    }

    public CandidateProfileTypeBuilder setWorkLifeCycles(final List<WorkLifeCycleType> workLifeCycles) {
        candidateProfileType.setWorkLifeCycles(workLifeCycles);
        return this;
    }

    public CandidateProfileType build() {
        return candidateProfileType;
    }

    public CandidateProfileTypeBuilder withProfiles(final ArbetsSokandeProfil profil) {
        final IdentifierType profileId = new IdentifierTypeBuilder().setValue(profil.getId() + "").build();
        setProfileId(profileId);

        setProfileName(profil.getNamn());
        setObjective(profil.getBeskrivning());
        setExecutiveSummary(profil.getPresentation());

        if (profil.getKorkort() != null) {
            final List<LicenseType> licenses = new ArrayList<>();
            licenses.add(new LicenseTypeBuilder().withKorkort(profil.getKorkort()).build());
            setLicenses(licenses);
        }

        if (profil.getKompetenser() != null) {
            final List<PersonCompetencyType> qualifications = new ArrayList<>();
            for (final Kompetens kompetens : profil.getKompetenser()) {
                // TODO Adjust this to use the new taxonomy.
                qualifications
                        .add(new PersonCompetencyTypeBuilder().withKompetens(String.valueOf(kompetens.getTaxonomiId()))
                                .setDescription(String.valueOf(Concept.EntityType.skill)).build());
            }
            setQualifications(qualifications);
        }

        if (profil.getYrkeserfarenheter() != null) {
            final List<EmployerHistoryType> employment = new ArrayList<>();
            for (final Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                // TODO Adjust this to use the new taxonomy.
                employment.add(new EmployerHistoryTypeBuilder()
                        .withCodes(String.valueOf(yrkeserfarenhet.getYrkesbenamning())).build());
            }
            setEmployment(employment);
        }

        if (profil.getYrkesroller() != null) {
            final List<EmployerHistoryType> employment = new ArrayList<>();
            for (final Yrkesroll yrkesroll : profil.getYrkesroller()) {
                employment.add(new EmployerHistoryTypeBuilder().withCodes(yrkesroll.getKod()).build());
            }
            setEmployment(employment);
        }

        if (profil.getAnstallningar() != null) {
            final List<EmployerHistoryType> emplyments = new ArrayList<>();
            for (final Anstallning anstallning : profil.getAnstallningar()) {
                final List<PositionHistoryType> positions = new ArrayList<>();
                final List<String> descriptions = new ArrayList<>();
                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                final PositionHistoryTypeBuilder positionHistoryTypeBuilder = new PositionHistoryTypeBuilder();
                final EmployerHistoryTypeBuilder employerHistoryTypeBuilder = new EmployerHistoryTypeBuilder();

                try {
                    employerHistoryTypeBuilder.setStart(sdf.format(sdf.parse(
                            anstallning.getStartdatum().getArtal() + "-" + anstallning.getStartdatum().getManad())));
                } catch (final Exception e) {
                    // No start date
                }
                try {
                    employerHistoryTypeBuilder.setEnd(sdf.format(sdf.parse(
                            anstallning.getSlutdatum().getArtal() + "-" + anstallning.getSlutdatum().getManad())));
                } catch (final Exception e) {
                    // No end date
                }
                positionHistoryTypeBuilder.setTitle(anstallning.getRubrik()).build();
                positions.add(positionHistoryTypeBuilder.build());
                descriptions.add(new String(anstallning.getBeskrivning()));
                emplyments.add(employerHistoryTypeBuilder.setOrganization(new OrganizationTypeBuilder().withAnstallning(anstallning).build())
                        .setPositionHistories(positions).setCurrent(anstallning.isPagaende())
                        .setDescriptions(descriptions).build());
            }
            setEmployment(emplyments);
        }

        if (profil.getUtbildningar() != null) {
            final List<EducationAttendanceType> education = new ArrayList<>();
            for (final Utbildning utbildning : profil.getUtbildningar()) {
                final List<String> descriptions = new ArrayList<>();
                final EducationAttendanceTypeBuilder educationAttendanceTypeBuilder = new EducationAttendanceTypeBuilder();

                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                try {
                    educationAttendanceTypeBuilder.setStart(sdf.format(sdf.parse(
                            utbildning.getStartdatum().getArtal() + "-" + utbildning.getStartdatum().getManad())));
                } catch (final Exception e) {
                    e.printStackTrace();
                }
                educationAttendanceTypeBuilder.setInstitution(new OrganizationTypeBuilder()
                        .setLegalId(new IdentifierTypeBuilder().setValue(utbildning.getSkola()).build()).build());


                try {
                    educationAttendanceTypeBuilder.setEnd(sdf.format(sdf.parse(
                            utbildning.getSlutdatum().getArtal() + "-" + utbildning.getSlutdatum().getManad())));
                } catch (final Exception e) {
                    e.printStackTrace();
                }
                descriptions.add(new String(utbildning.getInriktning()));
                educationAttendanceTypeBuilder.setCurrent(utbildning.isPagaende())
                        .setDescriptions(descriptions);
                education.add(educationAttendanceTypeBuilder.build());

            }
            setEducation(education);
        }

        if (profil.getOvrigaMeriter() != null) {
            final List<CertificationType> certifications = new ArrayList<>();
            for (final Merit merit : profil.getOvrigaMeriter()) {
                final List<String> descriptions = new ArrayList<>();
                descriptions.add(new String(merit.getBeskrivning()));
                certifications.add(new CertificationTypeBuilder().setName(merit.getRubrik())
                        .setDescriptions(descriptions).build());
            }
            setCertifications(certifications);
        }

        if (profil.getArbetsorter() != null) {
            final List<PositionPreferenceType> positionPreferences = new ArrayList<>();
            final List<PreferredLocationType> preferredLocations = new ArrayList<>();
            final List<AddressComponentType> countrySubDivisions = new ArrayList<>();

            for (final Arbetsort arbetsort : profil.getArbetsorter()) {
                countrySubDivisions.add(new AddressComponentTypeBuilder().setType("PLACEHOLDER TYPE").setValue("Kommun").build());
                preferredLocations.add(new PreferredLocationTypeBuilder().setReferenceLocation(new AddressTypeBuilder()
                        .setCity(arbetsort.getVarde1()).setCountrySubDivisions(countrySubDivisions).build()).build());
                positionPreferences.add(new PositionPreferenceTypeBuilder().setLocations(preferredLocations).build());
            }
            setPositionPreferences(positionPreferences);
        }

        return this;
    }
}