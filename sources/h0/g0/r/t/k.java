package h0.g0.r.t;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import h0.g0.i;
import h0.g0.r.d;
import h0.g0.r.l;
import h0.g0.r.s.p;
import h0.g0.r.s.q;

/* compiled from: StopWorkRunnable */
public class k implements Runnable {
    public static final String c = i.e("StopWorkRunnable");
    public final l d;
    public final String q;
    public final boolean x;

    public k(l lVar, String str, boolean z) {
        this.d = lVar;
        this.q = str;
        this.x = z;
    }

    public void run() {
        boolean containsKey;
        boolean z;
        l lVar = this.d;
        WorkDatabase workDatabase = lVar.g;
        d dVar = lVar.j;
        p q2 = workDatabase.q();
        workDatabase.c();
        try {
            String str = this.q;
            synchronized (dVar.d2) {
                containsKey = dVar.Y1.containsKey(str);
            }
            if (this.x) {
                z = this.d.j.h(this.q);
            } else {
                if (!containsKey) {
                    q qVar = (q) q2;
                    if (qVar.g(this.q) == WorkInfo$State.RUNNING) {
                        qVar.p(WorkInfo$State.ENQUEUED, this.q);
                    }
                }
                z = this.d.j.i(this.q);
            }
            i.c().a(c, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.q, Boolean.valueOf(z)}), new Throwable[0]);
            workDatabase.k();
            workDatabase.g();
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
