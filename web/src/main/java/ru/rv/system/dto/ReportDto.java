package ru.rv.system.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import java.io.Serializable;
import java.util.Date;

public class ReportDto implements Serializable
{
    private final long id;
    private final String nameReport;
    private final String nameAudit;
    private final Date date;

    @JsonCreator
    ReportDto(@Nonnegative @JsonProperty("id") final long id,
                      @Nonnull @JsonProperty("nameReport") final String nameReport,
                      @Nonnull @JsonProperty("nameAudit") final String nameAudit,
                      @Nonnull @JsonProperty("date") final Date date)
    {
        this.id = id;
        this.nameReport = nameReport;
        this.nameAudit = nameAudit;
        this.date = date;
    }

    @Nonnegative
    public long getId()
    {
        return id;
    }

    @Nonnull
    public String getNameReport()
    {
        return nameReport;
    }

    @Nonnull
    public String getNameAudit()
    {
        return nameAudit;
    }

    @Nonnull
    public Date getDate()
    {
        return date;
    }
}
