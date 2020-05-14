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
 * Terms offered or agreed regarding remuneration for a position. May include pay as well as benefits in-kind.
 * 
 * <p>Java class for RemunerationPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemunerationPackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="validFrom" type="{https://hropenstandards.org/schema/xml/}DateTimeType" minOccurs="0"/>
 *         &lt;element name="validTo" type="{https://hropenstandards.org/schema/xml/}DateTimeType" minOccurs="0"/>
 *         &lt;element name="id" type="{https://hropenstandards.org/schema/xml/}EntityType" minOccurs="0"/>
 *         &lt;element name="basisCode" type="{https://hropenstandards.org/schema/xml/}RemunerationBasisCodeList" minOccurs="0"/>
 *         &lt;element name="ranges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}RemunerationRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="benefitsSummary" type="{https://hropenstandards.org/schema/xml/}StringTypeArray" minOccurs="0"/>
 *         &lt;element name="descriptions" type="{https://hropenstandards.org/schema/xml/}StringTypeArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemunerationPackageType", propOrder = {

})
public class RemunerationPackageType {

    protected XMLGregorianCalendar validFrom;
    protected XMLGregorianCalendar validTo;
    protected EntityType id;
    protected RemunerationBasisCodeList basisCode;
    protected Ranges ranges;
    protected StringTypeArray benefitsSummary;
    protected StringTypeArray descriptions;

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setId(EntityType value) {
        this.id = value;
    }

    /**
     * Gets the value of the basisCode property.
     * 
     * @return
     *     possible object is
     *     {@link RemunerationBasisCodeList }
     *     
     */
    public RemunerationBasisCodeList getBasisCode() {
        return basisCode;
    }

    /**
     * Sets the value of the basisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemunerationBasisCodeList }
     *     
     */
    public void setBasisCode(RemunerationBasisCodeList value) {
        this.basisCode = value;
    }

    /**
     * Gets the value of the ranges property.
     * 
     * @return
     *     possible object is
     *     {@link Ranges }
     *     
     */
    public Ranges getRanges() {
        return ranges;
    }

    /**
     * Sets the value of the ranges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ranges }
     *     
     */
    public void setRanges(Ranges value) {
        this.ranges = value;
    }

    /**
     * Gets the value of the benefitsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeArray }
     *     
     */
    public StringTypeArray getBenefitsSummary() {
        return benefitsSummary;
    }

    /**
     * Sets the value of the benefitsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeArray }
     *     
     */
    public void setBenefitsSummary(StringTypeArray value) {
        this.benefitsSummary = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}RemunerationRangeType" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class Ranges {

        protected List<RemunerationRangeType> item;

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
         * {@link RemunerationRangeType }
         * 
         * 
         */
        public List<RemunerationRangeType> getItem() {
            if (item == null) {
                item = new ArrayList<RemunerationRangeType>();
            }
            return this.item;
        }

    }

}
