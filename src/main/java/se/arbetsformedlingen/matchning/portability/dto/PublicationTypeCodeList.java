package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PublicationTypeCodeList")
@XmlEnum
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
