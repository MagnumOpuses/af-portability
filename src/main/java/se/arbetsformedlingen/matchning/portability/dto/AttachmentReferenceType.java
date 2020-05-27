package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentReferenceType", propOrder = {

})
public class AttachmentReferenceType {

    protected IdentifierType reference;
    @XmlElement(required = true)
    protected String uri;
    protected List<String> descriptions;

    public IdentifierType getReference() {
        return reference;
    }

    public void setReference(IdentifierType reference) {
        this.reference = reference;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<String> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        return this.descriptions;
    }

    public void setDescriptions(List<String> descriptions){
        this.descriptions = descriptions;
    }
}
