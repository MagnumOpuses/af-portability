package se.arbetsformedlingen.matchning.portability.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefereeType", propOrder = {

})
public class RefereeType {

    protected IdentifierType refereeId;
    @XmlElement(required = true)
    protected PersonNameType personName;
    protected String positionTitle;
    protected String organizationName;
    protected CommunicationType communication;
    protected BigDecimal yearsKnown;
    protected RelationshipTypeCodeList relationship;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected List<CommentType> comments;

    public IdentifierType getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(IdentifierType refereeId) {
        this.refereeId = refereeId;
    }

    public PersonNameType getPersonName() {
        return personName;
    }

    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public CommunicationType getCommunication() {
        return communication;
    }

    public void setCommunication(CommunicationType communication) {
        this.communication = communication;
    }

    public BigDecimal getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(BigDecimal yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

    public RelationshipTypeCodeList getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipTypeCodeList relationship) {
        this.relationship = relationship;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public void setAttachmentReferences(List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public void setComments(List<CommentType> comments) {
        this.comments = comments;
    }

    public List<CommentType> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentType>();
        }
        return this.comments;
    }
}
