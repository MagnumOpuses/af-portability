package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositionPreference {
    private List<PreferredLocation> locations;
    private Set<Entity> jobCategories;
    private List<String> positionTitles;
    private List<String> positionOfferingTypeCodes;
    private List<String> positionScheduleTypeCodes;
    private List<String> careerLevelCodes;
    private List<String> descriptions;
    private Entity jobGradeCode;
    private RemunerationPackage offeredRemunerationPackage;
    private TravelPreference travel;
    private RelocationPreference relocation;
    private List<String> workingLanguageCodes;

    public PositionPreference() {}

    public List<PreferredLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<PreferredLocation> locations) {
        this.locations = locations;
    }

    public Set<Entity> getJobCategories() {
        return jobCategories;
    }

    public void setJobCategories(Set<Entity> jobCategories) {
        this.jobCategories = jobCategories;
    }

    public List<String> getPositionTitles() {
        return positionTitles;
    }

    public void setPositionTitles(List<String> positionTitles) {
        this.positionTitles = positionTitles;
    }

    public List<String> getPositionOfferingTypeCodes() {
        return positionOfferingTypeCodes;
    }

    public void setPositionOfferingTypeCodes(List<String> positionOfferingTypeCodes) {
        this.positionOfferingTypeCodes = positionOfferingTypeCodes;
    }

    public List<String> getPositionScheduleTypeCodes() {
        return positionScheduleTypeCodes;
    }

    public void setPositionScheduleTypeCodes(List<String> positionScheduleTypeCodes) {
        this.positionScheduleTypeCodes = positionScheduleTypeCodes;
    }

    public List<String> getCareerLevelCodes() {
        return careerLevelCodes;
    }

    public void setCareerLevelCodes(List<String> careerLevelCodes) {
        this.careerLevelCodes = careerLevelCodes;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public RemunerationPackage getOfferedRemunerationPackage() {
        return offeredRemunerationPackage;
    }

    public void setOfferedRemunerationPackage(RemunerationPackage offeredRemunerationPackage) {
        this.offeredRemunerationPackage = offeredRemunerationPackage;
    }

    public TravelPreference getTravel() {
        return travel;
    }

    public void setTravel(TravelPreference travel) {
        this.travel = travel;
    }

    public RelocationPreference getRelocation() {
        return relocation;
    }

    public void setRelocation(RelocationPreference relocation) {
        this.relocation = relocation;
    }

    public List<String> getWorkingLanguageCodes() {
        return workingLanguageCodes;
    }

    public void setWorkingLanguageCodes(List<String> workingLanguageCodes) {
        this.workingLanguageCodes = workingLanguageCodes;
    }

    public Entity getJobGradeCode() {
        return jobGradeCode;
    }

    public void setJobGradeCode(Entity jobGradeCode) {
        this.jobGradeCode = jobGradeCode;
    }

    /* Builder methods */
    public PositionPreference withPositionTitle(String varde) {
        getCreatePositionTitles().add(varde);
        return this;
    }

    public PositionPreference withJobCategory(String id, String scheme) {
        getCreateJobCategories().add(new Entity(id, scheme));
        return this;
    }

    public PositionPreference withLocation(String kommunkod) {
        getCreateLocations().add(new PreferredLocation().withKommunKod(kommunkod));
        return this;
    }

    /* Creator methods */
    private List<String> getCreatePositionTitles() {
        if (positionTitles == null) {
            positionTitles = new ArrayList<>();
        }
        return this.positionTitles;
    }

    private List<PreferredLocation> getCreateLocations() {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        return this.locations;
    }

    private Set<Entity> getCreateJobCategories() {
        if (this.jobCategories == null) {
            this.jobCategories = new HashSet<>();
        }
        return this.jobCategories;
    }

}
