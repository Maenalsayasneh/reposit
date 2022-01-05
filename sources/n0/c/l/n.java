package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import m0.n.b.i;
import m0.n.b.m;
import m0.n.b.q;
import m0.r.p;
import n0.c.i.g;
import n0.c.k.g1;
import n0.c.k.q0;
import n0.c.m.d;

/* compiled from: JsonElementSerializers.kt */
public final class n implements KSerializer<JsonObject> {
    public static final SerialDescriptor a = a.b;
    public static final n b = new n();

    /* compiled from: JsonElementSerializers.kt */
    public static final class a implements SerialDescriptor {
        public static final String a = "kotlinx.serialization.json.JsonObject";
        public static final a b = new a();
        public final /* synthetic */ SerialDescriptor c;

        public a() {
            p.a aVar = p.b;
            m0.r.n f = m.f(HashMap.class, aVar.a(m.e(String.class)), aVar.a(m.e(JsonElement.class)));
            i.e(f, "type");
            this.c = m0.r.t.a.r.m.a1.a.u3(d.a, f).getDescriptor();
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
        m0.r.t.a.r.m.a1.a.s3(q.a);
        return new JsonObject((Map) ((n0.c.k.a) m0.r.t.a.r.m.a1.a.v(g1.b, JsonElementSerializer.b)).deserialize(decoder));
    }

    public SerialDescriptor getDescriptor() {
        return a;
    }

    public void serialize(Encoder encoder, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        i.e(encoder, "encoder");
        i.e(jsonObject, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        m0.r.t.a.r.m.a1.a.V(encoder);
        m0.r.t.a.r.m.a1.a.s3(q.a);
        ((q0) m0.r.t.a.r.m.a1.a.v(g1.b, JsonElementSerializer.b)).serialize(encoder, jsonObject);
    }
}
