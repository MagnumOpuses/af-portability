package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelPreference {
    private boolean willingToTravelIndicator;
    private int percentage;
    private String description;

    public boolean isWillingToTravelIndicator() {
        return willingToTravelIndicator;
    }

    public void setWillingToTravelIndicator(boolean willingToTravelIndicator) {
        this.willingToTravelIndicator = willingToTravelIndicator;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
