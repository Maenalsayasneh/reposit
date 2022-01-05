package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.n;
import m0.r.p;
import n0.c.i.g;
import n0.c.k.l0;
import n0.c.m.d;

/* compiled from: JsonElementSerializers.kt */
public final class b implements KSerializer<JsonArray> {
    public static final SerialDescriptor a = a.b;
    public static final b b = new b();

    /* compiled from: JsonElementSerializers.kt */
    public static final class a implements SerialDescriptor {
        public static final String a = "kotlinx.serialization.json.JsonArray";
        public static final a b = new a();
        public final /* synthetic */ SerialDescriptor c;

        public a() {
            n i = m.a.i(m.a(List.class), Collections.singletonList(p.b.a(m.e(JsonElement.class))), false);
            i.e(i, "type");
            this.c = m0.r.t.a.r.m.a1.a.u3(d.a, i).getDescriptor();
        }

        public String a() {
            return a;
        }

        public boolean c() {
            return this.c.c();
        }

        public int d(String str) {
            i.e(str, "name");
            return this.c.d(str);
        }

        public int e() {
            return this.c.e();
        }

        public g f() {
            return this.c.f();
        }

        public String g(int i) {
            return this.c.g(i);
        }

        public SerialDescriptor h(int i) {
            return this.c.h(i);
        }

        public boolean isInline() {
            return this.c.isInline();
        }
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        m0.r.t.a.r.m.a1.a.U(decoder);
        return new JsonArray((List) ((n0.c.k.a) m0.r.t.a.r.m.a1.a.u(JsonElementSerializer.b)).deserialize(decoder));
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        i.e(encoder, "encoder");
        i.e(jsonArray, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        m0.r.t.a.r.m.a1.a.V(encoder);
        ((l0) m0.r.t.a.r.m.a1.a.u(JsonElementSerializer.b)).serialize(encoder, jsonArray);
    }
}
