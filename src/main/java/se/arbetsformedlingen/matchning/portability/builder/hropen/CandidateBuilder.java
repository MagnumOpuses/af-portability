package se.arbetsformedlingen.matchning.portability.builder.hropen;
import se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.CandidateType;
public class CandidateBuilder {
    private CandidateType candidateType = new CandidateType();

    public CandidateBuilder withProfiles(ArbetsSokandeProfil profile) {
        candidateType.setProfiles(new ProfilesBuilder()
                .name(profile.getName(),
                        profile.getBeskrivning(),
                        profile.getPresentation()).build());
        return this;
    }

    /*public CandidateBuilder withProfiles(String profileName, String objective, String executiveSummary){
        candidateType.getProfiles().withItem(profileName, objective, executiveSummary);
        return this;
    }*/
    public CandidateBuilder withProfilesLicense(String licenseName, String licenseType) {
        candidateType.getProfiles().withItemLicense(licenseName, licenseType);
        return this;
    }

    public CandidateBuilder withProfilesCompetence(String competenceId, String description) {
        candidateType.getProfiles().withItemCompetence(competenceId, description);
        return this;
    }

    public CandidateBuilder withProfilesWorkExperienceLevels(String levelId, String levelName) {
        candidateType.getProfiles().withItemWorkExperienceLevels(levelId, levelName);
        return this;
    }

    public CandidateBuilder withProfilesWorkExperience(String title, String legalId, String startDate, String endDate, Boolean current, String description) {
        candidateType.getProfiles().withItemWorkExperience(title, legalId, startDate, endDate, current, description);
        return this;
    }

}