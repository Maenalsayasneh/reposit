package m0.r.t.a.r.m;

import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.x0.e;

/* compiled from: SpecialTypes.kt */
public final class a extends k {
    public final a0 d;
    public final a0 q;

    public a(a0 a0Var, a0 a0Var2) {
        i.e(a0Var, "delegate");
        i.e(a0Var2, "abbreviation");
        this.d = a0Var;
        this.q = a0Var2;
    }

    public a0 P0(boolean z) {
        return new a(this.d.M0(z), this.q.M0(z));
    }

    public a0 Q0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new a(this.d.Q0(fVar), this.q);
    }

    public a0 R0() {
        return this.d;
    }

    public k T0(a0 a0Var) {
        i.e(a0Var, "delegate");
        return new a(a0Var, this.q);
    }

    /* renamed from: U0 */
    public a M0(boolean z) {
        return new a(this.d.M0(z), this.q.M0(z));
    }

    /* renamed from: V0 */
    public a S0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new a((a0) eVar.g(this.d), (a0) eVar.g(this.q));
    }

    /* renamed from: W0 */
    public a O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new a(this.d.Q0(fVar), this.q);
    }
}
