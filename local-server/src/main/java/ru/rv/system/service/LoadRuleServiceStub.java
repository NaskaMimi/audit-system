package ru.rv.system.service;

import com.google.common.collect.Lists;
import ru.rv.system.entity.RuleEntity;
import ru.rv.system.service.LoadRuleService;

import java.util.List;

//@Alternative
public class LoadRuleServiceStub implements LoadRuleService
{
    @Override
    public List<RuleEntity> loadRules()
    {
        return Lists.newArrayList();
    }
}
