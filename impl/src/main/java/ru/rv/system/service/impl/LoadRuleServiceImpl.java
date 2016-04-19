package ru.rv.system.service.impl;

import com.google.common.collect.Lists;
import ru.rv.system.entity.RuleEntity;
import ru.rv.system.service.LoadRuleService;

import javax.enterprise.inject.Alternative;
import java.math.BigInteger;
import java.util.List;

public class LoadRuleServiceImpl implements LoadRuleService
{
    @Override
    public List<RuleEntity> loadRules()
    {
        RuleEntity ruleEntity = new RuleEntity();
        ruleEntity.setId(BigInteger.ONE);
        ruleEntity.setName("sss");
        return Lists.newArrayList(ruleEntity);
    }
}
