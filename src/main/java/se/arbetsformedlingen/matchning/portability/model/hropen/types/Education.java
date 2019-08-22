package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Education {
    private Identifier id;
    private Organization institution;
    private Organization department;
    private List<DateRange> attendancePeriods;
    private List<String> programs;
    private List<Entity> educationLevelCodes;
    private boolean currentlyAttendingIndicator;
    private List<EducationDegree> educationDegrees;

    private String description; // From BaseHistory, TODO Refactor


    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Organization getInstitution() {
        return institution;
    }

    public void setInstitution(Organization institution) {
        this.institution = institution;
    }

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public List<DateRange> getAttendancePeriods() {
        return attendancePeriods;
    }

    public void setAttendancePeriods(List<DateRange> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
    }

    public List<String> getPrograms() {
        return programs;
    }

    public void setPrograms(List<String> programs) {
        this.programs = programs;
    }

    public List<Entity> getEducationLevelCodes() {
        return educationLevelCodes;
    }

     public void setEducationLevelCodes(List<Entity> educationLevelCodes) {
        this.educationLevelCodes = educationLevelCodes;
    }

    public boolean isCurrentlyAttendingIndicator() {
        if (attendancePeriods != null) {
            for (DateRange range : attendancePeriods) {
                if (range.isCurrentIndicator()) {
                    currentlyAttendingIndicator = true;
                }
            }
        }
        return currentlyAttendingIndicator;
    }

    public void setCurrentlyAttendingIndicator(boolean currentlyAttendingIndicator) {
        this.currentlyAttendingIndicator = currentlyAttendingIndicator;
    }


    public List<EducationDegree> getEducationDegrees() {
        return educationDegrees;
    }

    public void setEducationDegrees(List<EducationDegree> educationDegrees) {
        this.educationDegrees = educationDegrees;
    }

    public Education withSchool(String schoolName) {
        getCreateInstitution().setName(schoolName);
        return this;
    }

    public Education withProgram(String program) {
        if (this.programs == null) {
            this.programs = new ArrayList<>();
        }
        this.programs.add(program);
        return this;
    }

    public Education withAttendancePeriod(String fromYear, String fromMonth, String toYear, String toMonth) {
        getCreateAttendancePeriod().add(new DateRange().withStart(fromYear, fromMonth).withEnd(toYear, toMonth));
        return this;
    }

    private List<EducationDegree> getCreateEducationDegree() {
        if (this.educationDegrees == null) {
            this.educationDegrees = new ArrayList<>();
        }
        return this.educationDegrees;
    }

    private Organization getCreateInstitution() {
        if (this.institution == null) {
            this.institution = new Organization();
        }
        return this.institution;
    }
    private List<DateRange> getCreateAttendancePeriod() {
        if (this.attendancePeriods == null) {
            this.attendancePeriods = new ArrayList<>();
        }
        return this.attendancePeriods;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public class EducationDegree {
        private Identifier id;
        private String name;
        private List<String> codes;
        private Date date;
        private List<Entity> specializations;
        private List<String> academicHonors;
        private Score<Integer> scores;
        private EducationDegreeGrantedStatus degreeGrantedStatus;
        private ISCEDcode iscedEducationLevelCode;

        public Identifier getId() {
            return id;
        }

        public void setId(Identifier id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getCodes() {
            return codes;
        }

        public void setCodes(List<String> codes) {
            this.codes = codes;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public List<Entity> getSpecializations() {
            return specializations;
        }

        public void setSpecializations(List<Entity> specializations) {
            this.specializations = specializations;
        }

        public List<String> getAcademicHonors() {
            return academicHonors;
        }

        public void setAcademicHonors(List<String> academicHonors) {
            this.academicHonors = academicHonors;
        }

        public Score<Integer> getScores() {
            return scores;
        }

        public void setScores(Score<Integer> scores) {
            this.scores = scores;
        }

        public EducationDegreeGrantedStatus getDegreeGrantedStatus() {
            return degreeGrantedStatus;
        }

        public void setDegreeGrantedStatus(EducationDegreeGrantedStatus degreeGrantedStatus) {
            this.degreeGrantedStatus = degreeGrantedStatus;
        }

        public ISCEDcode getIscedEducationLevelCode() {
            return iscedEducationLevelCode;
        }

        public void setIscedEducationLevelCode(ISCEDcode iscedEducationLevelCode) {
            this.iscedEducationLevelCode = iscedEducationLevelCode;
        }
    }
    public enum EducationDegreeGrantedStatus {
        granted, inprogress, postponed, notgranted;
    }

}
