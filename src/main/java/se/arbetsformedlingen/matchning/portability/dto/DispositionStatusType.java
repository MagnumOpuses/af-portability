
package se.arbetsformedlingen.matchning.portability.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DispositionStatusType {

    @Expose
    private String description;
    @Expose
    private Properties properties;
    @Expose
    private String title;
    @Expose
    private String type;

    public String getDescription() {
        return description;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public static class Builder {

        private String description;
        private Properties properties;
        private String title;
        private String type;

        public DispositionStatusType.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public DispositionStatusType.Builder withProperties(Properties properties) {
            this.properties = properties;
            return this;
        }

        public DispositionStatusType.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public DispositionStatusType.Builder withType(String type) {
            this.type = type;
            return this;
        }

        public DispositionStatusType build() {
            DispositionStatusType dispositionStatusType = new DispositionStatusType();
            dispositionStatusType.description = description;
            dispositionStatusType.properties = properties;
            dispositionStatusType.title = title;
            dispositionStatusType.type = type;
            return dispositionStatusType;
        }

    }

}
