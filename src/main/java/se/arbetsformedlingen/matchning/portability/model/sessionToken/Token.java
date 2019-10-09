package se.arbetsformedlingen.matchning.portability.model.sessionToken;

import java.io.Serializable;

public class Token implements Serializable {
    private String token;

    public Token() {};

    public Token(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
