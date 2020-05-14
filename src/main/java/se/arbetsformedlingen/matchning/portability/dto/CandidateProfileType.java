
package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CandidateProfileType {

    @Expose
    private List<AllOf> allOf;
    @Expose
    private String description;
    @Expose
    private Properties properties;
    @Expose
    private String title;
    @Expose
    private String type;

    public List<AllOf> getAllOf() {
        return allOf;
    }

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

        private List<AllOf> allOf;
        private String description;
        private Properties properties;
        private String title;
        private String type;

        public CandidateProfileType.Builder withAllOf(List<AllOf> allOf) {
            this.allOf = allOf;
            return this;
        }

        public CandidateProfileType.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CandidateProfileType.Builder withProperties(Properties properties) {
            this.properties = properties;
            return this;
        }

        public CandidateProfileType.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public CandidateProfileType.Builder withType(String type) {
            this.type = type;
            return this;
        }

        public CandidateProfileType build() {
            CandidateProfileType candidateProfileType = new CandidateProfileType();
            candidateProfileType.allOf = allOf;
            candidateProfileType.description = description;
            candidateProfileType.properties = properties;
            candidateProfileType.title = title;
            candidateProfileType.type = type;
            return candidateProfileType;
        }

    }

}
