package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionPreferenceType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositionPreferenceType {

    public List<PreferredLocationType> locations;
    public List<EntityType> jobCategories;
    public List<String> positionTitles;
    public List<PositionTypeCodeList> positionOfferingTypeCodes;
    public List<PositionScheduleTypeCodeList> positionScheduleTypeCodes;
    public List<ScheduleType> shiftSchedules;
    public List<String> shiftDescriptions;
    public RemoteWorkType remoteWork;
    public List<CareerLevelCodeList> careerLevelCodes;
    public EntityType jobGradeCode;
    public RemunerationPackageType offeredRemunerationPackage;
    public TravelType travel;
    public RelocationType relocation;
    public List<LanguageCodeList> workingLanguageCodes;


    public List<PreferredLocationType> getLocations() {
        if (locations == null) {
            locations = new ArrayList<PreferredLocationType>();
        }
        return this.locations;
    }

    public void setLocations(final List<PreferredLocationType> locations) {
        this.locations = locations;
    }

    public List<EntityType> getJobCategories() {
        if (jobCategories == null) {
            jobCategories = new ArrayList<EntityType>();
        }
        return this.jobCategories;
    }

    public void setJobCategories(final List<EntityType> jobCategories) {
        this.jobCategories = jobCategories;
    }

    public List<String> getPositionTitles() {
        if (positionTitles == null) {
            positionTitles = new ArrayList<String>();
        }
        return this.positionTitles;
    }

    public void setPositionTitles(final List<String> positionTitles) {
        this.positionTitles = positionTitles;
    }

    public List<PositionTypeCodeList> getPositionOfferingTypeCodes() {
        if (positionOfferingTypeCodes == null) {
            positionOfferingTypeCodes = new ArrayList<PositionTypeCodeList>();
        }
        return this.positionOfferingTypeCodes;
    }

    public void setPositionOfferingTypeCodes(final List<PositionTypeCodeList> positionOfferingTypeCodes) {
        this.positionOfferingTypeCodes = positionOfferingTypeCodes;
    }

    public List<PositionScheduleTypeCodeList> getPositionScheduleTypeCodes() {
        if (positionScheduleTypeCodes == null) {
            positionScheduleTypeCodes = new ArrayList<PositionScheduleTypeCodeList>();
        }
        return this.positionScheduleTypeCodes;
    }

    public void setPositionScheduleTypeCodes(final List<PositionScheduleTypeCodeList> positionScheduleTypeCodes) {
        this.positionScheduleTypeCodes = positionScheduleTypeCodes;
    }

    public List<ScheduleType> getShiftSchedules() {
        if (shiftSchedules == null) {
            shiftSchedules = new ArrayList<ScheduleType>();
        }
        return this.shiftSchedules;
    }

    public void setShiftSchedules(final List<ScheduleType> shiftSchedules) {
        this.shiftSchedules = shiftSchedules;
    }

    public List<String> getShiftDescriptions() {
        if (shiftDescriptions == null) {
            shiftDescriptions = new ArrayList<String>();
        }
        return this.shiftDescriptions;
    }

    public void setShiftDescriptions(final List<String> shiftDescriptions) {
        this.shiftDescriptions = shiftDescriptions;
    }

    public RemoteWorkType getRemoteWork() {
        return remoteWork;
    }

    public void setRemoteWork(final RemoteWorkType remoteWork) {
        this.remoteWork = remoteWork;
    }

    public List<CareerLevelCodeList> getCareerLevelCodes() {
        return careerLevelCodes;
    }

    public void setCareerLevelCodes(final List<CareerLevelCodeList> careerLevelCodes) {
        this.careerLevelCodes = careerLevelCodes;
    }

    public EntityType getJobGradeCode() {
        return jobGradeCode;
    }

    public void setJobGradeCode(final EntityType jobGradeCode) {
        this.jobGradeCode = jobGradeCode;
    }

    public RemunerationPackageType getOfferedRemunerationPackage() {
        return offeredRemunerationPackage;
    }

    public void setOfferedRemunerationPackage(final RemunerationPackageType offeredRemunerationPackage) {
        this.offeredRemunerationPackage = offeredRemunerationPackage;
    }

    public TravelType getTravel() {
        return travel;
    }

    public void setTravel(final TravelType travel) {
        this.travel = travel;
    }

    public RelocationType getRelocation() {
        return relocation;
    }

    public void setRelocation(final RelocationType relocation) {
        this.relocation = relocation;
    }

    public List<LanguageCodeList> getWorkingLanguageCodes() {
        if (workingLanguageCodes == null) {
            workingLanguageCodes = new ArrayList<LanguageCodeList>();
        }
        return this.workingLanguageCodes;
    }

    public void setWorkingLanguageCodes(final List<LanguageCodeList> workingLanguageCodes) {
        this.workingLanguageCodes = workingLanguageCodes;
    }
}
