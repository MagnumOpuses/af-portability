package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecifiedCompetencyType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecifiedCompetencyType {

    protected List<IdentifierType> competencyIds;
    protected String name;
    protected BaseScoreType proficiencyLevel;

    public List<IdentifierType> getCompetencyIds() {
        if (competencyIds == null) {
            competencyIds = new ArrayList<IdentifierType>();
        }
        return this.competencyIds;
    }

    public void setCompetencyIds(final List<IdentifierType> competencyIds) {
        this.competencyIds = competencyIds;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BaseScoreType getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(final BaseScoreType proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }
}
