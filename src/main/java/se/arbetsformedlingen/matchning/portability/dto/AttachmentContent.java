package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentContent", propOrder = {

})
public class AttachmentContent {

    protected BinaryObjectType content;
    protected String url;

    public BinaryObjectType getContent() {
        return content;
    }

    public void setContent(BinaryObjectType content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
