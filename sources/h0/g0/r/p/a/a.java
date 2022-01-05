package h0.g0.r.p.a;

import h0.g0.i;
import h0.g0.r.s.o;

/* compiled from: DelayedWorkTracker */
public class a implements Runnable {
    public final /* synthetic */ o c;
    public final /* synthetic */ b d;

    public a(b bVar, o oVar) {
        this.d = bVar;
        this.c = oVar;
    }

    public void run() {
        i.c().a(b.a, String.format("Scheduling work %s", new Object[]{this.c.a}), new Throwable[0]);
        this.d.b.a(this.c);
    }
}
