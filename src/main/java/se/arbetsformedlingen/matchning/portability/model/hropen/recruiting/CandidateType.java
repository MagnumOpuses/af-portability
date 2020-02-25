
package se.arbetsformedlingen.matchning.portability.model.hropen.recruiting;

import se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist.CountryCodeList;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.base.IdentifierType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.base.SecurityPermissionType;

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
 * A person who is requesting consideration or is being considered for a current or future position at a company.
 * 
 * <p>Java class for CandidateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
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
 *         &lt;element name="uri" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="distributionGuidelines" type="{https://hropenstandards.org/schema/xml/}DistributionGuidelinesType" minOccurs="0"/>
 *         &lt;element name="person" type="{https://hropenstandards.org/schema/xml/}CandidatePersonType" minOccurs="0"/>
 *         &lt;element name="profiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}CandidateProfileType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CandidateType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CandidateType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IdentifierType documentId;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CandidateType.AlternateIds alternateIds;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String language;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CandidateType.DataProtectionPolicy dataProtectionPolicy;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String uri;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DistributionGuidelinesType distributionGuidelines;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CandidatePersonType person;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CandidateType.Profiles profiles;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumentId(IdentifierType value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the alternateIds property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateType.AlternateIds }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CandidateType.AlternateIds getAlternateIds() {
        return alternateIds;
    }

    /**
     * Sets the value of the alternateIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateType.AlternateIds }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAlternateIds(CandidateType.AlternateIds value) {
        this.alternateIds = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the dataProtectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateType.DataProtectionPolicy }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CandidateType.DataProtectionPolicy getDataProtectionPolicy() {
        return dataProtectionPolicy;
    }

    /**
     * Sets the value of the dataProtectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateType.DataProtectionPolicy }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDataProtectionPolicy(CandidateType.DataProtectionPolicy value) {
        this.dataProtectionPolicy = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the distributionGuidelines property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionGuidelinesType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DistributionGuidelinesType getDistributionGuidelines() {
        return distributionGuidelines;
    }

    /**
     * Sets the value of the distributionGuidelines property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionGuidelinesType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDistributionGuidelines(DistributionGuidelinesType value) {
        this.distributionGuidelines = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link CandidatePersonType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CandidatePersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidatePersonType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPerson(CandidatePersonType value) {
        this.person = value;
    }

    public CandidateType withPersonBaseInfo(String given, String family, String line, String extendedLines, CountryCodeList countryCode, String city, String postalCode, String emailAddress, String url){
        person.withName(given, family);
        person.withCommunication(line, extendedLines, countryCode, city, postalCode, emailAddress, url);
        return this;
    }

    public CandidateType withPersonPhone(String phoneNumber, String useCode){
        person.withPhoneCommunication(phoneNumber, useCode);
        return this;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateType.Profiles }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CandidateType.Profiles getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateType.Profiles }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setProfiles(CandidateType.Profiles value) {
        this.profiles = value;
    }

    public CandidateType withProfiles(String profileName, String objective, String executiveSummary){
        profiles.withItem(profileName, objective, executiveSummary);
        return this;
    }

    public CandidateType withProfilesLicense(String licenseName, String licenseType){
        profiles.withItemLicense(licenseName, licenseType);
        return this;
    }

    public CandidateType withProfilesCompetence(String competenceId, String description){
        profiles.withItemCompetence(competenceId, description);
        return this;
    }

    public CandidateType withProfilesWorkExperienceLevels(String levelId, String levelName){
        profiles.withItemWorkExperienceLevels(levelId, levelName);
        return this;
    }

    public CandidateType withProfilesWorkExperience(String title, String legalId, String startDate, String endDate, Boolean current, String description){
        profiles.withItemWorkExperience(title, legalId, startDate, endDate, current, description);
        return this;
    }

    public CandidateType withProfilesEducation(String school, String program, String startDate, String endDate, Boolean current, String description){
        profiles.withItemEducation(school, program, startDate, endDate, current, description);
        return this;
    }

    public CandidateType withProfilesMerit(String meritName, String description){
        profiles.withItemMerit(meritName, description);
        return this;
    }

    public CandidateType withProfilesPositionPreference(String city){
        profiles.withItemPositionPreference(city);
        return this;
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class AlternateIds {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class DataProtectionPolicy {

        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected XMLGregorianCalendar retentionDate;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected BigInteger retentionDays;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected CandidateType.DataProtectionPolicy.GeoRestrictions geoRestrictions;

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
         *     {@link CandidateType.DataProtectionPolicy.GeoRestrictions }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public CandidateType.DataProtectionPolicy.GeoRestrictions getGeoRestrictions() {
            return geoRestrictions;
        }

        /**
         * Sets the value of the geoRestrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link CandidateType.DataProtectionPolicy.GeoRestrictions }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setGeoRestrictions(CandidateType.DataProtectionPolicy.GeoRestrictions value) {
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
            protected List<CandidateType.DataProtectionPolicy.GeoRestrictions.Item> item;

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
             * {@link CandidateType.DataProtectionPolicy.GeoRestrictions.Item }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public List<CandidateType.DataProtectionPolicy.GeoRestrictions.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<CandidateType.DataProtectionPolicy.GeoRestrictions.Item>();
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


    /**
     * Information on the profiles of a candidate. A typical candidate will have one profile, but additional profiles can be included in difference languages, presentations, or industry focus.
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
     *         &lt;element name="item" type="{https://hropenstandards.org/schema/xml/}CandidateProfileType" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class Profiles {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<CandidateProfileType> item;

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
         * {@link CandidateProfileType }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<CandidateProfileType> getItem() {
            if (item == null) {
                item = new ArrayList<CandidateProfileType>();
            }
            return this.item;
        }

        public Profiles withItem(String profileName, String objective, String executiveSummary){
            CandidateProfileType item = null;

            item.setProfileName(profileName);
            item.setObjective(objective);
            item.setExecutiveSummary(executiveSummary);

            getItem().add(item);
            return this;
        }

        public Profiles withItemLicense(String licenseName, String licenseType){
            CandidateProfileType item = null;
            item.withLicenses(licenseName, licenseType);

            getItem().add(item);
            return this;
        }

        public Profiles withItemCompetence(String competencyId, String description){
            CandidateProfileType item = null;
            item.withQualifications(competencyId, description);

            getItem().add(item);
            return this;
        }

        public Profiles withItemWorkExperienceLevels(String levelId, String levelName){
            CandidateProfileType item = null;
            item.withEmploymentLevels(levelId, levelName);

            getItem().add(item);
            return this;
        }

        public Profiles withItemWorkExperience(String title, String legalId, String startDate, String endDate, Boolean current, String description){
            CandidateProfileType item = null;
            item.withEmployment(title, legalId, startDate, endDate, current, description);

            getItem().add(item);
            return this;
        }

        public Profiles withItemEducation(String school, String program, String startDate, String endDate, Boolean current, String description){
            CandidateProfileType item = null;
            item.withEducation(school, program, startDate, endDate, current, description);

            getItem().add(item);
            return this;
        }

        public Profiles withItemMerit(String meritName, String description){
            CandidateProfileType item = null;
            item.withCertification(meritName, description);
            getItem().add(item);
            return this;
        }

        public Profiles withItemPositionPreference(String city){
            CandidateProfileType item = null;
            item.withPositionPreference(city);

            getItem().add(item);
            return this;
        }


    }

}
