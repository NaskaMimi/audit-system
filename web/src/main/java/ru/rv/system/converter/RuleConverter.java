package ru.rv.system.converter;

import ru.rv.system.dto.FactoryDto;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.entity.RuleEntity;

import javax.annotation.Nonnull;

public class RuleConverter
        implements Converter<RuleEntity, RuleDto>

{
    @Nonnull
    @Override
    public RuleDto convert(@Nonnull final RuleEntity ruleEntity)
    {
        return FactoryDto.createRuleDto(
                ruleEntity.getId(),
                ruleEntity.getName());
    }

    @Nonnull
    @Override
    public RuleEntity convert(@Nonnull RuleDto input)
    {
        RuleEntity ruleEntity = new RuleEntity();
        ruleEntity.setName(input.getName());
        return ruleEntity;
    }
}
