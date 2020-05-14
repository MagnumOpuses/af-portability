
package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CandidateSourceType {

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

        public CandidateSourceType.Builder withAllOf(List<AllOf> allOf) {
            this.allOf = allOf;
            return this;
        }

        public CandidateSourceType.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CandidateSourceType.Builder withProperties(Properties properties) {
            this.properties = properties;
            return this;
        }

        public CandidateSourceType.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public CandidateSourceType.Builder withType(String type) {
            this.type = type;
            return this;
        }

        public CandidateSourceType build() {
            CandidateSourceType candidateSourceType = new CandidateSourceType();
            candidateSourceType.allOf = allOf;
            candidateSourceType.description = description;
            candidateSourceType.properties = properties;
            candidateSourceType.title = title;
            candidateSourceType.type = type;
            return candidateSourceType;
        }

    }

}
