package se.arbetsformedlingen.matchning.portability.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apikeys", schema = "public")
public class ApiKeys {

    @Id
    private Long id;
    private String apikey;
    private Long api_id;
    private String email;
    private String company_name;

    public ApiKeys() {
    }

    public ApiKeys(final Long id, final String apikey, final Long api_id, final String email, final String company_name) {
        this.id = id;
        this.apikey = apikey;
        this.api_id = api_id;
        this.email = email;
        this.company_name = company_name;
    }

    public Long getId() {
        return id;
    }

    public String getApikey() {
        return apikey;
    }

    public Long getApiId() {
        return api_id;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return company_name;
    }

    @Override
    public String toString() {
        return this.id + " -- " + this.apikey + " -- " + this.email + " -- " + this.company_name;
    }
}
