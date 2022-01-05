package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.Objects;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.b;
import n0.c.f;
import n0.c.i.c;

/* compiled from: JsonContentPolymorphicSerializer.kt */
public abstract class d<T> implements KSerializer<T> {
    public final SerialDescriptor a;
    public final m0.r.d<T> b;

    public d(m0.r.d<T> dVar) {
        i.e(dVar, "baseClass");
        this.b = dVar;
        StringBuilder P0 = a.P0("JsonContentPolymorphicSerializer<");
        P0.append(dVar.e());
        P0.append('>');
        this.a = m0.r.t.a.r.m.a1.a.g0(P0.toString(), c.b.a, new SerialDescriptor[0], (l) null, 8);
    }

    public abstract b<? extends T> a(JsonElement jsonElement);

    public final T deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        e U = m0.r.t.a.r.m.a1.a.U(decoder);
        JsonElement i = U.i();
        b a2 = a(i);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T>");
        return U.d().d((KSerializer) a2, i);
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public final void serialize(Encoder encoder, T t) {
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        f<T> d = encoder.a().d(this.b, t);
        if (d == null) {
            d = m0.r.t.a.r.m.a1.a.v3(m.a(t.getClass()));
        }
        if (d != null) {
            ((KSerializer) d).serialize(encoder, t);
            return;
        }
        m0.r.d a2 = m.a(t.getClass());
        m0.r.d<T> dVar = this.b;
        String e = a2.e();
        if (e == null) {
            e = String.valueOf(a2);
        }
        StringBuilder P0 = a.P0("in the scope of '");
        P0.append(dVar.e());
        P0.append('\'');
        StringBuilder U0 = a.U0("Class '", e, "' is not registered for polymorphic serialization ", P0.toString(), ".\n");
        U0.append("Mark the base class as 'sealed' or register the serializer explicitly.");
        throw new SerializationException(U0.toString());
    }
}
