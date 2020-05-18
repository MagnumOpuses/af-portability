package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemunerationPackageType", propOrder = {

})
public class RemunerationPackageType {

    protected XMLGregorianCalendar validFrom;
    protected XMLGregorianCalendar validTo;
    protected EntityType id;
    protected RemunerationBasisCodeList basisCode;
    protected List<RemunerationRangeType> ranges;
    protected StringTypeArray benefitsSummary;
    protected StringTypeArray descriptions;

    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(XMLGregorianCalendar validFrom) {
        this.validFrom = validFrom;
    }

    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    public void setValidTo(XMLGregorianCalendar validTo) {
        this.validTo = validTo;
    }

    public EntityType getId() {
        return id;
    }

    public void setId(EntityType id) {
        this.id = id;
    }

    public RemunerationBasisCodeList getBasisCode() {
        return basisCode;
    }

    public void setBasisCode(RemunerationBasisCodeList basisCode) {
        this.basisCode = basisCode;
    }

    public List<RemunerationRangeType> getRanges() {
        if (ranges == null) {
            ranges = new ArrayList<RemunerationRangeType>();
        }
        return this.ranges;
    }

    public StringTypeArray getBenefitsSummary() {
        return benefitsSummary;
    }

    public void setBenefitsSummary(StringTypeArray benefitsSummary) {
        this.benefitsSummary = benefitsSummary;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }
}
