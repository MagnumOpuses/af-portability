package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class PositionPreferenceTypeBuilder {
    private PositionPreferenceType positionPreferenceType = new PositionPreferenceType();

    public PositionPreferenceTypeBuilder setLocations(List<PreferredLocationType> locations) {
        positionPreferenceType.locations = locations;
        return this;
    }

    public PositionPreferenceTypeBuilder setJobCategories(List<EntityType> jobCategories) {
        positionPreferenceType.jobCategories = jobCategories;
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionTitles(List<String> positionTitles) {
        positionPreferenceType.positionTitles = positionTitles;
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionOfferingTypeCodes(List<PositionTypeCodeList> positionOfferingTypeCodes) {
        positionPreferenceType.positionOfferingTypeCodes = positionOfferingTypeCodes;
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionScheduleTypeCodes(List<PositionScheduleTypeCodeList> positionScheduleTypeCodes) {
        positionPreferenceType.positionScheduleTypeCodes = positionScheduleTypeCodes;
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftSchedules(List<ScheduleType> shiftSchedules) {
        positionPreferenceType.shiftSchedules = shiftSchedules;
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftDescriptions(List<String> shiftDescriptions) {
        positionPreferenceType.shiftDescriptions = shiftDescriptions;
        return this;
    }

    public PositionPreferenceTypeBuilder setRemoteWork(RemoteWorkType remoteWork) {
        positionPreferenceType.remoteWork = remoteWork;
        return this;
    }

    public PositionPreferenceTypeBuilder setCareerLevelCodes(List<CareerLevelCodeList> careerLevelCodes) {
        positionPreferenceType.careerLevelCodes = careerLevelCodes;
        return this;
    }

    public PositionPreferenceTypeBuilder setJobGradeCode(EntityType jobGradeCode) {
        positionPreferenceType.jobGradeCode = jobGradeCode;
        return this;
    }

    public PositionPreferenceTypeBuilder setOfferedRemunerationPackage(RemunerationPackageType offeredRemunerationPackage) {
        positionPreferenceType.offeredRemunerationPackage = offeredRemunerationPackage;
        return this;
    }

    public PositionPreferenceTypeBuilder setTravel(TravelType travel) {
        positionPreferenceType.travel = travel;
        return this;
    }

    public PositionPreferenceTypeBuilder setRelocation(RelocationType relocation) {
        positionPreferenceType.relocation = relocation;
        return this;
    }

    public PositionPreferenceTypeBuilder setWorkingLanguageCodes(List<LanguageCodeList> workingLanguageCodes) {
        positionPreferenceType.workingLanguageCodes = workingLanguageCodes;
        return this;
    }

    public PositionPreferenceType build() {
        return positionPreferenceType;
    }
}