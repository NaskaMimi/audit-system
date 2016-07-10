package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;
import java.io.Serializable;
import java.math.BigInteger;

public class RuleDto implements Serializable
{
    private final long id;
    private final String name;

    @JsonCreator
    RuleDto(@JsonProperty("id") final long id,
            @JsonProperty("name") @Nonnull final String name)
    {
        this.id = id;
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }

}
