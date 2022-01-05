package n0.a;

import m0.i;
import m0.n.a.l;

/* compiled from: JobSupport.kt */
public final class e1 extends i1 {
    public final l<Throwable, i> y;

    public e1(l<? super Throwable, i> lVar) {
        this.y = lVar;
    }

    public void H(Throwable th) {
        this.y.invoke(th);
    }

    public Object invoke(Object obj) {
        this.y.invoke((Throwable) obj);
        return i.a;
    }
}
