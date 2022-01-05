package m0.r.t.a.r.j;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.j.g;
import m0.n.a.p;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class b {
    public static final b a = new b();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        if (r8.m(r7, r6, (m0.r.t.a.r.c.d) null, true).c() == r2) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(m0.r.t.a.r.c.i r6, m0.r.t.a.r.c.i r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m0.r.t.a.r.c.d
            if (r0 == 0) goto L_0x001a
            boolean r0 = r7 instanceof m0.r.t.a.r.c.d
            if (r0 == 0) goto L_0x001a
            m0.r.t.a.r.c.d r6 = (m0.r.t.a.r.c.d) r6
            m0.r.t.a.r.c.d r7 = (m0.r.t.a.r.c.d) r7
            m0.r.t.a.r.m.j0 r6 = r6.i()
            m0.r.t.a.r.m.j0 r7 = r7.i()
            boolean r6 = m0.n.b.i.a(r6, r7)
            goto L_0x00fd
        L_0x001a:
            boolean r0 = r6 instanceof m0.r.t.a.r.c.m0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r7 instanceof m0.r.t.a.r.c.m0
            if (r0 == 0) goto L_0x002e
            m0.r.t.a.r.c.m0 r6 = (m0.r.t.a.r.c.m0) r6
            m0.r.t.a.r.c.m0 r7 = (m0.r.t.a.r.c.m0) r7
            kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1 r9 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.c
            boolean r6 = r5.b(r6, r7, r8, r9)
            goto L_0x00fd
        L_0x002e:
            boolean r0 = r6 instanceof m0.r.t.a.r.c.a
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r7 instanceof m0.r.t.a.r.c.a
            if (r0 == 0) goto L_0x00e0
            m0.r.t.a.r.c.a r6 = (m0.r.t.a.r.c.a) r6
            m0.r.t.a.r.c.a r7 = (m0.r.t.a.r.c.a) r7
            m0.r.t.a.r.m.x0.e$a r0 = m0.r.t.a.r.m.x0.e.a.a
            r1 = 0
            java.lang.String r2 = "a"
            m0.n.b.i.e(r6, r2)
            java.lang.String r2 = "b"
            m0.n.b.i.e(r7, r2)
            java.lang.String r2 = "kotlinTypeRefiner"
            m0.n.b.i.e(r0, r2)
            boolean r2 = m0.n.b.i.a(r6, r7)
            r3 = 1
            if (r2 == 0) goto L_0x0055
            goto L_0x00dc
        L_0x0055:
            m0.r.t.a.r.g.d r2 = r6.getName()
            m0.r.t.a.r.g.d r4 = r7.getName()
            boolean r2 = m0.n.b.i.a(r2, r4)
            if (r2 != 0) goto L_0x0065
            goto L_0x00de
        L_0x0065:
            if (r9 == 0) goto L_0x0080
            boolean r9 = r6 instanceof m0.r.t.a.r.c.s
            if (r9 == 0) goto L_0x0080
            boolean r9 = r7 instanceof m0.r.t.a.r.c.s
            if (r9 == 0) goto L_0x0080
            r9 = r6
            m0.r.t.a.r.c.s r9 = (m0.r.t.a.r.c.s) r9
            boolean r9 = r9.K()
            r2 = r7
            m0.r.t.a.r.c.s r2 = (m0.r.t.a.r.c.s) r2
            boolean r2 = r2.K()
            if (r9 == r2) goto L_0x0080
            goto L_0x00de
        L_0x0080:
            m0.r.t.a.r.c.i r9 = r6.b()
            m0.r.t.a.r.c.i r2 = r7.b()
            boolean r9 = m0.n.b.i.a(r9, r2)
            if (r9 == 0) goto L_0x00a0
            if (r8 != 0) goto L_0x0091
            goto L_0x00de
        L_0x0091:
            m0.r.t.a.r.c.h0 r9 = r5.d(r6)
            m0.r.t.a.r.c.h0 r2 = r5.d(r7)
            boolean r9 = m0.n.b.i.a(r9, r2)
            if (r9 != 0) goto L_0x00a0
            goto L_0x00de
        L_0x00a0:
            boolean r9 = m0.r.t.a.r.j.d.t(r6)
            if (r9 != 0) goto L_0x00de
            boolean r9 = m0.r.t.a.r.j.d.t(r7)
            if (r9 == 0) goto L_0x00ad
            goto L_0x00de
        L_0x00ad:
            kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1 r9 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1.c
            boolean r9 = r5.c(r6, r7, r9, r8)
            if (r9 != 0) goto L_0x00b6
            goto L_0x00de
        L_0x00b6:
            kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1 r9 = new kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1
            r9.<init>(r5, r8, r6, r7)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r8 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil
            r8.<init>(r9, r0)
            java.lang.String r9 = "fun areCallableDescriptorsEquivalent(\n        a: CallableDescriptor,\n        b: CallableDescriptor,\n        allowCopiesFromTheSameDeclaration: Boolean,\n        distinguishExpectsAndNonExpects: Boolean = true,\n        ignoreReturnType: Boolean = false,\n        kotlinTypeRefiner: KotlinTypeRefiner\n    ): Boolean {\n        if (a == b) return true\n        if (a.name != b.name) return false\n        if (distinguishExpectsAndNonExpects && a is MemberDescriptor && b is MemberDescriptor && a.isExpect != b.isExpect) return false\n        if (a.containingDeclaration == b.containingDeclaration) {\n            if (!allowCopiesFromTheSameDeclaration) return false\n            if (a.singleSource() != b.singleSource()) return false\n        }\n\n        // Distinct locals are not equivalent\n        if (DescriptorUtils.isLocal(a) || DescriptorUtils.isLocal(b)) return false\n\n        if (!ownersEquivalent(a, b, { _, _ -> false }, allowCopiesFromTheSameDeclaration)) return false\n\n        val overridingUtil = OverridingUtil.create(kotlinTypeRefiner) eq@{ c1, c2 ->\n            if (c1 == c2) return@eq true\n\n            val d1 = c1.declarationDescriptor\n            val d2 = c2.declarationDescriptor\n\n            if (d1 !is TypeParameterDescriptor || d2 !is TypeParameterDescriptor) return@eq false\n\n            areTypeParametersEquivalent(d1, d2, allowCopiesFromTheSameDeclaration) { x, y -> x == a && y == b }\n        }\n\n        return overridingUtil.isOverridableBy(a, b, null, !ignoreReturnType).result == OverrideCompatibilityInfo.Result.OVERRIDABLE\n                && overridingUtil.isOverridableBy(b, a, null, !ignoreReturnType).result == OverrideCompatibilityInfo.Result.OVERRIDABLE\n\n    }"
            m0.n.b.i.d(r8, r9)
            r9 = 0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = r8.m(r6, r7, r9, r3)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            if (r0 != r2) goto L_0x00de
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r6 = r8.m(r7, r6, r9, r3)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r6 = r6.c()
            if (r6 != r2) goto L_0x00de
        L_0x00dc:
            r6 = r3
            goto L_0x00fd
        L_0x00de:
            r6 = r1
            goto L_0x00fd
        L_0x00e0:
            boolean r8 = r6 instanceof m0.r.t.a.r.c.v
            if (r8 == 0) goto L_0x00f9
            boolean r8 = r7 instanceof m0.r.t.a.r.c.v
            if (r8 == 0) goto L_0x00f9
            m0.r.t.a.r.c.v r6 = (m0.r.t.a.r.c.v) r6
            m0.r.t.a.r.g.b r6 = r6.d()
            m0.r.t.a.r.c.v r7 = (m0.r.t.a.r.c.v) r7
            m0.r.t.a.r.g.b r7 = r7.d()
            boolean r6 = m0.n.b.i.a(r6, r7)
            goto L_0x00fd
        L_0x00f9:
            boolean r6 = m0.n.b.i.a(r6, r7)
        L_0x00fd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.j.b.a(m0.r.t.a.r.c.i, m0.r.t.a.r.c.i, boolean, boolean):boolean");
    }

    public final boolean b(m0 m0Var, m0 m0Var2, boolean z, p<? super i, ? super i, Boolean> pVar) {
        if (m0.n.b.i.a(m0Var, m0Var2)) {
            return true;
        }
        if (m0.n.b.i.a(m0Var.b(), m0Var2.b()) || !c(m0Var, m0Var2, pVar, z)) {
            return false;
        }
        if (m0Var.g() == m0Var2.g()) {
            return true;
        }
        return false;
    }

    public final boolean c(i iVar, i iVar2, p<? super i, ? super i, Boolean> pVar, boolean z) {
        i b = iVar.b();
        i b2 = iVar2.b();
        if ((b instanceof CallableMemberDescriptor) || (b2 instanceof CallableMemberDescriptor)) {
            return pVar.invoke(b, b2).booleanValue();
        }
        return a(b, b2, z, true);
    }

    public final h0 d(a aVar) {
        while (aVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) aVar;
            if (callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> e = callableMemberDescriptor.e();
            m0.n.b.i.d(e, "overriddenDescriptors");
            aVar = (CallableMemberDescriptor) g.k0(e);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.r();
    }
}
