package se.arbetsformedlingen.matchning.portability.builder.hropen421xsd;

import se.arbetsformedlingen.matchning.portability.model.asp.Arbetsort;

public class PositionPreferenceTypeBuilder {
    private PositionPreferenceType positionPreferenceType = new PositionPreferenceType();

    public PositionPreferenceTypeBuilder setLocations(PositionPreferenceType.Locations locations) {
        positionPreferenceType.setLocations(locations);
        return this;
    }

    public PositionPreferenceTypeBuilder setJobCategories(PositionPreferenceType.JobCategories jobCategories) {
        positionPreferenceType.setJobCategories(jobCategories);
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionTitles(StringTypeArray positionTitles) {
        positionPreferenceType.setPositionTitles(positionTitles);
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionOfferingTypeCodes(PositionPreferenceType.PositionOfferingTypeCodes positionOfferingTypeCodes) {
        positionPreferenceType.setPositionOfferingTypeCodes(positionOfferingTypeCodes);
        return this;
    }

    public PositionPreferenceTypeBuilder setPositionScheduleTypeCodes(PositionPreferenceType.PositionScheduleTypeCodes positionScheduleTypeCodes) {
        positionPreferenceType.setPositionScheduleTypeCodes(positionScheduleTypeCodes);
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftSchedules(PositionPreferenceType.ShiftSchedules shiftSchedules) {
        positionPreferenceType.setShiftSchedules(shiftSchedules);
        return this;
    }

    public PositionPreferenceTypeBuilder setShiftDescriptions(StringTypeArray shiftDescriptions) {
        positionPreferenceType.setShiftDescriptions(shiftDescriptions);
        return this;
    }

    public PositionPreferenceTypeBuilder setRemoteWork(RemoteWorkType remoteWork) {
        positionPreferenceType.setRemoteWork(remoteWork);
        return this;
    }

    public PositionPreferenceTypeBuilder setCareerLevelCodes(PositionPreferenceType.CareerLevelCodes careerLevelCodes) {
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

    public PositionPreferenceTypeBuilder setWorkingLanguageCodes(PositionPreferenceType.WorkingLanguageCodes workingLanguageCodes) {
        positionPreferenceType.setWorkingLanguageCodes(workingLanguageCodes);
        return this;
    }

    public PositionPreferenceType build() {
        return positionPreferenceType;
    }

    public PositionPreferenceTypeBuilder withArbetsort(Arbetsort arbetsort) {

        final AddressType addressType = new AddressTypeBuilder()
                .setCity(arbetsort.getVarde1())
                .setCountrySubDivisions(new AddressTypeCountrySubDivisionsBuilder().build())
                .build();

        final PreferredLocationType preferredLocationType = new PreferredLocationType();
        preferredLocationType.setReferenceLocation(addressType);

        final PositionPreferenceType.Locations locations = new PositionPreferenceType.Locations();
        locations.getItem().add(preferredLocationType);

        setLocations(locations);

        return this;
    }
}