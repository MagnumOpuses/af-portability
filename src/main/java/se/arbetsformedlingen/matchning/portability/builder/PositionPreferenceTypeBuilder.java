package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class PositionPreferenceTypeBuilder {
    private PositionPreferenceType positionPreferenceType = new PositionPreferenceType();

    public PositionPreferenceTypeBuilder setLocations(List<PreferredLocationType> locations) {
        positionPreferenceType.getLocations().addAll(locations);
        return this;
    }

    public PositionPreferenceTypeBuilder setJobCategories(List<EntityType> jobCategories) {
        positionPreferenceType.getJobCategories().addAll(jobCategories);
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionTitles(List<String> positionTitles) {
        positionPreferenceType.getPositionTitles().addAll(positionTitles);
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionOfferingTypeCodes(List<PositionTypeCodeList> positionOfferingTypeCodes) {
        positionPreferenceType.getPositionOfferingTypeCodes().addAll(positionOfferingTypeCodes);
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionScheduleTypeCodes(List<PositionScheduleTypeCodeList> positionScheduleTypeCodes) {
        positionPreferenceType.getPositionScheduleTypeCodes().addAll(positionScheduleTypeCodes);
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftSchedules(List<ScheduleType> shiftSchedules) {
        positionPreferenceType.getShiftSchedules().addAll(shiftSchedules);
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftDescriptions(List<String> shiftDescriptions) {
        positionPreferenceType.getShiftDescriptions().addAll(shiftDescriptions);
        return this;
    }

    public PositionPreferenceTypeBuilder setRemoteWork(RemoteWorkType remoteWork) {
        positionPreferenceType.setRemoteWork(remoteWork);
        return this;
    }

    public PositionPreferenceTypeBuilder setCareerLevelCodes(List<CareerLevelCodeList> careerLevelCodes) {
        positionPreferenceType.setCareerLevelCodes(careerLevelCodes);
        return this;
    }

    public PositionPreferenceTypeBuilder setJobGradeCode(EntityType jobGradeCode) {
        positionPreferenceType.setJobGradeCode(jobGradeCode);
        return this;
    }

    public PositionPreferenceTypeBuilder setOfferedRemunerationPackage(RemunerationPackageType offeredRemunerationPackage) {
        positionPreferenceType.setOfferedRemunerationPackage(offeredRemunerationPackage);
        return this;
    }

    public PositionPreferenceTypeBuilder setTravel(TravelType travel) {
        positionPreferenceType.setTravel(travel);
        return this;
    }

    public PositionPreferenceTypeBuilder setRelocation(RelocationType relocation) {
        positionPreferenceType.setRelocation(relocation);
        return this;
    }

    public PositionPreferenceTypeBuilder setWorkingLanguageCodes(List<LanguageCodeList> workingLanguageCodes) {
        positionPreferenceType.setWorkingLanguageCodes(workingLanguageCodes);
        return this;
    }

    public PositionPreferenceType build() {
        return positionPreferenceType;
    }
}