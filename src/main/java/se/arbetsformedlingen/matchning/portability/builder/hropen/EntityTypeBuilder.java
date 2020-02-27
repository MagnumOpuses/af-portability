package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EntityType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;

public class EntityTypeBuilder {
    private IdentifierType id;
    private String name;
    private String code;

    public EntityTypeBuilder setId(IdentifierType id) {
        this.id = id;
        return this;
    }

    public EntityTypeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EntityTypeBuilder withName(String name){
        setName(name);
        return this;
    }

    public EntityTypeBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public EntityType createEntityType() {
        return new EntityType(id, name, code);
    }
}