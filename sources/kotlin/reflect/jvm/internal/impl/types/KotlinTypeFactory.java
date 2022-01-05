package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.b0;
import m0.r.t.a.r.m.g0;
import m0.r.t.a.r.m.h0;
import m0.r.t.a.r.m.i0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.r;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: KotlinTypeFactory.kt */
public final class KotlinTypeFactory {
    public static final KotlinTypeFactory a = new KotlinTypeFactory();

    /* compiled from: KotlinTypeFactory.kt */
    public static final class a {
        public final a0 a;
        public final j0 b;

        public a(a0 a0Var, j0 j0Var) {
            this.a = a0Var;
            this.b = j0Var;
        }
    }

    static {
        KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 kotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.c;
    }

    public static final a a(KotlinTypeFactory kotlinTypeFactory, j0 j0Var, e eVar, List list) {
        f fVar;
        a aVar;
        f c = j0Var.c();
        if (c == null) {
            fVar = null;
        } else {
            fVar = eVar.e(c);
        }
        if (fVar == null) {
            return null;
        }
        if (fVar instanceof l0) {
            aVar = new a(b((l0) fVar, list), (j0) null);
        } else {
            j0 a2 = fVar.i().a(eVar);
            i.d(a2, "descriptor.typeConstructor.refine(kotlinTypeRefiner)");
            aVar = new a((a0) null, a2);
        }
        return aVar;
    }

    public static final a0 b(l0 l0Var, List<? extends m0> list) {
        i.e(l0Var, "<this>");
        i.e(list, "arguments");
        g0 g0Var = new g0(i0.a.a, false);
        h0 a2 = h0.a((h0) null, l0Var, list);
        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
        m0.r.t.a.r.c.r0.f fVar = f.a.b;
        i.e(a2, "typeAliasExpansion");
        i.e(fVar, "annotations");
        return g0Var.d(a2, fVar, false, 0, true);
    }

    public static final v0 c(a0 a0Var, a0 a0Var2) {
        i.e(a0Var, "lowerBound");
        i.e(a0Var2, "upperBound");
        if (i.a(a0Var, a0Var2)) {
            return a0Var;
        }
        return new r(a0Var, a0Var2);
    }

    public static final a0 d(m0.r.t.a.r.c.r0.f fVar, IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        i.e(fVar, "annotations");
        i.e(integerLiteralTypeConstructor, "constructor");
        EmptyList emptyList = EmptyList.c;
        MemberScope c = p.c("Scope for integer literal type", true);
        i.d(c, "createErrorScope(\"Scope for integer literal type\", true)");
        return h(fVar, integerLiteralTypeConstructor, emptyList, z, c);
    }

    public static final a0 e(m0.r.t.a.r.c.r0.f fVar, d dVar, List<? extends m0> list) {
        i.e(fVar, "annotations");
        i.e(dVar, "descriptor");
        i.e(list, "arguments");
        j0 i = dVar.i();
        i.d(i, "descriptor.typeConstructor");
        return g(fVar, i, list, false, (e) null, 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: m0.r.t.a.r.c.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: m0.r.t.a.r.c.t0.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: m0.r.t.a.r.c.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: m0.r.t.a.r.c.t0.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.m.a0 f(m0.r.t.a.r.c.r0.f r8, m0.r.t.a.r.m.j0 r9, java.util.List<? extends m0.r.t.a.r.m.m0> r10, boolean r11, m0.r.t.a.r.m.x0.e r12) {
        /*
            java.lang.String r0 = "annotations"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "constructor"
            m0.n.b.i.e(r9, r0)
            java.lang.String r0 = "arguments"
            m0.n.b.i.e(r10, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0034
            if (r11 != 0) goto L_0x0034
            m0.r.t.a.r.c.f r0 = r9.c()
            if (r0 == 0) goto L_0x0034
            m0.r.t.a.r.c.f r8 = r9.c()
            m0.n.b.i.c(r8)
            m0.r.t.a.r.m.a0 r8 = r8.q()
            java.lang.String r9 = "constructor.declarationDescriptor!!.defaultType"
            m0.n.b.i.d(r8, r9)
            return r8
        L_0x0034:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r1 = a
            m0.r.t.a.r.c.f r0 = r9.c()
            boolean r2 = r0 instanceof m0.r.t.a.r.c.m0
            if (r2 == 0) goto L_0x0049
            m0.r.t.a.r.m.a0 r12 = r0.q()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = r12.o()
        L_0x0046:
            r6 = r12
            goto L_0x00e9
        L_0x0049:
            boolean r2 = r0 instanceof m0.r.t.a.r.c.d
            if (r2 == 0) goto L_0x00bc
            if (r12 != 0) goto L_0x0057
            m0.r.t.a.r.c.u r12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.k(r0)
            m0.r.t.a.r.m.x0.e r12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.j(r12)
        L_0x0057:
            boolean r2 = r10.isEmpty()
            r3 = 0
            java.lang.String r4 = "kotlinTypeRefiner"
            java.lang.String r5 = "<this>"
            if (r2 == 0) goto L_0x0088
            m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
            m0.n.b.i.e(r0, r5)
            m0.n.b.i.e(r12, r4)
            m0.n.b.i.e(r0, r5)
            m0.n.b.i.e(r12, r4)
            boolean r2 = r0 instanceof m0.r.t.a.r.c.t0.s
            if (r2 == 0) goto L_0x0077
            r3 = r0
            m0.r.t.a.r.c.t0.s r3 = (m0.r.t.a.r.c.t0.s) r3
        L_0x0077:
            if (r3 != 0) goto L_0x0083
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = r0.z0()
            java.lang.String r0 = "this.unsubstitutedMemberScope"
            m0.n.b.i.d(r12, r0)
            goto L_0x0046
        L_0x0083:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = r3.E(r12)
            goto L_0x0046
        L_0x0088:
            m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
            m0.r.t.a.r.m.l0$a r2 = m0.r.t.a.r.m.l0.b
            m0.r.t.a.r.m.p0 r2 = r2.b(r9, r10)
            m0.n.b.i.e(r0, r5)
            java.lang.String r6 = "typeSubstitution"
            m0.n.b.i.e(r2, r6)
            m0.n.b.i.e(r12, r4)
            m0.n.b.i.e(r0, r5)
            m0.n.b.i.e(r2, r6)
            m0.n.b.i.e(r12, r4)
            boolean r4 = r0 instanceof m0.r.t.a.r.c.t0.s
            if (r4 == 0) goto L_0x00ab
            r3 = r0
            m0.r.t.a.r.c.t0.s r3 = (m0.r.t.a.r.c.t0.s) r3
        L_0x00ab:
            if (r3 != 0) goto L_0x00b7
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = r0.Z(r2)
            java.lang.String r0 = "this.getMemberScope(\n                typeSubstitution\n            )"
            m0.n.b.i.d(r12, r0)
            goto L_0x0046
        L_0x00b7:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = r3.D(r2, r12)
            goto L_0x0046
        L_0x00bc:
            boolean r12 = r0 instanceof m0.r.t.a.r.c.l0
            if (r12 == 0) goto L_0x00d8
            m0.r.t.a.r.c.l0 r0 = (m0.r.t.a.r.c.l0) r0
            m0.r.t.a.r.g.d r12 = r0.getName()
            java.lang.String r0 = "Scope for abbreviation: "
            java.lang.String r12 = m0.n.b.i.k(r0, r12)
            r0 = 1
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = m0.r.t.a.r.m.p.c(r12, r0)
            java.lang.String r0 = "createErrorScope(\"Scope for abbreviation: ${descriptor.name}\", true)"
            m0.n.b.i.d(r12, r0)
            goto L_0x0046
        L_0x00d8:
            boolean r12 = r9 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r12 == 0) goto L_0x00fb
            r12 = r9
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r12 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r12
            java.util.LinkedHashSet<m0.r.t.a.r.m.v> r12 = r12.b
            java.lang.String r0 = "member scope for intersection type"
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r12 = kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.a.a(r0, r12)
            goto L_0x0046
        L_0x00e9:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1 r7 = new kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r8
            r3 = r9
            r4 = r10
            m0.r.t.a.r.m.a0 r8 = i(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x00fb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unsupported classifier: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = " for constructor: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.f(m0.r.t.a.r.c.r0.f, m0.r.t.a.r.m.j0, java.util.List, boolean, m0.r.t.a.r.m.x0.e):m0.r.t.a.r.m.a0");
    }

    public static /* synthetic */ a0 g(m0.r.t.a.r.c.r0.f fVar, j0 j0Var, List list, boolean z, e eVar, int i) {
        int i2 = i & 16;
        return f(fVar, j0Var, list, z, (e) null);
    }

    public static final a0 h(m0.r.t.a.r.c.r0.f fVar, j0 j0Var, List<? extends m0> list, boolean z, MemberScope memberScope) {
        i.e(fVar, "annotations");
        i.e(j0Var, "constructor");
        i.e(list, "arguments");
        i.e(memberScope, "memberScope");
        b0 b0Var = new b0(j0Var, list, z, memberScope, new KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(a, j0Var, list, fVar, z, memberScope));
        return fVar.isEmpty() ? b0Var : new m0.r.t.a.r.m.f(b0Var, fVar);
    }

    public static final a0 i(m0.r.t.a.r.c.r0.f fVar, j0 j0Var, List<? extends m0> list, boolean z, MemberScope memberScope, l<? super e, ? extends a0> lVar) {
        i.e(fVar, "annotations");
        i.e(j0Var, "constructor");
        i.e(list, "arguments");
        i.e(memberScope, "memberScope");
        i.e(lVar, "refinedTypeFactory");
        b0 b0Var = new b0(j0Var, list, z, memberScope, lVar);
        return fVar.isEmpty() ? b0Var : new m0.r.t.a.r.m.f(b0Var, fVar);
    }
}
