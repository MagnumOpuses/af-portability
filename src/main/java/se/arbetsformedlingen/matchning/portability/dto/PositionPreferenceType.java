
package se.arbetsformedlingen.matchning.portability.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PositionPreferenceType {

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

        public PositionPreferenceType.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public PositionPreferenceType.Builder withProperties(Properties properties) {
            this.properties = properties;
            return this;
        }

        public PositionPreferenceType.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public PositionPreferenceType.Builder withType(String type) {
            this.type = type;
            return this;
        }

        public PositionPreferenceType build() {
            PositionPreferenceType positionPreferenceType = new PositionPreferenceType();
            positionPreferenceType.description = description;
            positionPreferenceType.properties = properties;
            positionPreferenceType.title = title;
            positionPreferenceType.type = type;
            return positionPreferenceType;
        }

    }

}
