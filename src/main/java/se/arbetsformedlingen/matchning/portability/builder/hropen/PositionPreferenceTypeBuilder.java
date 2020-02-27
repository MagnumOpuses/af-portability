package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.*;

public class PositionPreferenceTypeBuilder {
    private PositionPreferenceType.Locations locations;
    private PositionPreferenceType.JobCategories jobCategories;
    private StringTypeArray positionTitles;
    private PositionPreferenceType.PositionOfferingTypeCodes positionOfferingTypeCodes;
    private PositionPreferenceType.PositionScheduleTypeCodes positionScheduleTypeCodes;
    private PositionPreferenceType.ShiftSchedules shiftSchedules;
    private StringTypeArray shiftDescriptions;
    private RemoteWorkType remoteWork;
    private PositionPreferenceType.CareerLevelCodes careerLevelCodes;
    private EntityType jobGradeCode;
    private RemunerationPackageType offeredRemunerationPackage;
    private TravelType travel;
    private RelocationType relocation;
    private PositionPreferenceType.WorkingLanguageCodes workingLanguageCodes;

    public PositionPreferenceTypeBuilder setLocations(PositionPreferenceType.Locations locations) {
        this.locations = locations;
        return this;
    }

    public PositionPreferenceTypeBuilder setJobCategories(PositionPreferenceType.JobCategories jobCategories) {
        this.jobCategories = jobCategories;
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionTitles(StringTypeArray positionTitles) {
        this.positionTitles = positionTitles;
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionOfferingTypeCodes(PositionPreferenceType.PositionOfferingTypeCodes positionOfferingTypeCodes) {
        this.positionOfferingTypeCodes = positionOfferingTypeCodes;
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionScheduleTypeCodes(PositionPreferenceType.PositionScheduleTypeCodes positionScheduleTypeCodes) {
        this.positionScheduleTypeCodes = positionScheduleTypeCodes;
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftSchedules(PositionPreferenceType.ShiftSchedules shiftSchedules) {
        this.shiftSchedules = shiftSchedules;
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftDescriptions(StringTypeArray shiftDescriptions) {
        this.shiftDescriptions = shiftDescriptions;
        return this;
    }

    public PositionPreferenceTypeBuilder setRemoteWork(RemoteWorkType remoteWork) {
        this.remoteWork = remoteWork;
        return this;
    }

    public PositionPreferenceTypeBuilder setCareerLevelCodes(PositionPreferenceType.CareerLevelCodes careerLevelCodes) {
        this.careerLevelCodes = careerLevelCodes;
        return this;
    }

    public PositionPreferenceTypeBuilder setJobGradeCode(EntityType jobGradeCode) {
        this.jobGradeCode = jobGradeCode;
        return this;
    }

    public PositionPreferenceTypeBuilder setOfferedRemunerationPackage(RemunerationPackageType offeredRemunerationPackage) {
        this.offeredRemunerationPackage = offeredRemunerationPackage;
        return this;
    }

    public PositionPreferenceTypeBuilder setTravel(TravelType travel) {
        this.travel = travel;
        return this;
    }

    public PositionPreferenceTypeBuilder setRelocation(RelocationType relocation) {
        this.relocation = relocation;
        return this;
    }

    public PositionPreferenceTypeBuilder setWorkingLanguageCodes(PositionPreferenceType.WorkingLanguageCodes workingLanguageCodes) {
        this.workingLanguageCodes = workingLanguageCodes;
        return this;
    }

    public PositionPreferenceType createPositionPreferenceType() {
        return new PositionPreferenceType(locations, jobCategories, positionTitles, positionOfferingTypeCodes, positionScheduleTypeCodes, shiftSchedules, shiftDescriptions, remoteWork, careerLevelCodes, jobGradeCode, offeredRemunerationPackage, travel, relocation, workingLanguageCodes);
    }
}