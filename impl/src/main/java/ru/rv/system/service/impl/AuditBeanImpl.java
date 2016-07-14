package ru.rv.system.service.impl;

import ru.rv.system.entity.AuditEntity;
import ru.rv.system.service.AuditBean;

import javax.annotation.Nonnull;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class AuditBeanImpl implements AuditBean
{
    @PersistenceContext(unitName = "PostgrePersistence")
    private EntityManager entityManager;

    @Nonnull
    @Override
    public Collection<AuditEntity> loadAudits()
    {
        return entityManager.createNamedQuery("AUDITS.loadAll", AuditEntity.class)
                .getResultList();
    }
}
