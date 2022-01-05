package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$declaredField$1 extends Lambda implements l<d, c0> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredField$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.c = lazyJavaScope;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0115, code lost:
        if (m0.r.t.a.r.b.i.a(r4) != false) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            m0.r.t.a.r.g.d r14 = (m0.r.t.a.r.g.d) r14
            java.lang.String r0 = "name"
            m0.n.b.i.e(r14, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope r0 = r13.c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope r1 = r0.d
            if (r1 == 0) goto L_0x0017
            m0.r.t.a.r.l.g<m0.r.t.a.r.g.d, m0.r.t.a.r.c.c0> r0 = r1.h
            java.lang.Object r14 = r0.invoke(r14)
            m0.r.t.a.r.c.c0 r14 = (m0.r.t.a.r.c.c0) r14
            goto L_0x0141
        L_0x0017:
            m0.r.t.a.r.l.h<m0.r.t.a.r.e.a.u.g.a> r0 = r0.f
            java.lang.Object r0 = r0.invoke()
            m0.r.t.a.r.e.a.u.g.a r0 = (m0.r.t.a.r.e.a.u.g.a) r0
            m0.r.t.a.r.e.a.w.n r14 = r0.c(r14)
            r0 = 0
            if (r14 == 0) goto L_0x0140
            boolean r1 = r14.F()
            if (r1 != 0) goto L_0x0140
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope r1 = r13.c
            java.util.Objects.requireNonNull(r1)
            boolean r2 = r14.isFinal()
            r3 = 1
            r8 = r2 ^ 1
            m0.r.t.a.r.e.a.u.c r2 = r1.c
            m0.r.t.a.r.c.r0.f r5 = i0.j.f.p.h.z3(r2, r14)
            m0.r.t.a.r.c.i r4 = r1.q()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r6 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            m0.r.t.a.r.c.q0 r2 = r14.getVisibility()
            m0.r.t.a.r.c.p r7 = i0.j.f.p.h.h4(r2)
            m0.r.t.a.r.g.d r9 = r14.getName()
            m0.r.t.a.r.e.a.u.c r2 = r1.c
            m0.r.t.a.r.e.a.u.a r2 = r2.a
            m0.r.t.a.r.e.a.v.b r2 = r2.j
            m0.r.t.a.r.e.a.v.a r10 = r2.a(r14)
            boolean r2 = r14.isFinal()
            r12 = 0
            if (r2 == 0) goto L_0x0069
            boolean r2 = r14.P()
            if (r2 == 0) goto L_0x0069
            r11 = r3
            goto L_0x006a
        L_0x0069:
            r11 = r12
        L_0x006a:
            m0.r.t.a.r.e.a.t.f r2 = m0.r.t.a.r.e.a.t.f.M0(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r4 = "create(\n            ownerDescriptor, annotations, Modality.FINAL, field.visibility.toDescriptorVisibility(), isVar, field.name,\n            c.components.sourceElementFactory.source(field), /* isConst = */ field.isFinalStatic\n        )"
            m0.n.b.i.d(r2, r4)
            r2.K0(r0, r0, r0, r0)
            m0.r.t.a.r.e.a.u.c r4 = r1.c
            m0.r.t.a.r.e.a.u.h.b r4 = r4.e
            m0.r.t.a.r.e.a.w.w r5 = r14.getType()
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r6 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r7 = 3
            m0.r.t.a.r.e.a.u.h.a r6 = m0.r.t.a.r.e.a.u.h.c.c(r6, r12, r0, r7)
            m0.r.t.a.r.m.v r4 = r4.e(r5, r6)
            boolean r5 = m0.r.t.a.r.b.f.I(r4)
            if (r5 != 0) goto L_0x0095
            boolean r5 = m0.r.t.a.r.b.f.K(r4)
            if (r5 == 0) goto L_0x00ae
        L_0x0095:
            boolean r5 = r14.isFinal()
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r14.P()
            if (r5 == 0) goto L_0x00a3
            r5 = r3
            goto L_0x00a4
        L_0x00a3:
            r5 = r12
        L_0x00a4:
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r14.N()
            if (r5 == 0) goto L_0x00ae
            r5 = r3
            goto L_0x00af
        L_0x00ae:
            r5 = r12
        L_0x00af:
            if (r5 == 0) goto L_0x00ba
            m0.r.t.a.r.m.v r4 = m0.r.t.a.r.m.s0.i(r4)
            java.lang.String r5 = "makeNotNullable(propertyType)"
            m0.n.b.i.d(r4, r5)
        L_0x00ba:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.c
            m0.r.t.a.r.c.f0 r6 = r1.p()
            r2.L0(r4, r5, r6, r0)
            m0.r.t.a.r.m.v r4 = r2.getType()
            int r5 = m0.r.t.a.r.j.d.a
            if (r4 == 0) goto L_0x013a
            boolean r0 = r2.i0()
            if (r0 != 0) goto L_0x0118
            boolean r0 = i0.j.f.p.h.h2(r4)
            if (r0 == 0) goto L_0x00d8
            goto L_0x0118
        L_0x00d8:
            boolean r0 = m0.r.t.a.r.m.s0.b(r4)
            if (r0 == 0) goto L_0x00df
            goto L_0x0119
        L_0x00df:
            m0.r.t.a.r.b.f r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r2)
            boolean r5 = m0.r.t.a.r.b.f.I(r4)
            if (r5 != 0) goto L_0x0119
            m0.r.t.a.r.m.x0.d r5 = m0.r.t.a.r.m.x0.d.a
            m0.r.t.a.r.m.a0 r6 = r0.v()
            boolean r6 = r5.b(r6, r4)
            if (r6 != 0) goto L_0x0119
            java.lang.String r6 = "Number"
            m0.r.t.a.r.c.d r6 = r0.k(r6)
            m0.r.t.a.r.m.a0 r6 = r6.q()
            boolean r6 = r5.b(r6, r4)
            if (r6 != 0) goto L_0x0119
            m0.r.t.a.r.m.a0 r0 = r0.f()
            boolean r0 = r5.b(r0, r4)
            if (r0 != 0) goto L_0x0119
            m0.r.t.a.r.b.i r0 = m0.r.t.a.r.b.i.a
            boolean r0 = m0.r.t.a.r.b.i.a(r4)
            if (r0 == 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r3 = r12
        L_0x0119:
            if (r3 == 0) goto L_0x012d
            m0.r.t.a.r.e.a.u.c r0 = r1.c
            m0.r.t.a.r.e.a.u.a r0 = r0.a
            m0.r.t.a.r.l.l r0 = r0.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
            r3.<init>(r1, r14, r2)
            m0.r.t.a.r.l.i r14 = r0.e(r3)
            r2.H0(r14)
        L_0x012d:
            m0.r.t.a.r.e.a.u.c r14 = r1.c
            m0.r.t.a.r.e.a.u.a r14 = r14.a
            m0.r.t.a.r.e.a.s.d r14 = r14.g
            m0.r.t.a.r.e.a.s.d$a r14 = (m0.r.t.a.r.e.a.s.d.a) r14
            java.util.Objects.requireNonNull(r14)
            r14 = r2
            goto L_0x0141
        L_0x013a:
            r14 = 62
            m0.r.t.a.r.j.d.a(r14)
            throw r0
        L_0x0140:
            r14 = r0
        L_0x0141:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1.invoke(java.lang.Object):java.lang.Object");
    }
}
