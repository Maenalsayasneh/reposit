package n0.c.k;

import kotlinx.serialization.KSerializer;

/* compiled from: PluginHelperInterfaces.kt */
public interface v<T> extends KSerializer<T> {
    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
