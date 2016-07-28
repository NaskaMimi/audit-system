package ru.rv.system.resources;

import ru.rv.system.dto.AuditDto;
import ru.rv.system.dto.ReportDto;
import ru.rv.system.dto.RuleDto;

import javax.annotation.Nonnull;
import javax.ws.rs.*;
import java.util.Collection;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;
import static ru.rv.system.Constants.*;

@Path(JAX_RS_RESOURCE_AUDIT_PATH)
public interface AuditSystemResource
{
    @Nonnull
    @Path(RULES_PATH)
    @GET
    @Produces(APPLICATION_JSON)
    List<RuleDto> loadRule();

    @Path(AUTHORIZATION_USER_PATH)
    @POST
    @Produces(TEXT_PLAIN)
    void authorization(@Nonnull String login, @Nonnull String password);

    @Path(RULE_PATH)
    @PUT
    @Produces(APPLICATION_JSON)
    void addRule(@Nonnull RuleDto ruleDto);

    @Path(AUDITS_PATH)
    @GET
    @Produces(APPLICATION_JSON)
    List<AuditDto> loadAudits();

    @Path(AUDIT_PATH)
    @POST
    @Produces(APPLICATION_JSON)
    AuditDto createAudit(AuditDto auditDto);

    @Path(REPORT_PATH)
    @GET
    @Produces(APPLICATION_JSON)
    List<ReportDto> loadReports();
}
