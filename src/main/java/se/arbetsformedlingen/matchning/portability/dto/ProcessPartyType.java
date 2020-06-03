package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessPartyType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessPartyType {

    protected SpecifiedPersonType person;
    protected OrganizationReferenceType organization;

    public SpecifiedPersonType getPerson() {
        return person;
    }

    public void setPerson(final SpecifiedPersonType person) {
        this.person = person;
    }

    public OrganizationReferenceType getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationReferenceType organization) {
        this.organization = organization;
    }
}
