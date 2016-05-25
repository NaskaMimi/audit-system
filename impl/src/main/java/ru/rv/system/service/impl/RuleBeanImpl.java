package ru.rv.system.service.impl;

import ru.rv.system.entity.RuleEntity;
import ru.rv.system.service.RuleBean;

import javax.annotation.Nonnull;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class RuleBeanImpl implements RuleBean
{
    @PersistenceContext(unitName = "PostgrePersistence")
    private EntityManager entityManager;

    @Nonnull
    @Override
    public List<RuleEntity> loadRules()
    {
        return entityManager
                .createNamedQuery("RULES.loadAll", RuleEntity.class)
                .getResultList();

    }

    @Override
    public void addRule(@Nonnull RuleEntity ruleEntity)
    {
        entityManager.persist(ruleEntity);
    }
}
