package shared;

import java.util.UUID;

public abstract class Entity {
    protected String id;

    public Entity(String id) {
        this.id = (id != null) ? id : getRandomUUID();
    }

    public String getId() {
        return id;
    }

    private String getRandomUUID() {
        return UUID.randomUUID().toString();
    }
}