package m0.r.t.a.r.m;

import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;

/* compiled from: KotlinTypeFactory.kt */
public abstract class l extends k {
    public final a0 d;

    public l(a0 a0Var) {
        i.e(a0Var, "delegate");
        this.d = a0Var;
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return fVar != getAnnotations() ? new f(this, fVar) : this;
    }

    public a0 P0(boolean z) {
        if (z == J0()) {
            return this;
        }
        return this.d.M0(z).Q0(getAnnotations());
    }

    public a0 Q0(f fVar) {
        i.e(fVar, "newAnnotations");
        return fVar != getAnnotations() ? new f(this, fVar) : this;
    }

    public a0 R0() {
        return this.d;
    }
}
