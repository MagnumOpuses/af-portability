package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessHistoryItemType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessHistoryItemType {

    protected IdentifierType id;
    protected String actionDate;
    protected ProcessActionType action;
    protected ProcessStatusType status;
    protected ProcessStatusType previousStatus;
    protected List<ProcessPartyType> primaryParties;
    protected List<ProcessPartyType> associatedParties;
    protected List<AttachmentType> attachments;
    protected List<String> descriptions;

    public IdentifierType getId() {
        return id;
    }

    public void setId(final IdentifierType id) {
        this.id = id;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(final String actionDate) {
        this.actionDate = actionDate;
    }

    public ProcessActionType getAction() {
        return action;
    }

    public void setAction(final ProcessActionType action) {
        this.action = action;
    }

    public ProcessStatusType getStatus() {
        return status;
    }

    public void setStatus(final ProcessStatusType status) {
        this.status = status;
    }

    public ProcessStatusType getPreviousStatus() {
        return previousStatus;
    }

    public void setPreviousStatus(final ProcessStatusType previousStatus) {
        this.previousStatus = previousStatus;
    }

    public List<ProcessPartyType> getPrimaryParties() {
        if (primaryParties == null) {
            primaryParties = new ArrayList<ProcessPartyType>();
        }
        return this.primaryParties;
    }

    public void setPrimaryParties(final List<ProcessPartyType> primaryParties) {
        this.primaryParties = primaryParties;
    }

    public List<ProcessPartyType> getAssociatedParties() {
        if (associatedParties == null) {
            associatedParties = new ArrayList<ProcessPartyType>();
        }
        return this.associatedParties;
    }

    public void setAssociatedParties(final List<ProcessPartyType> associatedParties) {
        this.associatedParties = associatedParties;
    }

    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentType>();
        }
        return this.attachments;
    }

    public void setAttachments(final List<AttachmentType> attachments) {
        this.attachments = attachments;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
