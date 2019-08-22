package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Score<T> {
    private T value;
    private T minimum;
    private T maximum;
    private String description;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getMinimum() {
        return minimum;
    }

    public void setMinimum(T minimum) {
        this.minimum = minimum;
    }

    public T getMaximum() {
        return maximum;
    }

    public void setMaximum(T maximum) {
        this.maximum = maximum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
