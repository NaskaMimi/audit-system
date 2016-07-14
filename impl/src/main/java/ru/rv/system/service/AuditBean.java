package ru.rv.system.service;

import ru.rv.system.entity.AuditEntity;

import javax.annotation.Nonnull;
import javax.ejb.Local;
import java.util.Collection;

@Local
public interface AuditBean
{
    @Nonnull
    Collection<AuditEntity> loadAudits();
}
