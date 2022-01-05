package n0.a;

import i0.d.a.a.a;
import m0.i;

/* compiled from: CancellableContinuation.kt */
public final class p0 extends k {
    public final o0 c;

    public p0(o0 o0Var) {
        this.c = o0Var;
    }

    public void a(Throwable th) {
        this.c.dispose();
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.dispose();
        return i.a;
    }

    public String toString() {
        StringBuilder P0 = a.P0("DisposeOnCancel[");
        P0.append(this.c);
        P0.append(']');
        return P0.toString();
    }
}
