package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationAttendanceType", propOrder = {

})
public class EducationAttendanceType {

    protected IdentifierType id;
    protected String start;
    protected String end;
    protected Boolean current;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected List<String> descriptions;
    protected OrganizationType institution;
    protected OrganizationType department;
    protected StringTypeArray programs;
    protected List<EntityType> educationLevelCodes;
    protected Boolean currentlyAttendingIndicator;
    protected Boolean goodStandingIndicator;
    protected List<EducationDegreeType> educationDegrees;
    protected FormattedDateTimeType otherAttendancePeriods;


    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public List<String> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        return this.descriptions;
    }

    public OrganizationType getInstitution() {
        return institution;
    }

    public void setInstitution(OrganizationType institution) {
        this.institution = institution;
    }

    public OrganizationType getDepartment() {
        return department;
    }

    public void setDepartment(OrganizationType department) {
        this.department = department;
    }

    public StringTypeArray getPrograms() {
        return programs;
    }

    public void setPrograms(StringTypeArray programs) {
        this.programs = programs;
    }

    public List<EntityType> getEducationLevelCodes() {
        if (educationLevelCodes == null) {
            educationLevelCodes = new ArrayList<EntityType>();
        }
        return this.educationLevelCodes;
    }

    public Boolean getCurrentlyAttendingIndicator() {
        return currentlyAttendingIndicator;
    }

    public void setCurrentlyAttendingIndicator(Boolean currentlyAttendingIndicator) {
        this.currentlyAttendingIndicator = currentlyAttendingIndicator;
    }

    public Boolean getGoodStandingIndicator() {
        return goodStandingIndicator;
    }

    public void setGoodStandingIndicator(Boolean goodStandingIndicator) {
        this.goodStandingIndicator = goodStandingIndicator;
    }

    public List<EducationDegreeType> getEducationDegrees() {
        if (educationDegrees == null) {
            educationDegrees = new ArrayList<EducationDegreeType>();
        }
        return this.educationDegrees;
    }

    public FormattedDateTimeType getOtherAttendancePeriods() {
        return otherAttendancePeriods;
    }

    public void setOtherAttendancePeriods(FormattedDateTimeType otherAttendancePeriods) {
        this.otherAttendancePeriods = otherAttendancePeriods;
    }

}
