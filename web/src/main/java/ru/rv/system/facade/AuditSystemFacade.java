package ru.rv.system.facade;

import ru.rv.system.converter.RuleConverter;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.service.LoadRuleService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class AuditSystemFacade
{
    @Inject
    LoadRuleService loadRuleService;
    @Inject
    RuleConverter ruleConverter;

    @Inject
    public AuditSystemFacade(@Nonnull final LoadRuleService loadRuleService,
                             @Nonnull final RuleConverter ruleConverter)
    {
        this.loadRuleService = loadRuleService;
        this.ruleConverter = ruleConverter;
    }

    public List<RuleDto> loadRule()
    {
        return loadRuleService.loadRules().stream()
                .map(ruleConverter::convert)
                .collect(Collectors.toList());
    }
}
