package m0.r.t.a.r.m;

import i0.j.f.p.h;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.x0.e;

/* compiled from: TypeWithEnhancement.kt */
public final class c0 extends k implements t0 {
    public final a0 d;
    public final v q;

    public c0(a0 a0Var, v vVar) {
        i.e(a0Var, "delegate");
        i.e(vVar, "enhancement");
        this.d = a0Var;
        this.q = vVar;
    }

    public v0 B0() {
        return this.d;
    }

    public v E() {
        return this.q;
    }

    public a0 P0(boolean z) {
        return (a0) h.G4(this.d.M0(z), this.q.L0().M0(z));
    }

    /* renamed from: Q0 */
    public a0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return (a0) h.G4(this.d.O0(fVar), this.q);
    }

    public a0 R0() {
        return this.d;
    }

    public k T0(a0 a0Var) {
        i.e(a0Var, "delegate");
        return new c0(a0Var, this.q);
    }

    /* renamed from: U0 */
    public c0 S0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new c0((a0) eVar.g(this.d), eVar.g(this.q));
    }
}
