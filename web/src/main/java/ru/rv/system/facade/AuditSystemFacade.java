package ru.rv.system.facade;

import ru.rv.system.converter.RuleConverter;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.service.RuleBean;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class AuditSystemFacade
{
    @Inject
    RuleBean ruleBean;
    @Inject
    RuleConverter ruleConverter;

    @Inject
    public AuditSystemFacade(@Nonnull final RuleBean ruleBean,
                             @Nonnull final RuleConverter ruleConverter)
    {
        this.ruleBean = ruleBean;
        this.ruleConverter = ruleConverter;
    }

    @Nonnull
    public List<RuleDto> loadRule()
    {
        return ruleBean.loadRules()
                .stream()
                .map(ruleConverter::convert)
                .collect(Collectors.toList());
    }

    public void authorization(@Nonnull final String login,
                              @Nonnull final String password)
    {

    }

    public void addRule(@Nonnull final RuleDto ruleDto)
    {
        ruleBean.addRule(ruleConverter.convert(ruleDto));
    }
}
