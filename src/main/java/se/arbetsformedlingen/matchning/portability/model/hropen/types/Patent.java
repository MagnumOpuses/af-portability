package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import se.arbetsformedlingen.matchning.portability.model.hropen.Identifier;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Patent {
    private Identifier id;
    private String title;
    private List<String> inventorNames;
    private List<String> assigneeNames;
    private Organization issuingAuthority;
    private PatentStatus status;
    private List<String> descriptions;

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getInventorNames() {
        return inventorNames;
    }

    public void setInventorNames(List<String> inventorNames) {
        this.inventorNames = inventorNames;
    }

    public List<String> getAssigneeNames() {
        return assigneeNames;
    }

    public void setAssigneeNames(List<String> assigneeNames) {
        this.assigneeNames = assigneeNames;
    }

    public Organization getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(Organization issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public PatentStatus getStatus() {
        return status;
    }

    public void setStatus(PatentStatus status) {
        this.status = status;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public enum PatentStatus {
        filed, pending, issued;
    }
}
