package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationReferenceType", propOrder = {

})
public class OrganizationReferenceType {

    public IdentifierType id;
    public String name;
    public String code;
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

    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}
