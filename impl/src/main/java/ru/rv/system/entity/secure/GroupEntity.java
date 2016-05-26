package ru.rv.system.entity.secure;

import javax.annotation.Nonnull;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "GROUPS")
public class GroupEntity implements Serializable
{
    @Id
    @GeneratedValue(generator = "group_id_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "group_id_seq_gen", sequenceName = "group_id_seq", allocationSize = 1)
    @Column(name = "ID_GROUP")
    private int id;

    @Column(name = "NAME_GROUP", nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Collection<UserEntity> users;

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
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

    @Nonnull
    public Collection<UserEntity> getUsers()
    {
        return users;
    }

    public void setUsers(@Nonnull final Collection<UserEntity> users)
    {
        this.users = users;
    }
}
