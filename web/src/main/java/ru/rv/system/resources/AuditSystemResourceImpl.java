package ru.rv.system.resources;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.facade.AuditSystemFacade;

import javax.annotation.Nonnull;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.Collections;
import java.util.List;

public class AuditSystemResourceImpl implements AuditSystemResource
{
    @Inject
    AuditSystemFacade auditSystemFacade;

    @Nonnull
    @Override
    public List<RuleDto> loadRule()
    {
        return auditSystemFacade.loadRule();
    }

    @Override
    public void authorization(@Nonnull final String login,
                              @Nonnull final String password)
    {
        auditSystemFacade.authorization(login, password);
    }

}
