package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationAttendanceType", propOrder = {

})
public class EducationAttendanceType {

    public IdentifierType id;
    public String start;
    public String end;
    public Boolean current;
    public List<AttachmentReferenceType> attachmentReferences;
    public List<String> descriptions;
    public OrganizationType institution;
    public OrganizationType department;
    public List<String> programs;
    public List<EntityType> educationLevelCodes;
    public Boolean currentlyAttendingIndicator;
    public Boolean goodStandingIndicator;
    public List<EducationDegreeType> educationDegrees;
    public FormattedDateTimeType otherAttendancePeriods;


    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(final String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(final String end) {
        this.end = end;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(final Boolean current) {
        this.current = current;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public void setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public List<String> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        return this.descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public OrganizationType getInstitution() {
        return institution;
    }

    public void setInstitution(final OrganizationType institution) {
        this.institution = institution;
    }

    public OrganizationType getDepartment() {
        return department;
    }

    public void setDepartment(final OrganizationType department) {
        this.department = department;
    }

    public List<String> getPrograms() {
        return programs;
    }

    public void setPrograms(final List<String> programs) {
        this.programs = programs;
    }

    public List<EntityType> getEducationLevelCodes() {
        if (educationLevelCodes == null) {
            educationLevelCodes = new ArrayList<EntityType>();
        }
        return this.educationLevelCodes;
    }

    public void setEducationLevelCodes(final List<EntityType> educationLevelCodes) {
        this.educationLevelCodes = educationLevelCodes;
    }

    public Boolean getCurrentlyAttendingIndicator() {
        return currentlyAttendingIndicator;
    }

    public void setCurrentlyAttendingIndicator(final Boolean currentlyAttendingIndicator) {
        this.currentlyAttendingIndicator = currentlyAttendingIndicator;
    }

    public Boolean getGoodStandingIndicator() {
        return goodStandingIndicator;
    }

    public void setGoodStandingIndicator(final Boolean goodStandingIndicator) {
        this.goodStandingIndicator = goodStandingIndicator;
    }

    public List<EducationDegreeType> getEducationDegrees() {
        if (educationDegrees == null) {
            educationDegrees = new ArrayList<EducationDegreeType>();
        }
        return this.educationDegrees;
    }

    public void setEducationDegrees(final List<EducationDegreeType> educationDegrees) {
        this.educationDegrees = educationDegrees;
    }

    public FormattedDateTimeType getOtherAttendancePeriods() {
        return otherAttendancePeriods;
    }

    public void setOtherAttendancePeriods(final FormattedDateTimeType otherAttendancePeriods) {
        this.otherAttendancePeriods = otherAttendancePeriods;
    }

}
