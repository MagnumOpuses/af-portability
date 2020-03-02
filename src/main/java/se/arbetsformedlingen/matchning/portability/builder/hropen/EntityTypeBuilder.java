package se.arbetsformedlingen.matchning.portability.builder.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.EntityType;
import se.arbetsformedlingen.matchning.portability.model.hropen.IdentifierType;

public class EntityTypeBuilder {
    private EntityType entityType = new EntityType();

    public EntityTypeBuilder setId(IdentifierType id) {
        entityType.setId(id);
        return this;
    }

    public EntityTypeBuilder setName(String name) {
        entityType.setName(name);
        return this;
    }

    public EntityTypeBuilder setCode(String code) {
        entityType.setCode(code);
        return this;
    }

    public EntityType createEntityType() {
        return entityType;
    }
}