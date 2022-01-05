package n0.c.k;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;

/* compiled from: InlineClassDescriptor.kt */
public final class b0 implements v<T> {
    public final /* synthetic */ KSerializer a;

    public b0(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{this.a};
    }

    public T deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        throw new IllegalStateException("unsupported".toString());
    }

    public SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported".toString());
    }

    public void serialize(Encoder encoder, T t) {
        i.e(encoder, "encoder");
        throw new IllegalStateException("unsupported".toString());
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
