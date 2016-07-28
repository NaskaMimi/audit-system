package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Date;

public final class FactoryDto
{
    public static RuleDto createRuleDto(@Nonnegative final long id,
                                        @Nonnull final String name)
    {
        return new RuleDto(id, name);
    }
    public static AuditDto createAuditDto(@Nonnegative final BigInteger id,
                                          @Nonnull final String name,
                                          @Nullable final String description)
    {
        return new AuditDto(id, name, description);
    }

    public static ReportDto createReportDto(@Nonnegative final long id,
                                            @Nonnull final String nameReport,
                                            @Nonnull final String nameAudit,
                                            @Nonnull final Date date)
    {
        return new ReportDto(id, nameReport, nameAudit, date);
    }

    private FactoryDto() {}
}
