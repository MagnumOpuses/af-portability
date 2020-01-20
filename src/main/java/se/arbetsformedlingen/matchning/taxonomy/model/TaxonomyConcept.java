//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package se.arbetsformedlingen.matchning.taxonomy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept.EntityType;

public class TaxonomyConcept extends Concept implements Comparable<Concept> {
    private Float level;
    private String description;
    @JsonProperty("parent_id")
    private String parentId;
    private TaxonomyConcept parent;

    public TaxonomyConcept() {
    }

    public TaxonomyConcept(EntityType type) {
        this.setType(type);
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getLevel() {
        return this.level;
    }

    public void setLevel(Float level) {
        this.level = level;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public TaxonomyConcept getParent() {
        return this.parent;
    }

    public void setParent(TaxonomyConcept parent) {
        this.parent = parent;
    }

    @JsonIgnore
    public Concept getField() {
        TaxonomyConcept p;
        for(p = this; p.getParent() != null; p = p.getParent()) {
        }

        return p;
    }

    public String toString() {
        return this.getId() + ": " + this.getLabel() + " (" + this.getDescription() + ")";
    }

    public int compareTo(Concept o) {
        int myId = 0;
        int otherId = 0;

        try {
            myId = new Integer(this.getId());
            otherId = new Integer(o.getId());
        } catch (NullPointerException | NumberFormatException var5) {
        }

        return myId - otherId;
    }
}
