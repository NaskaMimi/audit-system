package ru.rv.system.dto;

import javax.annotation.Nonnull;
import java.math.BigInteger;

public class FactoryDto
{
    public static RuleDto createRuleDto(@Nonnull final BigInteger id,
                                        @Nonnull final String name)
    {
        return new RuleDto(id, name);
    }

    private FactoryDto() {}
}
