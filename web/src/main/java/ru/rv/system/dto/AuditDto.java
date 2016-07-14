package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.Serializable;

public class AuditDto implements Serializable
{
    private long id;
    private String name;
    private String description;

    @JsonCreator
    protected AuditDto(@Nonnegative @JsonProperty("id") final long id,
                       @Nonnull @JsonProperty("name") final String name,
                       @Nullable @JsonProperty("description") String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Nonnegative
    public long getId()
    {
        return id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }

    @Nullable
    public String getDescription()
    {
        return description;
    }
}
