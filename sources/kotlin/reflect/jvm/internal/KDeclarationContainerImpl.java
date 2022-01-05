package kotlin.reflect.jvm.internal;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.j.f.p.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.c;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.j;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.g.d;

/* compiled from: KDeclarationContainerImpl.kt */
public abstract class KDeclarationContainerImpl implements c {
    public static final Class<?> c = Class.forName("m0.n.b.f");
    public static final Regex d = new Regex("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class Data {
        public static final /* synthetic */ k[] a = {m.c(new PropertyReference1Impl(m.a(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        public final j b = h.K2(new KDeclarationContainerImpl$Data$moduleData$2(this));

        public Data() {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            i.e(callableMemberDescriptor, "member");
            CallableMemberDescriptor.Kind f = callableMemberDescriptor.f();
            i.d(f, "member.kind");
            return f.isReal() == (this == DECLARED);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class a extends m0.r.t.a.a {
        public a(KDeclarationContainerImpl kDeclarationContainerImpl, KDeclarationContainerImpl kDeclarationContainerImpl2) {
            super(kDeclarationContainerImpl2);
        }

        public Object h(m0.r.t.a.r.c.h hVar, Object obj) {
            i.e(hVar, "descriptor");
            i.e((m0.i) obj, MessageExtension.FIELD_DATA);
            throw new IllegalStateException("No constructors should appear here: " + hVar);
        }
    }

    public final void j(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> t = t(str);
        list.addAll(t);
        int size = ((((ArrayList) t).size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            i.d(cls, "Integer.TYPE");
            list.add(cls);
        }
        Class cls2 = z ? c : Object.class;
        i.d(cls2, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(cls2);
    }

    public final Method m(String str, String str2) {
        Method v;
        i.e(str, "name");
        i.e(str2, "desc");
        if (i.a(str, "<init>")) {
            return null;
        }
        Object[] array = t(str2).toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Class[] clsArr = (Class[]) array;
        Class<?> u = u(str2);
        Method v2 = v(r(), str, clsArr, u, false);
        if (v2 != null) {
            return v2;
        }
        if (!r().isInterface() || (v = v(Object.class, str, clsArr, u, false)) == null) {
            return null;
        }
        return v;
    }

    public abstract Collection<m0.r.t.a.r.c.h> n();

    public abstract Collection<r> o(d dVar);

    public abstract c0 p(int i);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> q(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "belonginess"
            m0.n.b.i.e(r9, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a
            r0.<init>(r7, r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = i0.j.f.p.h.Y0(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r8.next()
            m0.r.t.a.r.c.i r3 = (m0.r.t.a.r.c.i) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L_0x004e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            m0.r.t.a.r.c.p r5 = r4.getVisibility()
            m0.r.t.a.r.c.p r6 = m0.r.t.a.r.c.o.h
            boolean r5 = m0.n.b.i.a(r5, r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x004e
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L_0x004e
            m0.i r4 = m0.i.a
            java.lang.Object r3 = r3.J(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L_0x004f
        L_0x004e:
            r3 = r1
        L_0x004f:
            if (r3 == 0) goto L_0x001e
            r2.add(r3)
            goto L_0x001e
        L_0x0055:
            java.util.List r8 = m0.j.g.v0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.q(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    public Class<?> r() {
        Class<?> h = h();
        List<m0.r.d<? extends Object>> list = ReflectClassUtilKt.a;
        i.e(h, "<this>");
        Class<?> cls = ReflectClassUtilKt.c.get(h);
        return cls != null ? cls : h();
    }

    public abstract Collection<c0> s(d dVar);

    public final List<Class<?>> t(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (StringsKt__IndentKt.c("VZCBSIFJD", charAt, false, 2)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = StringsKt__IndentKt.l(str, ';', i2, false, 4) + 1;
            } else {
                throw new KotlinReflectionInternalError(i0.d.a.a.a.n0("Unknown type prefix in the method signature: ", str));
            }
            arrayList.add(w(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    public final Class<?> u(String str) {
        return w(str, StringsKt__IndentKt.l(str, ')', 0, false, 6) + 1, str.length());
    }

    public final Method v(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method v;
        if (z) {
            clsArr[0] = cls;
        }
        Method y = y(cls, str, clsArr, cls2);
        if (y != null) {
            return y;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (v = v(superclass, str, clsArr, cls2, z)) != null) {
            return v;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            i.d(cls3, "superInterface");
            Method v2 = v(cls3, str, clsArr, cls2, z);
            if (v2 != null) {
                return v2;
            }
            if (z) {
                Class<?> p4 = h.p4(ReflectClassUtilKt.e(cls3), cls3.getName() + "$DefaultImpls");
                if (p4 != null) {
                    clsArr[0] = cls3;
                    Method y2 = y(p4, str, clsArr, cls2);
                    if (y2 != null) {
                        return y2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final Class<?> w(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader e = ReflectClassUtilKt.e(h());
            String substring = str.substring(i + 1, i2 - 1);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Class<?> loadClass = e.loadClass(StringsKt__IndentKt.A(substring, '/', '.', false, 4));
            i.d(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                i.d(cls, "Void.TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return ReflectClassUtilKt.a(w(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new KotlinReflectionInternalError(i0.d.a.a.a.n0("Unknown type prefix in the method signature: ", str));
                }
            }
        }
    }

    public final Constructor<?> x(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[LOOP:0: B:6:0x0029->B:17:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method y(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r2 = "result"
            m0.n.b.i.d(r1, r2)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r2 = m0.n.b.i.a(r2, r10)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r2 == 0) goto L_0x001d
            r0 = r1
            goto L_0x005d
        L_0x001d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r1 = "declaredMethods"
            m0.n.b.i.d(r7, r1)     // Catch:{ NoSuchMethodException -> 0x005d }
            int r1 = r7.length     // Catch:{ NoSuchMethodException -> 0x005d }
            r2 = 0
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x005d
            r4 = r7[r3]     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r5 = "method"
            m0.n.b.i.d(r4, r5)     // Catch:{ NoSuchMethodException -> 0x005d }
            java.lang.String r5 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = m0.n.b.i.a(r5, r8)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = m0.n.b.i.a(r5, r10)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x005d }
            m0.n.b.i.c(r5)     // Catch:{ NoSuchMethodException -> 0x005d }
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch:{ NoSuchMethodException -> 0x005d }
            if (r5 == 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r5 == 0) goto L_0x005a
            r0 = r4
            goto L_0x005d
        L_0x005a:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.y(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }
}
