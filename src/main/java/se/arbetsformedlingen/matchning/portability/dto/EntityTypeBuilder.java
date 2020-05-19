package se.arbetsformedlingen.matchning.portability.dto;

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

    public EntityTypeBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public EntityType createEntityType() {
        return new EntityType(id, name, code);
    }
}