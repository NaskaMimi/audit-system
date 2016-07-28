package ru.rv.system.converter;

import ru.rv.system.dto.AuditDto;
import ru.rv.system.dto.FactoryDto;
import ru.rv.system.entity.AuditEntity;

import javax.annotation.Nonnull;

import static ru.rv.system.dto.FactoryDto.createAuditDto;

public class AuditConverter
        implements Converter<AuditEntity, AuditDto>
{
    @Nonnull
    @Override
    public AuditDto convert(@Nonnull final AuditEntity auditEntity)
    {
        return createAuditDto(
                auditEntity.getId(),
                auditEntity.getName(),
                auditEntity.getDescription());
    }

    @Nonnull
    public AuditEntity convert(@Nonnull final AuditDto auditDto)
    {
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setId(auditDto.getId());
        auditEntity.setName(auditDto.getName());
        auditEntity.setDescription(auditDto.getDescription());
        return auditEntity;
    }
}
