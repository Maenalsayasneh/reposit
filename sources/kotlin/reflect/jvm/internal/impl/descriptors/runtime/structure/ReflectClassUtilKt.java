package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import i0.j.f.p.h;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import m0.a;
import m0.j.g;
import m0.n.a.b;
import m0.n.a.c;
import m0.n.a.e;
import m0.n.a.f;
import m0.n.a.i;
import m0.n.a.j;
import m0.n.a.k;
import m0.n.a.l;
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
import m0.n.b.m;
import m0.r.d;

/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt {
    public static final List<d<? extends Object>> a;
    public static final Map<Class<? extends Object>, Class<? extends Object>> b;
    public static final Map<Class<? extends Object>, Class<? extends Object>> c;
    public static final Map<Class<? extends a<?>>, Integer> d;

    static {
        int i = 0;
        List<d<? extends Object>> K = g.K(m.a(Boolean.TYPE), m.a(Byte.TYPE), m.a(Character.TYPE), m.a(Double.TYPE), m.a(Float.TYPE), m.a(Integer.TYPE), m.a(Long.TYPE), m.a(Short.TYPE));
        a = K;
        ArrayList arrayList = new ArrayList(h.K(K, 10));
        for (d dVar : K) {
            arrayList.add(new Pair(h.m1(dVar), h.n1(dVar)));
        }
        b = g.w0(arrayList);
        List<d<? extends Object>> list = a;
        ArrayList arrayList2 = new ArrayList(h.K(list, 10));
        for (d dVar2 : list) {
            arrayList2.add(new Pair(h.n1(dVar2), h.m1(dVar2)));
        }
        c = g.w0(arrayList2);
        List K2 = g.K(m0.n.a.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, c.class, m0.n.a.d.class, e.class, f.class, m0.n.a.g.class, m0.n.a.h.class, i.class, j.class, k.class, m0.n.a.m.class, n.class, o.class);
        ArrayList arrayList3 = new ArrayList(h.K(K2, 10));
        for (Object next : K2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(new Pair((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                g.r0();
                throw null;
            }
        }
        d = g.w0(arrayList3);
    }

    public static final Class<?> a(Class<?> cls) {
        m0.n.b.i.e(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final m0.r.t.a.r.g.a b(Class<?> cls) {
        m0.n.b.i.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(m0.n.b.i.k("Can't compute ClassId for primitive type: ", cls));
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                m0.n.b.i.d(simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    m0.r.t.a.r.g.a d2 = declaringClass == null ? null : b(declaringClass).d(m0.r.t.a.r.g.d.g(cls.getSimpleName()));
                    if (d2 == null) {
                        d2 = m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b(cls.getName()));
                    }
                    m0.n.b.i.d(d2, "declaringClass?.classId?.createNestedClassId(Name.identifier(simpleName)) ?: ClassId.topLevel(FqName(name))");
                    return d2;
                }
            }
            m0.r.t.a.r.g.b bVar = new m0.r.t.a.r.g.b(cls.getName());
            return new m0.r.t.a.r.g.a(bVar.e(), m0.r.t.a.r.g.b.k(bVar.g()), true);
        } else {
            throw new IllegalArgumentException(m0.n.b.i.k("Can't compute ClassId for array type: ", cls));
        }
    }

    public static final String c(Class<?> cls) {
        m0.n.b.i.e(cls, "<this>");
        if (m0.n.b.i.a(cls, Void.TYPE)) {
            return "V";
        }
        String name = a(cls).getName();
        m0.n.b.i.d(name, "createArrayType().name");
        String substring = name.substring(1);
        m0.n.b.i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return StringsKt__IndentKt.A(substring, '.', '/', false, 4);
    }

    public static final List<Type> d(Type type) {
        m0.n.b.i.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.c;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.f(m0.r.t.a.r.m.a1.a.C1(type, ReflectClassUtilKt$parameterizedTypeArguments$1.c), ReflectClassUtilKt$parameterizedTypeArguments$2.c));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        m0.n.b.i.d(actualTypeArguments, "actualTypeArguments");
        return h.l4(actualTypeArguments);
    }

    public static final ClassLoader e(Class<?> cls) {
        m0.n.b.i.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        m0.n.b.i.d(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
