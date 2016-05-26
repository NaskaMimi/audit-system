package ru.rv.system.entity;

import javax.annotation.Nonnull;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "RULES")
@NamedQueries(
        @NamedQuery(name = "RULES.loadAll", query = "select o from RuleEntity o")
)
public class RuleEntity implements Serializable
{
    @Id
    @SequenceGenerator(name = "rule_id_seq_gen", sequenceName = "rule_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rule_id_seq_gen")
    @Column(name = "ID_RULES")
    private long id;

    @Column(name = "NAME_RULES")
    private String name;

    public RuleEntity() {}

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }

    public void setName(@Nonnull final String name)
    {
        this.name = name;
    }
}
