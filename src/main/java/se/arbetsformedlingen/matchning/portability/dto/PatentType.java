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
    protected StringTypeArray inventorNames;
    protected StringTypeArray assigneeNames;
    protected OrganizationType issuingAuthority;
    protected PatentStatusCodeList status;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected StringTypeArray descriptions;


    public List<IdentifierType> getIds() {
        if (ids == null) {
            ids = new ArrayList<IdentifierType>();
        }
        return this.ids;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StringTypeArray getInventorNames() {
        return inventorNames;
    }

    public void setInventorNames(StringTypeArray inventorNames) {
        this.inventorNames = inventorNames;
    }

    public StringTypeArray getAssigneeNames() {
        return assigneeNames;
    }

    public void setAssigneeNames(StringTypeArray assigneeNames) {
        this.assigneeNames = assigneeNames;
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

    public StringTypeArray getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(StringTypeArray descriptions) {
        this.descriptions = descriptions;
    }
}
