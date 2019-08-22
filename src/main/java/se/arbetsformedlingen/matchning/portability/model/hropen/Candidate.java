package se.arbetsformedlingen.matchning.portability.model.hropen;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Candidate {
    private Identifier documentId;
    private List<Identifier> alternateIds;
    private long timestamp;
    private URI uri;
    private Person person;
    private List<Profile> profiles;
    private String description;

    public Identifier getDocumentId() {
        if (documentId == null) {
            // Preventing NPE
            documentId = new Identifier();
        }
        return documentId;
    }

    public void setDocumentId(Identifier documentId) {
        this.documentId = documentId;
    }

    public List<Identifier> getAlternateIds() {
        return alternateIds;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setAlternateIds(List<Identifier> alternateIds) {
        this.alternateIds = alternateIds;
    }

    public String getUri() {
        return (uri == null ? null : uri.toString());
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public void addProfile(Profile profile) {
        getCreateProfiles().add(profile);
    }

    /* Builder methods */
    public Candidate withDocumentId(String id) {
        return withDocumentId(id, null);
    }

    public Candidate withDocumentId(String id, String scheme) {
        getCreateDocumentId().setValueId(id);
        getCreateDocumentId().setSchemeId(scheme);
        return this;
    }

    public Candidate withName(String name) {
        getCreatePerson().setName(name);
        return this;
    }

    public Candidate withBirthDate(Date date) {
        getCreatePerson().setBirthDate(date);
        return this;
    }

    public Candidate withEmail(String email) {
        getCreatePerson().withEmail(email);
        return this;
    }

    public Candidate withPhone(String s) {
        getCreatePerson().withPhone(s);
        return this;
    }
    public Candidate withPhone(String s, String type) {
        getCreatePerson().withPhone(s, type);
        return this;
    }

    public Candidate withAddress(String type, String l1, String l2, String pnr, String stad, String land) {
        getCreatePerson().withAddress(type, l1, l2, pnr, stad, land);
        return this;
    }

    public Candidate withDescription(String description) {
        setDescription(description);
        return this;
    }

    public Candidate withTimestamp(Date ts) {
        if (ts != null) {
            setTimestamp(ts.getTime());
        }
        return this;
    }
    public Candidate withTimestamp(long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    public Candidate withPersonnummer(String personnummer) {
        getCreatePerson().withPersonnummer(personnummer);
        return this;
    }

    public Candidate withProfile(Profile profile) {
        getCreateProfiles().add(profile);
        return this;
    }

    public Candidate withWebpage(String hemsida) {
        getCreatePerson().withWebpage(hemsida);
        return this;
    }

    /* Get-methods that create object if null */
    private Identifier getCreateDocumentId() {
        if (this.documentId == null) {
            this.documentId = new Identifier();
        }
        return this.documentId;
    }


    private Person getCreatePerson() {
        if (this.person == null) {
            this.person = new Person();
        }
        return this.person;
    }

    private List<Profile> getCreateProfiles() {
        if (this.profiles == null) {
            this.profiles = new ArrayList<>();
        }
        return this.profiles;
    }

}
