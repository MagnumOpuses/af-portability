package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Certificate {
    Identifier id;
    String name;
    Entity type;
    String status;
    DateRange effectiveTimePeriod;
    Date firstIssued;
    Organization issuingAuthority;
    List<String> descriptions;

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entity getType() {
        return type;
    }

    public void setType(Entity type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateRange getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    public void setEffectiveTimePeriod(DateRange effectiveTimePeriod) {
        this.effectiveTimePeriod = effectiveTimePeriod;
    }

    public Date getFirstIssued() {
        return firstIssued;
    }

    public void setFirstIssued(Date firstIssued) {
        this.firstIssued = firstIssued;
    }

    public Organization getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(Organization issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

}
