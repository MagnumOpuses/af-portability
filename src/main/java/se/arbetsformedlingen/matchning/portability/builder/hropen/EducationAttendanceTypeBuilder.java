package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EducationAttendanceType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.OrganizationType;
import se.arbetsformedlingen.matchning.portability.model.hropen.StringTypeArray;

public class EducationAttendanceTypeBuilder {
    private IdentifierType id;
    private String start;
    private String end;
    private Boolean current;
    private EducationAttendanceType.AttachmentReferences attachmentReferences;
    private StringTypeArray descriptions;
    private OrganizationType institution;
    private OrganizationType department;
    private StringTypeArray programs;
    private EducationAttendanceType.EducationLevelCodes educationLevelCodes;
    private Boolean currentlyAttendingIndicator;
    private Boolean goodStandingIndicator;
    private EducationAttendanceType.EducationDegrees educationDegrees;
    private EducationAttendanceType.OtherAttendancePeriods otherAttendancePeriods;

    public EducationAttendanceTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public EducationAttendanceTypeBuilder setStart(String start) {
        this.start = start;
        return this;
    }

    public EducationAttendanceTypeBuilder setEnd(String end) {
        this.end = end;
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrent(Boolean current) {
        this.current = current;
        return this;
    }

    public EducationAttendanceTypeBuilder setAttachmentReferences(EducationAttendanceType.AttachmentReferences attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
        return this;
    }

    public EducationAttendanceTypeBuilder setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public EducationAttendanceTypeBuilder setInstitution(OrganizationType institution) {
        this.institution = institution;
        return this;
    }

    public EducationAttendanceTypeBuilder setDepartment(OrganizationType department) {
        this.department = department;
        return this;
    }

    public EducationAttendanceTypeBuilder setPrograms(StringTypeArray programs) {
        this.programs = programs;
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationLevelCodes(EducationAttendanceType.EducationLevelCodes educationLevelCodes) {
        this.educationLevelCodes = educationLevelCodes;
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrentlyAttendingIndicator(Boolean currentlyAttendingIndicator) {
        this.currentlyAttendingIndicator = currentlyAttendingIndicator;
        return this;
    }

    public EducationAttendanceTypeBuilder setGoodStandingIndicator(Boolean goodStandingIndicator) {
        this.goodStandingIndicator = goodStandingIndicator;
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationDegrees(EducationAttendanceType.EducationDegrees educationDegrees) {
        this.educationDegrees = educationDegrees;
        return this;
    }

    public EducationAttendanceTypeBuilder setOtherAttendancePeriods(EducationAttendanceType.OtherAttendancePeriods otherAttendancePeriods) {
        this.otherAttendancePeriods = otherAttendancePeriods;
        return this;
    }

    public EducationAttendanceType createEducationAttendanceType() {
        return new EducationAttendanceType(id, start, end, current, attachmentReferences, descriptions, institution, department, programs, educationLevelCodes, currentlyAttendingIndicator, goodStandingIndicator, educationDegrees, otherAttendancePeriods);
    }
}