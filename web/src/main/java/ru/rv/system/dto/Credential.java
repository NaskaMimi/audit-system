package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.annotation.Nonnull;
import java.io.Serializable;

public class Credential implements Serializable
{
    private String login;
    private String password;

    @JsonCreator
    public Credential(@Nonnull final String login,
                      @Nonnull final String password)
    {
        this.login = login;
        this.password = password;
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }
}
