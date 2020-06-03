package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentReferenceType", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachmentReferenceType {

    protected IdentifierType reference;
    @XmlElement(required = true)
    protected String uri;
    protected List<String> descriptions;

    public IdentifierType getReference() {
        return reference;
    }

    public void setReference(final IdentifierType reference) {
        this.reference = reference;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
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
