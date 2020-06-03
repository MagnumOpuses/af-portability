package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributeToType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DistributeToType {

    protected String startDate;
    protected String endDate;
    protected String duration;
    protected EntityType person;
    protected OrganizationType organization;
    protected CommunicationType communication;
    protected List<String> descriptions;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(final String duration) {
        this.duration = duration;
    }

    public EntityType getPerson() {
        return person;
    }

    public void setPerson(final EntityType person) {
        this.person = person;
    }

    public OrganizationType getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationType organization) {
        this.organization = organization;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(final CommunicationType communication) {
        this.communication = communication;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
