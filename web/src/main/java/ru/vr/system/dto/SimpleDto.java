package ru.vr.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.math.BigInteger;

public class SimpleDto
{
    private BigInteger id;
    private String name;

    @JsonCreator
    public SimpleDto(BigInteger id,
                     String name)
    {
        this.id = id;
        this.name = name;
    }

    public BigInteger getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
