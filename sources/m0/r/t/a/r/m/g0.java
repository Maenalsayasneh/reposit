package m0.r.t.a.r.m;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$containsTypeAliasParameters$1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$requiresTypeAliasExpansion$1;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.m.x0.d;

/* compiled from: TypeAliasExpander.kt */
public final class g0 {
    public static final a a = new a((f) null);
    public final i0 b;
    public final boolean c;

    /* compiled from: TypeAliasExpander.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public g0(i0 i0Var, boolean z) {
        i.e(i0Var, "reportStrategy");
        this.b = i0Var;
        this.c = z;
    }

    public final void a(m0.r.t.a.r.c.r0.f fVar, m0.r.t.a.r.c.r0.f fVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((c) it.next()).d());
        }
        Iterator it2 = fVar2.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (hashSet.contains(cVar.d())) {
                this.b.b(cVar);
            }
        }
    }

    public final a0 b(a0 a0Var, m0.r.t.a.r.c.r0.f fVar) {
        return h.h2(a0Var) ? a0Var : h.v3(a0Var, (List) null, c(a0Var, fVar), 1);
    }

    public final m0.r.t.a.r.c.r0.f c(v vVar, m0.r.t.a.r.c.r0.f fVar) {
        if (h.h2(vVar)) {
            return vVar.getAnnotations();
        }
        return h.M(fVar, vVar.getAnnotations());
    }

    public final a0 d(h0 h0Var, m0.r.t.a.r.c.r0.f fVar, boolean z, int i, boolean z2) {
        m0 e = e(new o0(Variance.INVARIANT, h0Var.b.f0()), h0Var, (m0) null, i);
        v type = e.getType();
        i.d(type, "expandedProjection.type");
        a0 x = h.x(type);
        if (h.h2(x)) {
            return x;
        }
        e.b();
        a(x.getAnnotations(), fVar);
        a0 l = s0.l(b(x, fVar), z);
        i.d(l, "expandedType.combineAnnotations(annotations).let { TypeUtils.makeNullableIfNeeded(it, isNullable) }");
        if (!z2) {
            return l;
        }
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        j0 i2 = h0Var.b.i();
        i.d(i2, "descriptor.typeConstructor");
        return d0.e(l, KotlinTypeFactory.h(fVar, i2, h0Var.c, z, MemberScope.a.b));
    }

    public final m0 e(m0 m0Var, h0 h0Var, m0 m0Var2, int i) {
        v vVar;
        Variance variance;
        Variance variance2;
        h0 h0Var2 = h0Var;
        m0 m0Var3 = m0Var2;
        int i2 = i;
        l0 l0Var = h0Var2.b;
        if (i2 > 100) {
            throw new AssertionError(i.k("Too deep recursion while expanding type alias ", l0Var.getName()));
        } else if (m0Var.c()) {
            i.c(m0Var2);
            m0 m = s0.m(m0Var2);
            i.d(m, "makeStarProjection(typeParameterDescriptor!!)");
            return m;
        } else {
            v type = m0Var.getType();
            i.d(type, "underlyingProjection.type");
            j0 I0 = type.I0();
            i.e(I0, "constructor");
            m0.r.t.a.r.c.f c2 = I0.c();
            Variance variance3 = null;
            m0 m0Var4 = c2 instanceof m0 ? h0Var2.d.get(c2) : null;
            if (m0Var4 == null) {
                v0 L0 = m0Var.getType().L0();
                if (!h.f2(L0)) {
                    a0 x = h.x(L0);
                    if (!h.h2(x)) {
                        i.e(x, "<this>");
                        if (m0.r.t.a.r.m.a1.a.K0(x, TypeUtilsKt$requiresTypeAliasExpansion$1.c)) {
                            j0 I02 = x.I0();
                            m0.r.t.a.r.c.f c3 = I02.c();
                            I02.getParameters().size();
                            x.H0().size();
                            if (!(c3 instanceof m0)) {
                                int i3 = 0;
                                if (c3 instanceof l0) {
                                    l0 l0Var2 = (l0) c3;
                                    if (h0Var2.b(l0Var2)) {
                                        this.b.d(l0Var2);
                                        return new o0(Variance.INVARIANT, p.d(i.k("Recursive type alias: ", l0Var2.getName())));
                                    }
                                    List<m0> H0 = x.H0();
                                    ArrayList arrayList = new ArrayList(h.K(H0, 10));
                                    for (T next : H0) {
                                        int i4 = i3 + 1;
                                        if (i3 >= 0) {
                                            arrayList.add(e((m0) next, h0Var2, I02.getParameters().get(i3), i2 + 1));
                                            i3 = i4;
                                        } else {
                                            g.r0();
                                            throw null;
                                        }
                                    }
                                    a0 d = d(h0.a(h0Var2, l0Var2, arrayList), x.getAnnotations(), x.J0(), i2 + 1, false);
                                    a0 f = f(x, h0Var2, i2);
                                    if (!h.f2(d)) {
                                        d = d0.e(d, f);
                                    }
                                    return new o0(m0Var.b(), d);
                                }
                                a0 f2 = f(x, h0Var2, i2);
                                TypeSubstitutor d2 = TypeSubstitutor.d(f2);
                                i.d(d2, "create(substitutedType)");
                                for (T next2 : f2.H0()) {
                                    int i5 = i3 + 1;
                                    if (i3 >= 0) {
                                        m0 m0Var5 = (m0) next2;
                                        if (!m0Var5.c()) {
                                            v type2 = m0Var5.getType();
                                            i.d(type2, "substitutedArgument.type");
                                            i.e(type2, "<this>");
                                            if (!m0.r.t.a.r.m.a1.a.K0(type2, TypeUtilsKt$containsTypeAliasParameters$1.c)) {
                                                m0 m0Var6 = x.H0().get(i3);
                                                m0 m0Var7 = x.I0().getParameters().get(i3);
                                                if (this.c) {
                                                    i0 i0Var = this.b;
                                                    v type3 = m0Var6.getType();
                                                    i.d(type3, "unsubstitutedArgument.type");
                                                    v type4 = m0Var5.getType();
                                                    i.d(type4, "substitutedArgument.type");
                                                    i.d(m0Var7, "typeParameter");
                                                    i.e(i0Var, "reportStrategy");
                                                    i.e(type3, "unsubstitutedArgument");
                                                    i.e(type4, "typeArgument");
                                                    i.e(m0Var7, "typeParameterDescriptor");
                                                    i.e(d2, "substitutor");
                                                    for (v i6 : m0Var7.getUpperBounds()) {
                                                        v i7 = d2.i(i6, Variance.INVARIANT);
                                                        i.d(i7, "substitutor.safeSubstitute(bound, Variance.INVARIANT)");
                                                        if (!d.a.d(type4, i7)) {
                                                            i0Var.a(i7, type3, type4, m0Var7);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i3 = i5;
                                    } else {
                                        g.r0();
                                        throw null;
                                    }
                                }
                                return new o0(m0Var.b(), f2);
                            }
                        }
                    }
                }
                return m0Var;
            } else if (m0Var4.c()) {
                i.c(m0Var2);
                m0 m2 = s0.m(m0Var2);
                i.d(m2, "makeStarProjection(typeParameterDescriptor!!)");
                return m2;
            } else {
                v0 L02 = m0Var4.getType().L0();
                Variance b2 = m0Var4.b();
                i.d(b2, "argument.projectionKind");
                Variance b3 = m0Var.b();
                i.d(b3, "underlyingProjection.projectionKind");
                if (!(b3 == b2 || b3 == (variance2 = Variance.INVARIANT))) {
                    if (b2 == variance2) {
                        b2 = b3;
                    } else {
                        this.b.c(h0Var2.b, m0Var3, L02);
                    }
                }
                if (m0Var3 != null) {
                    variance3 = m0Var2.l();
                }
                if (variance3 == null) {
                    variance3 = Variance.INVARIANT;
                }
                i.d(variance3, "typeParameterDescriptor?.variance ?: Variance.INVARIANT");
                if (!(variance3 == b2 || variance3 == (variance = Variance.INVARIANT))) {
                    if (b2 == variance) {
                        b2 = variance;
                    } else {
                        this.b.c(h0Var2.b, m0Var3, L02);
                    }
                }
                a(type.getAnnotations(), L02.getAnnotations());
                if (L02 instanceof n) {
                    n nVar = (n) L02;
                    m0.r.t.a.r.c.r0.f c4 = c(nVar, type.getAnnotations());
                    i.e(c4, "newAnnotations");
                    vVar = new n(m0.r.t.a.r.m.a1.a.F1(nVar.q), c4);
                } else {
                    a0 l = s0.l(h.x(L02), type.J0());
                    i.d(l, "makeNullableIfNeeded(this, fromType.isMarkedNullable)");
                    vVar = b(l, type.getAnnotations());
                }
                return new o0(b2, vVar);
            }
        }
    }

    public final a0 f(a0 a0Var, h0 h0Var, int i) {
        j0 I0 = a0Var.I0();
        List<m0> H0 = a0Var.H0();
        ArrayList arrayList = new ArrayList(h.K(H0, 10));
        int i2 = 0;
        for (T next : H0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                m0 m0Var = (m0) next;
                m0 e = e(m0Var, h0Var, I0.getParameters().get(i2), i + 1);
                if (!e.c()) {
                    e = new o0(e.b(), s0.k(e.getType(), m0Var.getType().J0()));
                }
                arrayList.add(e);
                i2 = i3;
            } else {
                g.r0();
                throw null;
            }
        }
        return h.v3(a0Var, arrayList, (m0.r.t.a.r.c.r0.f) null, 2);
    }
}
