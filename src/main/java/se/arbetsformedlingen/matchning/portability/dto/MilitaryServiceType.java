//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 05:13:24 PM CEST 
//


package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * History of military service. Service or employment in a military branch.
 * 
 * <p>Java class for MilitaryServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilitaryServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{https://hropenstandards.org/schema/xml/}IdentifierType" minOccurs="0"/>
 *         &lt;element name="start" type="{https://hropenstandards.org/schema/xml/}FormattedDateTimeType" minOccurs="0"/>
 *         &lt;element name="end" type="{https://hropenstandards.org/schema/xml/}FormattedDateTimeType" minOccurs="0"/>
 *         &lt;element name="current" type="{https://hropenstandards.org/schema/xml/}IndicatorType" minOccurs="0"/>
 *         &lt;element name="attachmentReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}AttachmentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="descriptions" type="{https://hropenstandards.org/schema/xml/}StringTypeArray" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{https://hropenstandards.org/schema/xml/}CountryCodeList" minOccurs="0"/>
 *         &lt;element name="serviceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="branch" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="division" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startingRank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="endingRank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currentRankIndicator" type="{https://hropenstandards.org/schema/xml/}IndicatorType" minOccurs="0"/>
 *         &lt;element name="campaigns" type="{https://hropenstandards.org/schema/xml/}StringTypeArray" minOccurs="0"/>
 *         &lt;element name="expertises" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}SpecifiedCompetencyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="honors" type="{https://hropenstandards.org/schema/xml/}StringTypeArray" minOccurs="0"/>
 *         &lt;element name="disciplinaryActions" type="{https://hropenstandards.org/schema/xml/}StringTypeArray" minOccurs="0"/>
 *         &lt;element name="dischargeStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dischargeDate" type="{https://hropenstandards.org/schema/xml/}DateType" minOccurs="0"/>
 *         &lt;element name="comments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilitaryServiceType", propOrder = {

})
public class MilitaryServiceType {

    protected IdentifierType id;
    protected String start;
    protected String end;
    protected Boolean current;
    protected AttachmentReferences attachmentReferences;
    protected StringTypeArray descriptions;
    protected CountryCodeList countryCode;
    protected String serviceNumber;
    protected String branch;
    protected String division;
    protected String startingRank;
    protected String endingRank;
    protected Boolean currentRankIndicator;
    protected StringTypeArray campaigns;
    protected Expertises expertises;
    protected StringTypeArray honors;
    protected StringTypeArray disciplinaryActions;
    protected String dischargeStatus;
    protected XMLGregorianCalendar dischargeDate;
    protected Comments comments;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setId(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

    /**
     * Gets the value of the attachmentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentReferences }
     *     
     */
    public AttachmentReferences getAttachmentReferences() {
        return attachmentReferences;
    }

    /**
     * Sets the value of the attachmentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentReferences }
     *     
     */
    public void setAttachmentReferences(AttachmentReferences value) {
        this.attachmentReferences = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeArray }
     *     
     */
    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeArray }
     *     
     */
    public void setDescriptions(StringTypeArray value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeList }
     *     
     */
    public CountryCodeList getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeList }
     *     
     */
    public void setCountryCode(CountryCodeList value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the startingRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingRank() {
        return startingRank;
    }

    /**
     * Sets the value of the startingRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingRank(String value) {
        this.startingRank = value;
    }

    /**
     * Gets the value of the endingRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingRank() {
        return endingRank;
    }

    /**
     * Sets the value of the endingRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingRank(String value) {
        this.endingRank = value;
    }

    /**
     * Gets the value of the currentRankIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRankIndicator() {
        return currentRankIndicator;
    }

    /**
     * Sets the value of the currentRankIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRankIndicator(Boolean value) {
        this.currentRankIndicator = value;
    }

    /**
     * Gets the value of the campaigns property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeArray }
     *     
     */
    public StringTypeArray getCampaigns() {
        return campaigns;
    }

    /**
     * Sets the value of the campaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeArray }
     *     
     */
    public void setCampaigns(StringTypeArray value) {
        this.campaigns = value;
    }

    /**
     * Gets the value of the expertises property.
     * 
     * @return
     *     possible object is
     *     {@link Expertises }
     *     
     */
    public Expertises getExpertises() {
        return expertises;
    }

    /**
     * Sets the value of the expertises property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expertises }
     *     
     */
    public void setExpertises(Expertises value) {
        this.expertises = value;
    }

    /**
     * Gets the value of the honors property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeArray }
     *     
     */
    public StringTypeArray getHonors() {
        return honors;
    }

    /**
     * Sets the value of the honors property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeArray }
     *     
     */
    public void setHonors(StringTypeArray value) {
        this.honors = value;
    }

    /**
     * Gets the value of the disciplinaryActions property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeArray }
     *     
     */
    public StringTypeArray getDisciplinaryActions() {
        return disciplinaryActions;
    }

    /**
     * Sets the value of the disciplinaryActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeArray }
     *     
     */
    public void setDisciplinaryActions(StringTypeArray value) {
        this.disciplinaryActions = value;
    }

    /**
     * Gets the value of the dischargeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeStatus() {
        return dischargeStatus;
    }

    /**
     * Sets the value of the dischargeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeStatus(String value) {
        this.dischargeStatus = value;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeDate(XMLGregorianCalendar value) {
        this.dischargeDate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    public void setComments(Comments value) {
        this.comments = value;
    }


    /**
     * Attachment references supporting the history entry.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}AttachmentReferenceType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class AttachmentReferences {

        protected List<AttachmentReferenceType> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentReferenceType }
         * 
         * 
         */
        public List<AttachmentReferenceType> getItem() {
            if (item == null) {
                item = new ArrayList<AttachmentReferenceType>();
            }
            return this.item;
        }

    }


    /**
     * Additional comments about the military service history.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Comments {

        protected List<CommentType> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommentType }
         * 
         * 
         */
        public List<CommentType> getItem() {
            if (item == null) {
                item = new ArrayList<CommentType>();
            }
            return this.item;
        }

    }


    /**
     * A list of expertise that the person developed during the service period.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}SpecifiedCompetencyType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Expertises {

        protected List<SpecifiedCompetencyType> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecifiedCompetencyType }
         * 
         * 
         */
        public List<SpecifiedCompetencyType> getItem() {
            if (item == null) {
                item = new ArrayList<SpecifiedCompetencyType>();
            }
            return this.item;
        }

    }

}
