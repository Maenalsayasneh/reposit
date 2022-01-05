package n0.a;

import i0.d.a.a.a;
import m0.i;
import m0.n.a.l;

/* compiled from: CancellableContinuationImpl.kt */
public final class c1 extends k {
    public final l<Throwable, i> c;

    public c1(l<? super Throwable, i> lVar) {
        this.c = lVar;
    }

    public void a(Throwable th) {
        this.c.invoke(th);
    }

    public Object invoke(Object obj) {
        this.c.invoke((Throwable) obj);
        return i.a;
    }

    public String toString() {
        StringBuilder P0 = a.P0("InvokeOnCancel[");
        P0.append(m0.r.t.a.r.m.a1.a.I1(this.c));
        P0.append('@');
        P0.append(m0.r.t.a.r.m.a1.a.M1(this));
        P0.append(']');
        return P0.toString();
    }
}
