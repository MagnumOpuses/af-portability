package se.arbetsformedlingen.matchning.portability.model.sessionToken;

public class Response {
    public int status;
    public String value;

    public String getAllProperties() {
        return "status: " + this.status + ", value: " + this.value;
    }
}
