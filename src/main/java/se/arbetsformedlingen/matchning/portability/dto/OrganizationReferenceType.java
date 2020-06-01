package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationReferenceType", propOrder = {

})
public class OrganizationReferenceType {

    protected IdentifierType id;
    protected String name;
    protected String code;
    protected ResponsibilityCodeList responsibilityCode;
    protected CommunicationType communication;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResponsibilityCodeList getResponsibilityCode() {
        return responsibilityCode;
    }

    public void setResponsibilityCode(ResponsibilityCodeList responsibilityCode) {
        this.responsibilityCode = responsibilityCode;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(CommunicationType communication) {
        this.communication = communication;
    }
}
