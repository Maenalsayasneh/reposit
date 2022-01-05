package kotlin.reflect.jvm.internal.calls;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.j.g;
import m0.n.b.i;
import m0.r.d;
import m0.r.t.a.q.c;

/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCaller implements c {
    public final List<Type> a;
    public final List<Class<?>> b;
    public final List<Object> c;
    public final Class<?> d;
    public final List<String> e;
    public final CallMode f;
    public final List<Method> g;

    /* compiled from: AnnotationConstructorCaller.kt */
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public AnnotationConstructorCaller(Class<?> cls, List<String> list, CallMode callMode, Origin origin, List<Method> list2) {
        i.e(cls, "jClass");
        i.e(list, "parameterNames");
        i.e(callMode, "callMode");
        i.e(origin, "origin");
        i.e(list2, "methods");
        this.d = cls;
        this.e = list;
        this.f = callMode;
        this.g = list2;
        ArrayList arrayList = new ArrayList(h.K(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.a = arrayList;
        List<Method> list3 = this.g;
        ArrayList arrayList2 = new ArrayList(h.K(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            i.d(returnType2, "it");
            List<d<? extends Object>> list4 = ReflectClassUtilKt.a;
            i.e(returnType2, "<this>");
            Class<?> cls2 = ReflectClassUtilKt.c.get(returnType2);
            if (cls2 != null) {
                returnType2 = cls2;
            }
            arrayList2.add(returnType2);
        }
        this.b = arrayList2;
        List<Method> list5 = this.g;
        ArrayList arrayList3 = new ArrayList(h.K(list5, 10));
        for (Method defaultValue : list5) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.c = arrayList3;
        if (this.f == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && (!((ArrayList) g.Q(this.e, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE)).isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public /* bridge */ /* synthetic */ Member a() {
        return null;
    }

    public List<Type> b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r7.isInstance(r5) != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r14, r0)
            m0.n.b.i.e(r14, r0)
            i0.j.f.p.h.B(r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            int r1 = r14.length
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0015:
            if (r3 >= r1) goto L_0x013c
            r5 = r14[r3]
            int r6 = r4 + 1
            if (r5 != 0) goto L_0x002a
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r7 = r13.f
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r8 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            if (r7 != r8) goto L_0x002a
            java.util.List<java.lang.Object> r5 = r13.c
            java.lang.Object r5 = r5.get(r4)
            goto L_0x0085
        L_0x002a:
            java.util.List<java.lang.Class<?>> r7 = r13.b
            java.lang.Object r7 = r7.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r8 = r5 instanceof java.lang.Class
            r9 = 0
            if (r8 == 0) goto L_0x0038
            goto L_0x0084
        L_0x0038:
            boolean r8 = r5 instanceof m0.r.d
            if (r8 == 0) goto L_0x0043
            m0.r.d r5 = (m0.r.d) r5
            java.lang.Class r5 = i0.j.f.p.h.l1(r5)
            goto L_0x007d
        L_0x0043:
            boolean r8 = r5 instanceof java.lang.Object[]
            if (r8 == 0) goto L_0x007d
            r8 = r5
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            boolean r10 = r8 instanceof java.lang.Class[]
            if (r10 == 0) goto L_0x004f
            goto L_0x0084
        L_0x004f:
            boolean r10 = r8 instanceof m0.r.d[]
            if (r10 == 0) goto L_0x007c
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>"
            java.util.Objects.requireNonNull(r5, r8)
            m0.r.d[] r5 = (m0.r.d[]) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r5.length
            r8.<init>(r10)
            int r10 = r5.length
            r11 = r2
        L_0x0062:
            if (r11 >= r10) goto L_0x0070
            r12 = r5[r11]
            java.lang.Class r12 = i0.j.f.p.h.l1(r12)
            r8.add(r12)
            int r11 = r11 + 1
            goto L_0x0062
        L_0x0070:
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r5, r8)
            goto L_0x007d
        L_0x007c:
            r5 = r8
        L_0x007d:
            boolean r7 = r7.isInstance(r5)
            if (r7 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r5 = r9
        L_0x0085:
            if (r5 == 0) goto L_0x008e
            r0.add(r5)
            int r3 = r3 + 1
            r4 = r6
            goto L_0x0015
        L_0x008e:
            java.util.List<java.lang.String> r14 = r13.e
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            java.util.List<java.lang.Class<?>> r0 = r13.b
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r1 = m0.n.b.i.a(r0, r1)
            if (r1 == 0) goto L_0x00ad
            java.lang.Class<m0.r.d> r0 = m0.r.d.class
            m0.r.d r0 = m0.n.b.m.a(r0)
            goto L_0x00ca
        L_0x00ad:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x00c6
            java.lang.Class r1 = r0.getComponentType()
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            boolean r1 = m0.n.b.i.a(r1, r2)
            if (r1 == 0) goto L_0x00c6
            java.lang.Class<m0.r.d[]> r0 = m0.r.d[].class
            m0.r.d r0 = m0.n.b.m.a(r0)
            goto L_0x00ca
        L_0x00c6:
            m0.r.d r0 = i0.j.f.p.h.r1(r0)
        L_0x00ca:
            java.lang.String r1 = r0.b()
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            m0.r.d r2 = m0.n.b.m.a(r2)
            java.lang.String r2 = r2.b()
            boolean r1 = m0.n.b.i.a(r1, r2)
            if (r1 == 0) goto L_0x0111
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.b()
            r1.append(r2)
            r2 = 60
            r1.append(r2)
            java.lang.Class r0 = i0.j.f.p.h.l1(r0)
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r2 = "kotlinClass.java.componentType"
            m0.n.b.i.d(r0, r2)
            m0.r.d r0 = i0.j.f.p.h.r1(r0)
            java.lang.String r0 = r0.b()
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0115
        L_0x0111:
            java.lang.String r0 = r0.b()
        L_0x0115:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Argument #"
            r2.append(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = " is not of the required type "
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x013c:
            java.lang.Class<?> r14 = r13.d
            java.util.List<java.lang.String> r1 = r13.e
            java.util.List r0 = m0.j.g.F0(r1, r0)
            java.util.Map r0 = m0.j.g.w0(r0)
            java.util.List<java.lang.reflect.Method> r1 = r13.g
            java.lang.Object r14 = i0.j.f.p.h.c0(r14, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.call(java.lang.Object[]):java.lang.Object");
    }

    public Type getReturnType() {
        return this.d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r9, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r10, java.util.List r11, int r12) {
        /*
            r6 = this;
            r11 = r12 & 16
            if (r11 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = i0.j.f.p.h.K(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r0, r1)
            r11.add(r0)
            goto L_0x0013
        L_0x002a:
            r11 = 0
        L_0x002b:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.<init>(java.lang.Class, java.util.List, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin, java.util.List, int):void");
    }
}
