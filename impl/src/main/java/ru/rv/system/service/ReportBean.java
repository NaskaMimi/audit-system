package ru.rv.system.service;

import ru.rv.system.entity.ReportEntity;

import javax.ejb.Local;
import java.util.Collection;

@Local
public interface ReportBean
{
    Collection<ReportEntity> loadReports();
}
