package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessPartyType", propOrder = {

})
public class ProcessPartyType {

    protected SpecifiedPersonType person;
    protected OrganizationReferenceType organization;

    public SpecifiedPersonType getPerson() {
        return person;
    }

    public void setPerson(SpecifiedPersonType person) {
        this.person = person;
    }

    public OrganizationReferenceType getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationReferenceType organization) {
        this.organization = organization;
    }
}
