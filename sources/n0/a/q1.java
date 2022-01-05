package n0.a;

import i0.d.a.a.a;
import m0.i;
import n0.a.h2.k;

/* compiled from: CancellableContinuation.kt */
public final class q1 extends f {
    public final k c;

    public q1(k kVar) {
        this.c = kVar;
    }

    public void a(Throwable th) {
        this.c.E();
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.E();
        return i.a;
    }

    public String toString() {
        StringBuilder P0 = a.P0("RemoveOnCancel[");
        P0.append(this.c);
        P0.append(']');
        return P0.toString();
    }
}
