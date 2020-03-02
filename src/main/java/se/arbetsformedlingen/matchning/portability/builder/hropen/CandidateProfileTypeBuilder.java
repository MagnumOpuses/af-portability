package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

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

    public CandidateProfileTypeBuilder setEducation(CandidateProfileType.Education education) {
        candidateProfileType.setEducation(education);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployment(CandidateProfileType.Employment employment) {
        candidateProfileType.setEmployment(employment);
        return this;
    }

    public CandidateProfileTypeBuilder setMilitaryService(CandidateProfileType.MilitaryService militaryService) {
        candidateProfileType.setMilitaryService(militaryService);
        return this;
    }

    public CandidateProfileTypeBuilder setLicenses(CandidateProfileType.Licenses licenses) {
        candidateProfileType.setLicenses(licenses);
        return this;
    }

    public CandidateProfileTypeBuilder setCertifications(CandidateProfileType.Certifications certifications) {
        candidateProfileType.setCertifications(certifications);
        return this;
    }

    public CandidateProfileTypeBuilder setPatents(CandidateProfileType.Patents patents) {
        candidateProfileType.setPatents(patents);
        return this;
    }

    public CandidateProfileTypeBuilder setPublications(CandidateProfileType.Publications publications) {
        candidateProfileType.setPublications(publications);
        return this;
    }

    public CandidateProfileTypeBuilder setQualifications(CandidateProfileType.Qualifications qualifications) {
        candidateProfileType.setQualifications(qualifications);
        return this;
    }

    public CandidateProfileTypeBuilder setAffiliations(CandidateProfileType.Affiliations affiliations) {
        candidateProfileType.setAffiliations(affiliations);
        return this;
    }

    public CandidateProfileTypeBuilder setSecurityCredentials(CandidateProfileType.SecurityCredentials securityCredentials) {
        candidateProfileType.setSecurityCredentials(securityCredentials);
        return this;
    }

    public CandidateProfileTypeBuilder setReferences(CandidateProfileType.References references) {
        candidateProfileType.setReferences(references);
        return this;
    }

    public CandidateProfileTypeBuilder setAttachments(CandidateProfileType.Attachments attachments) {
        candidateProfileType.setAttachments(attachments);
        return this;
    }

    public CandidateProfileTypeBuilder setProfileId(IdentifierType profileId) {
        candidateProfileType.setProfileId(profileId);
        return this;
    }

    public CandidateProfileTypeBuilder setAlternateIds(CandidateProfileType.AlternateIds alternateIds) {
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

    public CandidateProfileTypeBuilder setAssociatedPositionOpenings(CandidateProfileType.AssociatedPositionOpenings associatedPositionOpenings) {
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

    public CandidateProfileTypeBuilder setEmployerPreferences(CandidateProfileType.EmployerPreferences employerPreferences) {
        candidateProfileType.setEmployerPreferences(employerPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setPositionPreferences(CandidateProfileType.PositionPreferences positionPreferences) {
        candidateProfileType.setPositionPreferences(positionPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateRelationships(CandidateProfileType.CandidateRelationships candidateRelationships) {
        candidateProfileType.setCandidateRelationships(candidateRelationships);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateSources(CandidateProfileType.CandidateSources candidateSources) {
        candidateProfileType.setCandidateSources(candidateSources);
        return this;
    }

    public CandidateProfileTypeBuilder setApplicationProcessHistory(ProcessHistoryType applicationProcessHistory) {
        candidateProfileType.setApplicationProcessHistory(applicationProcessHistory);
        return this;
    }

    public CandidateProfileTypeBuilder setWorkLifeCycles(CandidateProfileType.WorkLifeCycles workLifeCycles) {
        candidateProfileType.setWorkLifeCycles(workLifeCycles);
        return this;
    }

    public CandidateProfileType build() {
        return candidateProfileType;
    }

    public CandidateProfileTypeBuilder withProfile(ArbetsSokandeProfil profil) {
        setProfileName(profil.getNamn());
        setObjective(profil.getBeskrivning());
        setExecutiveSummary(profil.getPresentation());


        if (profil.getKorkort() != null){
            setLicenses(new LicensesBuilder().withKorkort(profil.getKorkort()).build());
        }

        if (profil.getKompetenser() != null){
            for (Kompetens kompetens : profil.getKompetenser()){
                //TODO Adjust this to use the new taxonomy.
                setQualifications(new QualificationsBuilder().withKompetenser(profil.getKompetenser()).build());
            }
        }

        if (profil.getYrkeserfarenheter() != null) {
            for (Yrkeserfarenhet yrkeserfarenhet : profil.getYrkeserfarenheter()) {
                //TODO Adjust this to use the new taxonomy.
                setEmployment(new EmploymentBuilder().withCodes(String.valueOf(yrkeserfarenhet.getYrkesbenamning())).build());
            }
        }

        if (profil.getYrkesroller() != null) {
            for (Yrkesroll yrkesroll : profil.getYrkesroller()) {
                setEmployment(new EmploymentBuilder().withCodes(yrkesroll.getKod()).build());
            }
        }

        if (profil.getAnstallningar() != null) {
            setEmployment(new EmploymentBuilder().withAnstallningar(profil.getAnstallningar()).build());
        }

        if (profil.getUtbildningar() != null) {
            setEducation(new EducationBuilder().withUtbildningar(profil.getUtbildningar()).build());
        }

        if (profil.getOvrigaMeriter() != null) {
            setCertifications(new CertificationsBuilder().withOvrigaMeriter(profil.getOvrigaMeriter()).build());
        }

        if (profil.getArbetsorter() != null) {
            setPositionPreferences(new PositionPreferencesBuilder().withArbetsorter(profil.getArbetsorter()).build());
        }



        return this;
    }
}