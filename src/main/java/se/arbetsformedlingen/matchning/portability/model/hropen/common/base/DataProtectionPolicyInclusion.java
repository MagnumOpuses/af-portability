
package se.arbetsformedlingen.matchning.portability.model.hropen.common.base;

import se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist.CountryCodeList;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data protection policy according General Data Protection Regulation (GDPR) (Regulation (EU) 2016/679).
 * 
 * <p>Java class for DataProtectionPolicyInclusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProtectionPolicyInclusion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
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
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProtectionPolicyInclusion", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DataProtectionPolicyInclusion {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DataProtectionPolicyInclusion.DataProtectionPolicy dataProtectionPolicy;

    /**
     * Gets the value of the dataProtectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionPolicyInclusion.DataProtectionPolicy }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DataProtectionPolicyInclusion.DataProtectionPolicy getDataProtectionPolicy() {
        return dataProtectionPolicy;
    }

    /**
     * Sets the value of the dataProtectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionPolicyInclusion.DataProtectionPolicy }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataProtectionPolicy(DataProtectionPolicyInclusion.DataProtectionPolicy value) {
        this.dataProtectionPolicy = value;
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class DataProtectionPolicy {

        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected XMLGregorianCalendar retentionDate;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected BigInteger retentionDays;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions geoRestrictions;

        /**
         * Gets the value of the retentionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setRetentionDays(BigInteger value) {
            this.retentionDays = value;
        }

        /**
         * Gets the value of the geoRestrictions property.
         * 
         * @return
         *     possible object is
         *     {@link DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions getGeoRestrictions() {
            return geoRestrictions;
        }

        /**
         * Sets the value of the geoRestrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setGeoRestrictions(DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions value) {
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class GeoRestrictions {

            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected List<DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item> item;

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
             * {@link DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public List<DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item>();
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Item {

                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected CountryCodeList country;
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected SecurityPermissionType policy;

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CountryCodeList }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setPolicy(SecurityPermissionType value) {
                    this.policy = value;
                }

            }

        }

    }

}
