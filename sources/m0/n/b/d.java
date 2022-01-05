package m0.n.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.b;
import m0.n.a.c;
import m0.n.a.e;
import m0.n.a.f;
import m0.n.a.h;
import m0.n.a.i;
import m0.n.a.j;
import m0.n.a.k;
import m0.n.a.l;
import m0.n.a.m;
import m0.n.a.n;
import m0.n.a.o;
import m0.n.a.p;
import m0.n.a.q;
import m0.n.a.r;
import m0.n.a.s;
import m0.n.a.t;
import m0.n.a.u;
import m0.n.a.v;
import m0.n.a.w;

/* compiled from: ClassReference.kt */
public final class d implements m0.r.d<Object>, c {
    public static final a Y1 = new a((f) null);
    public static final Map<Class<? extends m0.a<?>>, Integer> c;
    public static final HashMap<String, String> d;
    public static final HashMap<String, String> q;
    public static final HashMap<String, String> x;
    public static final Map<String, String> y;
    public final Class<?> Z1;

    /* compiled from: ClassReference.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        int i = 0;
        List K = g.K(m0.n.a.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, c.class, m0.n.a.d.class, e.class, f.class, m0.n.a.g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(K, 10));
        for (Object next : K) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                g.r0();
                throw null;
            }
        }
        c = g.w0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        q = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.d(str, "kotlinName");
            sb.append(StringsKt__IndentKt.P(str, '.', (String) null, 2));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            hashMap3.put(sb2, str + ".Companion");
        }
        for (Map.Entry next2 : c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        x = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(i0.j.f.p.h.R2(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), StringsKt__IndentKt.P((String) entry.getValue(), '.', (String) null, 2));
        }
        y = linkedHashMap;
    }

    public d(Class<?> cls) {
        i.e(cls, "jClass");
        this.Z1 = cls;
    }

    public String b() {
        String str;
        Class<?> cls = this.Z1;
        i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            i.d(componentType, "componentType");
            if (componentType.isPrimitive() && (str = x.get(componentType.getName())) != null) {
                str2 = i0.d.a.a.a.n0(str, "Array");
            }
            if (str2 != null) {
                return str2;
            }
            return "kotlin.Array";
        }
        String str3 = x.get(cls.getName());
        return str3 != null ? str3 : cls.getCanonicalName();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String e() {
        /*
            r7 = this;
            java.lang.Class<?> r0 = r7.Z1
            java.lang.String r1 = "jClass"
            m0.n.b.i.e(r0, r1)
            boolean r1 = r0.isAnonymousClass()
            java.lang.String r2 = "Array"
            r3 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0010:
            r2 = r3
            goto L_0x00b2
        L_0x0013:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r0.getSimpleName()
            java.lang.reflect.Method r2 = r0.getEnclosingMethod()
            java.lang.String r4 = "$"
            r5 = 2
            java.lang.String r6 = "name"
            if (r2 == 0) goto L_0x0043
            m0.n.b.i.d(r1, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.N(r1, r0, r3, r5)
            goto L_0x0063
        L_0x0043:
            java.lang.reflect.Constructor r0 = r0.getEnclosingConstructor()
            if (r0 == 0) goto L_0x0065
            m0.n.b.i.d(r1, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.N(r1, r0, r3, r5)
        L_0x0063:
            r2 = r0
            goto L_0x0066
        L_0x0065:
            r2 = r3
        L_0x0066:
            if (r2 == 0) goto L_0x0069
            goto L_0x00b2
        L_0x0069:
            m0.n.b.i.d(r1, r6)
            r0 = 36
            java.lang.String r2 = kotlin.text.StringsKt__IndentKt.M(r1, r0, r3, r5)
            goto L_0x00b2
        L_0x0073:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x009e
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r1 = "componentType"
            m0.n.b.i.d(r0, r1)
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L_0x009a
            java.util.Map<java.lang.String, java.lang.String> r1 = y
            java.lang.String r0 = r0.getName()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x009a
            java.lang.String r3 = i0.d.a.a.a.n0(r0, r2)
        L_0x009a:
            if (r3 == 0) goto L_0x00b2
            goto L_0x0010
        L_0x009e:
            java.util.Map<java.lang.String, java.lang.String> r1 = y
            java.lang.String r2 = r0.getName()
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00ae
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r2 = r0.getSimpleName()
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.n.b.d.e():java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && i.a(i0.j.f.p.h.m1(this), i0.j.f.p.h.m1((m0.r.d) obj));
    }

    public Class<?> h() {
        return this.Z1;
    }

    public int hashCode() {
        return i0.j.f.p.h.m1(this).hashCode();
    }

    public String toString() {
        return this.Z1.toString() + " (Kotlin reflection is not available)";
    }
}
