package ru.rv.system.service;

import ru.rv.system.entity.RuleEntity;

import javax.ejb.Stateless;
import java.util.List;

public interface LoadRuleService
{
    List<RuleEntity> loadRules();
}
