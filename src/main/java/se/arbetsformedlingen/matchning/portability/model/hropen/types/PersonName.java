package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonName {
    private String given;
    private String family;
    private String preferredSalutationCode;

    public PersonName() {}
    public PersonName(String givenName, String familyName) {
        this.given = givenName;
        this.family = familyName;
    }

    public String getFormattedName() {
        String formatted = ""+(preferredSalutationCode != null ? preferredSalutationCode : "")+ " " + (given != null ? given : "") + " " + (family != null ? family : "");
        return formatted.trim();
    }

    public String getGiven() {
        return given;
    }

    public void setGiven(String given) {
        this.given = given;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPreferredSalutationCode() {
        return preferredSalutationCode;
    }

    public void setPreferredSalutationCode(String preferredSalutationCode) {
        this.preferredSalutationCode = preferredSalutationCode;
    }
}
