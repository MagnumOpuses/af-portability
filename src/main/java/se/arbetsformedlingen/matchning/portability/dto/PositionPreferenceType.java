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

    public void setLocations(List<PreferredLocationType> locations) {
        this.locations = locations;
    }

    public List<EntityType> getJobCategories() {
        if (jobCategories == null) {
            jobCategories = new ArrayList<EntityType>();
        }
        return this.jobCategories;
    }

    public void setJobCategories(List<EntityType> jobCategories) {
        this.jobCategories = jobCategories;
    }

    public List<String> getPositionTitles() {
        if (positionTitles == null) {
            positionTitles = new ArrayList<String>();
        }
        return this.positionTitles;
    }

    public void setPositionTitles(List<String> positionTitles) {
        this.positionTitles = positionTitles;
    }

    public List<PositionTypeCodeList> getPositionOfferingTypeCodes() {
        if (positionOfferingTypeCodes == null) {
            positionOfferingTypeCodes = new ArrayList<PositionTypeCodeList>();
        }
        return this.positionOfferingTypeCodes;
    }

    public void setPositionOfferingTypeCodes(List<PositionTypeCodeList> positionOfferingTypeCodes) {
        this.positionOfferingTypeCodes = positionOfferingTypeCodes;
    }

    public List<PositionScheduleTypeCodeList> getPositionScheduleTypeCodes() {
        if (positionScheduleTypeCodes == null) {
            positionScheduleTypeCodes = new ArrayList<PositionScheduleTypeCodeList>();
        }
        return this.positionScheduleTypeCodes;
    }

    public void setPositionScheduleTypeCodes(List<PositionScheduleTypeCodeList> positionScheduleTypeCodes) {
        this.positionScheduleTypeCodes = positionScheduleTypeCodes;
    }

    public List<ScheduleType> getShiftSchedules() {
        if (shiftSchedules == null) {
            shiftSchedules = new ArrayList<ScheduleType>();
        }
        return this.shiftSchedules;
    }

    public void setShiftSchedules(List<ScheduleType> shiftSchedules) {
        this.shiftSchedules = shiftSchedules;
    }

    public List<String> getShiftDescriptions() {
        if (shiftDescriptions == null) {
            shiftDescriptions = new ArrayList<String>();
        }
        return this.shiftDescriptions;
    }

    public void setShiftDescriptions(List<String> shiftDescriptions) {
        this.shiftDescriptions = shiftDescriptions;
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

    public void setWorkingLanguageCodes(List<LanguageCodeList> workingLanguageCodes) {
        this.workingLanguageCodes = workingLanguageCodes;
    }
}
