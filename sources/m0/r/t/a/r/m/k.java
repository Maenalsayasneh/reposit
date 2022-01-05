package m0.r.t.a.r.m;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.x0.e;

/* compiled from: SpecialTypes.kt */
public abstract class k extends a0 {
    public List<m0> H0() {
        return R0().H0();
    }

    public j0 I0() {
        return R0().I0();
    }

    public boolean J0() {
        return R0().J0();
    }

    public abstract a0 R0();

    /* renamed from: S0 */
    public a0 N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return T0((a0) eVar.g(R0()));
    }

    public abstract k T0(a0 a0Var);

    public f getAnnotations() {
        return R0().getAnnotations();
    }

    public MemberScope o() {
        return R0().o();
    }
}
