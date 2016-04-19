package ru.rv.system.service;

import ru.rv.system.entity.RuleEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface LoadRuleService
{
    List<RuleEntity> loadRules();
}
