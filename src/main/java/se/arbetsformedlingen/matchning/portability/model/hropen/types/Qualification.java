package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Qualification {
    private List<Identifier> competencyId;
    private String competencyName;
    private String description;
    private String proficiencyLevel;
    private Measure experienceMeasure;
    private Integer interestLevel;

    public List<Identifier> getCompetencyId() {
        return competencyId;
    }

    public void setCompetencyId(List<Identifier> competencyId) {
        this.competencyId = competencyId;
    }

    public String getCompetencyName() {
        return competencyName;
    }

    public void setCompetencyName(String competencyName) {
        this.competencyName = competencyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public Measure getExperienceMeasure() {
        return experienceMeasure;
    }

    public void setExperienceMeasure(Measure experienceMeasure) {
        this.experienceMeasure = experienceMeasure;
    }

    public Integer getInterestLevel() {
        return interestLevel;
    }

    public void setInterestLevel(int interestLevel) {
        this.interestLevel = interestLevel;
    }

    public Qualification withCompetencyName(String label) {
        setCompetencyName(label);
        return this;
    }

    public Qualification withDescription(String description) {
        setDescription(description);
        return this;
    }

    public Qualification withIdentifier(String id, String scheme) {
        if (this.competencyId == null) {
            this.competencyId = new ArrayList<>();
        }
        this.competencyId.add(new Identifier(id, scheme));
        return this;
    }
}
