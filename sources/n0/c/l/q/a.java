package n0.c.l.q;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.TaggedDecoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.b;
import n0.c.i.d;
import n0.c.i.g;
import n0.c.i.h;
import n0.c.j.c;
import n0.c.l.e;
import n0.c.l.k;

/* compiled from: TreeJsonDecoder.kt */
public abstract class a extends TaggedDecoder implements e {
    public final d c;
    public final n0.c.l.a d;
    public final JsonElement e;

    public a(n0.c.l.a aVar, JsonElement jsonElement, f fVar) {
        this.d = aVar;
        this.e = jsonElement;
        this.c = aVar.b;
    }

    public static final Void R(a aVar, String str) {
        throw m0.r.t.a.r.m.a1.a.q(-1, "Failed to parse '" + str + '\'', aVar.T().toString());
    }

    public <T> T B(b<T> bVar) {
        i.e(bVar, "deserializer");
        return p.b(this, bVar);
    }

    public boolean H(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        JsonPrimitive X = X(str);
        if (this.d.b.c || !((n0.c.l.i) X).b) {
            try {
                Boolean E1 = m0.r.t.a.r.m.a1.a.E1(X);
                if (E1 != null) {
                    return E1.booleanValue();
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException unused) {
                R(this, "boolean");
                throw null;
            }
        } else {
            throw m0.r.t.a.r.m.a1.a.q(-1, i0.d.a.a.a.o0("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), T().toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[SYNTHETIC, Splitter:B:11:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte I(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "tag"
            m0.n.b.i.e(r5, r0)
            kotlinx.serialization.json.JsonPrimitive r5 = r4.X(r5)
            java.lang.String r0 = "byte"
            r1 = 0
            int r5 = m0.r.t.a.r.m.a1.a.N1(r5)     // Catch:{ IllegalArgumentException -> 0x002d }
            r2 = 127(0x7f, float:1.78E-43)
            r3 = -128(0xffffffffffffff80, float:NaN)
            if (r3 <= r5) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            if (r2 < r5) goto L_0x0021
            byte r5 = (byte) r5     // Catch:{ IllegalArgumentException -> 0x002d }
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x002d }
            goto L_0x0022
        L_0x0021:
            r5 = r1
        L_0x0022:
            if (r5 == 0) goto L_0x0029
            byte r5 = r5.byteValue()
            return r5
        L_0x0029:
            R(r4, r0)     // Catch:{ IllegalArgumentException -> 0x002d }
            throw r1     // Catch:{ IllegalArgumentException -> 0x002d }
        L_0x002d:
            R(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.a.I(java.lang.Object):byte");
    }

    public char J(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        try {
            return m0.r.t.a.r.m.a1.a.z3(X(str).b());
        } catch (IllegalArgumentException unused) {
            R(this, "char");
            throw null;
        }
    }

    public double K(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        JsonPrimitive X = X(str);
        try {
            i.e(X, "$this$double");
            double parseDouble = Double.parseDouble(X.b());
            if (!this.d.b.j) {
                if (!(!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    throw m0.r.t.a.r.m.a1.a.j(Double.valueOf(parseDouble), str, T().toString());
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            R(this, "double");
            throw null;
        }
    }

    public float L(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        JsonPrimitive X = X(str);
        try {
            i.e(X, "$this$float");
            float parseFloat = Float.parseFloat(X.b());
            if (!this.d.b.j) {
                if (!(!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    throw m0.r.t.a.r.m.a1.a.j(Float.valueOf(parseFloat), str, T().toString());
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            R(this, "float");
            throw null;
        }
    }

    public int M(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        try {
            return m0.r.t.a.r.m.a1.a.N1(X(str));
        } catch (IllegalArgumentException unused) {
            R(this, "int");
            throw null;
        }
    }

    public long N(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        JsonPrimitive X = X(str);
        try {
            i.e(X, "$this$long");
            return Long.parseLong(X.b());
        } catch (IllegalArgumentException unused) {
            R(this, "long");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[SYNTHETIC, Splitter:B:11:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public short O(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "tag"
            m0.n.b.i.e(r5, r0)
            kotlinx.serialization.json.JsonPrimitive r5 = r4.X(r5)
            java.lang.String r0 = "short"
            r1 = 0
            int r5 = m0.r.t.a.r.m.a1.a.N1(r5)     // Catch:{ IllegalArgumentException -> 0x002d }
            r2 = 32767(0x7fff, float:4.5916E-41)
            r3 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 <= r5) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            if (r2 < r5) goto L_0x0021
            short r5 = (short) r5     // Catch:{ IllegalArgumentException -> 0x002d }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x002d }
            goto L_0x0022
        L_0x0021:
            r5 = r1
        L_0x0022:
            if (r5 == 0) goto L_0x0029
            short r5 = r5.shortValue()
            return r5
        L_0x0029:
            R(r4, r0)     // Catch:{ IllegalArgumentException -> 0x002d }
            throw r1     // Catch:{ IllegalArgumentException -> 0x002d }
        L_0x002d:
            R(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.a.O(java.lang.Object):short");
    }

    public String P(Object obj) {
        String str = (String) obj;
        i.e(str, "tag");
        JsonPrimitive X = X(str);
        if (this.d.b.c || ((n0.c.l.i) X).b) {
            return X.b();
        }
        throw m0.r.t.a.r.m.a1.a.q(-1, i0.d.a.a.a.o0("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), T().toString());
    }

    public abstract JsonElement S(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = S(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.json.JsonElement T() {
        /*
            r1 = this;
            java.util.ArrayList<Tag> r0 = r1.a
            java.lang.Object r0 = m0.j.g.I(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0011
            kotlinx.serialization.json.JsonElement r0 = r1.S(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            kotlinx.serialization.json.JsonElement r0 = r1.W()
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.a.T():kotlinx.serialization.json.JsonElement");
    }

    public String U(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "desc");
        return serialDescriptor.g(i);
    }

    public final String V(SerialDescriptor serialDescriptor, int i) {
        i.e(serialDescriptor, "$this$getTag");
        String U = U(serialDescriptor, i);
        i.e(U, "nestedName");
        String str = (String) g.I(this.a);
        if (str == null) {
            str = "";
        }
        i.e(str, "parentName");
        i.e(U, "childName");
        return U;
    }

    public JsonElement W() {
        return this.e;
    }

    public JsonPrimitive X(String str) {
        i.e(str, "tag");
        JsonElement S = S(str);
        JsonPrimitive jsonPrimitive = (JsonPrimitive) (!(S instanceof JsonPrimitive) ? null : S);
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw m0.r.t.a.r.m.a1.a.q(-1, "Expected JsonPrimitive at " + str + ", found " + S, T().toString());
    }

    public n0.c.m.b a() {
        return this.d.b.k;
    }

    public void b(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
    }

    public c c(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        JsonElement T = T();
        n0.c.i.g f = serialDescriptor.f();
        if (i.a(f, h.b.a) || (f instanceof n0.c.i.c)) {
            n0.c.l.a aVar = this.d;
            if (T instanceof JsonArray) {
                return new l(aVar, (JsonArray) T);
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Expected ");
            P0.append(m.a(JsonArray.class));
            P0.append(" as the serialized body of ");
            P0.append(serialDescriptor.a());
            P0.append(", but had ");
            P0.append(m.a(T.getClass()));
            throw m0.r.t.a.r.m.a1.a.p(-1, P0.toString());
        } else if (i.a(f, h.c.a)) {
            n0.c.l.a aVar2 = this.d;
            SerialDescriptor h = serialDescriptor.h(0);
            n0.c.i.g f2 = h.f();
            if ((f2 instanceof d) || i.a(f2, g.b.a)) {
                n0.c.l.a aVar3 = this.d;
                if (T instanceof JsonObject) {
                    return new n(aVar3, (JsonObject) T);
                }
                StringBuilder P02 = i0.d.a.a.a.P0("Expected ");
                P02.append(m.a(JsonObject.class));
                P02.append(" as the serialized body of ");
                P02.append(serialDescriptor.a());
                P02.append(", but had ");
                P02.append(m.a(T.getClass()));
                throw m0.r.t.a.r.m.a1.a.p(-1, P02.toString());
            } else if (aVar2.b.d) {
                n0.c.l.a aVar4 = this.d;
                if (T instanceof JsonArray) {
                    return new l(aVar4, (JsonArray) T);
                }
                StringBuilder P03 = i0.d.a.a.a.P0("Expected ");
                P03.append(m.a(JsonArray.class));
                P03.append(" as the serialized body of ");
                P03.append(serialDescriptor.a());
                P03.append(", but had ");
                P03.append(m.a(T.getClass()));
                throw m0.r.t.a.r.m.a1.a.p(-1, P03.toString());
            } else {
                throw m0.r.t.a.r.m.a1.a.m(h);
            }
        } else {
            n0.c.l.a aVar5 = this.d;
            if (T instanceof JsonObject) {
                return new j(aVar5, (JsonObject) T, (String) null, (SerialDescriptor) null, 12);
            }
            StringBuilder P04 = i0.d.a.a.a.P0("Expected ");
            P04.append(m.a(JsonObject.class));
            P04.append(" as the serialized body of ");
            P04.append(serialDescriptor.a());
            P04.append(", but had ");
            P04.append(m.a(T.getClass()));
            throw m0.r.t.a.r.m.a1.a.p(-1, P04.toString());
        }
    }

    public n0.c.l.a d() {
        return this.d;
    }

    public JsonElement i() {
        return T();
    }

    public boolean u() {
        return !(T() instanceof k);
    }
}
