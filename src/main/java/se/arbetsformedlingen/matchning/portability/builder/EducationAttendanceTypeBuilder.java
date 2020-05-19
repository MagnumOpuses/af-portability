package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class EducationAttendanceTypeBuilder {
    private EducationAttendanceType educationAttendanceType = new EducationAttendanceType();

    public EducationAttendanceTypeBuilder setId(IdentifierType id) {
        educationAttendanceType.id = id;
        return this;
    }

    public EducationAttendanceTypeBuilder setStart(String start) {
        educationAttendanceType.start = start;
        return this;
    }

    public EducationAttendanceTypeBuilder setEnd(String end) {
        educationAttendanceType.end = end;
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrent(Boolean current) {
        educationAttendanceType.current = current;
        return this;
    }

    public EducationAttendanceTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        educationAttendanceType.attachmentReferences = attachmentReferences;
        return this;
    }

    public EducationAttendanceTypeBuilder setDescriptions(List<String> descriptions) {
        educationAttendanceType.descriptions = descriptions;
        return this;
    }

    public EducationAttendanceTypeBuilder setInstitution(OrganizationType institution) {
        educationAttendanceType.institution = institution;
        return this;
    }

    public EducationAttendanceTypeBuilder setDepartment(OrganizationType department) {
        educationAttendanceType.department = department;
        return this;
    }

    public EducationAttendanceTypeBuilder setPrograms(StringTypeArray programs) {
        educationAttendanceType.programs = programs;
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationLevelCodes(List<EntityType> educationLevelCodes) {
        educationAttendanceType.educationLevelCodes = educationLevelCodes;
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrentlyAttendingIndicator(Boolean currentlyAttendingIndicator) {
        educationAttendanceType.currentlyAttendingIndicator = currentlyAttendingIndicator;
        return this;
    }

    public EducationAttendanceTypeBuilder setGoodStandingIndicator(Boolean goodStandingIndicator) {
        educationAttendanceType.goodStandingIndicator = goodStandingIndicator;
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationDegrees(List<EducationDegreeType> educationDegrees) {
        educationAttendanceType.educationDegrees = educationDegrees;
        return this;
    }

    public EducationAttendanceTypeBuilder setOtherAttendancePeriods(FormattedDateTimeType otherAttendancePeriods) {
        educationAttendanceType.otherAttendancePeriods = otherAttendancePeriods;
        return this;
    }

    public EducationAttendanceType build() {
        return educationAttendanceType;
    }

}