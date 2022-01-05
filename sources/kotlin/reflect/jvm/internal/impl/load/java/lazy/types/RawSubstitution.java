package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.a.u.h.a;
import m0.r.t.a.r.e.a.u.h.c;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.o0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.p0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: RawType.kt */
public final class RawSubstitution extends p0 {
    public static final RawSubstitution b = new RawSubstitution();
    public static final a c;
    public static final a d;

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        c = c.c(typeUsage, false, (m0) null, 3).a(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        d = c.c(typeUsage, false, (m0) null, 3).a(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public m0.r.t.a.r.m.m0 e(v vVar) {
        i.e(vVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return new o0(j(vVar));
    }

    public final m0.r.t.a.r.m.m0 h(m0 m0Var, a aVar, v vVar) {
        i.e(m0Var, "parameter");
        i.e(aVar, "attr");
        i.e(vVar, "erasedUpperBound");
        int ordinal = aVar.b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (!m0Var.l().getAllowsOutPosition()) {
                return new o0(Variance.INVARIANT, DescriptorUtilsKt.f(m0Var).o());
            }
            List<m0> parameters = vVar.I0().getParameters();
            i.d(parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                return new o0(Variance.OUT_VARIANCE, vVar);
            }
            return c.b(m0Var, aVar);
        } else if (ordinal == 2) {
            return new o0(Variance.INVARIANT, vVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Pair<a0, Boolean> i(a0 a0Var, d dVar, a aVar) {
        if (a0Var.I0().getParameters().isEmpty()) {
            return new Pair<>(a0Var, Boolean.FALSE);
        }
        if (f.z(a0Var)) {
            m0.r.t.a.r.m.m0 m0Var = a0Var.H0().get(0);
            Variance b2 = m0Var.b();
            v type = m0Var.getType();
            i.d(type, "componentTypeProjection.type");
            List L2 = h.L2(new o0(b2, j(type)));
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            return new Pair<>(KotlinTypeFactory.g(a0Var.getAnnotations(), a0Var.I0(), L2, a0Var.J0(), (e) null, 16), Boolean.FALSE);
        } else if (h.h2(a0Var)) {
            a0 d2 = p.d(i.k("Raw error type: ", a0Var.I0()));
            i.d(d2, "createErrorType(\"Raw error type: ${type.constructor}\")");
            return new Pair<>(d2, Boolean.FALSE);
        } else {
            MemberScope Z = dVar.Z(this);
            i.d(Z, "declaration.getMemberScope(RawSubstitution)");
            KotlinTypeFactory kotlinTypeFactory2 = KotlinTypeFactory.a;
            m0.r.t.a.r.c.r0.f annotations = a0Var.getAnnotations();
            j0 i = dVar.i();
            i.d(i, "declaration.typeConstructor");
            List<m0> parameters = dVar.i().getParameters();
            i.d(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(h.K(parameters, 10));
            for (m0 m0Var2 : parameters) {
                i.d(m0Var2, "parameter");
                b bVar = c.a;
                arrayList.add(h(m0Var2, aVar, c.a(m0Var2, (m0) null, new JavaTypeResolverKt$getErasedUpperBound$1(m0Var2))));
            }
            return new Pair<>(KotlinTypeFactory.i(annotations, i, arrayList, a0Var.J0(), Z, new RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(dVar, this, a0Var, aVar)), Boolean.TRUE);
        }
    }

    public final v j(v vVar) {
        m0.r.t.a.r.c.f c2 = vVar.I0().c();
        if (c2 instanceof m0) {
            m0 m0Var = (m0) c2;
            b bVar = c.a;
            return j(c.a(m0Var, (m0) null, new JavaTypeResolverKt$getErasedUpperBound$1(m0Var)));
        } else if (c2 instanceof d) {
            m0.r.t.a.r.c.f c3 = h.B4(vVar).I0().c();
            if (c3 instanceof d) {
                Pair<a0, Boolean> i = i(h.P2(vVar), (d) c2, c);
                a0 a0Var = (a0) i.c;
                boolean booleanValue = ((Boolean) i.d).booleanValue();
                Pair<a0, Boolean> i2 = i(h.B4(vVar), (d) c3, d);
                a0 a0Var2 = (a0) i2.c;
                boolean booleanValue2 = ((Boolean) i2.d).booleanValue();
                if (booleanValue || booleanValue2) {
                    return new RawTypeImpl(a0Var, a0Var2);
                }
                KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
                return KotlinTypeFactory.c(a0Var, a0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + c3 + "\" while for lower it's \"" + c2 + '\"').toString());
        } else {
            throw new IllegalStateException(i.k("Unexpected declaration kind: ", c2).toString());
        }
    }
}
