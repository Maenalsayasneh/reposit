package n0.c;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: KSerializer.kt */
public interface b<T> {
    T deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
