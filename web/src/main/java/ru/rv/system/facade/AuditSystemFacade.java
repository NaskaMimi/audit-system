package ru.rv.system.facade;

import com.google.common.collect.Lists;
import ru.rv.system.converter.RuleConverter;
import ru.rv.system.dto.AuditDto;
import ru.rv.system.dto.FactoryDto;
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

    public List<AuditDto> loadAudits()
    {
        return Lists.newArrayList(
                FactoryDto.createAuditDto(1, "name1", "description1"),
                FactoryDto.createAuditDto(2, "name2", "description2"));
    }
}
