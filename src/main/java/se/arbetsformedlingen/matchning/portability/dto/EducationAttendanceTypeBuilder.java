package se.arbetsformedlingen.matchning.portability.dto;

import se.arbetsformedlingen.matchning.portability.builder.OrganizationTypeBuilder;
import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;

import java.text.SimpleDateFormat;
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

    public EducationAttendanceTypeBuilder setDescriptions(StringTypeArray descriptions) {
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

    public se.arbetsformedlingen.matchning.portability.builder.EducationAttendanceTypeBuilder withUtbildning(Utbildning utbildning) {
        setInstitution(new OrganizationTypeBuilder().withUtbildning(utbildning).build());

        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        try {
            setStart(sdf.format(sdf.parse(utbildning.getStartdatum().getArtal() + "-" + utbildning.getStartdatum().getManad())));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            setEnd(sdf.format(sdf.parse(utbildning.getSlutdatum().getArtal() + "-" + utbildning.getSlutdatum().getManad())));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setCurrent(utbildning.isPagaende());

        StringTypeArray descriptions = new StringTypeArray();
        descriptions.getItem().add(utbildning.getInriktning());
        setDescriptions(descriptions);

        return this;
    }
}