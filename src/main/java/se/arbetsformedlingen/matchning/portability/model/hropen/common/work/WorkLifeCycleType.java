
package se.arbetsformedlingen.matchning.portability.model.hropen.common.work;

import se.arbetsformedlingen.matchning.portability.model.hropen.common.work.*;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains a collection of information about a period of employment, including hire, leaves of absence, and termination.
 * 
 * <p>Java class for WorkLifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkLifeCycleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="contract" type="{https://hropenstandards.org/schema/xml/}ContractType" minOccurs="0"/>
 *         &lt;element name="hire" type="{https://hropenstandards.org/schema/xml/}HireType" minOccurs="0"/>
 *         &lt;element name="termination" type="{https://hropenstandards.org/schema/xml/}TerminationType" minOccurs="0"/>
 *         &lt;element name="leaveOfAbsence" type="{https://hropenstandards.org/schema/xml/}LeaveType" minOccurs="0"/>
 *         &lt;element name="recruitingAndStaffing" type="{https://hropenstandards.org/schema/xml/}RecruitingAndStaffingType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkLifeCycleType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class WorkLifeCycleType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ContractType contract;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected HireType hire;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TerminationType termination;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LeaveType leaveOfAbsence;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected RecruitingAndStaffingType recruitingAndStaffing;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ContractType getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContract(ContractType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the hire property.
     * 
     * @return
     *     possible object is
     *     {@link HireType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public HireType getHire() {
        return hire;
    }

    /**
     * Sets the value of the hire property.
     * 
     * @param value
     *     allowed object is
     *     {@link HireType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHire(HireType value) {
        this.hire = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TerminationType getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTermination(TerminationType value) {
        this.termination = value;
    }

    /**
     * Gets the value of the leaveOfAbsence property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LeaveType getLeaveOfAbsence() {
        return leaveOfAbsence;
    }

    /**
     * Sets the value of the leaveOfAbsence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLeaveOfAbsence(LeaveType value) {
        this.leaveOfAbsence = value;
    }

    /**
     * Gets the value of the recruitingAndStaffing property.
     * 
     * @return
     *     possible object is
     *     {@link RecruitingAndStaffingType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public RecruitingAndStaffingType getRecruitingAndStaffing() {
        return recruitingAndStaffing;
    }

    /**
     * Sets the value of the recruitingAndStaffing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecruitingAndStaffingType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRecruitingAndStaffing(RecruitingAndStaffingType value) {
        this.recruitingAndStaffing = value;
    }

}
