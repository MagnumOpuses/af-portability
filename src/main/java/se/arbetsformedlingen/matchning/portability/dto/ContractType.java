package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType", propOrder = {

})
public class ContractType {

    protected IdentifierType contractNumber;
    protected XMLGregorianCalendar contractStartDate;
    protected XMLGregorianCalendar contractEndDate;
    protected List<XMLGregorianCalendar> addendum;
    protected String workRelationshipType;

    public IdentifierType getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(IdentifierType contractNumber) {
        this.contractNumber = contractNumber;
    }

    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(XMLGregorianCalendar contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(XMLGregorianCalendar contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public List<XMLGregorianCalendar> getAddendum() {
        if (addendum == null) {
            addendum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.addendum;
    }

    public void setAddendum(List<XMLGregorianCalendar> addendum) {
        this.addendum = addendum;
    }

    public String getWorkRelationshipType() {
        return workRelationshipType;
    }

    public void setWorkRelationshipType(String workRelationshipType) {
        this.workRelationshipType = workRelationshipType;
    }
}
