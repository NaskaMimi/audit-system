package ru.vr.system.converter;

import ru.vr.system.dto.*;
import ru.rv.system.entity.RuleEntity;

import javax.annotation.Nonnull;

public class RuleConverter implements Converter<RuleEntity, RuleDto>
{
    @Nonnull
    @Override
    public RuleDto convert(@Nonnull final RuleEntity ruleEntity)
    {
        return FactoryDto.createRuleDto(
                ruleEntity.getId(),
                ruleEntity.getName());
    }
}
