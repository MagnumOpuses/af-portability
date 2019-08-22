package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attachment {
    private String id;
    private EmbeddedData embeddedData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EmbeddedData getEmbeddedData() {
        return embeddedData;
    }

    public void setEmbeddedData(EmbeddedData embeddedData) {
        this.embeddedData = embeddedData;
    }

    public class EmbeddedData {
        private byte[] value;
        private String encoding;
        private String mimeType;
        private String filename;

        public byte[] getValue() {
            return value;
        }

        public void setValue(byte[] value) {
            this.value = value;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }
    }
}
