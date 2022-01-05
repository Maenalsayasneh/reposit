package h0.g0.r.r;

import androidx.work.impl.WorkDatabase;
import h0.g0.r.s.o;
import h0.g0.r.s.q;

/* compiled from: SystemForegroundDispatcher */
public class b implements Runnable {
    public final /* synthetic */ WorkDatabase c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c q;

    public b(c cVar, WorkDatabase workDatabase, String str) {
        this.q = cVar;
        this.c = workDatabase;
        this.d = str;
    }

    public void run() {
        o i = ((q) this.c.q()).i(this.d);
        if (i != null && i.b()) {
            synchronized (this.q.y) {
                this.q.a2.put(this.d, i);
                this.q.b2.add(i);
                c cVar = this.q;
                cVar.c2.b(cVar.b2);
            }
        }
    }
}
