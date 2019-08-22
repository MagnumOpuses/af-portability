package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reference {
    private Identifier refereeId;
    private PersonName personName;
    private String positionTitle;
    private String organizationName;
    private Communication communication;
    private int yearsKnown;
    private String relationsship;
    private List<String> comments;

    public Identifier getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Identifier refereeId) {
        this.refereeId = refereeId;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

    public String getRelationsship() {
        return relationsship;
    }

    public void setRelationsship(String relationsship) {
        this.relationsship = relationsship;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
