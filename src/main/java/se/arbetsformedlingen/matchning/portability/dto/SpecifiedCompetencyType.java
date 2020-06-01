package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecifiedCompetencyType", propOrder = {

})
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

    public void setCompetencyIds(List<IdentifierType> competencyIds) {
        this.competencyIds = competencyIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseScoreType getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(BaseScoreType proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }
}
