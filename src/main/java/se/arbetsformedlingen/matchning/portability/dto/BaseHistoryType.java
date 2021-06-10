package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHistoryType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseHistoryType {

    protected IdentifierType id;
    protected String start;
    protected String end;
    protected Boolean current;
    protected List<AttachmentReferenceType> attachmentReferences;
    protected List<String> descriptions;

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
}
