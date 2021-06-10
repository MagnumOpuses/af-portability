package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PublicationTypeCodeList")
@XmlEnum
public enum PublicationTypeCodeList {


    /**
     * Book
     */
    @XmlEnumValue("Book")
    @JsonProperty("Book")
    BOOK("Book"),

    /**
     * Paper
     */
    @XmlEnumValue("Paper")
    @JsonProperty("Paper")
    PAPER("Paper"),

    /**
     * Article
     */
    @XmlEnumValue("Article")
    @JsonProperty("Article")
    ARTICLE("Article"),

    /**
     * Conference
     */
    @XmlEnumValue("Conference")
    @JsonProperty("Conference")
    CONFERENCE("Conference"),

    /**
     * Thesis
     */
    @XmlEnumValue("Thesis")
    @JsonProperty("Thesis")
    THESIS("Thesis"),

    /**
     * White Paper
     */
    @XmlEnumValue("WhitePaper")
    @JsonProperty("WhitePaper")
    WHITE_PAPER("WhitePaper"),

    /**
     * Report
     */
    @XmlEnumValue("Report")
    @JsonProperty("Report")
    REPORT("Report"),

    /**
     * Technical Documentation
     */
    @XmlEnumValue("TechnicalDocumentation")
    @JsonProperty("TechnicalDocumentation")
    TECHNICAL_DOCUMENTATION("TechnicalDocumentation"),

    /**
     * Study
     */
    @XmlEnumValue("Study")
    @JsonProperty("Study")
    STUDY("Study"),

    /**
     * Manual
     */
    @XmlEnumValue("Manual")
    @JsonProperty("Manual")
    MANUAL("Manual"),

    /**
     * Research Paper
     */
    @XmlEnumValue("ResearchPaper")
    @JsonProperty("ResearchPaper")
    RESEARCH_PAPER("ResearchPaper"),

    /**
     * Other Publication
     */
    @XmlEnumValue("OtherPublication")
    @JsonProperty("OtherPublication")
    OTHER_PUBLICATION("OtherPublication");
    private final String value;

    PublicationTypeCodeList(final String v) {
        value = v;
    }

    public static PublicationTypeCodeList fromValue(final String v) {
        for (final PublicationTypeCodeList c : PublicationTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
