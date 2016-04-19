package ru.vr.system.resources;

import ru.vr.system.converter.RuleConverter;
import ru.vr.system.dto.RuleDto;
import ru.rv.system.service.LoadRuleService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/audit")
public class AuditSystemResource
{
    @Inject
    LoadRuleService loadRuleService;
    @Inject
    RuleConverter ruleConverter;

    /*@Inject
    public AuditSystemResource(@Nonnull final LoadRuleService loadRuleService,
                               @Nonnull final RuleConverter ruleConverter)
    {
        this.loadRuleService = loadRuleService;
        this.ruleConverter = ruleConverter;
    }*/

    @Path("loadRule")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RuleDto> loadRule()
    {
        return loadRuleService.loadRules().stream()
                .map(ruleConverter::convert)
                .collect(Collectors.toList());
    }
}
