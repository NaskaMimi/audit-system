package ru.rv.system.service;

import ru.rv.system.entity.RuleEntity;

import javax.annotation.Nonnull;
import javax.ejb.Local;
import java.util.List;

@Local
public interface RuleBean
{
    @Nonnull
    List<RuleEntity> loadRules();

    void addRule(@Nonnull RuleEntity ruleEntity);
}
