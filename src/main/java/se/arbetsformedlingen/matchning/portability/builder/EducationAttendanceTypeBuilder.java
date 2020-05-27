package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class EducationAttendanceTypeBuilder {
    private EducationAttendanceType educationAttendanceType = new EducationAttendanceType();

    public EducationAttendanceTypeBuilder setId(IdentifierType id) {
        educationAttendanceType.setId(id);
        return this;
    }

    public EducationAttendanceTypeBuilder setStart(String start) {
        educationAttendanceType.setStart(start);
        return this;
    }

    public EducationAttendanceTypeBuilder setEnd(String end) {
        educationAttendanceType.setEnd(end);
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrent(Boolean current) {
        educationAttendanceType.setCurrent(current);
        return this;
    }

    public EducationAttendanceTypeBuilder setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        educationAttendanceType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public EducationAttendanceTypeBuilder setDescriptions(List<String> descriptions) {
        educationAttendanceType.setDescriptions(descriptions);
        return this;
    }

    public EducationAttendanceTypeBuilder setInstitution(OrganizationType institution) {
        educationAttendanceType.setInstitution(institution);
        return this;
    }

    public EducationAttendanceTypeBuilder setDepartment(OrganizationType department) {
        educationAttendanceType.setDepartment(department);
        return this;
    }

    public EducationAttendanceTypeBuilder setPrograms(StringTypeArray programs) {
        educationAttendanceType.setPrograms(programs);
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationLevelCodes(List<EntityType> educationLevelCodes) {
        educationAttendanceType.setEducationLevelCodes(educationLevelCodes);
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrentlyAttendingIndicator(Boolean currentlyAttendingIndicator) {
        educationAttendanceType.setCurrentlyAttendingIndicator(currentlyAttendingIndicator);
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