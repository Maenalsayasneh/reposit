package m0.r.t.a.r.c;

import m0.n.b.i;

/* compiled from: DescriptorVisibility.kt */
public abstract class n extends p {
    public final q0 a;

    public n(q0 q0Var) {
        i.e(q0Var, "delegate");
        this.a = q0Var;
    }

    public q0 a() {
        return this.a;
    }

    public String b() {
        return this.a.getInternalDisplayName();
    }

    public p d() {
        p h = o.h(this.a.normalize());
        i.d(h, "toDescriptorVisibility(delegate.normalize())");
        return h;
    }
}
