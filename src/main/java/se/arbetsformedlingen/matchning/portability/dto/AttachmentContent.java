package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentContent", propOrder = {

})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachmentContent {

    protected BinaryObjectType content;
    protected String url;

    public BinaryObjectType getContent() {
        return content;
    }

    public void setContent(final BinaryObjectType content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
