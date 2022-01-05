package m0.r.t.a.r.e.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.e.b.f;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class n implements ExternalOverridabilityCondition {
    public static final boolean c(a aVar, a aVar2) {
        i.e(aVar, "superDescriptor");
        i.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof JavaMethodDescriptor) || !(aVar instanceof r)) {
            return false;
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
        javaMethodDescriptor.h().size();
        r rVar = (r) aVar;
        rVar.h().size();
        List<o0> h = javaMethodDescriptor.a().h();
        i.d(h, "subDescriptor.original.valueParameters");
        List<o0> h2 = rVar.a().h();
        i.d(h2, "superDescriptor.original.valueParameters");
        Iterator it = ((ArrayList) g.F0(h, h2)).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            o0 o0Var = (o0) pair.c;
            o0 o0Var2 = (o0) pair.d;
            i.d(o0Var, "subParameter");
            boolean z = d((r) aVar2, o0Var) instanceof f.c;
            i.d(o0Var2, "superParameter");
            if (z != (d(rVar, o0Var2) instanceof f.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [m0.r.t.a.r.c.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.e.b.f d(m0.r.t.a.r.c.r r6, m0.r.t.a.r.c.o0 r7) {
        /*
            java.lang.String r0 = "f"
            m0.n.b.i.e(r6, r0)
            m0.r.t.a.r.g.d r0 = r6.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "remove"
            boolean r0 = m0.n.b.i.a(r0, r1)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r6.h()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x00cb
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r6, r0)
            m0.n.b.i.e(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m(r6)
            m0.r.t.a.r.c.i r0 = r0.b()
            boolean r0 = r0 instanceof m0.r.t.a.r.e.a.t.d
            if (r0 != 0) goto L_0x003f
            boolean r0 = m0.r.t.a.r.b.f.A(r6)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            goto L_0x00cb
        L_0x0044:
            m0.r.t.a.r.c.r r0 = r6.a()
            java.util.List r0 = r0.h()
            java.lang.String r4 = "f.original.valueParameters"
            m0.n.b.i.d(r0, r4)
            java.lang.Object r0 = m0.j.g.j0(r0)
            m0.r.t.a.r.c.o0 r0 = (m0.r.t.a.r.c.o0) r0
            m0.r.t.a.r.m.v r0 = r0.getType()
            java.lang.String r4 = "f.original.valueParameters.single().type"
            m0.n.b.i.d(r0, r4)
            m0.r.t.a.r.e.b.f r0 = m0.r.t.a.r.e.b.n.d(r0)
            boolean r4 = r0 instanceof m0.r.t.a.r.e.b.f.c
            if (r4 == 0) goto L_0x006b
            m0.r.t.a.r.e.b.f$c r0 = (m0.r.t.a.r.e.b.f.c) r0
            goto L_0x006c
        L_0x006b:
            r0 = r1
        L_0x006c:
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0072
        L_0x0070:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r0 = r0.j
        L_0x0072:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
            if (r0 == r4) goto L_0x0077
            goto L_0x00cb
        L_0x0077:
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m
            m0.r.t.a.r.c.r r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.a(r6)
            if (r0 != 0) goto L_0x0080
            goto L_0x00cb
        L_0x0080:
            m0.r.t.a.r.c.r r4 = r0.a()
            java.util.List r4 = r4.h()
            java.lang.String r5 = "overridden.original.valueParameters"
            m0.n.b.i.d(r4, r5)
            java.lang.Object r4 = m0.j.g.j0(r4)
            m0.r.t.a.r.c.o0 r4 = (m0.r.t.a.r.c.o0) r4
            m0.r.t.a.r.m.v r4 = r4.getType()
            java.lang.String r5 = "overridden.original.valueParameters.single().type"
            m0.n.b.i.d(r4, r5)
            m0.r.t.a.r.e.b.f r4 = m0.r.t.a.r.e.b.n.d(r4)
            m0.r.t.a.r.c.i r0 = r0.b()
            java.lang.String r5 = "overridden.containingDeclaration"
            m0.n.b.i.d(r0, r5)
            m0.r.t.a.r.g.c r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.i(r0)
            m0.r.t.a.r.g.b r5 = m0.r.t.a.r.b.g.a.R
            m0.r.t.a.r.g.c r5 = r5.j()
            boolean r0 = m0.n.b.i.a(r0, r5)
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r4 instanceof m0.r.t.a.r.e.b.f.b
            if (r0 == 0) goto L_0x00cb
            m0.r.t.a.r.e.b.f$b r4 = (m0.r.t.a.r.e.b.f.b) r4
            java.lang.String r0 = r4.j
            java.lang.String r4 = "java/lang/Object"
            boolean r0 = m0.n.b.i.a(r0, r4)
            if (r0 == 0) goto L_0x00cb
            r0 = r2
            goto L_0x00cc
        L_0x00cb:
            r0 = r3
        L_0x00cc:
            java.lang.String r4 = "valueParameterDescriptor.type"
            if (r0 != 0) goto L_0x0135
            java.util.List r0 = r6.h()
            int r0 = r0.size()
            if (r0 == r2) goto L_0x00db
            goto L_0x0126
        L_0x00db:
            m0.r.t.a.r.c.i r0 = r6.b()
            boolean r5 = r0 instanceof m0.r.t.a.r.c.d
            if (r5 == 0) goto L_0x00e6
            m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
            goto L_0x00e7
        L_0x00e6:
            r0 = r1
        L_0x00e7:
            if (r0 != 0) goto L_0x00ea
            goto L_0x0126
        L_0x00ea:
            java.util.List r6 = r6.h()
            java.lang.String r5 = "f.valueParameters"
            m0.n.b.i.d(r6, r5)
            java.lang.Object r6 = m0.j.g.j0(r6)
            m0.r.t.a.r.c.o0 r6 = (m0.r.t.a.r.c.o0) r6
            m0.r.t.a.r.m.v r6 = r6.getType()
            m0.r.t.a.r.m.j0 r6 = r6.I0()
            m0.r.t.a.r.c.f r6 = r6.c()
            boolean r5 = r6 instanceof m0.r.t.a.r.c.d
            if (r5 == 0) goto L_0x010c
            r1 = r6
            m0.r.t.a.r.c.d r1 = (m0.r.t.a.r.c.d) r1
        L_0x010c:
            if (r1 != 0) goto L_0x010f
            goto L_0x0126
        L_0x010f:
            boolean r6 = m0.r.t.a.r.b.f.H(r0)
            if (r6 == 0) goto L_0x0124
            m0.r.t.a.r.g.b r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r0)
            m0.r.t.a.r.g.b r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r1)
            boolean r6 = m0.n.b.i.a(r6, r0)
            if (r6 == 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r2 = r3
        L_0x0125:
            r3 = r2
        L_0x0126:
            if (r3 == 0) goto L_0x0129
            goto L_0x0135
        L_0x0129:
            m0.r.t.a.r.m.v r6 = r7.getType()
            m0.n.b.i.d(r6, r4)
            m0.r.t.a.r.e.b.f r6 = m0.r.t.a.r.e.b.n.d(r6)
            goto L_0x0144
        L_0x0135:
            m0.r.t.a.r.m.v r6 = r7.getType()
            m0.n.b.i.d(r6, r4)
            m0.r.t.a.r.m.v r6 = m0.r.t.a.r.m.a1.a.I2(r6)
            m0.r.t.a.r.e.b.f r6 = m0.r.t.a.r.e.b.n.d(r6)
        L_0x0144:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.a.n.d(m0.r.t.a.r.c.r, m0.r.t.a.r.c.o0):m0.r.t.a.r.e.b.f");
    }

    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
        if (m0.n.b.i.a(r0, m0.r.t.a.r.e.b.n.b(r2, false, false, 2)) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.k.contains(r0) == false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(m0.r.t.a.r.c.a r8, m0.r.t.a.r.c.a r9, m0.r.t.a.r.c.d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "superDescriptor"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "subDescriptor"
            m0.n.b.i.e(r9, r0)
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            r1 = 0
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r9 instanceof m0.r.t.a.r.c.r
            if (r0 == 0) goto L_0x00bb
            boolean r0 = m0.r.t.a.r.b.f.A(r9)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bb
        L_0x001b:
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m
            r2 = r9
            m0.r.t.a.r.c.r r2 = (m0.r.t.a.r.c.r) r2
            m0.r.t.a.r.g.d r3 = r2.getName()
            java.lang.String r4 = "subDescriptor.name"
            m0.n.b.i.d(r3, r4)
            boolean r0 = r0.b(r3)
            if (r0 != 0) goto L_0x0047
            m0.r.t.a.r.e.a.b r0 = m0.r.t.a.r.e.a.b.m
            m0.r.t.a.r.g.d r0 = r2.getName()
            m0.n.b.i.d(r0, r4)
            java.lang.String r3 = "<this>"
            m0.n.b.i.e(r0, r3)
            java.util.List<m0.r.t.a.r.g.d> r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.k
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x00bb
        L_0x0047:
            r0 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = i0.j.f.p.h.y1(r0)
            boolean r3 = r2.u0()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r8 instanceof m0.r.t.a.r.c.r
            r5 = 0
            if (r4 == 0) goto L_0x005f
            r6 = r8
            m0.r.t.a.r.c.r r6 = (m0.r.t.a.r.c.r) r6
            goto L_0x0060
        L_0x005f:
            r6 = r5
        L_0x0060:
            if (r6 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            boolean r5 = r6.u0()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
        L_0x006b:
            boolean r3 = m0.n.b.i.a(r3, r5)
            r5 = 1
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x00ba
            boolean r3 = r2.u0()
            if (r3 != 0) goto L_0x007c
            goto L_0x00ba
        L_0x007c:
            boolean r3 = r10 instanceof m0.r.t.a.r.e.a.t.d
            if (r3 == 0) goto L_0x00bb
            m0.r.t.a.r.c.r r3 = r2.c0()
            if (r3 == 0) goto L_0x0087
            goto L_0x00bb
        L_0x0087:
            if (r0 == 0) goto L_0x00bb
            boolean r10 = i0.j.f.p.h.Q1(r10, r0)
            if (r10 == 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            boolean r10 = r0 instanceof m0.r.t.a.r.c.r
            if (r10 == 0) goto L_0x00ba
            if (r4 == 0) goto L_0x00ba
            m0.r.t.a.r.c.r r0 = (m0.r.t.a.r.c.r) r0
            m0.r.t.a.r.c.r r10 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.a(r0)
            if (r10 == 0) goto L_0x00ba
            r10 = 2
            java.lang.String r0 = m0.r.t.a.r.e.b.n.b(r2, r1, r1, r10)
            r2 = r8
            m0.r.t.a.r.c.r r2 = (m0.r.t.a.r.c.r) r2
            m0.r.t.a.r.c.r r2 = r2.a()
            java.lang.String r3 = "superDescriptor.original"
            m0.n.b.i.d(r2, r3)
            java.lang.String r10 = m0.r.t.a.r.e.b.n.b(r2, r1, r1, r10)
            boolean r10 = m0.n.b.i.a(r0, r10)
            if (r10 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r1 = r5
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r8 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r8
        L_0x00c0:
            boolean r8 = c(r8, r9)
            if (r8 == 0) goto L_0x00c9
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r8 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r8
        L_0x00c9:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r8 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.a.n.b(m0.r.t.a.r.c.a, m0.r.t.a.r.c.a, m0.r.t.a.r.c.d):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }
}
