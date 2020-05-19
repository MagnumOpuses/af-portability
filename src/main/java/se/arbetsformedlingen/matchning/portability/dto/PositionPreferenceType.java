package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionPreferenceType", propOrder = {

})
public class PositionPreferenceType {

    public List<PreferredLocationType> locations;
    public List<EntityType> jobCategories;
    public List<String> positionTitles;
    public List<PositionTypeCodeList> positionOfferingTypeCodes;
    public List<PositionScheduleTypeCodeList> positionScheduleTypeCodes;
    public List<ScheduleType> shiftSchedules;
    public List<String> shiftDescriptions;
    public RemoteWorkType remoteWork; //Not used in current implementation
    public List<CareerLevelCodeList> careerLevelCodes;
    public EntityType jobGradeCode;
    public RemunerationPackageType offeredRemunerationPackage; //Not used in current implementation
    public TravelType travel; //Not used in current implementation
    public RelocationType relocation; //Not used in current implementation
    public List<LanguageCodeList> workingLanguageCodes; //Not used in current implementation


    public List<PreferredLocationType> getLocations() {
        return locations;
    }

    public void setLocations(List<PreferredLocationType> locations) {
        this.locations = locations;
    }

    public List<EntityType> getJobCategories() {
        if (jobCategories == null) {
            jobCategories = new ArrayList<EntityType>();
        }
        return this.jobCategories;
    }

    public List<String> getPositionTitles() {
        if (positionTitles == null) {
            positionTitles = new ArrayList<String>();
        }
        return this.positionTitles;
    }

    public List<PositionTypeCodeList> getPositionOfferingTypeCodes() {
        if (positionOfferingTypeCodes == null) {
            positionOfferingTypeCodes = new ArrayList<PositionTypeCodeList>();
        }
        return this.positionOfferingTypeCodes;
    }

    public List<PositionScheduleTypeCodeList> getPositionScheduleTypeCodes() {
        if (positionScheduleTypeCodes == null) {
            positionScheduleTypeCodes = new ArrayList<PositionScheduleTypeCodeList>();
        }
        return this.positionScheduleTypeCodes;
    }

    public List<ScheduleType> getShiftSchedules() {
        if (shiftSchedules == null) {
            shiftSchedules = new ArrayList<ScheduleType>();
        }
        return this.shiftSchedules;
    }

    public List<String> getShiftDescriptions() {
        if (shiftDescriptions == null) {
            shiftDescriptions = new ArrayList<String>();
        }
        return this.shiftDescriptions;
    }

    public RemoteWorkType getRemoteWork() {
        return remoteWork;
    }

    public void setRemoteWork(RemoteWorkType remoteWork) {
        this.remoteWork = remoteWork;
    }

    public List<CareerLevelCodeList> getCareerLevelCodes() {
        return careerLevelCodes;
    }

    public void setCareerLevelCodes(List<CareerLevelCodeList> careerLevelCodes) {
        this.careerLevelCodes = careerLevelCodes;
    }

    public EntityType getJobGradeCode() {
        return jobGradeCode;
    }

    public void setJobGradeCode(EntityType jobGradeCode) {
        this.jobGradeCode = jobGradeCode;
    }

    public RemunerationPackageType getOfferedRemunerationPackage() {
        return offeredRemunerationPackage;
    }

    public void setOfferedRemunerationPackage(RemunerationPackageType offeredRemunerationPackage) {
        this.offeredRemunerationPackage = offeredRemunerationPackage;
    }

    public TravelType getTravel() {
        return travel;
    }

    public void setTravel(TravelType travel) {
        this.travel = travel;
    }

    public RelocationType getRelocation() {
        return relocation;
    }

    public void setRelocation(RelocationType relocation) {
        this.relocation = relocation;
    }

    public List<LanguageCodeList> getWorkingLanguageCodes() {
        if (workingLanguageCodes == null) {
            workingLanguageCodes = new ArrayList<LanguageCodeList>();
        }
        return this.workingLanguageCodes;
    }
}
