package se.arbetsformedlingen.matchning.portability.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentType", propOrder = {

})
public class PatentType {

    protected List<IdentifierType> ids;
    protected String title;
    protected List<String> inventorNames;
    protected List<String> assigneeNames;
    protected OrganizationType issuingAuthority;
    protected PatentStatusCodeList status;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected List<String> descriptions;


    public List<IdentifierType> getIds() {
        if (ids == null) {
            ids = new ArrayList<IdentifierType>();
        }
        return this.ids;
    }

    public void setIds(List<IdentifierType> ids) {
        this.ids = ids;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public OrganizationType getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(OrganizationType issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public PatentStatusCodeList getStatus() {
        return status;
    }

    public void setStatus(PatentStatusCodeList status) {
        this.status = status;
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

    public List<String> getInventorNames() {
        return inventorNames;
    }

    public void setInventorNames(List<String> inventorNames) {
        this.inventorNames = inventorNames;
    }

    public List<String> getAssigneeNames() {
        return assigneeNames;
    }

    public void setAssigneeNames(List<String> assigneeNames) {
        this.assigneeNames = assigneeNames;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
