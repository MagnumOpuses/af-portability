package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.asp.Utbildning;
import se.arbetsformedlingen.matchning.portability.model.hropen.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public EducationAttendanceTypeBuilder setAttachmentReferences(EducationAttendanceType.AttachmentReferences attachmentReferences) {
        educationAttendanceType.setAttachmentReferences(attachmentReferences);
        return this;
    }

    public EducationAttendanceTypeBuilder setDescriptions(StringTypeArray descriptions) {
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

    public EducationAttendanceTypeBuilder setEducationLevelCodes(EducationAttendanceType.EducationLevelCodes educationLevelCodes) {
        educationAttendanceType.setEducationLevelCodes(educationLevelCodes);
        return this;
    }

    public EducationAttendanceTypeBuilder setCurrentlyAttendingIndicator(Boolean currentlyAttendingIndicator) {
        educationAttendanceType.setCurrentlyAttendingIndicator(currentlyAttendingIndicator);
        return this;
    }

    public EducationAttendanceTypeBuilder setGoodStandingIndicator(Boolean goodStandingIndicator) {
        educationAttendanceType.setGoodStandingIndicator(goodStandingIndicator);
        return this;
    }

    public EducationAttendanceTypeBuilder setEducationDegrees(EducationAttendanceType.EducationDegrees educationDegrees) {
        educationAttendanceType.setEducationDegrees(educationDegrees);
        return this;
    }

    public EducationAttendanceTypeBuilder setOtherAttendancePeriods(EducationAttendanceType.OtherAttendancePeriods otherAttendancePeriods) {
        educationAttendanceType.setOtherAttendancePeriods(otherAttendancePeriods);
        return this;
    }

    public EducationAttendanceType build() {
        return educationAttendanceType;
    }

    public EducationAttendanceTypeBuilder withUtbildning(Utbildning utbildning) {
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