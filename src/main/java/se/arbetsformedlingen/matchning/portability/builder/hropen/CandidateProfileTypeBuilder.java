package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept;

public class CandidateProfileTypeBuilder {
    private String profileName;
    private LanguageCodeList languageCode;
    private CandidateProfileType.Education education;
    private CandidateProfileType.Employment employment;
    private CandidateProfileType.MilitaryService militaryService;
    private CandidateProfileType.Licenses licenses;
    private CandidateProfileType.Certifications certifications;
    private CandidateProfileType.Patents patents;
    private CandidateProfileType.Publications publications;
    private CandidateProfileType.Qualifications qualifications;
    private CandidateProfileType.Affiliations affiliations;
    private CandidateProfileType.SecurityCredentials securityCredentials;
    private CandidateProfileType.References references;
    private CandidateProfileType.Attachments attachments;
    private IdentifierType profileId;
    private CandidateProfileType.AlternateIds alternateIds;
    private PersonAvailabilityType personAvailability;
    private String processingInformation;
    private DistributionGuidelinesType distributionGuidelines;
    private CandidateProfileType.AssociatedPositionOpenings associatedPositionOpenings;
    private String objective;
    private String executiveSummary;
    private CandidateProfileType.EmployerPreferences employerPreferences;
    private CandidateProfileType.PositionPreferences positionPreferences;
    private CandidateProfileType.CandidateRelationships candidateRelationships;
    private CandidateProfileType.CandidateSources candidateSources;
    private ProcessHistoryType applicationProcessHistory;
    private CandidateProfileType.WorkLifeCycles workLifeCycles;

    public CandidateProfileTypeBuilder setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    public CandidateProfileTypeBuilder setLanguageCode(LanguageCodeList languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public CandidateProfileTypeBuilder setEducation(CandidateProfileType.Education education) {
        this.education = education;
        return this;
    }

    public CandidateProfileTypeBuilder setEmployment(CandidateProfileType.Employment employment) {
        this.employment = employment;
        return this;
    }

    public CandidateProfileTypeBuilder setMilitaryService(CandidateProfileType.MilitaryService militaryService) {
        this.militaryService = militaryService;
        return this;
    }

    public CandidateProfileTypeBuilder setLicenses(CandidateProfileType.Licenses licenses) {
        this.licenses = licenses;
        return this;
    }

    public CandidateProfileTypeBuilder setCertifications(CandidateProfileType.Certifications certifications) {
        this.certifications = certifications;
        return this;
    }

    public CandidateProfileTypeBuilder setPatents(CandidateProfileType.Patents patents) {
        this.patents = patents;
        return this;
    }

    public CandidateProfileTypeBuilder setPublications(CandidateProfileType.Publications publications) {
        this.publications = publications;
        return this;
    }

    public CandidateProfileTypeBuilder setQualifications(CandidateProfileType.Qualifications qualifications) {
        this.qualifications = qualifications;
        return this;
    }

    public CandidateProfileTypeBuilder setAffiliations(CandidateProfileType.Affiliations affiliations) {
        this.affiliations = affiliations;
        return this;
    }

    public CandidateProfileTypeBuilder setSecurityCredentials(CandidateProfileType.SecurityCredentials securityCredentials) {
        this.securityCredentials = securityCredentials;
        return this;
    }

    public CandidateProfileTypeBuilder setReferences(CandidateProfileType.References references) {
        this.references = references;
        return this;
    }

    public CandidateProfileTypeBuilder setAttachments(CandidateProfileType.Attachments attachments) {
        this.attachments = attachments;
        return this;
    }

    public CandidateProfileTypeBuilder setProfileId(IdentifierType profileId) {
        this.profileId = profileId;
        return this;
    }

    public CandidateProfileTypeBuilder setAlternateIds(CandidateProfileType.AlternateIds alternateIds) {
        this.alternateIds = alternateIds;
        return this;
    }

    public CandidateProfileTypeBuilder setPersonAvailability(PersonAvailabilityType personAvailability) {
        this.personAvailability = personAvailability;
        return this;
    }

    public CandidateProfileTypeBuilder setProcessingInformation(String processingInformation) {
        this.processingInformation = processingInformation;
        return this;
    }

    public CandidateProfileTypeBuilder setDistributionGuidelines(DistributionGuidelinesType distributionGuidelines) {
        this.distributionGuidelines = distributionGuidelines;
        return this;
    }

    public CandidateProfileTypeBuilder setAssociatedPositionOpenings(CandidateProfileType.AssociatedPositionOpenings associatedPositionOpenings) {
        this.associatedPositionOpenings = associatedPositionOpenings;
        return this;
    }

    public CandidateProfileTypeBuilder setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    public CandidateProfileTypeBuilder setExecutiveSummary(String executiveSummary) {
        this.executiveSummary = executiveSummary;
        return this;
    }

    public CandidateProfileTypeBuilder setEmployerPreferences(CandidateProfileType.EmployerPreferences employerPreferences) {
        this.employerPreferences = employerPreferences;
        return this;
    }

    public CandidateProfileTypeBuilder setPositionPreferences(CandidateProfileType.PositionPreferences positionPreferences) {
        this.positionPreferences = positionPreferences;
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateRelationships(CandidateProfileType.CandidateRelationships candidateRelationships) {
        this.candidateRelationships = candidateRelationships;
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateSources(CandidateProfileType.CandidateSources candidateSources) {
        this.candidateSources = candidateSources;
        return this;
    }

    public CandidateProfileTypeBuilder setApplicationProcessHistory(ProcessHistoryType applicationProcessHistory) {
        this.applicationProcessHistory = applicationProcessHistory;
        return this;
    }

    public CandidateProfileTypeBuilder setWorkLifeCycles(CandidateProfileType.WorkLifeCycles workLifeCycles) {
        this.workLifeCycles = workLifeCycles;
        return this;
    }

    public CandidateProfileType createCandidateProfileType() {
        return new CandidateProfileType(profileName, languageCode, education, employment, militaryService, licenses, certifications, patents, publications, qualifications, affiliations, securityCredentials, references, attachments, profileId, alternateIds, personAvailability, processingInformation, distributionGuidelines, associatedPositionOpenings, objective, executiveSummary, employerPreferences, positionPreferences, candidateRelationships, candidateSources, applicationProcessHistory, workLifeCycles);
    }

    public CandidateProfileTypeBuilder withProfile(ArbetsSokandeProfil profil) {
        setProfileName(profil.getNamn());

        if (profil.getKortkort() != null){
            //TODO the license thingy!
            //setLicenses(new LicensesBuilder().withKorkort(profil.getKortkort()).createLicenses());
        }

        if (profil.getKompetenser() != null){
            for (Kompetens kompetens : profil.getKompetenser()){
                //TODO Adjust this to use the new taxonomy.
                setQualifications(new QualificationsBuilder().withKompetenser(profil.getKompetenser()).createQualifications());
            }
        }

        if (profil.getYrkeserfarenheter() != null) {
            for (Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                //TODO Adjust this to use the new taxonomy.
                setEmployment(new EmploymentBuilder().withCodes(String.valueOf(yrkeserfarenhet.getYrkesbenamning())).createEmployment());
            }
        }

        if (profil.getYrkesroller() != null) {
            for (Yrkesroll yrkesroll : profil.getYrkesroller()) {
                setEmployment(new EmploymentBuilder().withCodes(yrkesroll.getKod()).createEmployment());
            }
        }

        if (profil.getAnstallningar() != null) {
            for (Anstallning anstallning : profil.getAnstallningar()) {
                setEmployment();

                if (anstallning.getSlutdatum() != null){
                    candidate.withProfilesWorkExperience(anstallning.getRubrik(),
                            anstallning.getArbetsgivare(),
                            new String(String.valueOf(anstallning.getStartdatum())),
                            new String(String.valueOf(anstallning.getSlutdatum())),
                            Boolean.FALSE,
                            anstallning.getBeskrivning());
                }
                else if (anstallning.getSlutdatum() == null) {
                    candidate.withProfilesWorkExperience(anstallning.getRubrik(),
                            anstallning.getArbetsgivare(),
                            new String(String.valueOf(anstallning.getStartdatum())),
                            new String(String.valueOf(anstallning.getSlutdatum())),
                            Boolean.TRUE,
                            anstallning.getBeskrivning());
                }
            }
        }

        if (profil.getUtbildningar() != null) {
            setEducation(new EducationBuilder().withUtbildningar(profil.getUtbildningar()).createEducation());
        }

        if (profil.getOvrigaMeriter() != null) {
            for (Merit merit : profil.getOvrigaMeriter()) {
                candidate.withProfilesMerit(merit.getRubrik(), merit.getBeskrivning());
            }
        }

        if (profil.getArbetsorter() != null) {
            for (Arbetsort arbetsort : profil.getArbetsorter()) {
                candidate.withProfilesPositionPreference(arbetsort.getVarde1()); //TODO make sure this is the correct mapping
            }
        }



        return this;
    }
}