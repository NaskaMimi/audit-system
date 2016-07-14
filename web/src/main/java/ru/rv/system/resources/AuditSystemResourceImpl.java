package ru.rv.system.resources;

import ru.rv.system.dto.AuditDto;
import ru.rv.system.dto.ReportDto;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.facade.AuditSystemFacade;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.util.List;

public class AuditSystemResourceImpl implements AuditSystemResource
{
    @Inject
    AuditSystemFacade auditSystemFacade;

    @Nonnull
    @Override
    public List<RuleDto> loadRule()
    {
        return auditSystemFacade.loadRule();
    }

    @Override
    public void authorization(@Nonnull final String login,
                              @Nonnull final String password)
    {
        auditSystemFacade.authorization(login, password);
    }

    @Override
    public void addRule(@Nonnull final RuleDto ruleDto)
    {
        auditSystemFacade.addRule(ruleDto);
    }

    @Override
    public List<AuditDto> loadAudits()
    {
        return auditSystemFacade.loadAudits();
    }

    @Override
    public List<ReportDto> loadReports()
    {
        return auditSystemFacade.loadReport();
    }
}
