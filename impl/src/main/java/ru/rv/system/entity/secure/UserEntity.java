package ru.rv.system.entity.secure;

import javax.annotation.Nonnull;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
public class UserEntity implements Serializable
{
    @Id
    @SequenceGenerator(name = "user_id_seq_gen", sequenceName = "user_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq_gen")
    @Column(name = "ID_USER")
    private long id;

    @Column(name = "NAME_USER", nullable = false)
    private String name;

    @Column(name = "PASSWORD_USER", nullable = false)
    private String password;

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

    @Nonnull
    public String getPassword()
    {
        return password;
    }

    public void setPassword(@Nonnull final String password)
    {
        this.password = password;
    }
}
