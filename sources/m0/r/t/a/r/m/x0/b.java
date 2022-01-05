package m0.r.t.a.r.m.x0;

import i0.d.a.a.a;
import java.util.Collection;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.l0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.x0.h;
import m0.r.t.a.r.m.z0.d;
import m0.r.t.a.r.m.z0.f;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.j;
import m0.r.t.a.r.m.z0.k;

/* compiled from: ClassicTypeCheckerContext.kt */
public class b extends AbstractTypeCheckerContext implements c {
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final e h;

    public b(boolean z, boolean z2, boolean z3, e eVar, int i) {
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? true : z3;
        eVar = (i & 8) != 0 ? e.a.a : eVar;
        i.e(eVar, "kotlinTypeRefiner");
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = eVar;
    }

    public boolean F() {
        return this.e;
    }

    public boolean H() {
        return this.f;
    }

    public f I(f fVar) {
        i.e(fVar, "type");
        if (fVar instanceof v) {
            Objects.requireNonNull(h.b);
            return h.a.b.h(((v) fVar).L0());
        }
        throw new IllegalArgumentException(i0.j.f.p.h.k(fVar).toString());
    }

    public f J(f fVar) {
        i.e(fVar, "type");
        if (fVar instanceof v) {
            return this.h.g((v) fVar);
        }
        throw new IllegalArgumentException(i0.j.f.p.h.k(fVar).toString());
    }

    public AbstractTypeCheckerContext.a K(g gVar) {
        i.e(gVar, "type");
        i.e(this, "<this>");
        i.e(gVar, "type");
        if (gVar instanceof a0) {
            return new a(this, l0.b.a((v) gVar).c());
        }
        throw new IllegalArgumentException(i0.j.f.p.h.k(gVar).toString());
    }

    public boolean L(j0 j0Var, j0 j0Var2) {
        i.e(j0Var, "a");
        i.e(j0Var2, "b");
        if (j0Var instanceof IntegerLiteralTypeConstructor) {
            return ((IntegerLiteralTypeConstructor) j0Var).f(j0Var2);
        }
        if (j0Var2 instanceof IntegerLiteralTypeConstructor) {
            return ((IntegerLiteralTypeConstructor) j0Var2).f(j0Var);
        }
        return i.a(j0Var, j0Var2);
    }

    public m0.r.t.a.r.m.z0.h M(g gVar) {
        i.e(this, "this");
        i.e(gVar, "receiver");
        if (gVar instanceof a0) {
            return (m0.r.t.a.r.m.z0.h) gVar;
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0.r.t.a.r.m.z0.g N(m0.r.t.a.r.m.z0.g r22, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r23) {
        /*
            r21 = this;
            r0 = r22
            r8 = r23
            java.lang.String r1 = "this"
            r9 = r21
            m0.n.b.i.e(r9, r1)
            java.lang.String r1 = "type"
            m0.n.b.i.e(r0, r1)
            java.lang.String r2 = "status"
            m0.n.b.i.e(r8, r2)
            boolean r3 = r0 instanceof m0.r.t.a.r.m.a0
            if (r3 == 0) goto L_0x01d4
            r10 = r0
            m0.r.t.a.r.m.a0 r10 = (m0.r.t.a.r.m.a0) r10
            m0.n.b.i.e(r10, r1)
            m0.n.b.i.e(r8, r2)
            java.util.List r0 = r10.H0()
            int r0 = r0.size()
            m0.r.t.a.r.m.j0 r1 = r10.I0()
            java.util.List r1 = r1.getParameters()
            int r1 = r1.size()
            r11 = 0
            if (r0 == r1) goto L_0x003a
            goto L_0x006b
        L_0x003a:
            java.util.List r12 = r10.H0()
            boolean r0 = r12 instanceof java.util.Collection
            r13 = 0
            r1 = 1
            if (r0 == 0) goto L_0x004b
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            java.util.Iterator r0 = r12.iterator()
        L_0x004f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r0.next()
            m0.r.t.a.r.m.m0 r2 = (m0.r.t.a.r.m.m0) r2
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r2 != r3) goto L_0x0065
            r2 = r1
            goto L_0x0066
        L_0x0065:
            r2 = r13
        L_0x0066:
            if (r2 != 0) goto L_0x004f
            r1 = r13
        L_0x0069:
            if (r1 == 0) goto L_0x006f
        L_0x006b:
            r17 = r11
            goto L_0x01ba
        L_0x006f:
            m0.r.t.a.r.m.j0 r0 = r10.I0()
            java.util.List r0 = r0.getParameters()
            java.lang.String r1 = "type.constructor.parameters"
            m0.n.b.i.d(r0, r1)
            java.util.List r0 = m0.j.g.F0(r12, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r1 = 10
            int r1 = i0.j.f.p.h.K(r0, r1)
            r14.<init>(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r15 = r0.iterator()
        L_0x0091:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r15.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            A r1 = r0.c
            r3 = r1
            m0.r.t.a.r.m.m0 r3 = (m0.r.t.a.r.m.m0) r3
            B r0 = r0.d
            r6 = r0
            m0.r.t.a.r.c.m0 r6 = (m0.r.t.a.r.c.m0) r6
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r3.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r0 != r1) goto L_0x00b0
            goto L_0x0100
        L_0x00b0:
            boolean r0 = r3.c()
            if (r0 != 0) goto L_0x00c9
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r3.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r0 != r1) goto L_0x00c9
            m0.r.t.a.r.m.v r0 = r3.getType()
            m0.r.t.a.r.m.v0 r0 = r0.L0()
            r16 = r0
            goto L_0x00cb
        L_0x00c9:
            r16 = r11
        L_0x00cb:
            m0.r.t.a.r.m.x0.g r17 = new m0.r.t.a.r.m.x0.g
            java.lang.String r0 = "parameter"
            m0.n.b.i.d(r6, r0)
            java.lang.String r0 = "captureStatus"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "projection"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "typeParameter"
            m0.n.b.i.e(r6, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r18 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r19 = 0
            r5 = 0
            r7 = 6
            r4 = 0
            r2 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r5 = 0
            r6 = 0
            r7 = 56
            r0 = r17
            r1 = r23
            r3 = r16
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            m0.r.t.a.r.m.m0 r3 = m0.r.t.a.r.m.a1.a.Y(r17)
        L_0x0100:
            r14.add(r3)
            goto L_0x0091
        L_0x0104:
            m0.r.t.a.r.m.l0$a r0 = m0.r.t.a.r.m.l0.b
            m0.r.t.a.r.m.j0 r1 = r10.I0()
            m0.r.t.a.r.m.p0 r0 = r0.b(r1, r14)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r0 = r0.c()
            int r1 = r12.size()
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x01b8
        L_0x011a:
            int r2 = r13 + 1
            java.lang.Object r3 = r12.get(r13)
            m0.r.t.a.r.m.m0 r3 = (m0.r.t.a.r.m.m0) r3
            java.lang.Object r4 = r14.get(r13)
            m0.r.t.a.r.m.m0 r4 = (m0.r.t.a.r.m.m0) r4
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r3.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r5 != r6) goto L_0x0132
            goto L_0x01b2
        L_0x0132:
            m0.r.t.a.r.m.j0 r5 = r10.I0()
            java.util.List r5 = r5.getParameters()
            java.lang.Object r5 = r5.get(r13)
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            java.util.List r5 = r5.getUpperBounds()
            java.lang.String r6 = "type.constructor.parameters[index].upperBounds"
            m0.n.b.i.d(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0152:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0177
            java.lang.Object r7 = r5.next()
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            m0.r.t.a.r.m.x0.h$a r8 = m0.r.t.a.r.m.x0.h.b
            java.util.Objects.requireNonNull(r8)
            m0.r.t.a.r.m.x0.i r8 = m0.r.t.a.r.m.x0.h.a.b
            kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            m0.r.t.a.r.m.v r7 = r0.i(r7, r13)
            m0.r.t.a.r.m.v0 r7 = r7.L0()
            m0.r.t.a.r.m.v0 r7 = r8.h(r7)
            r6.add(r7)
            goto L_0x0152
        L_0x0177:
            boolean r5 = r3.c()
            if (r5 != 0) goto L_0x019b
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r3.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r5 != r7) goto L_0x019b
            m0.r.t.a.r.m.x0.h$a r5 = m0.r.t.a.r.m.x0.h.b
            java.util.Objects.requireNonNull(r5)
            m0.r.t.a.r.m.x0.i r5 = m0.r.t.a.r.m.x0.h.a.b
            m0.r.t.a.r.m.v r3 = r3.getType()
            m0.r.t.a.r.m.v0 r3 = r3.L0()
            m0.r.t.a.r.m.v0 r3 = r5.h(r3)
            r6.add(r3)
        L_0x019b:
            m0.r.t.a.r.m.v r3 = r4.getType()
            m0.r.t.a.r.m.x0.g r3 = (m0.r.t.a.r.m.x0.g) r3
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r3 = r3.q
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "supertypes"
            m0.n.b.i.e(r6, r4)
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$initializeSupertypes$2 r4 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$initializeSupertypes$2
            r4.<init>(r6)
            r3.b = r4
        L_0x01b2:
            if (r2 <= r1) goto L_0x01b5
            goto L_0x01b8
        L_0x01b5:
            r13 = r2
            goto L_0x011a
        L_0x01b8:
            r17 = r14
        L_0x01ba:
            if (r17 != 0) goto L_0x01bd
            goto L_0x01d3
        L_0x01bd:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.c.r0.f r15 = r10.getAnnotations()
            m0.r.t.a.r.m.j0 r16 = r10.I0()
            boolean r18 = r10.J0()
            r19 = 0
            r20 = 16
            m0.r.t.a.r.m.a0 r11 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r15, r16, r17, r18, r19, r20)
        L_0x01d3:
            return r11
        L_0x01d4:
            java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = i0.d.a.a.a.W0(r1, r0, r2)
            java.lang.String r0 = i0.d.a.a.a.I0(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.x0.b.N(m0.r.t.a.r.m.z0.g, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus):m0.r.t.a.r.m.z0.g");
    }

    public k O(j jVar, int i) {
        i.e(this, "this");
        i.e(jVar, "receiver");
        m0 m0Var = ((j0) jVar).getParameters().get(i);
        i.d(m0Var, "this.parameters[index]");
        return m0Var;
    }

    public TypeVariance P(k kVar) {
        i.e(this, "this");
        i.e(kVar, "receiver");
        if (kVar instanceof m0) {
            Variance l = ((m0) kVar).l();
            i.d(l, "this.variance");
            return i0.j.f.p.h.W(l);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + m.a(kVar.getClass())).toString());
    }

    public boolean Q(j jVar) {
        return i0.j.f.p.h.d2(this, jVar);
    }

    public boolean R(f fVar) {
        i.e(this, "this");
        i.e(fVar, "receiver");
        if (fVar instanceof v) {
            return i0.j.f.p.h.h2((v) fVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public boolean S(j jVar) {
        return i0.j.f.p.h.m2(this, jVar);
    }

    public boolean T(j jVar) {
        i.e(this, "this");
        i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            return jVar instanceof IntersectionTypeConstructor;
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public boolean U(g gVar) {
        i.e(this, "this");
        i.e(gVar, "receiver");
        if (gVar instanceof a0) {
            return false;
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    public int V(j jVar) {
        i.e(this, "this");
        i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            return ((j0) jVar).getParameters().size();
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public Collection<f> W(j jVar) {
        i.e(this, "this");
        i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            Collection<v> b = ((j0) jVar).b();
            i.d(b, "this.supertypes");
            return b;
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public g a(f fVar) {
        return i0.j.f.p.h.y(this, fVar);
    }

    public int b(f fVar) {
        return i0.j.f.p.h.p(this, fVar);
    }

    public f c(k kVar) {
        return i0.j.f.p.h.D1(this, kVar);
    }

    public k e(j jVar) {
        return i0.j.f.p.h.H1(this, jVar);
    }

    public boolean f(m0.r.t.a.r.m.z0.i iVar) {
        return i0.j.f.p.h.x2(this, iVar);
    }

    public d g(f fVar) {
        return i0.j.f.p.h.u(this, fVar);
    }

    public j h(g gVar) {
        return i0.j.f.p.h.s4(this, gVar);
    }

    public boolean i(g gVar) {
        return i0.j.f.p.h.p2(this, gVar);
    }

    public g j(g gVar, boolean z) {
        return i0.j.f.p.h.F4(this, gVar, z);
    }

    public boolean k(j jVar) {
        return i0.j.f.p.h.l2(this, jVar);
    }

    public f l(f fVar) {
        return i0.j.f.p.h.F1(this, fVar);
    }

    public g m(d dVar) {
        return i0.j.f.p.h.z4(this, dVar);
    }

    public m0.r.t.a.r.m.z0.i n(f fVar, int i) {
        return i0.j.f.p.h.R0(this, fVar, i);
    }

    public TypeVariance p(m0.r.t.a.r.m.z0.i iVar) {
        return i0.j.f.p.h.L1(this, iVar);
    }

    public boolean r(f fVar) {
        return i0.j.f.p.h.s2(this, fVar);
    }

    public m0.r.t.a.r.m.z0.b s(g gVar) {
        return i0.j.f.p.h.r(this, gVar);
    }

    public boolean t(g gVar, g gVar2) {
        return i0.j.f.p.h.T1(this, gVar, gVar2);
    }

    public f u(m0.r.t.a.r.m.z0.i iVar) {
        return i0.j.f.p.h.G1(this, iVar);
    }

    public boolean v(j jVar, j jVar2) {
        i.e(jVar, "c1");
        i.e(jVar2, "c2");
        if (!(jVar instanceof j0)) {
            throw new IllegalArgumentException(i0.j.f.p.h.k(jVar).toString());
        } else if (jVar2 instanceof j0) {
            return L((j0) jVar, (j0) jVar2);
        } else {
            throw new IllegalArgumentException(i0.j.f.p.h.k(jVar2).toString());
        }
    }

    public f w(f fVar) {
        return i0.j.f.p.h.Q2(this, fVar);
    }

    public g x(d dVar) {
        return i0.j.f.p.h.N2(this, dVar);
    }

    public boolean y(g gVar) {
        return i0.j.f.p.h.v2(this, gVar);
    }

    public b(boolean z, boolean z2, boolean z3, e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = eVar;
    }
}
