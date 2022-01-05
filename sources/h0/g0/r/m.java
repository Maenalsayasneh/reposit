package h0.g0.r;

import h0.g0.i;
import h0.g0.r.t.p.a;

/* compiled from: WorkerWrapper */
public class m implements Runnable {
    public final /* synthetic */ a c;
    public final /* synthetic */ o d;

    public m(o oVar, a aVar) {
        this.d = oVar;
        this.c = aVar;
    }

    public void run() {
        try {
            i.c().a(o.c, String.format("Starting work for %s", new Object[]{this.d.Y1.c}), new Throwable[0]);
            o oVar = this.d;
            oVar.l2 = oVar.Z1.d();
            this.c.l(this.d.l2);
        } catch (Throwable th) {
            this.c.k(th);
        }
    }
}
