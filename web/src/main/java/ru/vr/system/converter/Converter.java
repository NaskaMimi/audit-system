package ru.vr.system.converter;

import javax.annotation.Nonnull;

public interface Converter<Input, Output>
{
    @Nonnull
    Output convert(@Nonnull Input input);
}
