package ru.rv.system.entity.secure;

import javax.annotation.Nonnull;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "ROLES")
public class RoleEntity implements Serializable
{
    @Id
    @SequenceGenerator(name = "role_id_seq_gen", sequenceName = "role_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_seq_gen")
    @Column(name = "ID_ROLE")
    private long id;

    @Column(name = "NAME_ROLE", nullable = false)
    private String name;

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
