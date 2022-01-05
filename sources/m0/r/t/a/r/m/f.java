package m0.r.t.a.r.m;

import m0.n.b.i;

/* compiled from: KotlinTypeFactory.kt */
public final class f extends l {
    public final m0.r.t.a.r.c.r0.f q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(a0 a0Var, m0.r.t.a.r.c.r0.f fVar) {
        super(a0Var);
        i.e(a0Var, "delegate");
        i.e(fVar, "annotations");
        this.q = fVar;
    }

    public k T0(a0 a0Var) {
        i.e(a0Var, "delegate");
        return new f(a0Var, this.q);
    }

    public m0.r.t.a.r.c.r0.f getAnnotations() {
        return this.q;
    }
}
