package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationReferenceType", propOrder = {

})
public class OrganizationReferenceType extends EntityType {

    protected ResponsibilityCodeList responsibilityCode;
    protected CommunicationType communication;

    public ResponsibilityCodeList getResponsibilityCode() {
        return responsibilityCode;
    }

    public void setResponsibilityCode(final ResponsibilityCodeList responsibilityCode) {
        this.responsibilityCode = responsibilityCode;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(final CommunicationType communication) {
        this.communication = communication;
    }
}
