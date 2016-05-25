package ru.rv.system.converter;

import javax.annotation.Nonnull;
import java.io.Serializable;

public interface Converter<Input extends Serializable, Output>
{
    @Nonnull
    Output convert(@Nonnull Input input);

    @Nonnull
    Input convert(@Nonnull Output input);
}
