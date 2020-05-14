
package se.arbetsformedlingen.matchning.portability.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CandidatePersonType {

    @Expose
    private List<AllOf> allOf;
    @Expose
    private String description;
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

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public static class Builder {

        private List<AllOf> allOf;
        private String description;
        private String title;
        private String type;

        public CandidatePersonType.Builder withAllOf(List<AllOf> allOf) {
            this.allOf = allOf;
            return this;
        }

        public CandidatePersonType.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CandidatePersonType.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public CandidatePersonType.Builder withType(String type) {
            this.type = type;
            return this;
        }

        public CandidatePersonType build() {
            CandidatePersonType candidatePersonType = new CandidatePersonType();
            candidatePersonType.allOf = allOf;
            candidatePersonType.description = description;
            candidatePersonType.title = title;
            candidatePersonType.type = type;
            return candidatePersonType;
        }

    }

}
