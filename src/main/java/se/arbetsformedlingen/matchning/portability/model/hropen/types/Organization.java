package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.net.URI;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Organization {
    private String name;
    private Communication communication;
    private String description;
    private URI domainName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URI getDomainName() {
        return domainName;
    }

    public void setDomainName(URI domainName) {
        this.domainName = domainName;
    }

    /* Builder methods */
    public Organization withName(String organizationName) {
        setName(organizationName);
        return this;
    }
}
