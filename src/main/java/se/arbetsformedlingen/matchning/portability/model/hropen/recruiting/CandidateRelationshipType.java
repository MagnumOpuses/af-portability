
package se.arbetsformedlingen.matchning.portability.model.hropen.recruiting;

import se.arbetsformedlingen.matchning.portability.model.hropen.common.base.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.codelist.CandidateRelationshipCodeList;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the relationship of a candidate to the (potential) employer of his/her candidacy.
 * 
 * <p>Java class for CandidateRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="candidateRelationshipId" type="{https://hropenstandards.org/schema/xml/}IdentifierType" minOccurs="0"/>
 *         &lt;element name="internalCandidateIndicator" type="{https://hropenstandards.org/schema/xml/}IndicatorType" minOccurs="0"/>
 *         &lt;element name="candidateRelationshipCode" type="{https://hropenstandards.org/schema/xml/}CandidateRelationshipCodeList" minOccurs="0"/>
 *         &lt;element name="otherCandidateRelationshipCode" type="{https://hropenstandards.org/schema/xml/}CodeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateRelationshipType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CandidateRelationshipType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IdentifierType candidateRelationshipId;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean internalCandidateIndicator;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CandidateRelationshipCodeList candidateRelationshipCode;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String otherCandidateRelationshipCode;

    /**
     * Gets the value of the candidateRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IdentifierType getCandidateRelationshipId() {
        return candidateRelationshipId;
    }

    /**
     * Sets the value of the candidateRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCandidateRelationshipId(IdentifierType value) {
        this.candidateRelationshipId = value;
    }

    /**
     * Gets the value of the internalCandidateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isInternalCandidateIndicator() {
        return internalCandidateIndicator;
    }

    /**
     * Sets the value of the internalCandidateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInternalCandidateIndicator(Boolean value) {
        this.internalCandidateIndicator = value;
    }

    /**
     * Gets the value of the candidateRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateRelationshipCodeList }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CandidateRelationshipCodeList getCandidateRelationshipCode() {
        return candidateRelationshipCode;
    }

    /**
     * Sets the value of the candidateRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateRelationshipCodeList }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCandidateRelationshipCode(CandidateRelationshipCodeList value) {
        this.candidateRelationshipCode = value;
    }

    /**
     * Gets the value of the otherCandidateRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOtherCandidateRelationshipCode() {
        return otherCandidateRelationshipCode;
    }

    /**
     * Sets the value of the otherCandidateRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOtherCandidateRelationshipCode(String value) {
        this.otherCandidateRelationshipCode = value;
    }

}
