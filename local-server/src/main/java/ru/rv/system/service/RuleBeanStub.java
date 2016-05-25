package ru.rv.system.service;

import com.google.common.collect.Lists;
import ru.rv.system.entity.RuleEntity;

import javax.annotation.Nonnull;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import java.util.List;

@Alternative
@Stateless
public class RuleBeanStub implements RuleBean
{
    @Nonnull
    @Override
    public List<RuleEntity> loadRules()
    {
        return Lists.newArrayList();
    }

    @Override
    public void addRule(@Nonnull final RuleEntity ruleEntity)
    {
        //TODO: implements method
    }
}
