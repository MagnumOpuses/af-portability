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

    protected List<PreferredLocationType> locations;
    protected List<EntityType> jobCategories;
    protected List<String> positionTitles;
    protected List<PositionTypeCodeList> positionOfferingTypeCodes;
    protected List<PositionScheduleTypeCodeList> positionScheduleTypeCodes;
    protected List<ScheduleType> shiftSchedules;
    protected List<String> shiftDescriptions;
    protected RemoteWorkType remoteWork; //Not used in current implementation
    protected List<CareerLevelCodeList> careerLevelCodes;
    protected EntityType jobGradeCode;
    protected RemunerationPackageType offeredRemunerationPackage; //Not used in current implementation
    protected TravelType travel; //Not used in current implementation
    protected RelocationType relocation; //Not used in current implementation
    protected List<LanguageCodeList> workingLanguageCodes; //Not used in current implementation

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
