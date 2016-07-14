package ru.rv.system.converter;

import ru.rv.system.dto.AuditDto;
import ru.rv.system.dto.FactoryDto;
import ru.rv.system.entity.AuditEntity;

import javax.annotation.Nonnull;

public class AuditConverter
        implements Converter<AuditEntity, AuditDto>
{

    @Nonnull
    @Override
    public AuditDto convert(@Nonnull final AuditEntity auditEntity)
    {
        return FactoryDto.createAuditDto(
                auditEntity.getId(),
                auditEntity.getName(),
                auditEntity.getDescription());
    }
}
