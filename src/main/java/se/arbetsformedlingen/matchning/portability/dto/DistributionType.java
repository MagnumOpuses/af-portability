
package se.arbetsformedlingen.matchning.portability.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DistributionType {

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

        public DistributionType.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public DistributionType.Builder withProperties(Properties properties) {
            this.properties = properties;
            return this;
        }

        public DistributionType.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public DistributionType.Builder withType(String type) {
            this.type = type;
            return this;
        }

        public DistributionType build() {
            DistributionType distributionType = new DistributionType();
            distributionType.description = description;
            distributionType.properties = properties;
            distributionType.title = title;
            distributionType.type = type;
            return distributionType;
        }

    }

}
