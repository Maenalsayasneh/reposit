package m0.r.t.a.r.m.x0;

import i0.j.f.p.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.e;
import m0.r.t.a.r.m.q;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;

/* compiled from: NewKotlinTypeChecker.kt */
public final class i implements h {
    public final e c;
    public final OverridingUtil d;

    public i(e eVar) {
        m0.n.b.i.e(eVar, "kotlinTypeRefiner");
        this.c = eVar;
        if (eVar != null) {
            OverridingUtil overridingUtil = new OverridingUtil(OverridingUtil.c, eVar);
            m0.n.b.i.d(overridingUtil, "createWithTypeRefiner(kotlinTypeRefiner)");
            this.d = overridingUtil;
            return;
        }
        OverridingUtil.a(1);
        throw null;
    }

    public OverridingUtil a() {
        return this.d;
    }

    public boolean b(v vVar, v vVar2) {
        m0.n.b.i.e(vVar, "a");
        m0.n.b.i.e(vVar2, "b");
        return e(new b(false, false, false, this.c, 6), vVar.L0(), vVar2.L0());
    }

    public e c() {
        return this.c;
    }

    public boolean d(v vVar, v vVar2) {
        m0.n.b.i.e(vVar, "subtype");
        m0.n.b.i.e(vVar2, "supertype");
        return f(new b(true, false, false, this.c, 6), vVar.L0(), vVar2.L0());
    }

    public final boolean e(b bVar, v0 v0Var, v0 v0Var2) {
        m0.n.b.i.e(bVar, "<this>");
        m0.n.b.i.e(v0Var, "a");
        m0.n.b.i.e(v0Var2, "b");
        return e.a.d(bVar, v0Var, v0Var2);
    }

    public final boolean f(b bVar, v0 v0Var, v0 v0Var2) {
        m0.n.b.i.e(bVar, "<this>");
        m0.n.b.i.e(v0Var, "subType");
        m0.n.b.i.e(v0Var2, "superType");
        return e.g(e.a, bVar, v0Var, v0Var2, false, 8);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [m0.r.t.a.r.m.v] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.m.a0 g(m0.r.t.a.r.m.a0 r18) {
        /*
            r17 = this;
            java.lang.String r0 = "type"
            r1 = r18
            m0.n.b.i.e(r1, r0)
            m0.r.t.a.r.m.j0 r0 = r18.I0()
            boolean r2 = r0 instanceof m0.r.t.a.r.j.o.a.c
            r3 = 1
            r4 = 0
            r5 = 10
            r6 = 0
            if (r2 == 0) goto L_0x0095
            m0.r.t.a.r.j.o.a.c r0 = (m0.r.t.a.r.j.o.a.c) r0
            m0.r.t.a.r.m.m0 r2 = r0.a
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = r2.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r7 != r8) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = r4
        L_0x0022:
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r6
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            m0.r.t.a.r.m.v r2 = r2.getType()
            if (r2 != 0) goto L_0x0031
        L_0x002f:
            r10 = r6
            goto L_0x0036
        L_0x0031:
            m0.r.t.a.r.m.v0 r6 = r2.L0()
            goto L_0x002f
        L_0x0036:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r2 = r0.b
            if (r2 != 0) goto L_0x007c
            m0.r.t.a.r.m.m0 r12 = r0.a
            java.util.Collection r2 = r0.b()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = i0.j.f.p.h.K(r2, r5)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r2.next()
            m0.r.t.a.r.m.v r4 = (m0.r.t.a.r.m.v) r4
            m0.r.t.a.r.m.v0 r4 = r4.L0()
            r3.add(r4)
            goto L_0x004d
        L_0x0061:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r2 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r14 = 0
            java.lang.String r4 = "projection"
            m0.n.b.i.e(r12, r4)
            java.lang.String r4 = "supertypes"
            m0.n.b.i.e(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$1 r13 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$1
            r13.<init>(r3)
            r15 = 0
            r16 = 8
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0.b = r2
        L_0x007c:
            m0.r.t.a.r.m.x0.g r2 = new m0.r.t.a.r.m.x0.g
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r8 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r9 = r0.b
            m0.n.b.i.c(r9)
            m0.r.t.a.r.c.r0.f r11 = r18.getAnnotations()
            boolean r12 = r18.J0()
            r13 = 0
            r14 = 32
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0095:
            boolean r2 = r0 instanceof m0.r.t.a.r.j.p.n
            if (r2 == 0) goto L_0x00de
            m0.r.t.a.r.j.p.n r0 = (m0.r.t.a.r.j.p.n) r0
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = i0.j.f.p.h.K(r6, r5)
            r0.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x00ab:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r2.next()
            m0.r.t.a.r.m.v r3 = (m0.r.t.a.r.m.v) r3
            boolean r5 = r18.J0()
            m0.r.t.a.r.m.v r3 = m0.r.t.a.r.m.s0.j(r3, r5)
            java.lang.String r5 = "makeNullableAsSpecified(it, type.isMarkedNullable)"
            m0.n.b.i.d(r3, r5)
            r0.add(r3)
            goto L_0x00ab
        L_0x00c8:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r2 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r2.<init>(r0)
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.c.r0.f r0 = r18.getAnnotations()
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.c
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = r18.o()
            m0.r.t.a.r.m.a0 r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.h(r0, r2, r3, r4, r1)
            return r0
        L_0x00de:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r2 == 0) goto L_0x013b
            boolean r2 = r18.J0()
            if (r2 == 0) goto L_0x013b
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r0
            java.util.LinkedHashSet<m0.r.t.a.r.m.v> r1 = r0.b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = i0.j.f.p.h.K(r1, r5)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x010e
            java.lang.Object r4 = r1.next()
            m0.r.t.a.r.m.v r4 = (m0.r.t.a.r.m.v) r4
            m0.r.t.a.r.m.v r4 = m0.r.t.a.r.m.a1.a.I2(r4)
            r2.add(r4)
            r4 = r3
            goto L_0x00f9
        L_0x010e:
            if (r4 != 0) goto L_0x0111
            goto L_0x0132
        L_0x0111:
            m0.r.t.a.r.m.v r1 = r0.a
            if (r1 != 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            m0.r.t.a.r.m.v r6 = m0.r.t.a.r.m.a1.a.I2(r1)
        L_0x011a:
            java.lang.String r1 = "typesToIntersect"
            m0.n.b.i.e(r2, r1)
            r2.isEmpty()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r2)
            r1.hashCode()
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r2 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r2.<init>(r1)
            r2.a = r6
            r6 = r2
        L_0x0132:
            if (r6 != 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r0 = r6
        L_0x0136:
            m0.r.t.a.r.m.a0 r0 = r0.f()
            goto L_0x013c
        L_0x013b:
            r0 = r1
        L_0x013c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.x0.i.g(m0.r.t.a.r.m.a0):m0.r.t.a.r.m.a0");
    }

    public v0 h(v0 v0Var) {
        v0 v0Var2;
        m0.n.b.i.e(v0Var, "type");
        if (v0Var instanceof a0) {
            v0Var2 = g((a0) v0Var);
        } else if (v0Var instanceof q) {
            q qVar = (q) v0Var;
            a0 g = g(qVar.d);
            a0 g2 = g(qVar.q);
            if (g == qVar.d && g2 == qVar.q) {
                v0Var2 = v0Var;
            } else {
                KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
                v0Var2 = KotlinTypeFactory.c(g, g2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return h.a2(v0Var2, v0Var);
    }
}
