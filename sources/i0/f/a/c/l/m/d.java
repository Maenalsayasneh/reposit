package i0.f.a.c.l.m;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: ExternalTypeHandler */
public class d {
    public final JavaType a;
    public final b[] b;
    public final Map<String, Object> c;
    public final String[] d;
    public final r[] e;

    /* compiled from: ExternalTypeHandler */
    public static class a {
        public final JavaType a;
        public final List<b> b = new ArrayList();
        public final Map<String, Object> c = new HashMap();

        public a(JavaType javaType) {
            this.a = javaType;
        }

        public final void a(String str, Integer num) {
            Object obj = this.c.get(str);
            if (obj == null) {
                this.c.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this.c.put(str, linkedList);
            }
        }
    }

    /* compiled from: ExternalTypeHandler */
    public static final class b {
        public final SettableBeanProperty a;
        public final i0.f.a.c.p.b b;
        public final String c;
        public SettableBeanProperty d;

        public b(SettableBeanProperty settableBeanProperty, i0.f.a.c.p.b bVar) {
            this.a = settableBeanProperty;
            this.b = bVar;
            this.c = bVar.h();
        }

        public String a() {
            Class<?> g = this.b.g();
            if (g == null) {
                return null;
            }
            return this.b.i().e((Object) null, g);
        }
    }

    public d(JavaType javaType, b[] bVarArr, Map<String, Object> map, String[] strArr, r[] rVarArr) {
        this.a = javaType;
        this.b = bVarArr;
        this.c = map;
        this.d = null;
        this.e = null;
    }

    public final void a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        if (str != null) {
            JsonParser g1 = this.e[i].g1(jsonParser);
            if (g1.M0() == JsonToken.VALUE_NULL) {
                this.b[i].a.I(obj, (Object) null);
                return;
            }
            r rVar = new r(jsonParser, deserializationContext);
            rVar.I0();
            rVar.Q0(str);
            rVar.i1(g1);
            rVar.T();
            JsonParser g12 = rVar.g1(jsonParser);
            g12.M0();
            this.b[i].a.k(g12, deserializationContext, obj);
            return;
        }
        deserializationContext.l0(this.a, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        throw null;
    }

    public final boolean b(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        boolean z = false;
        if (!str.equals(this.b[i].c)) {
            return false;
        }
        if (!(obj == null || this.e[i] == null)) {
            z = true;
        }
        if (z) {
            a(jsonParser, deserializationContext, obj, i, str2);
            this.e[i] = null;
        } else {
            this.d[i] = str2;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13, i0.f.a.c.l.m.g r14, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r15) throws java.io.IOException {
        /*
            r11 = this;
            i0.f.a.c.l.m.d$b[] r0 = r11.b
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L_0x0007:
            if (r3 >= r0) goto L_0x00f0
            java.lang.String[] r4 = r11.d
            r4 = r4[r3]
            i0.f.a.c.l.m.d$b[] r5 = r11.b
            r5 = r5[r3]
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x0048
            i0.f.a.c.t.r[] r4 = r11.e
            r4 = r4[r3]
            if (r4 == 0) goto L_0x00ec
            i0.f.a.c.t.r$b r4 = r4.e2
            com.fasterxml.jackson.core.JsonToken r4 = r4.k(r2)
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r4 != r8) goto L_0x0027
            goto L_0x00ec
        L_0x0027:
            i0.f.a.c.p.b r4 = r5.b
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = r5.a()
            goto L_0x0078
        L_0x0034:
            com.fasterxml.jackson.databind.JavaType r12 = r11.a
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r14 = r5.a
            com.fasterxml.jackson.databind.PropertyName r14 = r14.x
            java.lang.String r14 = r14.q
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.String r0 = r5.c
            r15[r2] = r0
            java.lang.String r0 = "Missing external type id property '%s'"
            r13.o0(r12, r14, r0, r15)
            throw r7
        L_0x0048:
            i0.f.a.c.t.r[] r8 = r11.e
            r8 = r8[r3]
            if (r8 != 0) goto L_0x0078
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r5.a
            boolean r9 = r8.c()
            if (r9 != 0) goto L_0x005f
            com.fasterxml.jackson.databind.DeserializationFeature r9 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r9 = r13.d0(r9)
            if (r9 != 0) goto L_0x005f
            goto L_0x0078
        L_0x005f:
            com.fasterxml.jackson.databind.JavaType r12 = r11.a
            com.fasterxml.jackson.databind.PropertyName r14 = r8.x
            java.lang.String r14 = r14.q
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r2] = r14
            i0.f.a.c.l.m.d$b[] r0 = r11.b
            r0 = r0[r3]
            java.lang.String r0 = r0.c
            r15[r6] = r0
            java.lang.String r0 = "Missing property '%s' for external type id '%s'"
            r13.o0(r12, r14, r0, r15)
            throw r7
        L_0x0078:
            i0.f.a.c.t.r[] r8 = r11.e
            r9 = r8[r3]
            if (r9 == 0) goto L_0x00b1
            r8 = r8[r3]
            com.fasterxml.jackson.core.JsonParser r8 = r8.g1(r12)
            com.fasterxml.jackson.core.JsonToken r9 = r8.M0()
            com.fasterxml.jackson.core.JsonToken r10 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r9 != r10) goto L_0x008d
            goto L_0x00af
        L_0x008d:
            i0.f.a.c.t.r r7 = new i0.f.a.c.t.r
            r7.<init>((com.fasterxml.jackson.core.JsonParser) r12, (com.fasterxml.jackson.databind.DeserializationContext) r13)
            r7.I0()
            r7.Q0(r4)
            r7.i1(r8)
            r7.T()
            com.fasterxml.jackson.core.JsonParser r7 = r7.g1(r12)
            r7.M0()
            i0.f.a.c.l.m.d$b[] r8 = r11.b
            r8 = r8[r3]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r8.a
            java.lang.Object r7 = r8.i(r7, r13)
        L_0x00af:
            r1[r3] = r7
        L_0x00b1:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r5.a
            int r8 = r7.p()
            if (r8 < 0) goto L_0x00ec
            r8 = r1[r3]
            r14.b(r7, r8)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r5.d
            if (r5 == 0) goto L_0x00ec
            int r7 = r5.p()
            if (r7 < 0) goto L_0x00ec
            com.fasterxml.jackson.databind.JavaType r7 = r5.y
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<?> r7 = r7.c
            if (r7 != r8) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r6 = r2
        L_0x00d2:
            if (r6 == 0) goto L_0x00d5
            goto L_0x00e9
        L_0x00d5:
            i0.f.a.c.t.r r6 = new i0.f.a.c.t.r
            r6.<init>((com.fasterxml.jackson.core.JsonParser) r12, (com.fasterxml.jackson.databind.DeserializationContext) r13)
            r6.Q0(r4)
            i0.f.a.c.d r4 = r5.y()
            com.fasterxml.jackson.core.JsonParser r6 = r6.h1()
            java.lang.Object r4 = r4.d(r6, r13)
        L_0x00e9:
            r14.b(r5, r4)
        L_0x00ec:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00f0:
            java.lang.Object r12 = r15.a(r13, r14)
        L_0x00f4:
            if (r2 >= r0) goto L_0x010a
            i0.f.a.c.l.m.d$b[] r13 = r11.b
            r13 = r13[r2]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r13 = r13.a
            int r14 = r13.p()
            if (r14 >= 0) goto L_0x0107
            r14 = r1[r2]
            r13.I(r12, r14)
        L_0x0107:
            int r2 = r2 + 1
            goto L_0x00f4
        L_0x010a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.l.m.d.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, i0.f.a.c.l.m.g, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            String str = this.d[i];
            b bVar = this.b[i];
            if (str == null) {
                r rVar = this.e[i];
                if (rVar != null) {
                    if (rVar.e2.k(0).isScalarValue()) {
                        JsonParser g1 = rVar.g1(jsonParser);
                        g1.M0();
                        SettableBeanProperty settableBeanProperty = bVar.a;
                        Object a2 = i0.f.a.c.p.b.a(g1, deserializationContext, settableBeanProperty.y);
                        if (a2 != null) {
                            settableBeanProperty.I(obj, a2);
                        }
                    }
                    if (bVar.b.l()) {
                        str = bVar.a();
                        if (str == null) {
                            deserializationContext.o0(this.a, bVar.a.x.q, "Invalid default type id for property '%s': `null` returned by TypeIdResolver", bVar.c);
                            throw null;
                        }
                    } else {
                        deserializationContext.o0(this.a, bVar.a.x.q, "Missing external type id property '%s' (and no 'defaultImpl' specified)", bVar.c);
                        throw null;
                    }
                } else {
                    continue;
                }
            } else if (this.e[i] == null) {
                SettableBeanProperty settableBeanProperty2 = bVar.a;
                if (!settableBeanProperty2.c() && !deserializationContext.d0(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    return obj;
                }
                Class<?> cls = obj.getClass();
                String str2 = settableBeanProperty2.x.q;
                MismatchedInputException mismatchedInputException = new MismatchedInputException(deserializationContext.Z1, deserializationContext.b("Missing property '%s' for external type id '%s'", str2, bVar.c), cls);
                if (str2 != null) {
                    mismatchedInputException.g(cls, str2);
                }
                throw mismatchedInputException;
            }
            a(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (r10.e[r0] != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r10.d[r0] != null) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.lang.String r13, java.lang.Object r14) throws java.io.IOException {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.c
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L_0x0075
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            i0.f.a.c.l.m.d$b[] r1 = r10.b
            int r2 = r0.intValue()
            r1 = r1[r2]
            java.lang.String r1 = r1.c
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L_0x004f
            java.lang.String r12 = r11.Z()
            r11.U0()
            java.lang.String[] r11 = r10.d
            int r13 = r0.intValue()
            r11[r13] = r12
        L_0x003a:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0074
            java.lang.String[] r11 = r10.d
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L_0x003a
        L_0x004f:
            i0.f.a.c.t.r r13 = new i0.f.a.c.t.r
            r13.<init>((com.fasterxml.jackson.core.JsonParser) r11, (com.fasterxml.jackson.databind.DeserializationContext) r12)
            r13.i1(r11)
            i0.f.a.c.t.r[] r11 = r10.e
            int r12 = r0.intValue()
            r11[r12] = r13
        L_0x005f:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0074
            i0.f.a.c.t.r[] r11 = r10.e
            java.lang.Object r12 = r14.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r13
            goto L_0x005f
        L_0x0074:
            return r3
        L_0x0075:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            i0.f.a.c.l.m.d$b[] r2 = r10.b
            r2 = r2[r0]
            java.lang.String r2 = r2.c
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x009b
            java.lang.String[] r13 = r10.d
            java.lang.String r2 = r11.r0()
            r13[r0] = r2
            r11.U0()
            if (r14 == 0) goto L_0x00b0
            i0.f.a.c.t.r[] r13 = r10.e
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00b0
            goto L_0x00af
        L_0x009b:
            i0.f.a.c.t.r r13 = new i0.f.a.c.t.r
            r13.<init>((com.fasterxml.jackson.core.JsonParser) r11, (com.fasterxml.jackson.databind.DeserializationContext) r12)
            r13.i1(r11)
            i0.f.a.c.t.r[] r2 = r10.e
            r2[r0] = r13
            if (r14 == 0) goto L_0x00b0
            java.lang.String[] r13 = r10.d
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00b0
        L_0x00af:
            r1 = r3
        L_0x00b0:
            if (r1 == 0) goto L_0x00c5
            java.lang.String[] r13 = r10.d
            r9 = r13[r0]
            r1 = 0
            r13[r0] = r1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r0
            r4.a(r5, r6, r7, r8, r9)
            i0.f.a.c.t.r[] r11 = r10.e
            r11[r0] = r1
        L_0x00c5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.l.m.d.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean f(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.c.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String Z = jsonParser.Z();
        if (obj2 instanceof List) {
            for (Integer intValue : (List) obj2) {
                if (b(jsonParser, deserializationContext, str, obj, Z, intValue.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return b(jsonParser, deserializationContext, str, obj, Z, ((Integer) obj2).intValue());
    }

    public d(d dVar) {
        this.a = dVar.a;
        b[] bVarArr = dVar.b;
        this.b = bVarArr;
        this.c = dVar.c;
        int length = bVarArr.length;
        this.d = new String[length];
        this.e = new r[length];
    }
}
