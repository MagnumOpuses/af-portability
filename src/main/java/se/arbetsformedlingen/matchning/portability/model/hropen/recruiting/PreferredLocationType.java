
package se.arbetsformedlingen.matchning.portability.model.hropen.recruiting;

import se.arbetsformedlingen.matchning.portability.model.hropen.common.base.MeasureType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.communication.AddressType;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains a collection of information about a candidate's preferences in the location of a position.
 * 
 * <p>Java class for PreferredLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferredLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="maximumCommuteDuration" type="{https://hropenstandards.org/schema/xml/}MeasureType" minOccurs="0"/>
 *         &lt;element name="maximumCommuteDistance" type="{https://hropenstandards.org/schema/xml/}MeasureType" minOccurs="0"/>
 *         &lt;element name="referenceLocation" type="{https://hropenstandards.org/schema/xml/}AddressType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferredLocationType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PreferredLocationType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected MeasureType maximumCommuteDuration;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected MeasureType maximumCommuteDistance;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AddressType referenceLocation;

    /**
     * Gets the value of the maximumCommuteDuration property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public MeasureType getMaximumCommuteDuration() {
        return maximumCommuteDuration;
    }

    /**
     * Sets the value of the maximumCommuteDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMaximumCommuteDuration(MeasureType value) {
        this.maximumCommuteDuration = value;
    }

    /**
     * Gets the value of the maximumCommuteDistance property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public MeasureType getMaximumCommuteDistance() {
        return maximumCommuteDistance;
    }

    /**
     * Sets the value of the maximumCommuteDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMaximumCommuteDistance(MeasureType value) {
        this.maximumCommuteDistance = value;
    }

    /**
     * Gets the value of the referenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AddressType getReferenceLocation() {
        return referenceLocation;
    }

    /**
     * Sets the value of the referenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReferenceLocation(AddressType value) {
        this.referenceLocation = value;
    }

    public PreferredLocationType withAddress(String city){
        setReferenceLocation(new AddressType().withCity(city));
        return this;
    }

}
