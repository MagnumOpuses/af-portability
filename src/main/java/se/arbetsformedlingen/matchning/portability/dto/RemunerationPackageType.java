package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemunerationPackageType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemunerationPackageType {

    protected XMLGregorianCalendar validFrom;
    protected XMLGregorianCalendar validTo;
    protected EntityType id;
    protected RemunerationBasisCodeList basisCode;
    protected List<RemunerationRangeType> ranges;
    protected List<String> benefitsSummary;
    protected List<String> descriptions;

    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(final XMLGregorianCalendar validFrom) {
        this.validFrom = validFrom;
    }

    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    public void setValidTo(final XMLGregorianCalendar validTo) {
        this.validTo = validTo;
    }

    public EntityType getId() {
        return id;
    }

    public void setId(final EntityType id) {
        this.id = id;
    }

    public RemunerationBasisCodeList getBasisCode() {
        return basisCode;
    }

    public void setBasisCode(final RemunerationBasisCodeList basisCode) {
        this.basisCode = basisCode;
    }

    public List<RemunerationRangeType> getRanges() {
        if (ranges == null) {
            ranges = new ArrayList<RemunerationRangeType>();
        }
        return this.ranges;
    }

    public void setRanges(final List<RemunerationRangeType> ranges) {
        this.ranges = ranges;
    }

    public List<String> getBenefitsSummary() {
        return benefitsSummary;
    }

    public void setBenefitsSummary(final List<String> benefitsSummary) {
        this.benefitsSummary = benefitsSummary;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
