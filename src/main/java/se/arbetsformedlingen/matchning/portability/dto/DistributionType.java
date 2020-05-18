package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionType", propOrder = {

})
public class DistributionType {

    protected String startDate;
    protected String endDate;
    protected String duration;
    protected EntityType person;
    protected OrganizationType organization;
    protected CommunicationType communication;
    protected StringTypeArray descriptions;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public EntityType getPerson() {
        return person;
    }

    public void setPerson(EntityType person) {
        this.person = person;
    }

    public OrganizationType getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(CommunicationType communication) {
        this.communication = communication;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }
}
