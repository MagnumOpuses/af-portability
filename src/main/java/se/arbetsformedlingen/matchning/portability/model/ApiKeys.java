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

    public ApiKeys() {}

    public ApiKeys(Long id, String apikey, Long api_id, String email) {
        this.id = id;
        this.apikey = apikey;
        this.api_id = api_id;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.id + " -- " + this.apikey + " -- " + this.email;
    }
}
