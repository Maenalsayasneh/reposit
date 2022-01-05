package m0.r.t.a.r.b.k;

import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.g.f;

/* compiled from: JavaToKotlinClassMap.kt */
public final class c {
    public static final c a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final m0.r.t.a.r.g.a f;
    public static final b g;
    public static final m0.r.t.a.r.g.a h;
    public static final HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> i = new HashMap<>();
    public static final HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> j = new HashMap<>();
    public static final HashMap<m0.r.t.a.r.g.c, b> k = new HashMap<>();
    public static final HashMap<m0.r.t.a.r.g.c, b> l = new HashMap<>();
    public static final List<a> m;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {
        public final m0.r.t.a.r.g.a a;
        public final m0.r.t.a.r.g.a b;
        public final m0.r.t.a.r.g.a c;

        public a(m0.r.t.a.r.g.a aVar, m0.r.t.a.r.g.a aVar2, m0.r.t.a.r.g.a aVar3) {
            i.e(aVar, "javaClass");
            i.e(aVar2, "kotlinReadOnly");
            i.e(aVar3, "kotlinMutable");
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("PlatformMutabilityMapping(javaClass=");
            P0.append(this.a);
            P0.append(", kotlinReadOnly=");
            P0.append(this.b);
            P0.append(", kotlinMutable=");
            P0.append(this.c);
            P0.append(')');
            return P0.toString();
        }
    }

    static {
        c cVar = new c();
        a = cVar;
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb.append(functionClassKind.getPackageFqName().toString());
        sb.append('.');
        sb.append(functionClassKind.getClassNamePrefix());
        b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb2.append(functionClassKind2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind2.getClassNamePrefix());
        c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb3.append(functionClassKind3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind3.getClassNamePrefix());
        d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb4.append(functionClassKind4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind4.getClassNamePrefix());
        e = sb4.toString();
        m0.r.t.a.r.g.a l2 = m0.r.t.a.r.g.a.l(new b("kotlin.jvm.functions.FunctionN"));
        i.d(l2, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f = l2;
        b b2 = l2.b();
        i.d(b2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        g = b2;
        m0.r.t.a.r.g.a l3 = m0.r.t.a.r.g.a.l(new b("kotlin.reflect.KFunction"));
        i.d(l3, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        h = l3;
        i.d(m0.r.t.a.r.g.a.l(new b("kotlin.reflect.KClass")), "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        cVar.e(Class.class);
        m0.r.t.a.r.g.a l4 = m0.r.t.a.r.g.a.l(g.a.I);
        i.d(l4, "topLevel(FqNames.iterable)");
        b bVar = g.a.Q;
        b h2 = l4.h();
        b h3 = l4.h();
        i.d(h3, "kotlinReadOnly.packageFqName");
        b b4 = h.b4(bVar, h3);
        int i2 = 0;
        m0.r.t.a.r.g.a aVar = new m0.r.t.a.r.g.a(h2, b4, false);
        m0.r.t.a.r.g.a l5 = m0.r.t.a.r.g.a.l(g.a.H);
        i.d(l5, "topLevel(FqNames.iterator)");
        b bVar2 = g.a.P;
        b h4 = l5.h();
        b h5 = l5.h();
        i.d(h5, "kotlinReadOnly.packageFqName");
        m0.r.t.a.r.g.a aVar2 = new m0.r.t.a.r.g.a(h4, h.b4(bVar2, h5), false);
        m0.r.t.a.r.g.a l6 = m0.r.t.a.r.g.a.l(g.a.J);
        i.d(l6, "topLevel(FqNames.collection)");
        b bVar3 = g.a.R;
        b h6 = l6.h();
        b h7 = l6.h();
        i.d(h7, "kotlinReadOnly.packageFqName");
        m0.r.t.a.r.g.a aVar3 = new m0.r.t.a.r.g.a(h6, h.b4(bVar3, h7), false);
        m0.r.t.a.r.g.a l7 = m0.r.t.a.r.g.a.l(g.a.K);
        i.d(l7, "topLevel(FqNames.list)");
        b bVar4 = g.a.S;
        b h8 = l7.h();
        b h9 = l7.h();
        i.d(h9, "kotlinReadOnly.packageFqName");
        m0.r.t.a.r.g.a aVar4 = new m0.r.t.a.r.g.a(h8, h.b4(bVar4, h9), false);
        m0.r.t.a.r.g.a l8 = m0.r.t.a.r.g.a.l(g.a.M);
        i.d(l8, "topLevel(FqNames.set)");
        b bVar5 = g.a.U;
        b h10 = l8.h();
        b h11 = l8.h();
        i.d(h11, "kotlinReadOnly.packageFqName");
        m0.r.t.a.r.g.a aVar5 = new m0.r.t.a.r.g.a(h10, h.b4(bVar5, h11), false);
        m0.r.t.a.r.g.a l9 = m0.r.t.a.r.g.a.l(g.a.L);
        i.d(l9, "topLevel(FqNames.listIterator)");
        b bVar6 = g.a.T;
        b h12 = l9.h();
        b h13 = l9.h();
        i.d(h13, "kotlinReadOnly.packageFqName");
        m0.r.t.a.r.g.a aVar6 = new m0.r.t.a.r.g.a(h12, h.b4(bVar6, h13), false);
        b bVar7 = g.a.N;
        m0.r.t.a.r.g.a l10 = m0.r.t.a.r.g.a.l(bVar7);
        i.d(l10, "topLevel(FqNames.map)");
        b bVar8 = g.a.V;
        b h14 = l10.h();
        b h15 = l10.h();
        i.d(h15, "kotlinReadOnly.packageFqName");
        m0.r.t.a.r.g.a aVar7 = new m0.r.t.a.r.g.a(h14, h.b4(bVar8, h15), false);
        m0.r.t.a.r.g.a d2 = m0.r.t.a.r.g.a.l(bVar7).d(g.a.O.g());
        i.d(d2, "topLevel(FqNames.map).createNestedClassId(FqNames.mapEntry.shortName())");
        b bVar9 = g.a.W;
        b h16 = d2.h();
        b h17 = d2.h();
        i.d(h17, "kotlinReadOnly.packageFqName");
        List<a> K = m0.j.g.K(new a(cVar.e(Iterable.class), l4, aVar), new a(cVar.e(Iterator.class), l5, aVar2), new a(cVar.e(Collection.class), l6, aVar3), new a(cVar.e(List.class), l7, aVar4), new a(cVar.e(Set.class), l8, aVar5), new a(cVar.e(ListIterator.class), l9, aVar6), new a(cVar.e(Map.class), l10, aVar7), new a(cVar.e(Map.Entry.class), d2, new m0.r.t.a.r.g.a(h16, h.b4(bVar9, h17), false)));
        m = K;
        cVar.d(Object.class, g.a.b);
        cVar.d(String.class, g.a.g);
        cVar.d(CharSequence.class, g.a.f);
        cVar.c(Throwable.class, g.a.s);
        cVar.d(Cloneable.class, g.a.d);
        cVar.d(Number.class, g.a.q);
        cVar.c(Comparable.class, g.a.t);
        cVar.d(Enum.class, g.a.r);
        cVar.c(Annotation.class, g.a.z);
        for (a next : K) {
            m0.r.t.a.r.g.a aVar8 = next.a;
            m0.r.t.a.r.g.a aVar9 = next.b;
            m0.r.t.a.r.g.a aVar10 = next.c;
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap = i;
            m0.r.t.a.r.g.c j2 = aVar8.b().j();
            i.d(j2, "javaClassId.asSingleFqName().toUnsafe()");
            hashMap.put(j2, aVar9);
            b b3 = aVar9.b();
            i.d(b3, "kotlinClassId.asSingleFqName()");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap2 = j;
            m0.r.t.a.r.g.c j3 = b3.j();
            i.d(j3, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap2.put(j3, aVar8);
            b b5 = aVar10.b();
            i.d(b5, "mutableClassId.asSingleFqName()");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap3 = j;
            m0.r.t.a.r.g.c j4 = b5.j();
            i.d(j4, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap3.put(j4, aVar8);
            b b6 = aVar9.b();
            i.d(b6, "readOnlyClassId.asSingleFqName()");
            b b7 = aVar10.b();
            i.d(b7, "mutableClassId.asSingleFqName()");
            HashMap<m0.r.t.a.r.g.c, b> hashMap4 = k;
            m0.r.t.a.r.g.c j5 = aVar10.b().j();
            i.d(j5, "mutableClassId.asSingleFqName().toUnsafe()");
            hashMap4.put(j5, b6);
            HashMap<m0.r.t.a.r.g.c, b> hashMap5 = l;
            m0.r.t.a.r.g.c j6 = b6.j();
            i.d(j6, "readOnlyFqName.toUnsafe()");
            hashMap5.put(j6, b7);
        }
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int i3 = 0;
        while (i3 < 8) {
            JvmPrimitiveType jvmPrimitiveType = values[i3];
            i3++;
            m0.r.t.a.r.g.a l11 = m0.r.t.a.r.g.a.l(jvmPrimitiveType.getWrapperFqName());
            i.d(l11, "topLevel(jvmType.wrapperFqName)");
            g gVar = g.a;
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            i.d(primitiveType, "jvmType.primitiveType");
            i.e(primitiveType, "primitiveType");
            b c2 = g.l.c(primitiveType.getTypeName());
            i.d(c2, "BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName)");
            m0.r.t.a.r.g.a l12 = m0.r.t.a.r.g.a.l(c2);
            i.d(l12, "topLevel(StandardNames.getPrimitiveFqName(jvmType.primitiveType))");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap6 = i;
            m0.r.t.a.r.g.c j7 = l11.b().j();
            i.d(j7, "javaClassId.asSingleFqName().toUnsafe()");
            hashMap6.put(j7, l12);
            b b8 = l12.b();
            i.d(b8, "kotlinClassId.asSingleFqName()");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap7 = j;
            m0.r.t.a.r.g.c j8 = b8.j();
            i.d(j8, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap7.put(j8, l11);
        }
        m0.r.t.a.r.b.b bVar10 = m0.r.t.a.r.b.b.a;
        for (m0.r.t.a.r.g.a next2 : m0.r.t.a.r.b.b.b) {
            StringBuilder P0 = i0.d.a.a.a.P0("kotlin.jvm.internal.");
            P0.append(next2.j().b());
            P0.append("CompanionObject");
            m0.r.t.a.r.g.a l13 = m0.r.t.a.r.g.a.l(new b(P0.toString()));
            i.d(l13, "topLevel(FqName(\"kotlin.jvm.internal.\" + classId.shortClassName.asString() + \"CompanionObject\"))");
            m0.r.t.a.r.g.a d3 = next2.d(f.b);
            i.d(d3, "classId.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap8 = i;
            m0.r.t.a.r.g.c j9 = l13.b().j();
            i.d(j9, "javaClassId.asSingleFqName().toUnsafe()");
            hashMap8.put(j9, d3);
            b b9 = d3.b();
            i.d(b9, "kotlinClassId.asSingleFqName()");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap9 = j;
            m0.r.t.a.r.g.c j10 = b9.j();
            i.d(j10, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap9.put(j10, l13);
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            m0.r.t.a.r.g.a l14 = m0.r.t.a.r.g.a.l(new b(i.k("kotlin.jvm.functions.Function", Integer.valueOf(i4))));
            i.d(l14, "topLevel(FqName(\"kotlin.jvm.functions.Function$i\"))");
            g gVar2 = g.a;
            m0.r.t.a.r.g.a a2 = g.a(i4);
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap10 = i;
            m0.r.t.a.r.g.c j11 = l14.b().j();
            i.d(j11, "javaClassId.asSingleFqName().toUnsafe()");
            hashMap10.put(j11, a2);
            b b10 = a2.b();
            i.d(b10, "kotlinClassId.asSingleFqName()");
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap11 = j;
            m0.r.t.a.r.g.c j12 = b10.j();
            i.d(j12, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap11.put(j12, l14);
            b bVar11 = new b(i.k(c, Integer.valueOf(i4)));
            m0.r.t.a.r.g.a aVar11 = h;
            HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap12 = j;
            m0.r.t.a.r.g.c j13 = bVar11.j();
            i.d(j13, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap12.put(j13, aVar11);
            if (i5 >= 23) {
                break;
            }
            i4 = i5;
        }
        while (true) {
            int i6 = i2 + 1;
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            c cVar2 = a;
            cVar2.b(new b(i.k(functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix(), Integer.valueOf(i2))), h);
            if (i6 >= 22) {
                b i7 = g.a.c.i();
                i.d(i7, "nothing.toSafe()");
                m0.r.t.a.r.g.a e2 = cVar2.e(Void.class);
                HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap13 = j;
                m0.r.t.a.r.g.c j14 = i7.j();
                i.d(j14, "kotlinFqNameUnsafe.toUnsafe()");
                hashMap13.put(j14, e2);
                return;
            }
            i2 = i6;
        }
    }

    public final void a(m0.r.t.a.r.g.a aVar, m0.r.t.a.r.g.a aVar2) {
        HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap = i;
        m0.r.t.a.r.g.c j2 = aVar.b().j();
        i.d(j2, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j2, aVar2);
        b b2 = aVar2.b();
        i.d(b2, "kotlinClassId.asSingleFqName()");
        HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap2 = j;
        m0.r.t.a.r.g.c j3 = b2.j();
        i.d(j3, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap2.put(j3, aVar);
    }

    public final void b(b bVar, m0.r.t.a.r.g.a aVar) {
        HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.a> hashMap = j;
        m0.r.t.a.r.g.c j2 = bVar.j();
        i.d(j2, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j2, aVar);
    }

    public final void c(Class<?> cls, b bVar) {
        m0.r.t.a.r.g.a e2 = e(cls);
        m0.r.t.a.r.g.a l2 = m0.r.t.a.r.g.a.l(bVar);
        i.d(l2, "topLevel(kotlinFqName)");
        a(e2, l2);
    }

    public final void d(Class<?> cls, m0.r.t.a.r.g.c cVar) {
        b i2 = cVar.i();
        i.d(i2, "kotlinFqName.toSafe()");
        m0.r.t.a.r.g.a e2 = e(cls);
        m0.r.t.a.r.g.a l2 = m0.r.t.a.r.g.a.l(i2);
        i.d(l2, "topLevel(kotlinFqName)");
        a(e2, l2);
    }

    public final m0.r.t.a.r.g.a e(Class<?> cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            m0.r.t.a.r.g.a l2 = m0.r.t.a.r.g.a.l(new b(cls.getCanonicalName()));
            i.d(l2, "topLevel(FqName(clazz.canonicalName))");
            return l2;
        }
        m0.r.t.a.r.g.a d2 = e(declaringClass).d(d.g(cls.getSimpleName()));
        i.d(d2, "classId(outer).createNestedClassId(Name.identifier(clazz.simpleName))");
        return d2;
    }

    public final boolean f(m0.r.t.a.r.g.c cVar, String str) {
        String b2 = cVar.b();
        i.d(b2, "kotlinFqName.asString()");
        String L = StringsKt__IndentKt.L(b2, str, "");
        if (L.length() > 0) {
            i.e(L, "$this$startsWith");
            if (!(L.length() > 0 && m0.r.t.a.r.m.a1.a.o1(L.charAt(0), '0', false))) {
                Integer S = StringsKt__IndentKt.S(L);
                if (S == null || S.intValue() < 23) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final m0.r.t.a.r.g.a g(b bVar) {
        i.e(bVar, "fqName");
        return i.get(bVar.j());
    }

    public final m0.r.t.a.r.g.a h(m0.r.t.a.r.g.c cVar) {
        i.e(cVar, "kotlinFqName");
        if (f(cVar, b)) {
            return f;
        }
        if (f(cVar, d)) {
            return f;
        }
        if (f(cVar, c)) {
            return h;
        }
        if (f(cVar, e)) {
            return h;
        }
        return j.get(cVar);
    }
}
