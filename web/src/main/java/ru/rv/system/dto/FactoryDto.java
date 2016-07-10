package ru.rv.system.dto;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import java.math.BigInteger;

public final class FactoryDto
{
    public static RuleDto createRuleDto(@Nonnegative final long id,
                                        @Nonnull final String name)
    {
        return new RuleDto(id, name);
    }
    public static AuditDto createAuditDto(@Nonnegative final long id,
                                          @Nonnull final String name,
                                          @Nonnull final String description)
    {
        return new AuditDto(id, name, description);
    }

    private FactoryDto() {}
}
