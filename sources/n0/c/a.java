package n0.c;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.d;
import n0.c.i.b;
import n0.c.i.g;
import n0.c.k.u0;

/* compiled from: ContextualSerializer.kt */
public final class a<T> implements KSerializer<T> {
    public final SerialDescriptor a;
    public final d<T> b;
    public final KSerializer<T> c = null;
    public final KSerializer<?>[] d;

    public a(d<T> dVar, KSerializer<T> kSerializer, KSerializer<?>[] kSerializerArr) {
        i.e(dVar, "serializableClass");
        i.e(kSerializerArr, "typeParametersSerializers");
        this.b = dVar;
        this.d = kSerializerArr;
        SerialDescriptor g02 = m0.r.t.a.r.m.a1.a.g0("kotlinx.serialization.ContextualSerializer", g.a.a, new SerialDescriptor[0], (l) null, 8);
        i.e(g02, "$this$withContext");
        i.e(dVar, "context");
        this.a = new b(g02, dVar);
    }

    public final KSerializer<T> a(n0.c.m.b bVar) {
        KSerializer<T> b2 = bVar.b(this.b);
        if (b2 == null) {
            b2 = this.c;
        }
        if (b2 != null) {
            return b2;
        }
        u0.d(this.b);
        throw null;
    }

    public T deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return decoder.B(a(decoder.a()));
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public void serialize(Encoder encoder, T t) {
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.e(a(encoder.a()), t);
    }
}
