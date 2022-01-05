package m0.r.t.a.r.e.a.x;

import m0.n.b.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: typeEnhancement.kt */
public final class d {
    public final m0.r.t.a.r.e.a.u.b a;

    /* compiled from: typeEnhancement.kt */
    public static class a {
        public final v a;
        public final int b;
        public final boolean c;

        public a(v vVar, int i, boolean z) {
            i.e(vVar, "type");
            this.a = vVar;
            this.b = i;
            this.c = z;
        }

        public v a() {
            return this.a;
        }
    }

    /* compiled from: typeEnhancement.kt */
    public static final class b extends a {
        public final a0 d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, int i, boolean z) {
            super(a0Var, i, z);
            i.e(a0Var, "type");
            this.d = a0Var;
        }

        public v a() {
            return this.d;
        }
    }

    public d(m0.r.t.a.r.e.a.u.b bVar) {
        i.e(bVar, "javaResolverSettings");
        this.a = bVar;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.e.a.x.d.b a(m0.r.t.a.r.m.a0 r21, m0.n.a.l<? super java.lang.Integer, m0.r.t.a.r.e.a.x.e> r22, int r23, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r24, boolean r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            boolean r4 = i0.j.f.p.h.P3(r24)
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0020
            java.util.List r4 = r21.H0()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0020
            m0.r.t.a.r.e.a.x.d$b r2 = new m0.r.t.a.r.e.a.x.d$b
            r2.<init>(r1, r6, r5)
            return r2
        L_0x0020:
            m0.r.t.a.r.m.j0 r4 = r21.I0()
            m0.r.t.a.r.c.f r4 = r4.c()
            if (r4 != 0) goto L_0x0030
            m0.r.t.a.r.e.a.x.d$b r2 = new m0.r.t.a.r.e.a.x.d$b
            r2.<init>(r1, r6, r5)
            return r2
        L_0x0030:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r23)
            java.lang.Object r7 = r2.invoke(r7)
            m0.r.t.a.r.e.a.x.e r7 = (m0.r.t.a.r.e.a.x.e) r7
            m0.r.t.a.r.e.a.x.b r8 = m0.r.t.a.r.e.a.x.l.a
            boolean r8 = i0.j.f.p.h.P3(r24)
            r10 = 2
            if (r8 != 0) goto L_0x0049
            m0.r.t.a.r.e.a.x.c r4 = m0.r.t.a.r.e.a.x.l.a(r4)
            goto L_0x00e2
        L_0x0049:
            boolean r8 = r4 instanceof m0.r.t.a.r.c.d
            if (r8 != 0) goto L_0x0053
            m0.r.t.a.r.e.a.x.c r4 = m0.r.t.a.r.e.a.x.l.a(r4)
            goto L_0x00e2
        L_0x0053:
            m0.r.t.a.r.b.k.d r8 = m0.r.t.a.r.b.k.d.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r11 = r7.d
            if (r11 != 0) goto L_0x005b
            r11 = -1
            goto L_0x0063
        L_0x005b:
            int[] r12 = m0.r.t.a.r.e.a.x.l.a.a
            int r11 = r11.ordinal()
            r11 = r12[r11]
        L_0x0063:
            if (r11 == r6) goto L_0x0082
            if (r11 == r10) goto L_0x0069
            goto L_0x00de
        L_0x0069:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            if (r3 != r11) goto L_0x00de
            r11 = r4
            m0.r.t.a.r.c.d r11 = (m0.r.t.a.r.c.d) r11
            boolean r12 = r8.c(r11)
            if (r12 == 0) goto L_0x00de
            m0.r.t.a.r.c.d r4 = r8.a(r11)
            m0.r.t.a.r.e.a.x.c r8 = new m0.r.t.a.r.e.a.x.c
            m0.r.t.a.r.e.a.x.b r11 = m0.r.t.a.r.e.a.x.l.b
            r8.<init>(r4, r11)
            goto L_0x00b8
        L_0x0082:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            if (r3 != r11) goto L_0x00de
            r11 = r4
            m0.r.t.a.r.c.d r11 = (m0.r.t.a.r.c.d) r11
            boolean r8 = r8.b(r11)
            if (r8 == 0) goto L_0x00de
            java.lang.String r4 = "mutable"
            m0.n.b.i.e(r11, r4)
            m0.r.t.a.r.g.c r8 = m0.r.t.a.r.j.d.g(r11)
            m0.r.t.a.r.b.k.c r12 = m0.r.t.a.r.b.k.c.a
            java.util.HashMap<m0.r.t.a.r.g.c, m0.r.t.a.r.g.b> r12 = m0.r.t.a.r.b.k.c.k
            java.lang.Object r8 = r12.get(r8)
            m0.r.t.a.r.g.b r8 = (m0.r.t.a.r.g.b) r8
            if (r8 == 0) goto L_0x00ba
            m0.r.t.a.r.b.f r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r11)
            m0.r.t.a.r.c.d r4 = r4.j(r8)
            java.lang.String r8 = "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)"
            m0.n.b.i.d(r4, r8)
            m0.r.t.a.r.e.a.x.c r8 = new m0.r.t.a.r.e.a.x.c
            m0.r.t.a.r.e.a.x.b r11 = m0.r.t.a.r.e.a.x.l.b
            r8.<init>(r4, r11)
        L_0x00b8:
            r4 = r8
            goto L_0x00e2
        L_0x00ba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Given class "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " is not a "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " collection"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00de:
            m0.r.t.a.r.e.a.x.c r4 = m0.r.t.a.r.e.a.x.l.a(r4)
        L_0x00e2:
            T r8 = r4.a
            m0.r.t.a.r.c.f r8 = (m0.r.t.a.r.c.f) r8
            m0.r.t.a.r.c.r0.f r4 = r4.b
            m0.r.t.a.r.m.j0 r12 = r8.i()
            java.lang.String r11 = "enhancedClassifier.typeConstructor"
            m0.n.b.i.d(r12, r11)
            int r11 = r23 + 1
            if (r4 == 0) goto L_0x00f7
            r13 = r6
            goto L_0x00f8
        L_0x00f7:
            r13 = r5
        L_0x00f8:
            java.util.List r14 = r21.H0()
            java.util.ArrayList r15 = new java.util.ArrayList
            r9 = 10
            int r9 = i0.j.f.p.h.K(r14, r9)
            r15.<init>(r9)
            java.util.Iterator r9 = r14.iterator()
            r14 = r5
        L_0x010c:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x01b4
            java.lang.Object r17 = r9.next()
            int r18 = r14 + 1
            if (r14 < 0) goto L_0x01af
            m0.r.t.a.r.m.m0 r17 = (m0.r.t.a.r.m.m0) r17
            boolean r19 = r17.c()
            java.lang.String r5 = "arg.projectionKind"
            if (r19 == 0) goto L_0x0172
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r2.invoke(r10)
            m0.r.t.a.r.e.a.x.e r10 = (m0.r.t.a.r.e.a.x.e) r10
            int r11 = r11 + 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r10 = r10.c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r10 != r6) goto L_0x015a
            if (r25 != 0) goto L_0x015a
            m0.r.t.a.r.m.v r6 = r17.getType()
            m0.r.t.a.r.m.v0 r6 = r6.L0()
            m0.r.t.a.r.m.v r6 = m0.r.t.a.r.m.a1.a.H2(r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = r17.b()
            m0.n.b.i.d(r10, r5)
            java.util.List r5 = r12.getParameters()
            java.lang.Object r5 = r5.get(r14)
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            m0.r.t.a.r.m.m0 r5 = m0.r.t.a.r.m.a1.a.Q0(r6, r10, r5)
            goto L_0x01a5
        L_0x015a:
            m0.r.t.a.r.m.j0 r5 = r8.i()
            java.util.List r5 = r5.getParameters()
            java.lang.Object r5 = r5.get(r14)
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            m0.r.t.a.r.m.m0 r5 = m0.r.t.a.r.m.s0.m(r5)
            java.lang.String r6 = "{\n                    TypeUtils.makeStarProjection(enhancedClassifier.typeConstructor.parameters[localArgIndex])\n                }"
            m0.n.b.i.d(r5, r6)
            goto L_0x01a5
        L_0x0172:
            m0.r.t.a.r.m.v r6 = r17.getType()
            m0.r.t.a.r.m.v0 r6 = r6.L0()
            m0.r.t.a.r.e.a.x.d$a r6 = r0.b(r6, r2, r11)
            if (r13 != 0) goto L_0x0187
            boolean r10 = r6.c
            if (r10 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r10 = 0
            goto L_0x0188
        L_0x0187:
            r10 = 1
        L_0x0188:
            int r13 = r6.b
            int r11 = r11 + r13
            m0.r.t.a.r.m.v r6 = r6.a()
            kotlin.reflect.jvm.internal.impl.types.Variance r13 = r17.b()
            m0.n.b.i.d(r13, r5)
            java.util.List r5 = r12.getParameters()
            java.lang.Object r5 = r5.get(r14)
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            m0.r.t.a.r.m.m0 r5 = m0.r.t.a.r.m.a1.a.Q0(r6, r13, r5)
            r13 = r10
        L_0x01a5:
            r15.add(r5)
            r14 = r18
            r5 = 0
            r6 = 1
            r10 = 2
            goto L_0x010c
        L_0x01af:
            m0.j.g.r0()
            r1 = 0
            throw r1
        L_0x01b4:
            boolean r2 = i0.j.f.p.h.P3(r24)
            if (r2 != 0) goto L_0x01c7
            boolean r2 = r21.J0()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            m0.r.t.a.r.e.a.x.c r2 = m0.r.t.a.r.e.a.x.l.a(r2)
            goto L_0x01fd
        L_0x01c7:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r7.c
            if (r2 != 0) goto L_0x01ce
            r2 = 1
            r9 = -1
            goto L_0x01d7
        L_0x01ce:
            int[] r3 = m0.r.t.a.r.e.a.x.l.a.b
            int r2 = r2.ordinal()
            r9 = r3[r2]
            r2 = 1
        L_0x01d7:
            if (r9 == r2) goto L_0x01f3
            r2 = 2
            if (r9 == r2) goto L_0x01e9
            boolean r2 = r21.J0()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            m0.r.t.a.r.e.a.x.c r2 = m0.r.t.a.r.e.a.x.l.a(r2)
            goto L_0x01fd
        L_0x01e9:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            m0.r.t.a.r.e.a.x.c r3 = new m0.r.t.a.r.e.a.x.c
            m0.r.t.a.r.e.a.x.b r5 = m0.r.t.a.r.e.a.x.l.a
            r3.<init>(r2, r5)
            goto L_0x01fc
        L_0x01f3:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            m0.r.t.a.r.e.a.x.c r3 = new m0.r.t.a.r.e.a.x.c
            m0.r.t.a.r.e.a.x.b r5 = m0.r.t.a.r.e.a.x.l.a
            r3.<init>(r2, r5)
        L_0x01fc:
            r2 = r3
        L_0x01fd:
            T r3 = r2.a
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r14 = r3.booleanValue()
            m0.r.t.a.r.c.r0.f r2 = r2.b
            if (r13 != 0) goto L_0x020e
            if (r2 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            r3 = 0
            goto L_0x020f
        L_0x020e:
            r3 = 1
        L_0x020f:
            int r5 = r11 - r23
            if (r3 != 0) goto L_0x021a
            m0.r.t.a.r.e.a.x.d$b r2 = new m0.r.t.a.r.e.a.x.d$b
            r3 = 0
            r2.<init>(r1, r5, r3)
            return r2
        L_0x021a:
            r3 = 0
            r6 = 3
            m0.r.t.a.r.c.r0.f[] r6 = new m0.r.t.a.r.c.r0.f[r6]
            m0.r.t.a.r.c.r0.f r8 = r21.getAnnotations()
            r6[r3] = r8
            r8 = 1
            r6[r8] = r4
            r4 = 2
            r6[r4] = r2
            java.util.List r4 = m0.j.g.M(r6)
            r6 = r4
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            if (r6 == 0) goto L_0x0284
            if (r6 == r8) goto L_0x0244
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations r6 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations
            java.util.List r4 = m0.j.g.v0(r4)
            r6.<init>((java.util.List<? extends m0.r.t.a.r.c.r0.f>) r4)
            r11 = r6
            goto L_0x024b
        L_0x0244:
            java.lang.Object r4 = m0.j.g.j0(r4)
            m0.r.t.a.r.c.r0.f r4 = (m0.r.t.a.r.c.r0.f) r4
            r11 = r4
        L_0x024b:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r4 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            r4 = 0
            r16 = 16
            r13 = r15
            r15 = r4
            m0.r.t.a.r.m.a0 r4 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r11, r12, r13, r14, r15, r16)
            boolean r6 = r7.e
            if (r6 == 0) goto L_0x026e
            m0.r.t.a.r.e.a.u.b r6 = r0.a
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x0268
            r6 = 1
            m0.r.t.a.r.m.a0 r4 = m0.r.t.a.r.m.d0.d(r4, r6)
            goto L_0x026e
        L_0x0268:
            m0.r.t.a.r.e.a.x.f r6 = new m0.r.t.a.r.e.a.x.f
            r6.<init>(r4)
            r4 = r6
        L_0x026e:
            if (r2 == 0) goto L_0x0275
            boolean r2 = r7.f
            if (r2 == 0) goto L_0x0275
            r3 = 1
        L_0x0275:
            if (r3 == 0) goto L_0x027b
            m0.r.t.a.r.m.v0 r4 = i0.j.f.p.h.G4(r1, r4)
        L_0x027b:
            m0.r.t.a.r.e.a.x.d$b r1 = new m0.r.t.a.r.e.a.x.d$b
            m0.r.t.a.r.m.a0 r4 = (m0.r.t.a.r.m.a0) r4
            r2 = 1
            r1.<init>(r4, r5, r2)
            return r1
        L_0x0284:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "At least one Annotations object expected"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.a.x.d.a(m0.r.t.a.r.m.a0, m0.n.a.l, int, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition, boolean):m0.r.t.a.r.e.a.x.d$b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.e.a.x.d.a b(m0.r.t.a.r.m.v0 r12, m0.n.a.l<? super java.lang.Integer, m0.r.t.a.r.e.a.x.e> r13, int r14) {
        /*
            r11 = this;
            boolean r0 = i0.j.f.p.h.h2(r12)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            m0.r.t.a.r.e.a.x.d$a r13 = new m0.r.t.a.r.e.a.x.d$a
            r13.<init>(r12, r2, r1)
            return r13
        L_0x000e:
            boolean r0 = r12 instanceof m0.r.t.a.r.m.q
            if (r0 == 0) goto L_0x007e
            boolean r0 = r12 instanceof m0.r.t.a.r.m.z
            r9 = r12
            m0.r.t.a.r.m.q r9 = (m0.r.t.a.r.m.q) r9
            m0.r.t.a.r.m.a0 r4 = r9.d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r3 = r11
            r5 = r13
            r6 = r14
            r8 = r0
            m0.r.t.a.r.e.a.x.d$b r10 = r3.a(r4, r5, r6, r7, r8)
            m0.r.t.a.r.m.a0 r4 = r9.q
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            m0.r.t.a.r.e.a.x.d$b r13 = r3.a(r4, r5, r6, r7, r8)
            boolean r14 = r10.c
            if (r14 != 0) goto L_0x0033
            boolean r14 = r13.c
            if (r14 == 0) goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            m0.r.t.a.r.m.a0 r14 = r10.d
            m0.r.t.a.r.m.a0 r0 = r13.d
            m0.r.t.a.r.m.v r0 = i0.j.f.p.h.a1(r0)
            m0.r.t.a.r.m.v r14 = i0.j.f.p.h.a1(r14)
            if (r14 != 0) goto L_0x0047
            if (r0 != 0) goto L_0x0046
            r14 = 0
            goto L_0x0058
        L_0x0046:
            r14 = r0
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0058
        L_0x004a:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.m.a0 r14 = i0.j.f.p.h.P2(r14)
            m0.r.t.a.r.m.a0 r0 = i0.j.f.p.h.B4(r0)
            m0.r.t.a.r.m.v0 r14 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.c(r14, r0)
        L_0x0058:
            if (r1 == 0) goto L_0x0076
            boolean r12 = r12 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            if (r12 == 0) goto L_0x0068
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl r12 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            m0.r.t.a.r.m.a0 r0 = r10.d
            m0.r.t.a.r.m.a0 r13 = r13.d
            r12.<init>(r0, r13)
            goto L_0x0072
        L_0x0068:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r12 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.m.a0 r12 = r10.d
            m0.r.t.a.r.m.a0 r13 = r13.d
            m0.r.t.a.r.m.v0 r12 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.c(r12, r13)
        L_0x0072:
            m0.r.t.a.r.m.v0 r12 = i0.j.f.p.h.G4(r12, r14)
        L_0x0076:
            m0.r.t.a.r.e.a.x.d$a r13 = new m0.r.t.a.r.e.a.x.d$a
            int r14 = r10.b
            r13.<init>(r12, r14, r1)
            goto L_0x008f
        L_0x007e:
            boolean r0 = r12 instanceof m0.r.t.a.r.m.a0
            if (r0 == 0) goto L_0x0090
            r2 = r12
            m0.r.t.a.r.m.a0 r2 = (m0.r.t.a.r.m.a0) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            m0.r.t.a.r.e.a.x.d$b r13 = r1.a(r2, r3, r4, r5, r6)
        L_0x008f:
            return r13
        L_0x0090:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.a.x.d.b(m0.r.t.a.r.m.v0, m0.n.a.l, int):m0.r.t.a.r.e.a.x.d$a");
    }
}
