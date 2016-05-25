package ru.rv.system.resources;

import ru.rv.system.Constants;
import ru.rv.system.dto.RuleDto;

import javax.annotation.Nonnull;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static ru.rv.system.Constants.JAX_RS_RESOURCE_AUDIT_PATH;

@Path(JAX_RS_RESOURCE_AUDIT_PATH)
public interface AuditSystemResource
{
    @Nonnull
    @Path(Constants.RULES_PATH)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<RuleDto> loadRule();

    @Path(Constants.AUTHORIZATION_USER_PATH)
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    void authorization(@Nonnull String login, @Nonnull String password);

    @Path(Constants.RULE_PATH)
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    void addRule(@Nonnull RuleDto ruleDto);
}
