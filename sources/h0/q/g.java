package h0.q;

import m0.l.e;

/* compiled from: DispatchQueue.kt */
public final class g implements Runnable {
    public final /* synthetic */ h c;
    public final /* synthetic */ e d;
    public final /* synthetic */ Runnable q;

    public g(h hVar, e eVar, Runnable runnable) {
        this.c = hVar;
        this.d = eVar;
        this.q = runnable;
    }

    public final void run() {
        this.c.c(this.q);
    }
}
