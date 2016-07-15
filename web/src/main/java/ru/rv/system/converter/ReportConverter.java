package ru.rv.system.converter;


import ru.rv.system.dto.FactoryDto;
import ru.rv.system.dto.ReportDto;
import ru.rv.system.entity.ReportEntity;

import javax.annotation.Nonnull;

public class ReportConverter implements Converter<ReportEntity, ReportDto>
{
    @Nonnull
    @Override
    public ReportDto convert(@Nonnull ReportEntity reportEntity)
    {
        return FactoryDto.createReportDto(reportEntity.getId(),
                reportEntity.getNameReport(),
                reportEntity.getAuditEntity().getName(),
                reportEntity.getDate());
    }
}
