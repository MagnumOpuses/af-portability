package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerHistoryType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployerHistoryType {

    public IdentifierType id;
    public String start;
    public String end;
    public Boolean current;
    public List<AttachmentReferenceType> attachmentReferences;
    public List<String> descriptions;
    public OrganizationType organization;
    public List<PositionHistoryType> positionHistories;


    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(final String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(final String end) {
        this.end = end;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(final Boolean current) {
        this.current = current;
    }

    public List<AttachmentReferenceType> getAttachmentReferences() {
        if (attachmentReferences == null) {
            attachmentReferences = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReferences;
    }

    public void setAttachmentReferences(final List<AttachmentReferenceType> attachmentReferences) {
        this.attachmentReferences = attachmentReferences;
    }

    public List<String> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        return this.descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public OrganizationType getOrganization() {
        return organization;
    }

    public void setOrganization(final OrganizationType organization) {
        this.organization = organization;
    }

    public List<PositionHistoryType> getPositionHistories() {
        if (positionHistories == null) {
            positionHistories = new ArrayList<PositionHistoryType>();
        }
        return this.positionHistories;
    }

    public void setPositionHistories(final List<PositionHistoryType> positionHistories) {
        this.positionHistories = positionHistories;
    }
}

