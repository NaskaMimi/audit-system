package ru.rv.system.entity;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "REPORTS")
@NamedQueries(
        @NamedQuery(name = "REPORTS.loadAll", query = "select o from ReportEntity o")
)
public class ReportEntity implements Serializable
{
    @Id
    @SequenceGenerator(name = "report_id_seq_gen", sequenceName = "report_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_id_seq_gen")
    @Column(name = "ID_REPORT")
    private long id;

    @Column(name = "NAME_REPORT", length = 50, nullable = false)
    private String nameReport;

    @Column(name = "DATE")
    private Date date;

    @OneToOne(optional = false)
    @JoinColumn(name = "ID_AUDIT")
    private AuditEntity auditEntity;

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

    public void setNameReport(@Nonnull final String nameReport)
    {
        this.nameReport = nameReport;
    }

    @Nonnull
    public Date getDate()
    {
        return date;
    }

    public void setDate(@Nonnull final Date date)
    {
        this.date = date;
    }

    @Nonnull
    public AuditEntity getAuditEntity()
    {
        return auditEntity;
    }

    public void setAuditEntity(@Nonnull final AuditEntity auditEntity)
    {
        this.auditEntity = auditEntity;
    }
}
