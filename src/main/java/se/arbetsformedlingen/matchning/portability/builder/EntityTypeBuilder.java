package se.arbetsformedlingen.matchning.portability.builder;

import se.arbetsformedlingen.matchning.portability.dto.EntityType;
import se.arbetsformedlingen.matchning.portability.dto.IdentifierType;

public class EntityTypeBuilder {
    private EntityType entityType = new EntityType();

    public EntityTypeBuilder setId(IdentifierType id) {
        entityType.id = id;
        return this;
    }

    public EntityTypeBuilder setName(String name) {
        entityType.name = name;
        return this;
    }

    public EntityTypeBuilder setCode(String code) {
        entityType.code = code;
        return this;
    }

    public EntityType build() {
        return entityType;
    }
}