package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CandidateProfileTypeBuilder {
    private CandidateProfileType candidateProfileType = new CandidateProfileType();

    public CandidateProfileTypeBuilder setProfileName(String profileName) {
        candidateProfileType.setProfileName(profileName);
        return this;
    }

    public CandidateProfileTypeBuilder setLanguageCode(LanguageCodeList languageCode) {
        candidateProfileType.setLanguageCode(languageCode);
        return this;
    }

    public CandidateProfileTypeBuilder setEducation(List<EducationAttendanceType> education) {
        candidateProfileType.setEducation(education);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployment(List<EmployerHistoryType> employment) {
        candidateProfileType.setEmployment(employment);
        return this;
    }

    public CandidateProfileTypeBuilder setMilitaryService(List<MilitaryServiceType> militaryService) {
        candidateProfileType.setMilitaryService(militaryService);
        return this;
    }

    public CandidateProfileTypeBuilder setLicenses(List<LicenseType> licenses) {
        candidateProfileType.setLicenses(licenses);
        return this;
    }

    public CandidateProfileTypeBuilder setCertifications(List<CertificationType> certifications) {
        candidateProfileType.setCertifications(certifications);
        return this;
    }

    public CandidateProfileTypeBuilder setPatents(List<PatentType> patents) {
        candidateProfileType.setPatents(patents);
        return this;
    }

    public CandidateProfileTypeBuilder setPublications(List<PublicationType> publications) {
        candidateProfileType.setPublications(publications);
        return this;
    }

    public CandidateProfileTypeBuilder setQualifications(List<PersonCompetencyType> qualifications) {
        candidateProfileType.setQualifications(qualifications);
        return this;
    }

    public CandidateProfileTypeBuilder setAffiliations(List<OrganizationAffiliationType> affiliations) {
        candidateProfileType.setAffiliations(affiliations);
        return this;
    }

    public CandidateProfileTypeBuilder setSecurityCredentials(List<CertificationType> securityCredentials) {
        candidateProfileType.setSecurityCredentials(securityCredentials);
        return this;
    }

    public CandidateProfileTypeBuilder setReferences(List<RefereeType> references) {
        candidateProfileType.setReferences(references);
        return this;
    }

    public CandidateProfileTypeBuilder setAttachments(List<AttachmentType> attachments) {
        candidateProfileType.setAttachments(attachments);
        return this;
    }

    public CandidateProfileTypeBuilder setProfileId(IdentifierType profileId) {
        candidateProfileType.setProfileId(profileId);
        return this;
    }

    public CandidateProfileTypeBuilder setAlternateIds(List<IdentifierType> alternateIds) {
        candidateProfileType.setAlternateIds(alternateIds);
        return this;
    }

    public CandidateProfileTypeBuilder setPersonAvailability(PersonAvailabilityType personAvailability) {
        candidateProfileType.setPersonAvailability(personAvailability);
        return this;
    }

    public CandidateProfileTypeBuilder setProcessingInformation(String processingInformation) {
        candidateProfileType.setProcessingInformation(processingInformation);
        return this;
    }

    public CandidateProfileTypeBuilder setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        candidateProfileType.setDistributionGuidelines(distributionGuidelines);
        return this;
    }

    public CandidateProfileTypeBuilder setAssociatedPositionOpenings(
            List<AssociatedPositionOpeningType> associatedPositionOpenings) {
        candidateProfileType.setAssociatedPositionOpenings(associatedPositionOpenings);
        return this;
    }

    public CandidateProfileTypeBuilder setObjective(String objective) {
        candidateProfileType.setObjective(objective);
        return this;
    }

    public CandidateProfileTypeBuilder setExecutiveSummary(String executiveSummary) {
        candidateProfileType.setExecutiveSummary(executiveSummary);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployerPreferences(List<EmployerPreferenceType> employerPreferences) {
        candidateProfileType.setEmployerPreferences(employerPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setPositionPreferences(List<PositionPreferenceType> positionPreferences) {
        candidateProfileType.setPositionPreferences(positionPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateRelationships(
            List<CandidateRelationshipType> candidateRelationships) {
        candidateProfileType.setCandidateRelationships(candidateRelationships);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateSources(List<CandidateSourceType> candidateSources) {
        candidateProfileType.setCandidateSources(candidateSources);
        return this;
    }

    public CandidateProfileTypeBuilder setApplicationProcessHistory(ProcessHistoryType applicationProcessHistory) {
        candidateProfileType.setApplicationProcessHistory(applicationProcessHistory);
        return this;
    }

    public CandidateProfileTypeBuilder setWorkLifeCycles(List<WorkLifeCycleType> workLifeCycles) {
        candidateProfileType.setWorkLifeCycles(workLifeCycles);
        return this;
    }

    public CandidateProfileType build() {
        return candidateProfileType;
    }

    public CandidateProfileTypeBuilder withProfiles(ArbetsSokandeProfil profil) {
        setProfileName(profil.getNamn());
        setObjective(profil.getBeskrivning());
        setExecutiveSummary(profil.getPresentation());

        if (profil.getKorkort() != null) {
            List<LicenseType> licenses = new ArrayList<>();
            licenses.add(new LicenseTypeBuilder().withKorkort(profil.getKorkort()).build());
            setLicenses(licenses);
        }

        if (profil.getKompetenser() != null) {
            List<PersonCompetencyType> qualifications = new ArrayList<>();
            for (Kompetens kompetens : profil.getKompetenser()) {
                // TODO Adjust this to use the new taxonomy.
                qualifications
                        .add(new PersonCompetencyTypeBuilder().withKompetens(String.valueOf(kompetens.getTaxonomiId()))
                                .setDescription(String.valueOf(Concept.EntityType.skill)).build());
            }
            setQualifications(qualifications);
        }

        if (profil.getYrkeserfarenheter() != null) {
            List<EmployerHistoryType> employment = new ArrayList<>();
            for (Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                // TODO Adjust this to use the new taxonomy.
                employment.add(new EmployerHistoryTypeBuilder()
                        .withCodes(String.valueOf(yrkeserfarenhet.getYrkesbenamning())).build());
            }
            setEmployment(employment);
        }

        if (profil.getYrkesroller() != null) {
            List<EmployerHistoryType> employment = new ArrayList<>();
            for (Yrkesroll yrkesroll : profil.getYrkesroller()) {
                employment.add(new EmployerHistoryTypeBuilder().withCodes(yrkesroll.getKod()).build());
            }
            setEmployment(employment);
        }

        if (profil.getAnstallningar() != null) {
            List<EmployerHistoryType> emplyments = new ArrayList<>();
            for (Anstallning anstallning : profil.getAnstallningar()) {
                List<PositionHistoryType> positions = new ArrayList<>();
                List<String> descriptions = new ArrayList<>();
                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                final PositionHistoryTypeBuilder positionHistoryTypeBuilder = new PositionHistoryTypeBuilder();
                final EmployerHistoryTypeBuilder employerHistoryTypeBuilder = new EmployerHistoryTypeBuilder();

                try {
                    employerHistoryTypeBuilder.setStart(sdf.format(sdf.parse(
                            anstallning.getStartdatum().getArtal() + "-" + anstallning.getStartdatum().getManad())));
                } catch (Exception e) {
                    // No start date
                }
                try {
                    employerHistoryTypeBuilder.setEnd(sdf.format(sdf.parse(
                            anstallning.getSlutdatum().getArtal() + "-" + anstallning.getSlutdatum().getManad())));
                } catch (Exception e) {
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
            List<EducationAttendanceType> education = new ArrayList<>();
            for (Utbildning utbildning : profil.getUtbildningar()) {
                List<String> descriptions = new ArrayList<>();
                final EducationAttendanceTypeBuilder educationAttendanceTypeBuilder = new EducationAttendanceTypeBuilder();

                final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                try {
                    educationAttendanceTypeBuilder.setStart(sdf.format(sdf.parse(
                            utbildning.getStartdatum().getArtal() + "-" + utbildning.getStartdatum().getManad())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                educationAttendanceTypeBuilder.setInstitution(new OrganizationTypeBuilder()
                        .setLegalId(new IdentifierTypeBuilder().setValue(utbildning.getSkola()).build()).build());


                try {
                    educationAttendanceTypeBuilder.setEnd(sdf.format(sdf.parse(
                                    utbildning.getSlutdatum().getArtal() + "-" + utbildning.getSlutdatum().getManad())));
                } catch (Exception e) {
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
            List<CertificationType> certifications = new ArrayList<>();
            for (Merit merit : profil.getOvrigaMeriter()) {
                List<String> descriptions = new ArrayList<>();
                descriptions.add(new String(merit.getBeskrivning()));
                certifications.add(new CertificationTypeBuilder().setName(merit.getRubrik())
                        .setDescriptions(descriptions).build());
            }
            setCertifications(certifications);
        }

        if (profil.getArbetsorter() != null) {
            List<PositionPreferenceType> positionPreferences = new ArrayList<>();
            List<PreferredLocationType> preferredLocations = new ArrayList<>();
            List<AddressComponentType> countrySubDivisions = new ArrayList<>();

            for (Arbetsort arbetsort : profil.getArbetsorter()) {
                countrySubDivisions.add(new AddressComponentTypeBuilder().setValue("Kommun").build());
                preferredLocations.add(new PreferredLocationTypeBuilder().setReferenceLocation(new AddressTypeBuilder()
                        .setCity(arbetsort.getVarde1()).setCountrySubDivisions(countrySubDivisions).build()).build());
                positionPreferences.add(new PositionPreferenceTypeBuilder().setLocations(preferredLocations).build());
            }
            setPositionPreferences(positionPreferences);
        }

        return this;
    }
}