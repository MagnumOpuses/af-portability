
package se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicationTypeCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicationTypeCodeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="Article"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="Thesis"/>
 *     &lt;enumeration value="WhitePaper"/>
 *     &lt;enumeration value="Report"/>
 *     &lt;enumeration value="TechnicalDocumentation"/>
 *     &lt;enumeration value="Study"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="ResearchPaper"/>
 *     &lt;enumeration value="OtherPublication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicationTypeCodeList")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-18T10:16:43+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PublicationTypeCodeList {


    /**
     * Book
     * 
     */
    @XmlEnumValue("Book")
    BOOK("Book"),

    /**
     * Paper
     * 
     */
    @XmlEnumValue("Paper")
    PAPER("Paper"),

    /**
     * Article
     * 
     */
    @XmlEnumValue("Article")
    ARTICLE("Article"),

    /**
     * Conference
     * 
     */
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),

    /**
     * Thesis
     * 
     */
    @XmlEnumValue("Thesis")
    THESIS("Thesis"),

    /**
     * White Paper
     * 
     */
    @XmlEnumValue("WhitePaper")
    WHITE_PAPER("WhitePaper"),

    /**
     * Report
     * 
     */
    @XmlEnumValue("Report")
    REPORT("Report"),

    /**
     * Technical Documentation
     * 
     */
    @XmlEnumValue("TechnicalDocumentation")
    TECHNICAL_DOCUMENTATION("TechnicalDocumentation"),

    /**
     * Study
     * 
     */
    @XmlEnumValue("Study")
    STUDY("Study"),

    /**
     * Manual
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * Research Paper
     * 
     */
    @XmlEnumValue("ResearchPaper")
    RESEARCH_PAPER("ResearchPaper"),

    /**
     * Other Publication
     * 
     */
    @XmlEnumValue("OtherPublication")
    OTHER_PUBLICATION("OtherPublication");
    private final String value;

    PublicationTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicationTypeCodeList fromValue(String v) {
        for (PublicationTypeCodeList c: PublicationTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
