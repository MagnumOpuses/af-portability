package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public void setIds(final List<IdentifierType> ids) {
        this.ids = ids;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }


    public OrganizationType getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(final OrganizationType issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public PatentStatusCodeList getStatus() {
        return status;
    }

    public void setStatus(final PatentStatusCodeList status) {
        this.status = status;
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

    public List<String> getInventorNames() {
        return inventorNames;
    }

    public void setInventorNames(final List<String> inventorNames) {
        this.inventorNames = inventorNames;
    }

    public List<String> getAssigneeNames() {
        return assigneeNames;
    }

    public void setAssigneeNames(final List<String> assigneeNames) {
        this.assigneeNames = assigneeNames;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
