package ru.rv.system.facade;

import ru.rv.system.converter.AuditConverter;
import ru.rv.system.converter.ReportConverter;
import ru.rv.system.converter.RuleConverter;
import ru.rv.system.dto.AuditDto;
import ru.rv.system.dto.FactoryDto;
import ru.rv.system.dto.ReportDto;
import ru.rv.system.dto.RuleDto;
import ru.rv.system.service.AuditBean;
import ru.rv.system.service.ReportBean;
import ru.rv.system.service.RuleBean;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//TODO: change facade on command
public class AuditSystemFacade
{
    @Inject
    RuleBean ruleBean;
    @Inject
    AuditBean auditBean;
    @Inject
    ReportBean reportBean;

    @Inject
    RuleConverter ruleConverter;
    @Inject
    AuditConverter auditConverter;
    @Inject
    ReportConverter reportConverter;

    @Inject
    public AuditSystemFacade(@Nonnull final RuleBean ruleBean,
                             @Nonnull final AuditBean auditBean,
                             @Nonnull final ReportBean reportBean,
                             @Nonnull final RuleConverter ruleConverter,
                             @Nonnull final AuditConverter auditConverter,
                             @Nonnull final ReportConverter reportConverter)
    {
        this.ruleBean = ruleBean;
        this.auditBean = auditBean;
        this.reportBean = reportBean;
        this.ruleConverter = ruleConverter;
        this.auditConverter = auditConverter;
        this.reportConverter = reportConverter;
    }

    @Nonnull
    public List<RuleDto> loadRule()
    {
        return ruleBean.loadRules()
                .stream()
                .map(ruleConverter::convert)
                .collect(Collectors.toList());
    }

    public void authorization(@Nonnull final String login,
                              @Nonnull final String password)
    {

    }

    public void addRule(@Nonnull final RuleDto ruleDto)
    {
        // TODO: addRule
    }

    public List<AuditDto> loadAudits()
    {
        return auditBean.loadAudits()
                .stream()
                .map(auditConverter::convert)
                .collect(Collectors.toList());
    }

    public List<ReportDto> loadReport()
    {
        return reportBean.loadReports()
                .stream()
                .map(reportConverter::convert)
                .collect(Collectors.toList());
    }

    public AuditDto addAudit(AuditDto auditDto)
    {
        return FactoryDto.createAuditDto(BigInteger.TEN, "test add", "test add d");
    }
}
