
package se.arbetsformedlingen.matchning.portability.model.hropen.common.base;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Content of an attachment in the JSON message, which can be embedded or an external reference.
 * 
 * <p>Java class for AttachmentContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="content" type="{https://hropenstandards.org/schema/xml/}BinaryObjectType" minOccurs="0"/>
 *         &lt;element name="url" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
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
@XmlType(name = "AttachmentContent", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class AttachmentContent {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BinaryObjectType content;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String url;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BinaryObjectType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContent(BinaryObjectType value) {
        this.content = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUrl(String value) {
        this.url = value;
    }

}
