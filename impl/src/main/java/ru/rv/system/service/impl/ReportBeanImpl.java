package ru.rv.system.service.impl;

import ru.rv.system.entity.ReportEntity;
import ru.rv.system.service.ReportBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

public class ReportBeanImpl implements ReportBean
{
    @PersistenceContext(unitName = "PostgrePersistence")
    private EntityManager entityManager;

    @Override
    public Collection<ReportEntity> loadReports()
    {
        return entityManager
                .createNamedQuery("REPORTS.loadAll", ReportEntity.class)
                .getResultList();
    }
}
