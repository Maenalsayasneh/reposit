package m0.r.t.a.r.m;

import i0.j.f.p.h;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import m0.n.b.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.x0.g;
import m0.r.t.a.r.m.z0.b;

/* compiled from: SpecialTypes.kt */
public final class i extends k implements h, b {
    public final a0 d;
    public final boolean q;

    public i(a0 a0Var, boolean z) {
        this.d = a0Var;
        this.q = z;
    }

    public static final i U0(v0 v0Var, boolean z) {
        m0.n.b.i.e(v0Var, "type");
        if (v0Var instanceof i) {
            return (i) v0Var;
        }
        v0Var.I0();
        boolean z2 = false;
        boolean z3 = true;
        if (!(v0Var.I0().c() instanceof m0) && !(v0Var instanceof g)) {
            z3 = false;
        }
        if (z3) {
            if (!z || !(v0Var.I0().c() instanceof m0)) {
                m0.n.b.i.e(v0Var, "type");
                z2 = !c.a(new m0.r.t.a.r.m.x0.b(false, true, false, (e) null, 12), h.P2(v0Var), AbstractTypeCheckerContext.a.b.a);
            } else {
                z2 = s0.g(v0Var);
            }
        }
        if (!z2) {
            return null;
        }
        if (v0Var instanceof q) {
            q qVar = (q) v0Var;
            m0.n.b.i.a(qVar.d.I0(), qVar.q.I0());
        }
        return new i(h.P2(v0Var), z, (f) null);
    }

    public boolean D() {
        this.d.I0();
        return this.d.I0().c() instanceof m0;
    }

    public v I(v vVar) {
        m0.n.b.i.e(vVar, "replacement");
        return d0.a(vVar.L0(), this.q);
    }

    public boolean J0() {
        return false;
    }

    public a0 P0(boolean z) {
        return z ? this.d.M0(z) : this;
    }

    public a0 Q0(m0.r.t.a.r.c.r0.f fVar) {
        m0.n.b.i.e(fVar, "newAnnotations");
        return new i(this.d.Q0(fVar), this.q);
    }

    public a0 R0() {
        return this.d;
    }

    public k T0(a0 a0Var) {
        m0.n.b.i.e(a0Var, "delegate");
        return new i(a0Var, this.q);
    }

    /* renamed from: V0 */
    public i O0(m0.r.t.a.r.c.r0.f fVar) {
        m0.n.b.i.e(fVar, "newAnnotations");
        return new i(this.d.Q0(fVar), this.q);
    }

    public String toString() {
        return this.d + "!!";
    }

    public i(a0 a0Var, boolean z, f fVar) {
        this.d = a0Var;
        this.q = z;
    }
}
