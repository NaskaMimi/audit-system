package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.annotation.Nonnull;
import java.math.BigInteger;

public class RuleDto
{
    private final BigInteger id;
    private final String name;

    @JsonCreator
    RuleDto(@Nonnull final BigInteger id,
            @Nonnull final String name)
    {
        this.id = id;
        this.name = name;
    }

    @Nonnull
    public BigInteger getId()
    {
        return id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }
}
