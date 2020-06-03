package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.*;

import java.util.List;

public class EducationAttendanceTypeBuilder {
    private final EducationAttendanceType educationAttendanceType = new EducationAttendanceType();

    public EducationAttendanceTypeBuilder setId(final IdentifierType id) {
        educationAttendanceType.setId(id);
        return this;
    }

    public EducationAttendanceTypeBuilder setStart(final String start) {
        educationAttendanceType.setStart(start);
        return this;
    }

    public EducationAttendanceTypeBuilder setEnd(final String end) {
        educationAttendanceType.setEnd(end);
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrent(final Boolean current) {
        educationAttendanceType.setCurrent(current);
        return this;
    }

    public EducationAttendanceTypeBuilder setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        educationAttendanceType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public EducationAttendanceTypeBuilder setDescriptions(final List<String> descriptions) {
        educationAttendanceType.setDescriptions(descriptions);
        return this;
    }

    public EducationAttendanceTypeBuilder setInstitution(final OrganizationType institution) {
        educationAttendanceType.setInstitution(institution);
        return this;
    }

    public EducationAttendanceTypeBuilder setDepartment(final OrganizationType department) {
        educationAttendanceType.setDepartment(department);
        return this;
    }

    public EducationAttendanceTypeBuilder setPrograms(final List<String> programs) {
        educationAttendanceType.setPrograms(programs);
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationLevelCodes(final List<EntityType> educationLevelCodes) {
        educationAttendanceType.setEducationLevelCodes(educationLevelCodes);
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrentlyAttendingIndicator(final Boolean currentlyAttendingIndicator) {
        educationAttendanceType.setCurrentlyAttendingIndicator(currentlyAttendingIndicator);
        return this;
    }

    public EducationAttendanceTypeBuilder setGoodStandingIndicator(final Boolean goodStandingIndicator) {
        educationAttendanceType.goodStandingIndicator = goodStandingIndicator;
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationDegrees(final List<EducationDegreeType> educationDegrees) {
        educationAttendanceType.educationDegrees = educationDegrees;
        return this;
    }

    public EducationAttendanceTypeBuilder setOtherAttendancePeriods(final FormattedDateTimeType otherAttendancePeriods) {
        educationAttendanceType.otherAttendancePeriods = otherAttendancePeriods;
        return this;
    }

    public EducationAttendanceType build() {
        return educationAttendanceType;
    }

}