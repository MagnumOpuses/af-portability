package se.arbetsformedlingen.matchning.portability.model.storeapi;

public class StoreRequestBody {
    public String token;
    public String value;

    public StoreRequestBody() {}

    public StoreRequestBody(String token, String value) {
        this.token = token;
        this.value = value;
    }

    public String getToken() {
        return token;
    }

    public String getValue() {
        return value;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
