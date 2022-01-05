package n0.a;

import m0.i;

/* compiled from: JobSupport.kt */
public final class q0 extends i1 {
    public final o0 y;

    public q0(o0 o0Var) {
        this.y = o0Var;
    }

    public void H(Throwable th) {
        this.y.dispose();
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.y.dispose();
        return i.a;
    }
}
