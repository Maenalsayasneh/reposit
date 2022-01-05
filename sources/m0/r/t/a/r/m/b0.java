package m0.r.t.a.r.m;

import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.x0.e;

/* compiled from: KotlinTypeFactory.kt */
public final class b0 extends a0 {
    public final l<e, a0> Y1;
    public final j0 d;
    public final List<m0> q;
    public final boolean x;
    public final MemberScope y;

    public b0(j0 j0Var, List<? extends m0> list, boolean z, MemberScope memberScope, l<? super e, ? extends a0> lVar) {
        i.e(j0Var, "constructor");
        i.e(list, "arguments");
        i.e(memberScope, "memberScope");
        i.e(lVar, "refinedTypeFactory");
        this.d = j0Var;
        this.q = list;
        this.x = z;
        this.y = memberScope;
        this.Y1 = lVar;
        if (memberScope instanceof p.d) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + 10 + j0Var);
        }
    }

    public List<m0> H0() {
        return this.q;
    }

    public j0 I0() {
        return this.d;
    }

    public boolean J0() {
        return this.x;
    }

    public v K0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        a0 invoke = this.Y1.invoke(eVar);
        return invoke == null ? this : invoke;
    }

    public v0 N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        a0 invoke = this.Y1.invoke(eVar);
        return invoke == null ? this : invoke;
    }

    public a0 P0(boolean z) {
        if (z == this.x) {
            return this;
        }
        if (z) {
            return new y(this);
        }
        return new x(this);
    }

    /* renamed from: Q0 */
    public a0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        if (fVar.isEmpty()) {
            return this;
        }
        return new f(this, fVar);
    }

    public f getAnnotations() {
        Objects.requireNonNull(f.i);
        return f.a.b;
    }

    public MemberScope o() {
        return this.y;
    }
}
