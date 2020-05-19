package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;
import se.arbetsformedlingen.matchning.portability.model.asp.*;

public class CandidateProfileTypeBuilder {
    private CandidateProfileType candidateProfileType = new se.arbetsformedlingen.matchning.portability.dto.CandidateProfileTypeBuilder().createCandidateProfileType();

    public CandidateProfileTypeBuilder setProfileName(String profileName) {
        candidateProfileType.setProfileName(profileName);
        return this;
    }

    public CandidateProfileTypeBuilder setLanguageCode(LanguageCodeList languageCode) {
        candidateProfileType.setLanguageCode(languageCode);
        return this;
    }

    public CandidateProfileTypeBuilder setEducation(CandidateProfileType education) {
        candidateProfileType.getEducation(education);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployment(CandidateProfileType employment) {
        candidateProfileType.getEmployment(employment);
        return this;
    }


    public CandidateProfileTypeBuilder setLicenses(CandidateProfileType licenses) {
        candidateProfileType.getLicenses(licenses);
        return this;
    }

    public CandidateProfileTypeBuilder setCertifications(CandidateProfileType certifications) {
        candidateProfileType.getCertifications(certifications);
        return this;
    }

    public CandidateProfileTypeBuilder setPublications(CandidateProfileType publications) {
        candidateProfileType.getPublications(publications);
        return this;
    }

    public CandidateProfileTypeBuilder setQualifications(CandidateProfileType qualifications) {
        candidateProfileType.getQualifications(qualifications);
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

    public CandidateProfileTypeBuilder setAlternateIds(CandidateProfileType alternateIds) {
        candidateProfileType.getAlternateIds(alternateIds);
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


    public CandidateProfileTypeBuilder setObjective(String objective) {
        candidateProfileType.setObjective(objective);
        return this;
    }

    public CandidateProfileTypeBuilder setExecutiveSummary(String executiveSummary) {
        candidateProfileType.setExecutiveSummary(executiveSummary);
        return this;
    }

    public CandidateProfileTypeBuilder setEmployerPreferences(CandidateProfileType employerPreferences) {
        candidateProfileType.getEmployerPreferences(employerPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setPositionPreferences(CandidateProfileType positionPreferences) {
        candidateProfileType.getPositionPreferences(positionPreferences);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateRelationships(CandidateProfileType candidateRelationships) {
        candidateProfileType.getCandidateRelationships(candidateRelationships);
        return this;
    }

    public CandidateProfileTypeBuilder setCandidateSources(CandidateProfileType candidateSources) {
        candidateProfileType.getCandidateSources(candidateSources);
        return this;
    }

    public CandidateProfileTypeBuilder setApplicationProcessHistory(ProcessHistoryType applicationProcessHistory) {
        candidateProfileType.setApplicationProcessHistory(applicationProcessHistory);
        return this;
    }

    public CandidateProfileTypeBuilder setWorkLifeCycles(CandidateProfileType workLifeCycles) {
        candidateProfileType.getWorkLifeCycles(workLifeCycles);
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