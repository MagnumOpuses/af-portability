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


/**
 * Represents the remote work specification.
 * 
 * <p>Java class for RemoteWorkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteWorkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="remoteWorkIndicator" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="workLocationCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}WorkLocationCodeList" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="restrictionCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}RestrictionCodeList" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="remoteEligibilityRequirement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="restrictionDetails" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "RemoteWorkType", propOrder = {

})
public class RemoteWorkType {

    protected Boolean remoteWorkIndicator;
    protected WorkLocationCodes workLocationCodes;
    protected RestrictionCodes restrictionCodes;
    protected String remoteEligibilityRequirement;
    protected String restrictionDetails;

    /**
     * Gets the value of the remoteWorkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteWorkIndicator() {
        return remoteWorkIndicator;
    }

    /**
     * Sets the value of the remoteWorkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteWorkIndicator(Boolean value) {
        this.remoteWorkIndicator = value;
    }

    /**
     * Gets the value of the workLocationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocationCodes }
     *     
     */
    public WorkLocationCodes getWorkLocationCodes() {
        return workLocationCodes;
    }

    /**
     * Sets the value of the workLocationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocationCodes }
     *     
     */
    public void setWorkLocationCodes(WorkLocationCodes value) {
        this.workLocationCodes = value;
    }

    /**
     * Gets the value of the restrictionCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionCodes }
     *     
     */
    public RestrictionCodes getRestrictionCodes() {
        return restrictionCodes;
    }

    /**
     * Sets the value of the restrictionCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionCodes }
     *     
     */
    public void setRestrictionCodes(RestrictionCodes value) {
        this.restrictionCodes = value;
    }

    /**
     * Gets the value of the remoteEligibilityRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteEligibilityRequirement() {
        return remoteEligibilityRequirement;
    }

    /**
     * Sets the value of the remoteEligibilityRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteEligibilityRequirement(String value) {
        this.remoteEligibilityRequirement = value;
    }

    /**
     * Gets the value of the restrictionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionDetails() {
        return restrictionDetails;
    }

    /**
     * Sets the value of the restrictionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionDetails(String value) {
        this.restrictionDetails = value;
    }


    /**
     * A list of codes defining the scope of restrictions of work locations allowed for or desired for remote work.
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
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}RestrictionCodeList" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class RestrictionCodes {

        protected List<RestrictionCodeList> item;

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
         * {@link RestrictionCodeList }
         * 
         * 
         */
        public List<RestrictionCodeList> getItem() {
            if (item == null) {
                item = new ArrayList<RestrictionCodeList>();
            }
            return this.item;
        }

    }


    /**
     * A list of codes defining work locations allowed for or desired for remote work.
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
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}WorkLocationCodeList" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class WorkLocationCodes {

        protected List<WorkLocationCodeList> item;

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
         * {@link WorkLocationCodeList }
         * 
         * 
         */
        public List<WorkLocationCodeList> getItem() {
            if (item == null) {
                item = new ArrayList<WorkLocationCodeList>();
            }
            return this.item;
        }

    }

}
