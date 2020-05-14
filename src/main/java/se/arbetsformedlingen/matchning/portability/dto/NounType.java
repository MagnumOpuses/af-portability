//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 05:13:24 PM CEST 
//


package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A common type that should be included at the top level of schemas.
 * 
 * <p>Java class for NounType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NounType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="language" type="{https://hropenstandards.org/schema/xml/}LanguageCodeList" minOccurs="0"/>
 *         &lt;element name="dataProtectionPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="retentionDate" type="{https://hropenstandards.org/schema/xml/}DateType" minOccurs="0"/>
 *                   &lt;element name="retentionDays" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="geoRestrictions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="country" type="{https://hropenstandards.org/schema/xml/}CountryCodeList" minOccurs="0"/>
 *                                       &lt;element name="policy" type="{https://hropenstandards.org/schema/xml/}SecurityPermissionType" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentId" type="{https://hropenstandards.org/schema/xml/}IdentifierType" minOccurs="0"/>
 *         &lt;element name="alternateIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "NounType", propOrder = {

})
public class NounType {

    protected LanguageCodeList language;
    protected DataProtectionPolicy dataProtectionPolicy;
    protected IdentifierType documentId;
    protected AlternateIds alternateIds;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeList }
     *     
     */
    public LanguageCodeList getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeList }
     *     
     */
    public void setLanguage(LanguageCodeList value) {
        this.language = value;
    }

    /**
     * Gets the value of the dataProtectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionPolicy }
     *     
     */
    public DataProtectionPolicy getDataProtectionPolicy() {
        return dataProtectionPolicy;
    }

    /**
     * Sets the value of the dataProtectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionPolicy }
     *     
     */
    public void setDataProtectionPolicy(DataProtectionPolicy value) {
        this.dataProtectionPolicy = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDocumentId(IdentifierType value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the alternateIds property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIds }
     *     
     */
    public AlternateIds getAlternateIds() {
        return alternateIds;
    }

    /**
     * Sets the value of the alternateIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIds }
     *     
     */
    public void setAlternateIds(AlternateIds value) {
        this.alternateIds = value;
    }


    /**
     * Alternative document IDs.
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
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class AlternateIds {

        protected List<IdentifierType> item;

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
         * {@link IdentifierType }
         * 
         * 
         */
        public List<IdentifierType> getItem() {
            if (item == null) {
                item = new ArrayList<IdentifierType>();
            }
            return this.item;
        }

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
     *       &lt;all>
     *         &lt;element name="retentionDate" type="{https://hropenstandards.org/schema/xml/}DateType" minOccurs="0"/>
     *         &lt;element name="retentionDays" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="geoRestrictions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="country" type="{https://hropenstandards.org/schema/xml/}CountryCodeList" minOccurs="0"/>
     *                             &lt;element name="policy" type="{https://hropenstandards.org/schema/xml/}SecurityPermissionType" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {

    })
    public static class DataProtectionPolicy {

        protected XMLGregorianCalendar retentionDate;
        protected BigInteger retentionDays;
        protected GeoRestrictions geoRestrictions;

        /**
         * Gets the value of the retentionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRetentionDate() {
            return retentionDate;
        }

        /**
         * Sets the value of the retentionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRetentionDate(XMLGregorianCalendar value) {
            this.retentionDate = value;
        }

        /**
         * Gets the value of the retentionDays property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRetentionDays() {
            return retentionDays;
        }

        /**
         * Sets the value of the retentionDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRetentionDays(BigInteger value) {
            this.retentionDays = value;
        }

        /**
         * Gets the value of the geoRestrictions property.
         * 
         * @return
         *     possible object is
         *     {@link GeoRestrictions }
         *     
         */
        public GeoRestrictions getGeoRestrictions() {
            return geoRestrictions;
        }

        /**
         * Sets the value of the geoRestrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeoRestrictions }
         *     
         */
        public void setGeoRestrictions(GeoRestrictions value) {
            this.geoRestrictions = value;
        }


        /**
         * Data can be processed only in countries from this list. In case not present, there is no country restriction associated with data.
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
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="country" type="{https://hropenstandards.org/schema/xml/}CountryCodeList" minOccurs="0"/>
         *                   &lt;element name="policy" type="{https://hropenstandards.org/schema/xml/}SecurityPermissionType" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
        public static class GeoRestrictions {

            protected List<Item> item;

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
             * {@link Item }
             * 
             * 
             */
            public List<Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Item>();
                }
                return this.item;
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
             *       &lt;all>
             *         &lt;element name="country" type="{https://hropenstandards.org/schema/xml/}CountryCodeList" minOccurs="0"/>
             *         &lt;element name="policy" type="{https://hropenstandards.org/schema/xml/}SecurityPermissionType" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class Item {

                protected CountryCodeList country;
                protected SecurityPermissionType policy;

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CountryCodeList }
                 *     
                 */
                public CountryCodeList getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CountryCodeList }
                 *     
                 */
                public void setCountry(CountryCodeList value) {
                    this.country = value;
                }

                /**
                 * Gets the value of the policy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SecurityPermissionType }
                 *     
                 */
                public SecurityPermissionType getPolicy() {
                    return policy;
                }

                /**
                 * Sets the value of the policy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SecurityPermissionType }
                 *     
                 */
                public void setPolicy(SecurityPermissionType value) {
                    this.policy = value;
                }

            }

        }

    }

}
