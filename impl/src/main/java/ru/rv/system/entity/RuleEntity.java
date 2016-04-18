package ru.rv.system.entity;

import java.io.Serializable;
import java.math.BigInteger;

public class RuleEntity implements Serializable
{
    private BigInteger id;
    private String name;

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
