package m0.r.t.a;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.text.StringsKt__IndentKt;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.r0.a;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v0.a.j;
import m0.r.t.a.r.c.v0.b.l;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.f.c.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.j.p.o;
import m0.r.t.a.r.j.p.q;
import m0.r.t.a.r.k.b.g;
import m0.r.t.a.r.k.b.w.d;

/* compiled from: util.kt */
public final class o {
    public static final b a = new b("kotlin.jvm.JvmStatic");

    public static final KFunctionImpl a(Object obj) {
        m0.r.b bVar = null;
        KFunctionImpl kFunctionImpl = (KFunctionImpl) (!(obj instanceof KFunctionImpl) ? null : obj);
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        if (!(obj instanceof FunctionReference)) {
            obj = null;
        }
        FunctionReference functionReference = (FunctionReference) obj;
        m0.r.b compute = functionReference != null ? functionReference.compute() : null;
        if (compute instanceof KFunctionImpl) {
            bVar = compute;
        }
        return (KFunctionImpl) bVar;
    }

    public static final List<Annotation> b(a aVar) {
        i.e(aVar, "$this$computeAnnotations");
        f<c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (c cVar : annotations) {
            h0 r = cVar.r();
            Annotation annotation = null;
            if (r instanceof m0.r.t.a.r.c.v0.a.b) {
                annotation = ((m0.r.t.a.r.c.v0.a.b) r).b;
            } else if (r instanceof j.a) {
                l lVar = ((j.a) r).b;
                if (!(lVar instanceof m0.r.t.a.r.c.v0.b.b)) {
                    lVar = null;
                }
                m0.r.t.a.r.c.v0.b.b bVar = (m0.r.t.a.r.c.v0.b.b) lVar;
                if (bVar != null) {
                    annotation = bVar.a;
                }
            } else {
                annotation = g(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return arrayList;
    }

    public static final Object c(Type type) {
        i.e(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (i.a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (i.a(type, Character.TYPE)) {
            return Character.valueOf((char) 0);
        }
        if (i.a(type, Byte.TYPE)) {
            return Byte.valueOf((byte) 0);
        }
        if (i.a(type, Short.TYPE)) {
            return Short.valueOf((short) 0);
        }
        if (i.a(type, Integer.TYPE)) {
            return 0;
        }
        if (i.a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (i.a(type, Long.TYPE)) {
            return 0L;
        }
        if (i.a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (i.a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException(i0.d.a.a.a.q0("Unknown primitive: ", type));
    }

    public static final <M extends m0.r.t.a.r.h.l, D extends m0.r.t.a.r.c.a> D d(Class<?> cls, M m, m0.r.t.a.r.f.c.c cVar, e eVar, m0.r.t.a.r.f.c.a aVar, p<? super MemberDeserializer, ? super M, ? extends D> pVar) {
        List<ProtoBuf$TypeParameter> list;
        M m2 = m;
        p<? super MemberDeserializer, ? super M, ? extends D> pVar2 = pVar;
        Class<?> cls2 = cls;
        i.e(cls, "moduleAnchor");
        i.e(m, "proto");
        i.e(cVar, "nameResolver");
        i.e(eVar, "typeTable");
        i.e(aVar, "metadataVersion");
        i.e(pVar2, "createDescriptor");
        m0.r.t.a.r.c.v0.a.i a2 = i.a(cls);
        if (m2 instanceof ProtoBuf$Function) {
            list = ((ProtoBuf$Function) m2).d2;
        } else if (m2 instanceof ProtoBuf$Property) {
            list = ((ProtoBuf$Property) m2).d2;
        } else {
            throw new IllegalStateException(("Unsupported message: " + m).toString());
        }
        List<ProtoBuf$TypeParameter> list2 = list;
        g gVar = a2.a;
        u uVar = gVar.b;
        g.a aVar2 = m0.r.t.a.r.f.c.g.a;
        m0.r.t.a.r.f.c.g gVar2 = m0.r.t.a.r.f.c.g.b;
        i.d(list2, "typeParameters");
        return (m0.r.t.a.r.c.a) pVar2.invoke(new MemberDeserializer(new m0.r.t.a.r.k.b.i(gVar, cVar, uVar, eVar, gVar2, aVar, (d) null, (TypeDeserializer) null, list2)), m);
    }

    public static final f0 e(m0.r.t.a.r.c.a aVar) {
        i.e(aVar, "$this$instanceReceiverParameter");
        if (aVar.e0() == null) {
            return null;
        }
        m0.r.t.a.r.c.i b = aVar.b();
        Objects.requireNonNull(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((m0.r.t.a.r.c.d) b).G0();
    }

    public static final Class<?> f(ClassLoader classLoader, m0.r.t.a.r.g.a aVar, int i) {
        m0.r.t.a.r.b.k.c cVar = m0.r.t.a.r.b.k.c.a;
        m0.r.t.a.r.g.c j = aVar.b().j();
        i.d(j, "kotlinClassId.asSingleFqName().toUnsafe()");
        m0.r.t.a.r.g.a h = cVar.h(j);
        if (h != null) {
            aVar = h;
        }
        String b = aVar.h().b();
        i.d(b, "javaClassId.packageFqName.asString()");
        String b2 = aVar.i().b();
        i.d(b2, "javaClassId.relativeClassName.asString()");
        if (i.a(b, "kotlin")) {
            switch (b2.hashCode()) {
                case -901856463:
                    if (b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str = b + '.' + StringsKt__IndentKt.A(b2, '.', '$', false, 4);
        if (i > 0) {
            str = StringsKt__IndentKt.z("[", i) + 'L' + str + ';';
        }
        return h.p4(classLoader, str);
    }

    public static final Annotation g(c cVar) {
        m0.r.t.a.r.c.d e = DescriptorUtilsKt.e(cVar);
        Class<?> h = e != null ? h(e) : null;
        if (!(h instanceof Class)) {
            h = null;
        }
        if (h == null) {
            return null;
        }
        Set<Map.Entry<m0.r.t.a.r.g.d, m0.r.t.a.r.j.p.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            m0.r.t.a.r.g.d dVar = (m0.r.t.a.r.g.d) entry.getKey();
            ClassLoader classLoader = h.getClassLoader();
            i.d(classLoader, "annotationClass.classLoader");
            Object i = i((m0.r.t.a.r.j.p.g) entry.getValue(), classLoader);
            Pair pair = i != null ? new Pair(dVar.b(), i) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map w0 = m0.j.g.w0(arrayList);
        Set<String> keySet = w0.keySet();
        ArrayList arrayList2 = new ArrayList(h.K(keySet, 10));
        for (String declaredMethod : keySet) {
            arrayList2.add(h.getDeclaredMethod(declaredMethod, new Class[0]));
        }
        return (Annotation) h.c0(h, w0, arrayList2);
    }

    public static final Class<?> h(m0.r.t.a.r.c.d dVar) {
        i.e(dVar, "$this$toJavaClass");
        h0 r = dVar.r();
        i.d(r, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (r instanceof m0.r.t.a.r.e.b.l) {
            m0.r.t.a.r.e.b.j jVar = ((m0.r.t.a.r.e.b.l) r).b;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((m0.r.t.a.r.c.v0.a.e) jVar).a;
        } else if (r instanceof j.a) {
            l lVar = ((j.a) r).b;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((m0.r.t.a.r.c.v0.b.h) lVar).a;
        } else {
            m0.r.t.a.r.g.a g = DescriptorUtilsKt.g(dVar);
            if (g != null) {
                return f(ReflectClassUtilKt.e(dVar.getClass()), g, 0);
            }
            return null;
        }
    }

    public static final Object i(m0.r.t.a.r.j.p.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof m0.r.t.a.r.j.p.a) {
            return g((c) ((m0.r.t.a.r.j.p.a) gVar).a);
        }
        if (gVar instanceof m0.r.t.a.r.j.p.b) {
            Iterable<m0.r.t.a.r.j.p.g> iterable = (Iterable) ((m0.r.t.a.r.j.p.b) gVar).a;
            ArrayList arrayList = new ArrayList(h.K(iterable, 10));
            for (m0.r.t.a.r.j.p.g i : iterable) {
                arrayList.add(i(i, classLoader));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return array;
        } else if (gVar instanceof m0.r.t.a.r.j.p.i) {
            Pair pair = (Pair) ((m0.r.t.a.r.j.p.i) gVar).a;
            m0.r.t.a.r.g.d dVar = (m0.r.t.a.r.g.d) pair.d;
            Class<?> f = f(classLoader, (m0.r.t.a.r.g.a) pair.c, 0);
            if (f != null) {
                return Enum.valueOf(f, dVar.b());
            }
            return null;
        } else if (gVar instanceof m0.r.t.a.r.j.p.o) {
            o.a aVar = (o.a) ((m0.r.t.a.r.j.p.o) gVar).a;
            if (aVar instanceof o.a.b) {
                m0.r.t.a.r.j.p.f fVar = ((o.a.b) aVar).a;
                return f(classLoader, fVar.a, fVar.b);
            } else if (aVar instanceof o.a.C0271a) {
                m0.r.t.a.r.c.f c = ((o.a.C0271a) aVar).a.I0().c();
                if (!(c instanceof m0.r.t.a.r.c.d)) {
                    c = null;
                }
                m0.r.t.a.r.c.d dVar2 = (m0.r.t.a.r.c.d) c;
                if (dVar2 != null) {
                    return h(dVar2);
                }
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!(gVar instanceof m0.r.t.a.r.j.p.j) && !(gVar instanceof q)) {
            return gVar.b();
        } else {
            return null;
        }
    }
}
