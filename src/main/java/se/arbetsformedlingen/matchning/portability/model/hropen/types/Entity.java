package se.arbetsformedlingen.matchning.portability.model.hropen.types;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Entity {
    private String id;
    private String name;
    private String code;
    private String type;

    public Entity() {}
    public Entity(String name, String code) {
        setName(name);
        setCode(code);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String code) {
        this.type = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;
        Entity entity = (Entity) o;
        return Objects.equals(getId(), entity.getId()) &&
                Objects.equals(getName(), entity.getName()) &&
                Objects.equals(getCode(), entity.getCode()) &&
                Objects.equals(getType(), entity.getType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getCode(), getType());
    }
}
