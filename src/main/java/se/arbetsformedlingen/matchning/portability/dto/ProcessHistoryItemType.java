package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessHistoryItemType", propOrder = {

})
public class ProcessHistoryItemType {

    protected IdentifierType id;
    protected String actionDate;
    protected ProcessActionType action;
    protected ProcessStatusType status;
    protected ProcessStatusType previousStatus;
    protected List<ProcessPartyType> primaryParties;
    protected List<ProcessPartyType> associatedParties;
    protected List<AttachmentType> attachments;
    protected StringTypeArray descriptions;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public ProcessActionType getAction() {
        return action;
    }

    public void setAction(ProcessActionType action) {
        this.action = action;
    }

    public ProcessStatusType getStatus() {
        return status;
    }

    public void setStatus(ProcessStatusType status) {
        this.status = status;
    }

    public ProcessStatusType getPreviousStatus() {
        return previousStatus;
    }

    public void setPreviousStatus(ProcessStatusType previousStatus) {
        this.previousStatus = previousStatus;
    }

    public List<ProcessPartyType> getPrimaryParties() {
        if (primaryParties == null) {
            primaryParties = new ArrayList<ProcessPartyType>();
        }
        return this.primaryParties;
    }

    public List<ProcessPartyType> getAssociatedParties() {
        if (associatedParties == null) {
            associatedParties = new ArrayList<ProcessPartyType>();
        }
        return this.associatedParties;
    }

    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentType>();
        }
        return this.attachments;
    }

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }
}
