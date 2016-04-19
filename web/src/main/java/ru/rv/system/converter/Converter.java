package ru.rv.system.converter;

import javax.annotation.Nonnull;

public interface Converter<Input, Output>
{
    @Nonnull
    Output convert(@Nonnull Input input);
}
