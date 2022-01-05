package m0.r.t.a.q;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import m0.n.b.i;

/* compiled from: InlineClassAwareCaller.kt */
public final class e<M extends Member> implements c<M> {
    public final a a;
    public final c<M> b;
    public final boolean c;

    /* compiled from: InlineClassAwareCaller.kt */
    public static final class a {
        public final m0.q.e a;
        public final Method[] b;
        public final Method c;

        public a(m0.q.e eVar, Method[] methodArr, Method method) {
            i.e(eVar, "argumentRange");
            i.e(methodArr, "unbox");
            this.a = eVar;
            this.b = methodArr;
            this.c = method;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if ((r9 instanceof m0.r.t.a.q.b) != false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r8, m0.r.t.a.q.c<? extends M> r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r8, r0)
            java.lang.String r1 = "caller"
            m0.n.b.i.e(r9, r1)
            r7.<init>()
            r7.b = r9
            r7.c = r10
            m0.r.t.a.r.m.v r1 = r8.getReturnType()
            m0.n.b.i.c(r1)
            java.lang.String r2 = "descriptor.returnType!!"
            m0.n.b.i.d(r1, r2)
            java.lang.Class r1 = i0.j.f.p.h.j4(r1)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x006a
            java.lang.String r5 = "$this$getBoxMethod"
            m0.n.b.i.e(r1, r5)
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "box-impl"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.reflect.Method r6 = i0.j.f.p.h.J1(r1, r8)     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.Class r6 = r6.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0046 }
            r5[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.String r5 = "getDeclaredMethod(\"box\" …d(descriptor).returnType)"
            m0.n.b.i.d(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0046 }
            goto L_0x006b
        L_0x0046:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "No box method found in inline class: "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = " (calling "
            r10.append(r0)
            r10.append(r8)
            r8 = 41
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x006a:
            r0 = r3
        L_0x006b:
            boolean r1 = m0.r.t.a.r.j.e.a(r8)
            if (r1 == 0) goto L_0x007e
            m0.r.t.a.q.e$a r8 = new m0.r.t.a.q.e$a
            m0.q.e r9 = m0.q.e.y
            m0.q.e r9 = m0.q.e.x
            java.lang.reflect.Method[] r10 = new java.lang.reflect.Method[r4]
            r8.<init>(r9, r10, r0)
            goto L_0x017b
        L_0x007e:
            boolean r1 = r9 instanceof m0.r.t.a.q.d.g.c
            java.lang.String r5 = "descriptor.containingDeclaration"
            r6 = -1
            if (r1 == 0) goto L_0x0086
            goto L_0x00aa
        L_0x0086:
            boolean r1 = r8 instanceof m0.r.t.a.r.c.h
            if (r1 == 0) goto L_0x008f
            boolean r9 = r9 instanceof m0.r.t.a.q.b
            if (r9 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x008f:
            m0.r.t.a.r.c.f0 r1 = r8.e0()
            if (r1 == 0) goto L_0x00a9
            boolean r9 = r9 instanceof m0.r.t.a.q.b
            if (r9 != 0) goto L_0x00a9
            m0.r.t.a.r.c.i r9 = r8.b()
            m0.n.b.i.d(r9, r5)
            boolean r9 = m0.r.t.a.r.j.e.b(r9)
            if (r9 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r6 = r2
            goto L_0x00aa
        L_0x00a9:
            r6 = r4
        L_0x00aa:
            if (r10 == 0) goto L_0x00ae
            r9 = 2
            goto L_0x00af
        L_0x00ae:
            r9 = r4
        L_0x00af:
            boolean r10 = r8 instanceof m0.r.t.a.r.c.r
            if (r10 == 0) goto L_0x00bd
            r10 = r8
            m0.r.t.a.r.c.r r10 = (m0.r.t.a.r.c.r) r10
            boolean r10 = r10.isSuspend()
            if (r10 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r2 = r4
        L_0x00be:
            int r9 = r9 + r2
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            m0.r.t.a.r.c.f0 r1 = r8.l0()
            if (r1 == 0) goto L_0x00cf
            m0.r.t.a.r.m.v r1 = r1.getType()
            goto L_0x00d0
        L_0x00cf:
            r1 = r3
        L_0x00d0:
            if (r1 == 0) goto L_0x00d6
            r10.add(r1)
            goto L_0x0119
        L_0x00d6:
            boolean r1 = r8 instanceof m0.r.t.a.r.c.h
            if (r1 == 0) goto L_0x00ff
            r1 = r8
            m0.r.t.a.r.c.h r1 = (m0.r.t.a.r.c.h) r1
            m0.r.t.a.r.c.d r1 = r1.y()
            java.lang.String r2 = "descriptor.constructedClass"
            m0.n.b.i.d(r1, r2)
            boolean r2 = r1.L()
            if (r2 == 0) goto L_0x0119
            m0.r.t.a.r.c.i r1 = r1.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r1, r2)
            m0.r.t.a.r.c.d r1 = (m0.r.t.a.r.c.d) r1
            m0.r.t.a.r.m.a0 r1 = r1.q()
            r10.add(r1)
            goto L_0x0119
        L_0x00ff:
            m0.r.t.a.r.c.i r1 = r8.b()
            m0.n.b.i.d(r1, r5)
            boolean r2 = r1 instanceof m0.r.t.a.r.c.d
            if (r2 == 0) goto L_0x0119
            boolean r2 = m0.r.t.a.r.j.e.b(r1)
            if (r2 == 0) goto L_0x0119
            m0.r.t.a.r.c.d r1 = (m0.r.t.a.r.c.d) r1
            m0.r.t.a.r.m.a0 r1 = r1.q()
            r10.add(r1)
        L_0x0119:
            java.util.List r1 = r8.h()
            java.lang.String r2 = "descriptor.valueParameters"
            m0.n.b.i.d(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0126:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r1.next()
            m0.r.t.a.r.c.o0 r2 = (m0.r.t.a.r.c.o0) r2
            m0.r.t.a.r.m.v r2 = r2.getType()
            r10.add(r2)
            goto L_0x0126
        L_0x013a:
            int r1 = r10.size()
            int r1 = r1 + r6
            int r1 = r1 + r9
            int r9 = i0.j.f.p.h.S0(r7)
            if (r9 != r1) goto L_0x017e
            int r9 = java.lang.Math.max(r6, r4)
            int r2 = r10.size()
            int r2 = r2 + r6
            m0.q.e r9 = m0.q.i.f(r9, r2)
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[r1]
        L_0x0155:
            if (r4 >= r1) goto L_0x0176
            boolean r5 = r9.k(r4)
            if (r5 == 0) goto L_0x0170
            int r5 = r4 - r6
            java.lang.Object r5 = r10.get(r5)
            m0.r.t.a.r.m.v r5 = (m0.r.t.a.r.m.v) r5
            java.lang.Class r5 = i0.j.f.p.h.j4(r5)
            if (r5 == 0) goto L_0x0170
            java.lang.reflect.Method r5 = i0.j.f.p.h.J1(r5, r8)
            goto L_0x0171
        L_0x0170:
            r5 = r3
        L_0x0171:
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0155
        L_0x0176:
            m0.r.t.a.q.e$a r8 = new m0.r.t.a.q.e$a
            r8.<init>(r9, r2, r0)
        L_0x017b:
            r7.a = r8
            return
        L_0x017e:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r10 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            java.lang.StringBuilder r10 = i0.d.a.a.a.P0(r10)
            int r0 = i0.j.f.p.h.S0(r7)
            r10.append(r0)
            java.lang.String r0 = " != "
            r10.append(r0)
            r10.append(r1)
            r0 = 10
            r10.append(r0)
            java.lang.String r1 = "Calling: "
            r10.append(r1)
            r10.append(r8)
            r10.append(r0)
            java.lang.String r8 = "Parameter types: "
            r10.append(r8)
            java.util.List r8 = r7.b()
            r10.append(r8)
            java.lang.String r8 = ")\n"
            r10.append(r8)
            java.lang.String r8 = "Default: "
            r10.append(r8)
            boolean r8 = r7.c
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.e.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, m0.r.t.a.q.c, boolean):void");
    }

    public M a() {
        return this.b.a();
    }

    public List<Type> b() {
        return this.b.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r10, r0)
            m0.r.t.a.q.e$a r0 = r9.a
            m0.q.e r1 = r0.a
            java.lang.reflect.Method[] r2 = r0.b
            java.lang.reflect.Method r0 = r0.c
            int r3 = r10.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            m0.n.b.i.d(r3, r4)
            int r4 = r1.c
            int r1 = r1.d
            r5 = 0
            if (r4 > r1) goto L_0x0041
        L_0x001e:
            r6 = r2[r4]
            r7 = r10[r4]
            if (r6 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x002d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r7 = r6.invoke(r7, r8)
            goto L_0x003a
        L_0x002d:
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r7 = "method.returnType"
            m0.n.b.i.d(r6, r7)
            java.lang.Object r7 = m0.r.t.a.o.c(r6)
        L_0x003a:
            r3[r4] = r7
            if (r4 == r1) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0041:
            m0.r.t.a.q.c<M> r10 = r9.b
            java.lang.Object r10 = r10.call(r3)
            if (r0 == 0) goto L_0x0056
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 == 0) goto L_0x0056
            r10 = r0
        L_0x0056:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.q.e.call(java.lang.Object[]):java.lang.Object");
    }

    public Type getReturnType() {
        return this.b.getReturnType();
    }
}
