package ru.rv.system.entity;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "AUDITS")
@NamedQueries(
        @NamedQuery(name = "AUDITS.loadAll", query = "select o from AuditEntity o")
)
public class AuditEntity implements Serializable
{
    @Id
    @SequenceGenerator(name = "audit_id_seq_gen", sequenceName = "audit_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_id_seq_gen")
    @Column(name = "ID_AUDIT")
    private BigInteger id;

    @Column(name = "NAME_AUDIT", length = 50, nullable = false)
    private String name;

    @Column(name = "DESCRIPTION_AUDIT", length = 100)
    private String description;

    @Nonnegative
    public BigInteger getId()
    {
        return id;
    }

    public void setId(@Nonnegative final BigInteger id)
    {
        this.id = id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }

    public void setName(@Nullable final String name)
    {
        this.name = name;
    }

    @Nullable
    public String getDescription()
    {
        return description;
    }

    public void setDescription(@Nullable final String description)
    {
        this.description = description;
    }
}
