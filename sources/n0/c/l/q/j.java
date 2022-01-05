package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.i.c;
import n0.c.k.u0;
import n0.c.l.a;

/* compiled from: TreeJsonDecoder.kt */
public class j extends a {
    public int f;
    public final JsonObject g;
    public final String h;
    public final SerialDescriptor i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a aVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i2) {
        super(aVar, jsonObject, (f) null);
        int i3 = i2 & 4;
        int i4 = i2 & 8;
        i.e(aVar, "json");
        i.e(jsonObject, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.g = jsonObject;
        this.h = null;
        this.i = null;
    }

    public JsonElement S(String str) {
        i.e(str, "tag");
        return (JsonElement) g.A(W(), str);
    }

    /* renamed from: Y */
    public JsonObject W() {
        return this.g;
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        if (!this.c.b && !(serialDescriptor.f() instanceof c)) {
            i.e(serialDescriptor, "$this$jsonCachedSerialNames");
            Set<String> a = u0.a(serialDescriptor);
            for (String next : W().keySet()) {
                if (!a.contains(next) && (!i.a(next, this.h))) {
                    String jsonObject = W().toString();
                    i.e(next, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                    i.e(jsonObject, "input");
                    throw m0.r.t.a.r.m.a1.a.p(-1, "Encountered unknown key '" + next + "'.\n" + "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\n" + "Current input: " + m0.r.t.a.r.m.a1.a.L2(jsonObject, -1));
                }
            }
        }
    }

    public n0.c.j.c c(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        if (serialDescriptor == this.i) {
            return this;
        }
        return super.c(serialDescriptor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r1.d(r5) == -3) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int x(kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r6 = this;
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r7, r0)
        L_0x0005:
            int r0 = r6.f
            int r1 = r7.e()
            if (r0 >= r1) goto L_0x0078
            int r0 = r6.f
            int r1 = r0 + 1
            r6.f = r1
            java.lang.String r0 = r6.V(r7, r0)
            kotlinx.serialization.json.JsonObject r1 = r6.W()
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0005
            n0.c.l.q.d r1 = r6.c
            boolean r1 = r1.g
            r2 = 1
            if (r1 == 0) goto L_0x0074
            int r1 = r6.f
            int r1 = r1 - r2
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r7.h(r1)
            kotlinx.serialization.json.JsonElement r3 = r6.S(r0)
            boolean r3 = r3 instanceof n0.c.l.k
            if (r3 == 0) goto L_0x003f
            boolean r3 = r1.c()
            if (r3 != 0) goto L_0x003f
        L_0x003d:
            r4 = r2
            goto L_0x0072
        L_0x003f:
            n0.c.i.g r3 = r1.f()
            n0.c.i.g$b r4 = n0.c.i.g.b.a
            boolean r3 = m0.n.b.i.a(r3, r4)
            r4 = 0
            if (r3 == 0) goto L_0x0072
            kotlinx.serialization.json.JsonElement r0 = r6.S(r0)
            boolean r3 = r0 instanceof kotlinx.serialization.json.JsonPrimitive
            r5 = 0
            if (r3 != 0) goto L_0x0056
            r0 = r5
        L_0x0056:
            kotlinx.serialization.json.JsonPrimitive r0 = (kotlinx.serialization.json.JsonPrimitive) r0
            if (r0 == 0) goto L_0x0072
            java.lang.String r3 = "$this$contentOrNull"
            m0.n.b.i.e(r0, r3)
            boolean r3 = r0 instanceof n0.c.l.k
            if (r3 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            java.lang.String r5 = r0.b()
        L_0x0068:
            if (r5 == 0) goto L_0x0072
            int r0 = r1.d(r5)
            r1 = -3
            if (r0 != r1) goto L_0x0072
            goto L_0x003d
        L_0x0072:
            if (r4 != 0) goto L_0x0005
        L_0x0074:
            int r7 = r6.f
            int r7 = r7 - r2
            return r7
        L_0x0078:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.j.x(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a aVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(aVar, jsonObject, (f) null);
        i.e(aVar, "json");
        i.e(jsonObject, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.g = jsonObject;
        this.h = str;
        this.i = serialDescriptor;
    }
}
