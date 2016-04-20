package ru.rv.system.resources;

import ru.rv.system.Constants;
import ru.rv.system.converter.RuleConverter;
import ru.rv.system.dto.FactoryDto;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.service.LoadRuleService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import static ru.rv.system.Constants.JAX_RS_RESOURCE_AUDIT_PATH;

@Path(JAX_RS_RESOURCE_AUDIT_PATH)
public class AuditSystemResource
{
    //TODO:create Facade
    @Inject
    LoadRuleService loadRuleService;
    @Inject
    RuleConverter ruleConverter;

    @Path(Constants.LOAD_RULES_PATH)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RuleDto> loadRules()
    {
        return loadRuleService.loadRules().stream()
                .map(ruleConverter::convert)
                .collect(Collectors.toList());
    }

    @Path(Constants.LOAD_RULE_PATH)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RuleDto loadRule(@PathParam(Constants.RULE_ID) BigInteger ruleId)
    {
        return FactoryDto.createRuleDto(BigInteger.ONE,"");
    }
}
