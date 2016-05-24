package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.annotation.Nonnull;
import java.math.BigInteger;

public class RuleDto
{
    private final long id;
    private final String name;

    @JsonCreator
    RuleDto(final long id,
            @Nonnull final String name)
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
