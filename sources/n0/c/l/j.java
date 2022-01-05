package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import m0.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;
import n0.c.k.k1;

/* compiled from: JsonElementSerializers.kt */
public final class j implements KSerializer<i> {
    public static final SerialDescriptor a = a.w("kotlinx.serialization.json.JsonLiteral", d.i.a);
    public static final j b = new j();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        JsonElement i = a.U(decoder).i();
        if (i instanceof i) {
            return (i) i;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Unexpected JSON element, expected JsonLiteral, had ");
        P0.append(m.a(i.getClass()));
        throw a.q(-1, P0.toString(), i.toString());
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        i.e(encoder, "encoder");
        i.e(iVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        a.V(encoder);
        if (iVar.b) {
            encoder.F(iVar.a);
            return;
        }
        i.e(iVar, "$this$longOrNull");
        String b2 = iVar.b();
        i.e(b2, "$this$toLongOrNull");
        Long U = StringsKt__IndentKt.U(b2, 10);
        if (U != null) {
            encoder.C(U.longValue());
            return;
        }
        f W = StringsKt__IndentKt.W(iVar.a);
        if (W != null) {
            long j = W.d;
            i.e(f.c, "$this$serializer");
            k1 k1Var = k1.b;
            Encoder y = encoder.y(k1.a);
            if (y != null) {
                y.C(j);
                return;
            }
            return;
        }
        i.e(iVar, "$this$doubleOrNull");
        Double a4 = a.a4(iVar.b());
        if (a4 != null) {
            encoder.h(a4.doubleValue());
            return;
        }
        Boolean E1 = a.E1(iVar);
        if (E1 != null) {
            encoder.k(E1.booleanValue());
        } else {
            encoder.F(iVar.a);
        }
    }
}
