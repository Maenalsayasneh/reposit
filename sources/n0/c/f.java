package n0.c;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: KSerializer.kt */
public interface f<T> {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, T t);
}
