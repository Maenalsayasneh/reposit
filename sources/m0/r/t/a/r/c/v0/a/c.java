package m0.r.t.a.r.c.v0.a;

import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.f;

/* compiled from: ReflectKotlinClass.kt */
public final class c {
    public static final f a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            i.d(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            a b = ReflectClassUtilKt.b(cls);
            m0.r.t.a.r.b.k.c cVar = m0.r.t.a.r.b.k.c.a;
            b b2 = b.b();
            i.d(b2, "javaClassId.asSingleFqName()");
            a g = cVar.g(b2);
            if (g != null) {
                b = g;
            }
            return new f(b, i);
        } else if (i.a(cls, Void.TYPE)) {
            a l = a.l(g.a.e.i());
            i.d(l, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new f(l, i);
        } else {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            i.d(primitiveType, "get(currentClass.name).primitiveType");
            if (i > 0) {
                a l2 = a.l(primitiveType.getArrayTypeFqName());
                i.d(l2, "topLevel(primitiveType.arrayTypeFqName)");
                return new f(l2, i - 1);
            }
            a l3 = a.l(primitiveType.getTypeFqName());
            i.d(l3, "topLevel(primitiveType.typeFqName)");
            return new f(l3, i);
        }
    }

    public static final void b(Class<?> cls, j.c cVar) {
        i.e(cls, "klass");
        i.e(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        i.d(declaredAnnotations, "klass.declaredAnnotations");
        int length = declaredAnnotations.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = declaredAnnotations[i];
            i++;
            i.d(annotation, "annotation");
            c(cVar, annotation);
        }
        cVar.a();
    }

    public static final void c(j.c cVar, Annotation annotation) {
        Class l1 = h.l1(h.N0(annotation));
        j.a b = cVar.b(ReflectClassUtilKt.b(l1), new b(annotation));
        if (b != null) {
            d(b, annotation, l1);
        }
    }

    public static final void d(j.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        i.d(declaredMethods, "annotationType.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            i++;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                i.c(invoke);
                d g = d.g(method.getName());
                i.d(g, "identifier(method.name)");
                Class<?> cls2 = invoke.getClass();
                if (i.a(cls2, Class.class)) {
                    aVar.b(g, a((Class) invoke));
                } else if (g.a.contains(cls2)) {
                    aVar.c(g, invoke);
                } else {
                    List<m0.r.d<? extends Object>> list = ReflectClassUtilKt.a;
                    i.e(cls2, "<this>");
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        i.d(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        a b = ReflectClassUtilKt.b(cls2);
                        d g2 = d.g(((Enum) invoke).name());
                        i.d(g2, "identifier((value as Enum<*>).name)");
                        aVar.d(g, b, g2);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class[] interfaces = cls2.getInterfaces();
                        i.d(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) h.S3(interfaces);
                        i.d(cls3, "annotationClass");
                        j.a e = aVar.e(g, ReflectClassUtilKt.b(cls3));
                        if (e != null) {
                            d(e, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        j.b f = aVar.f(g);
                        if (f != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                i.d(componentType, "componentType");
                                a b2 = ReflectClassUtilKt.b(componentType);
                                Object[] objArr = (Object[]) invoke;
                                int length2 = objArr.length;
                                int i2 = 0;
                                while (i2 < length2) {
                                    Object obj = objArr[i2];
                                    i2++;
                                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    d g3 = d.g(((Enum) obj).name());
                                    i.d(g3, "identifier((element as Enum<*>).name)");
                                    f.c(b2, g3);
                                }
                            } else if (i.a(componentType, Class.class)) {
                                Object[] objArr2 = (Object[]) invoke;
                                int length3 = objArr2.length;
                                int i3 = 0;
                                while (i3 < length3) {
                                    Object obj2 = objArr2[i3];
                                    i3++;
                                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    f.d(a((Class) obj2));
                                }
                            } else {
                                Object[] objArr3 = (Object[]) invoke;
                                int length4 = objArr3.length;
                                int i4 = 0;
                                while (i4 < length4) {
                                    Object obj3 = objArr3[i4];
                                    i4++;
                                    f.b(obj3);
                                }
                            }
                            f.a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
