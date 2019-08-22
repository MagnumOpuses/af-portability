package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelocationPreference {
    private boolean willingToRelocateIndicator;
    private String description;

    public boolean isWillingToRelocateIndicator() {
        return willingToRelocateIndicator;
    }

    public void setWillingToRelocateIndicator(boolean willingToRelocateIndicator) {
        this.willingToRelocateIndicator = willingToRelocateIndicator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
